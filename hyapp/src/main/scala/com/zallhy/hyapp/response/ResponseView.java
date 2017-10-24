package com.zallhy.hyapp.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseView {
    @JsonProperty("Result")
    private String result = "OK";

    @JsonProperty("Message")
    private String message = "操作成功！";

    public ResponseView(){

    }

    public ResponseView(String result,String message){
        this.setResult(result);
        this.setMessage(message);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
