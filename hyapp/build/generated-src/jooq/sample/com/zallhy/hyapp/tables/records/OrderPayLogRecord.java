/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.OrderPayLog;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 订单支付记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderPayLogRecord extends UpdatableRecordImpl<OrderPayLogRecord> implements Record9<Integer, Integer, String, String, String, BigDecimal, Integer, String, Timestamp> {

    private static final long serialVersionUID = -2034978349;

    /**
     * Setter for <code>ejavashop.order_pay_log.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.order_pay_log.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.order_pay_log.orders_id</code>.
     */
    public void setOrdersId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.order_pay_log.orders_id</code>.
     */
    public Integer getOrdersId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.order_pay_log.orders_sn</code>.
     */
    public void setOrdersSn(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.order_pay_log.orders_sn</code>.
     */
    public String getOrdersSn() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.order_pay_log.pay_status</code>. 支付方式
     */
    public void setPayStatus(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.order_pay_log.pay_status</code>. 支付方式
     */
    public String getPayStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.order_pay_log.pay_content</code>. 支付返回的代码
     */
    public void setPayContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.order_pay_log.pay_content</code>. 支付返回的代码
     */
    public String getPayContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ejavashop.order_pay_log.pay_money</code>. 支付金额
     */
    public void setPayMoney(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.order_pay_log.pay_money</code>. 支付金额
     */
    public BigDecimal getPayMoney() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>ejavashop.order_pay_log.member_id</code>.
     */
    public void setMemberId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.order_pay_log.member_id</code>.
     */
    public Integer getMemberId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ejavashop.order_pay_log.member_name</code>.
     */
    public void setMemberName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.order_pay_log.member_name</code>.
     */
    public String getMemberName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ejavashop.order_pay_log.create_time</code>. 支付时间
     */
    public void setCreateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.order_pay_log.create_time</code>. 支付时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, String, String, BigDecimal, Integer, String, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, String, String, BigDecimal, Integer, String, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OrderPayLog.ORDER_PAY_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return OrderPayLog.ORDER_PAY_LOG.ORDERS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OrderPayLog.ORDER_PAY_LOG.ORDERS_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OrderPayLog.ORDER_PAY_LOG.PAY_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return OrderPayLog.ORDER_PAY_LOG.PAY_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return OrderPayLog.ORDER_PAY_LOG.PAY_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return OrderPayLog.ORDER_PAY_LOG.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return OrderPayLog.ORDER_PAY_LOG.MEMBER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return OrderPayLog.ORDER_PAY_LOG.CREATE_TIME;
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
        return getOrdersId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOrdersSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPayStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPayContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getPayMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMemberName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPayLogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPayLogRecord value2(Integer value) {
        setOrdersId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPayLogRecord value3(String value) {
        setOrdersSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPayLogRecord value4(String value) {
        setPayStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPayLogRecord value5(String value) {
        setPayContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPayLogRecord value6(BigDecimal value) {
        setPayMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPayLogRecord value7(Integer value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPayLogRecord value8(String value) {
        setMemberName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPayLogRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderPayLogRecord values(Integer value1, Integer value2, String value3, String value4, String value5, BigDecimal value6, Integer value7, String value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderPayLogRecord
     */
    public OrderPayLogRecord() {
        super(OrderPayLog.ORDER_PAY_LOG);
    }

    /**
     * Create a detached, initialised OrderPayLogRecord
     */
    public OrderPayLogRecord(Integer id, Integer ordersId, String ordersSn, String payStatus, String payContent, BigDecimal payMoney, Integer memberId, String memberName, Timestamp createTime) {
        super(OrderPayLog.ORDER_PAY_LOG);

        set(0, id);
        set(1, ordersId);
        set(2, ordersSn);
        set(3, payStatus);
        set(4, payContent);
        set(5, payMoney);
        set(6, memberId);
        set(7, memberName);
        set(8, createTime);
    }
}
