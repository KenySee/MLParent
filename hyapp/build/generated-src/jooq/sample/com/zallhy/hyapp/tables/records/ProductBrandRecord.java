/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.ProductBrand;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 商品品牌
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductBrandRecord extends UpdatableRecordImpl<ProductBrandRecord> implements Record12<Integer, String, String, String, Byte, Byte, Integer, Integer, Timestamp, Integer, Timestamp, Byte> {

    private static final long serialVersionUID = -991556358;

    /**
     * Setter for <code>ejavashop.product_brand.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.product_brand.name</code>. 品牌名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.name</code>. 品牌名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ejavashop.product_brand.name_first</code>. 品牌首字母
     */
    public void setNameFirst(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.name_first</code>. 品牌首字母
     */
    public String getNameFirst() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.product_brand.image</code>. 品牌图片
     */
    public void setImage(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.image</code>. 品牌图片
     */
    public String getImage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.product_brand.look_method</code>. 展示方式1、图片；2、文字
     */
    public void setLookMethod(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.look_method</code>. 展示方式1、图片；2、文字
     */
    public Byte getLookMethod() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>ejavashop.product_brand.top</code>. 推荐1、推荐；2、不推荐
     */
    public void setTop(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.top</code>. 推荐1、推荐；2、不推荐
     */
    public Byte getTop() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>ejavashop.product_brand.sort</code>. 排序
     */
    public void setSort(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.sort</code>. 排序
     */
    public Integer getSort() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ejavashop.product_brand.create_id</code>. 创建人
     */
    public void setCreateId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.create_id</code>. 创建人
     */
    public Integer getCreateId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ejavashop.product_brand.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ejavashop.product_brand.update_id</code>. 更新人
     */
    public void setUpdateId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.update_id</code>. 更新人
     */
    public Integer getUpdateId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ejavashop.product_brand.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ejavashop.product_brand.state</code>. 状态 0、默认；1、提交审核；2、显示中；3、审核失败；4、删除
     */
    public void setState(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>ejavashop.product_brand.state</code>. 状态 0、默认；1、提交审核；2、显示中；3、审核失败；4、删除
     */
    public Byte getState() {
        return (Byte) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, Byte, Byte, Integer, Integer, Timestamp, Integer, Timestamp, Byte> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, Byte, Byte, Integer, Integer, Timestamp, Integer, Timestamp, Byte> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ProductBrand.PRODUCT_BRAND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ProductBrand.PRODUCT_BRAND.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ProductBrand.PRODUCT_BRAND.NAME_FIRST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ProductBrand.PRODUCT_BRAND.IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return ProductBrand.PRODUCT_BRAND.LOOK_METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return ProductBrand.PRODUCT_BRAND.TOP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ProductBrand.PRODUCT_BRAND.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ProductBrand.PRODUCT_BRAND.CREATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return ProductBrand.PRODUCT_BRAND.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ProductBrand.PRODUCT_BRAND.UPDATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return ProductBrand.PRODUCT_BRAND.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return ProductBrand.PRODUCT_BRAND.STATE;
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
    public String value3() {
        return getNameFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getLookMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getTop();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCreateId();
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
    public Integer value10() {
        return getUpdateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value3(String value) {
        setNameFirst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value4(String value) {
        setImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value5(Byte value) {
        setLookMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value6(Byte value) {
        setTop(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value7(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value8(Integer value) {
        setCreateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value10(Integer value) {
        setUpdateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value11(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord value12(Byte value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBrandRecord values(Integer value1, String value2, String value3, String value4, Byte value5, Byte value6, Integer value7, Integer value8, Timestamp value9, Integer value10, Timestamp value11, Byte value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductBrandRecord
     */
    public ProductBrandRecord() {
        super(ProductBrand.PRODUCT_BRAND);
    }

    /**
     * Create a detached, initialised ProductBrandRecord
     */
    public ProductBrandRecord(Integer id, String name, String nameFirst, String image, Byte lookMethod, Byte top, Integer sort, Integer createId, Timestamp createTime, Integer updateId, Timestamp updateTime, Byte state) {
        super(ProductBrand.PRODUCT_BRAND);

        set(0, id);
        set(1, name);
        set(2, nameFirst);
        set(3, image);
        set(4, lookMethod);
        set(5, top);
        set(6, sort);
        set(7, createId);
        set(8, createTime);
        set(9, updateId);
        set(10, updateTime);
        set(11, state);
    }
}
