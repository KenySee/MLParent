/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.ProductNormAttr;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 规格属性表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductNormAttrRecord extends UpdatableRecordImpl<ProductNormAttrRecord> implements Record7<Integer, String, Integer, Integer, Integer, Timestamp, String> {

    private static final long serialVersionUID = -1122125640;

    /**
     * Setter for <code>ejavashop.product_norm_attr.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm_attr.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.product_norm_attr.name</code>. 属性名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm_attr.name</code>. 属性名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ejavashop.product_norm_attr.product_norm_id</code>. 规格ID
     */
    public void setProductNormId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm_attr.product_norm_id</code>. 规格ID
     */
    public Integer getProductNormId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ejavashop.product_norm_attr.sort</code>. 排序
     */
    public void setSort(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm_attr.sort</code>. 排序
     */
    public Integer getSort() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ejavashop.product_norm_attr.create_id</code>. 创建人
     */
    public void setCreateId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm_attr.create_id</code>. 创建人
     */
    public Integer getCreateId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ejavashop.product_norm_attr.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm_attr.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ejavashop.product_norm_attr.image</code>. 默认图片
     */
    public void setImage(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.product_norm_attr.image</code>. 默认图片
     */
    public String getImage() {
        return (String) get(6);
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
    public Row7<Integer, String, Integer, Integer, Integer, Timestamp, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Integer, Integer, Integer, Timestamp, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ProductNormAttr.PRODUCT_NORM_ATTR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ProductNormAttr.PRODUCT_NORM_ATTR.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ProductNormAttr.PRODUCT_NORM_ATTR.PRODUCT_NORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ProductNormAttr.PRODUCT_NORM_ATTR.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ProductNormAttr.PRODUCT_NORM_ATTR.CREATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ProductNormAttr.PRODUCT_NORM_ATTR.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ProductNormAttr.PRODUCT_NORM_ATTR.IMAGE;
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
        return getProductNormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getSort();
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
    public String value7() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormAttrRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormAttrRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormAttrRecord value3(Integer value) {
        setProductNormId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormAttrRecord value4(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormAttrRecord value5(Integer value) {
        setCreateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormAttrRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormAttrRecord value7(String value) {
        setImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormAttrRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, Timestamp value6, String value7) {
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
     * Create a detached ProductNormAttrRecord
     */
    public ProductNormAttrRecord() {
        super(ProductNormAttr.PRODUCT_NORM_ATTR);
    }

    /**
     * Create a detached, initialised ProductNormAttrRecord
     */
    public ProductNormAttrRecord(Integer id, String name, Integer productNormId, Integer sort, Integer createId, Timestamp createTime, String image) {
        super(ProductNormAttr.PRODUCT_NORM_ATTR);

        set(0, id);
        set(1, name);
        set(2, productNormId);
        set(3, sort);
        set(4, createId);
        set(5, createTime);
        set(6, image);
    }
}