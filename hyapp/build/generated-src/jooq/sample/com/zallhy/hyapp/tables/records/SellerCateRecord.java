/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.SellerCate;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 店铺分类
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SellerCateRecord extends UpdatableRecordImpl<SellerCateRecord> implements Record9<Integer, Integer, Integer, String, String, Integer, Integer, Timestamp, Byte> {

    private static final long serialVersionUID = 290351467;

    /**
     * Setter for <code>ejavashop.seller_cate.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.seller_cate.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.seller_cate.seller_id</code>. 商家id
     */
    public void setSellerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.seller_cate.seller_id</code>. 商家id
     */
    public Integer getSellerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.seller_cate.pid</code>. 父类ID
     */
    public void setPid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.seller_cate.pid</code>. 父类ID
     */
    public Integer getPid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ejavashop.seller_cate.name</code>. 分类名称
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.seller_cate.name</code>. 分类名称
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.seller_cate.path</code>. 分类路径
     */
    public void setPath(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.seller_cate.path</code>. 分类路径
     */
    public String getPath() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ejavashop.seller_cate.sort</code>. 排序
     */
    public void setSort(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.seller_cate.sort</code>. 排序
     */
    public Integer getSort() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ejavashop.seller_cate.create_id</code>. 创建人
     */
    public void setCreateId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.seller_cate.create_id</code>. 创建人
     */
    public Integer getCreateId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ejavashop.seller_cate.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.seller_cate.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ejavashop.seller_cate.status</code>. 1、显示；2、不显示；3、删除
     */
    public void setStatus(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.seller_cate.status</code>. 1、显示；2、不显示；3、删除
     */
    public Byte getStatus() {
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
    public Row9<Integer, Integer, Integer, String, String, Integer, Integer, Timestamp, Byte> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, String, String, Integer, Integer, Timestamp, Byte> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SellerCate.SELLER_CATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SellerCate.SELLER_CATE.SELLER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SellerCate.SELLER_CATE.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SellerCate.SELLER_CATE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SellerCate.SELLER_CATE.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return SellerCate.SELLER_CATE.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return SellerCate.SELLER_CATE.CREATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return SellerCate.SELLER_CATE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return SellerCate.SELLER_CATE.STATUS;
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
    public Integer value3() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCreateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerCateRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerCateRecord value2(Integer value) {
        setSellerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerCateRecord value3(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerCateRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerCateRecord value5(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerCateRecord value6(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerCateRecord value7(Integer value) {
        setCreateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerCateRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerCateRecord value9(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerCateRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, Integer value6, Integer value7, Timestamp value8, Byte value9) {
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
     * Create a detached SellerCateRecord
     */
    public SellerCateRecord() {
        super(SellerCate.SELLER_CATE);
    }

    /**
     * Create a detached, initialised SellerCateRecord
     */
    public SellerCateRecord(Integer id, Integer sellerId, Integer pid, String name, String path, Integer sort, Integer createId, Timestamp createTime, Byte status) {
        super(SellerCate.SELLER_CATE);

        set(0, id);
        set(1, sellerId);
        set(2, pid);
        set(3, name);
        set(4, path);
        set(5, sort);
        set(6, createId);
        set(7, createTime);
        set(8, status);
    }
}
