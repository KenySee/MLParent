/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.NewsType;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 文章分类
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NewsTypeRecord extends UpdatableRecordImpl<NewsTypeRecord> implements Record7<Integer, Integer, String, String, Integer, String, Timestamp> {

    private static final long serialVersionUID = 2027320215;

    /**
     * Setter for <code>ejavashop.news_type.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.news_type.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.news_type.pid</code>.
     */
    public void setPid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.news_type.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.news_type.parent_path</code>.
     */
    public void setParentPath(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.news_type.parent_path</code>.
     */
    public String getParentPath() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.news_type.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.news_type.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.news_type.sort</code>. 序号越小，越靠前
     */
    public void setSort(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.news_type.sort</code>. 序号越小，越靠前
     */
    public Integer getSort() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ejavashop.news_type.image</code>. 分类图片
     */
    public void setImage(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.news_type.image</code>. 分类图片
     */
    public String getImage() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ejavashop.news_type.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.news_type.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(6);
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
    public Row7<Integer, Integer, String, String, Integer, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, String, Integer, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return NewsType.NEWS_TYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return NewsType.NEWS_TYPE.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return NewsType.NEWS_TYPE.PARENT_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return NewsType.NEWS_TYPE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return NewsType.NEWS_TYPE.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return NewsType.NEWS_TYPE.IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return NewsType.NEWS_TYPE.CREATE_TIME;
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
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParentPath();
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
    public Integer value5() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsTypeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsTypeRecord value2(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsTypeRecord value3(String value) {
        setParentPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsTypeRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsTypeRecord value5(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsTypeRecord value6(String value) {
        setImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsTypeRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsTypeRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, String value6, Timestamp value7) {
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
     * Create a detached NewsTypeRecord
     */
    public NewsTypeRecord() {
        super(NewsType.NEWS_TYPE);
    }

    /**
     * Create a detached, initialised NewsTypeRecord
     */
    public NewsTypeRecord(Integer id, Integer pid, String parentPath, String name, Integer sort, String image, Timestamp createTime) {
        super(NewsType.NEWS_TYPE);

        set(0, id);
        set(1, pid);
        set(2, parentPath);
        set(3, name);
        set(4, sort);
        set(5, image);
        set(6, createTime);
    }
}
