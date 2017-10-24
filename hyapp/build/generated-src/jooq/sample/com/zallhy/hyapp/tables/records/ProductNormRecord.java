/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.ProductNorm;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 商品规格表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductNormRecord extends UpdatableRecordImpl<ProductNormRecord> implements Record9<Integer, String, Integer, Byte, Integer, Timestamp, Integer, Timestamp, Byte> {

    private static final long serialVersionUID = -1304156972;

    /**
     * Setter for <code>ejavashop.product_norm.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.product_norm.name</code>. 规格名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm.name</code>. 规格名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ejavashop.product_norm.sort</code>. 排序
     */
    public void setSort(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm.sort</code>. 排序
     */
    public Integer getSort() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ejavashop.product_norm.type</code>. 规格类型1、文字；2、图片
     */
    public void setType(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm.type</code>. 规格类型1、文字；2、图片
     */
    public Byte getType() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>ejavashop.product_norm.create_id</code>. 创建人
     */
    public void setCreateId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm.create_id</code>. 创建人
     */
    public Integer getCreateId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ejavashop.product_norm.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ejavashop.product_norm.update_id</code>. 更新人
     */
    public void setUpdateId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm.update_id</code>. 更新人
     */
    public Integer getUpdateId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ejavashop.product_norm.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ejavashop.product_norm.state</code>. 状态 0：删除 1:正常
     */
    public void setState(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm.state</code>. 状态 0：删除 1:正常
     */
    public Byte getState() {
        return (Byte) get(8);
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
    public Row9<Integer, String, Integer, Byte, Integer, Timestamp, Integer, Timestamp, Byte> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Integer, Byte, Integer, Timestamp, Integer, Timestamp, Byte> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ProductNorm.PRODUCT_NORM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ProductNorm.PRODUCT_NORM.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ProductNorm.PRODUCT_NORM.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return ProductNorm.PRODUCT_NORM.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ProductNorm.PRODUCT_NORM.CREATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ProductNorm.PRODUCT_NORM.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ProductNorm.PRODUCT_NORM.UPDATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ProductNorm.PRODUCT_NORM.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return ProductNorm.PRODUCT_NORM.STATE;
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getType();
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
    public Integer value7() {
        return getUpdateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormRecord value3(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormRecord value4(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormRecord value5(Integer value) {
        setCreateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormRecord value7(Integer value) {
        setUpdateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormRecord value8(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormRecord value9(Byte value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormRecord values(Integer value1, String value2, Integer value3, Byte value4, Integer value5, Timestamp value6, Integer value7, Timestamp value8, Byte value9) {
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
     * Create a detached ProductNormRecord
     */
    public ProductNormRecord() {
        super(ProductNorm.PRODUCT_NORM);
    }

    /**
     * Create a detached, initialised ProductNormRecord
     */
    public ProductNormRecord(Integer id, String name, Integer sort, Byte type, Integer createId, Timestamp createTime, Integer updateId, Timestamp updateTime, Byte state) {
        super(ProductNorm.PRODUCT_NORM);

        set(0, id);
        set(1, name);
        set(2, sort);
        set(3, type);
        set(4, createId);
        set(5, createTime);
        set(6, updateId);
        set(7, updateTime);
        set(8, state);
    }
}