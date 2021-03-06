/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.SellerUserLoginLogRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 商家用户登录日志
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SellerUserLoginLog extends TableImpl<SellerUserLoginLogRecord> {

    private static final long serialVersionUID = -2004937006;

    /**
     * The reference instance of <code>ejavashop.seller_user_login_log</code>
     */
    public static final SellerUserLoginLog SELLER_USER_LOGIN_LOG = new SellerUserLoginLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SellerUserLoginLogRecord> getRecordType() {
        return SellerUserLoginLogRecord.class;
    }

    /**
     * The column <code>ejavashop.seller_user_login_log.id</code>.
     */
    public final TableField<SellerUserLoginLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.seller_user_login_log.user_id</code>.
     */
    public final TableField<SellerUserLoginLogRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.seller_user_login_log.user_name</code>.
     */
    public final TableField<SellerUserLoginLogRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>ejavashop.seller_user_login_log.login_ip</code>.
     */
    public final TableField<SellerUserLoginLogRecord, String> LOGIN_IP = createField("login_ip", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>ejavashop.seller_user_login_log.create_time</code>.
     */
    public final TableField<SellerUserLoginLogRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>ejavashop.seller_user_login_log</code> table reference
     */
    public SellerUserLoginLog() {
        this("seller_user_login_log", null);
    }

    /**
     * Create an aliased <code>ejavashop.seller_user_login_log</code> table reference
     */
    public SellerUserLoginLog(String alias) {
        this(alias, SELLER_USER_LOGIN_LOG);
    }

    private SellerUserLoginLog(String alias, Table<SellerUserLoginLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private SellerUserLoginLog(String alias, Table<SellerUserLoginLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "商家用户登录日志");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Ejavashop.EJAVASHOP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SellerUserLoginLogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SELLER_USER_LOGIN_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SellerUserLoginLogRecord> getPrimaryKey() {
        return Keys.KEY_SELLER_USER_LOGIN_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SellerUserLoginLogRecord>> getKeys() {
        return Arrays.<UniqueKey<SellerUserLoginLogRecord>>asList(Keys.KEY_SELLER_USER_LOGIN_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerUserLoginLog as(String alias) {
        return new SellerUserLoginLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerUserLoginLog rename(String name) {
        return new SellerUserLoginLog(name, null);
    }
}
