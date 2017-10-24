/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.SellerQq;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 商家客服QQ
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SellerQqRecord extends UpdatableRecordImpl<SellerQqRecord> implements Record7<Integer, Integer, String, String, Integer, Timestamp, Byte> {

    private static final long serialVersionUID = -161935789;

    /**
     * Setter for <code>ejavashop.seller_qq.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.seller_qq.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.seller_qq.seller_id</code>. 商家ID
     */
    public void setSellerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.seller_qq.seller_id</code>. 商家ID
     */
    public Integer getSellerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.seller_qq.name</code>. 客服名称
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.seller_qq.name</code>. 客服名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.seller_qq.qq</code>. 客服QQ
     */
    public void setQq(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.seller_qq.qq</code>. 客服QQ
     */
    public String getQq() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.seller_qq.create_id</code>. 创建人
     */
    public void setCreateId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.seller_qq.create_id</code>. 创建人
     */
    public Integer getCreateId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ejavashop.seller_qq.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.seller_qq.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ejavashop.seller_qq.state</code>. 1、显示；2、不显示；3、删除
     */
    public void setState(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.seller_qq.state</code>. 1、显示；2、不显示；3、删除
     */
    public Byte getState() {
        return (Byte) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, String, Integer, Timestamp, Byte> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, String, Integer, Timestamp, Byte> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SellerQq.SELLER_QQ.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SellerQq.SELLER_QQ.SELLER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SellerQq.SELLER_QQ.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SellerQq.SELLER_QQ.QQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return SellerQq.SELLER_QQ.CREATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return SellerQq.SELLER_QQ.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return SellerQq.SELLER_QQ.STATE;
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
        return getSellerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getQq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCreateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerQqRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerQqRecord value2(Integer value) {
        setSellerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerQqRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerQqRecord value4(String value) {
        setQq(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerQqRecord value5(Integer value) {
        setCreateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerQqRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerQqRecord value7(Byte value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerQqRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, Timestamp value6, Byte value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SellerQqRecord
     */
    public SellerQqRecord() {
        super(SellerQq.SELLER_QQ);
    }

    /**
     * Create a detached, initialised SellerQqRecord
     */
    public SellerQqRecord(Integer id, Integer sellerId, String name, String qq, Integer createId, Timestamp createTime, Byte state) {
        super(SellerQq.SELLER_QQ);

        set(0, id);
        set(1, sellerId);
        set(2, name);
        set(3, qq);
        set(4, createId);
        set(5, createTime);
        set(6, state);
    }
}
