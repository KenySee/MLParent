package com.zallhy.hyapp.utils;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Client;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.storage.model.FileInfo;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Qiniu implements InitializingBean {
    private final Log logger = LogFactory.getLog(getClass());

    @Value("${qiniu.accessKey}")
    private String accessKey;
    @Value("${qiniu.secretKey}")
    private String secretKey;
    @Value("${qiniu.bucketName}")
    private String bucketName;
    @Value("${qiniu.host}")
    private  String host;

    private Auth auth;

    private UploadManager uploadManager;

    private BucketManager bucketManager;


    private final Client client = new Client();
    private final StringMap header = new StringMap();

    @Override
    public void afterPropertiesSet() throws Exception {
        this.auth = Auth.create(accessKey, secretKey);
        Configuration configuration = new Configuration(Zone.zone0());
        this.uploadManager = new UploadManager(configuration);
        bucketManager = new BucketManager(auth, configuration);
        header.put("Host", host);

    }

    public String token(){
        return auth.uploadToken(bucketName);
    }

    public String fetch(String url) {
        String key = IdGen.nextS();
        try {
            DefaultPutRet ret = bucketManager.fetch(url, bucketName);
            logger.info(ret.hash);
            return String.format("%s/%s", host, ret.key);
        } catch (QiniuException e) {
            logger.error(e.response.toString());
            throw new RuntimeException(e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    public String put(byte[] buffer) {
        String key = IdGen.nextS();
        String upToken = auth.uploadToken(bucketName, key);
        try {
            Response r = uploadManager.put(buffer, key, upToken, null, null, true);
            logger.info(r.bodyString());
            PutRet putRet = r.jsonToObject(PutRet.class);
            return String.format("%s/%s", host, putRet.key);

        } catch (QiniuException e) {
            logger.error(e.response.toString());
            throw new RuntimeException(e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }


    public FileInfo fileInfo(String key) {
        try {
            FileInfo fileInfo = bucketManager.stat(bucketName, key);
            return fileInfo;
        } catch (QiniuException e) {
            logger.error(e.response.toString());
            throw new RuntimeException(e);
        }
    }


    public static class PutRet {
        String hash;
        String key;
        String code;
        String error;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

    }


}
