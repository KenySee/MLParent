/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.SellerTransport;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 卖家运费模板
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SellerTransportRecord extends UpdatableRecordImpl<SellerTransportRecord> implements Record13<Integer, Integer, Integer, String, Integer, Integer, String, Integer, String, Integer, String, Timestamp, Integer> {

    private static final long serialVersionUID = 1873545228;

    /**
     * Setter for <code>ejavashop.seller_transport.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.state</code>. 状态 1-使用中 2-禁用
     */
    public void setState(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.state</code>. 状态 1-使用中 2-禁用
     */
    public Integer getState() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.seller_id</code>. 商家id
     */
    public void setSellerId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.seller_id</code>. 商家id
     */
    public Integer getSellerId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.trans_name</code>. 模板名称
     */
    public void setTransName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.trans_name</code>. 模板名称
     */
    public String getTransName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.trans_type</code>. 计价方式 1-按件数 2-按重量
     */
    public void setTransType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.trans_type</code>. 计价方式 1-按件数 2-按重量
     */
    public Integer getTransType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.trans_express</code>. 快递
     */
    public void setTransExpress(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.trans_express</code>. 快递
     */
    public Integer getTransExpress() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.trans_express_info</code>. 快递模板信息
     */
    public void setTransExpressInfo(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.trans_express_info</code>. 快递模板信息
     */
    public String getTransExpressInfo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.trans_ems</code>. EMS
     */
    public void setTransEms(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.trans_ems</code>. EMS
     */
    public Integer getTransEms() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.trans_ems_info</code>. EMS模板信息
     */
    public void setTransEmsInfo(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.trans_ems_info</code>. EMS模板信息
     */
    public String getTransEmsInfo() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.trans_mail</code>. 平邮
     */
    public void setTransMail(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.trans_mail</code>. 平邮
     */
    public Integer getTransMail() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.trans_mail_info</code>. 平邮模板信息
     */
    public void setTransMailInfo(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.trans_mail_info</code>. 平邮模板信息
     */
    public String getTransMailInfo() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.createtime</code>. 创建时间
     */
    public void setCreatetime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.createtime</code>. 创建时间
     */
    public Timestamp getCreatetime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>ejavashop.seller_transport.trans_time</code>. 发货时间
     */
    public void setTransTime(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>ejavashop.seller_transport.trans_time</code>. 发货时间
     */
    public Integer getTransTime() {
        return (Integer) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Integer, String, Integer, Integer, String, Integer, String, Integer, String, Timestamp, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Integer, String, Integer, Integer, String, Integer, String, Integer, String, Timestamp, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SellerTransport.SELLER_TRANSPORT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SellerTransport.SELLER_TRANSPORT.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SellerTransport.SELLER_TRANSPORT.SELLER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SellerTransport.SELLER_TRANSPORT.TRANS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return SellerTransport.SELLER_TRANSPORT.TRANS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return SellerTransport.SELLER_TRANSPORT.TRANS_EXPRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SellerTransport.SELLER_TRANSPORT.TRANS_EXPRESS_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return SellerTransport.SELLER_TRANSPORT.TRANS_EMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SellerTransport.SELLER_TRANSPORT.TRANS_EMS_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return SellerTransport.SELLER_TRANSPORT.TRANS_MAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SellerTransport.SELLER_TRANSPORT.TRANS_MAIL_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return SellerTransport.SELLER_TRANSPORT.CREATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return SellerTransport.SELLER_TRANSPORT.TRANS_TIME;
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
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSellerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTransName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getTransType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getTransExpress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTransExpressInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getTransEms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTransEmsInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getTransMail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getTransMailInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getTransTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value2(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value3(Integer value) {
        setSellerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value4(String value) {
        setTransName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value5(Integer value) {
        setTransType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value6(Integer value) {
        setTransExpress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value7(String value) {
        setTransExpressInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value8(Integer value) {
        setTransEms(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value9(String value) {
        setTransEmsInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value10(Integer value) {
        setTransMail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value11(String value) {
        setTransMailInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value12(Timestamp value) {
        setCreatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord value13(Integer value) {
        setTransTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerTransportRecord values(Integer value1, Integer value2, Integer value3, String value4, Integer value5, Integer value6, String value7, Integer value8, String value9, Integer value10, String value11, Timestamp value12, Integer value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SellerTransportRecord
     */
    public SellerTransportRecord() {
        super(SellerTransport.SELLER_TRANSPORT);
    }

    /**
     * Create a detached, initialised SellerTransportRecord
     */
    public SellerTransportRecord(Integer id, Integer state, Integer sellerId, String transName, Integer transType, Integer transExpress, String transExpressInfo, Integer transEms, String transEmsInfo, Integer transMail, String transMailInfo, Timestamp createtime, Integer transTime) {
        super(SellerTransport.SELLER_TRANSPORT);

        set(0, id);
        set(1, state);
        set(2, sellerId);
        set(3, transName);
        set(4, transType);
        set(5, transExpress);
        set(6, transExpressInfo);
        set(7, transEms);
        set(8, transEmsInfo);
        set(9, transMail);
        set(10, transMailInfo);
        set(11, createtime);
        set(12, transTime);
    }
}
