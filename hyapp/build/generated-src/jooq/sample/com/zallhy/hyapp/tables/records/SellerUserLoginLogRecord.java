/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.SellerUserLoginLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SellerUserLoginLogRecord extends UpdatableRecordImpl<SellerUserLoginLogRecord> implements Record5<Integer, Integer, String, String, Timestamp> {

    private static final long serialVersionUID = -530207050;

    /**
     * Setter for <code>ejavashop.seller_user_login_log.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.seller_user_login_log.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.seller_user_login_log.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.seller_user_login_log.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.seller_user_login_log.user_name</code>.
     */
    public void setUserName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.seller_user_login_log.user_name</code>.
     */
    public String getUserName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.seller_user_login_log.login_ip</code>.
     */
    public void setLoginIp(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.seller_user_login_log.login_ip</code>.
     */
    public String getLoginIp() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.seller_user_login_log.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.seller_user_login_log.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SellerUserLoginLog.SELLER_USER_LOGIN_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SellerUserLoginLog.SELLER_USER_LOGIN_LOG.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SellerUserLoginLog.SELLER_USER_LOGIN_LOG.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SellerUserLoginLog.SELLER_USER_LOGIN_LOG.LOGIN_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return SellerUserLoginLog.SELLER_USER_LOGIN_LOG.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLoginIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerUserLoginLogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerUserLoginLogRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerUserLoginLogRecord value3(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerUserLoginLogRecord value4(String value) {
        setLoginIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerUserLoginLogRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerUserLoginLogRecord values(Integer value1, Integer value2, String value3, String value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SellerUserLoginLogRecord
     */
    public SellerUserLoginLogRecord() {
        super(SellerUserLoginLog.SELLER_USER_LOGIN_LOG);
    }

    /**
     * Create a detached, initialised SellerUserLoginLogRecord
     */
    public SellerUserLoginLogRecord(Integer id, Integer userId, String userName, String loginIp, Timestamp createTime) {
        super(SellerUserLoginLog.SELLER_USER_LOGIN_LOG);

        set(0, id);
        set(1, userId);
        set(2, userName);
        set(3, loginIp);
        set(4, createTime);
    }
}
