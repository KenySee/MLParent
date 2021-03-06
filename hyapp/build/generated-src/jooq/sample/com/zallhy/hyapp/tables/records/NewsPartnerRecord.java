/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.NewsPartner;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 合作伙伴
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NewsPartnerRecord extends UpdatableRecordImpl<NewsPartnerRecord> implements Record9<Integer, String, String, String, Integer, Byte, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1017969076;

    /**
     * Setter for <code>ejavashop.news_partner.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.news_partner.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.news_partner.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.news_partner.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ejavashop.news_partner.image</code>. 图片标识
     */
    public void setImage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.news_partner.image</code>. 图片标识
     */
    public String getImage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.news_partner.url</code>. 链接
     */
    public void setUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.news_partner.url</code>. 链接
     */
    public String getUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.news_partner.sort</code>. 数字越小，越靠前
     */
    public void setSort(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.news_partner.sort</code>. 数字越小，越靠前
     */
    public Integer getSort() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ejavashop.news_partner.status</code>. 0、不可见；1、可见
     */
    public void setStatus(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.news_partner.status</code>. 0、不可见；1、可见
     */
    public Byte getStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>ejavashop.news_partner.create_id</code>.
     */
    public void setCreateId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.news_partner.create_id</code>.
     */
    public Integer getCreateId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ejavashop.news_partner.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.news_partner.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ejavashop.news_partner.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.news_partner.update_time</code>.
     */
    public Timestamp getUpdateTime() {
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
    public Row9<Integer, String, String, String, Integer, Byte, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, Integer, Byte, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return NewsPartner.NEWS_PARTNER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return NewsPartner.NEWS_PARTNER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return NewsPartner.NEWS_PARTNER.IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return NewsPartner.NEWS_PARTNER.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return NewsPartner.NEWS_PARTNER.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return NewsPartner.NEWS_PARTNER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return NewsPartner.NEWS_PARTNER.CREATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return NewsPartner.NEWS_PARTNER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return NewsPartner.NEWS_PARTNER.UPDATE_TIME;
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
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUrl();
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
    public Byte value6() {
        return getStatus();
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
    public Timestamp value9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsPartnerRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsPartnerRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsPartnerRecord value3(String value) {
        setImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsPartnerRecord value4(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsPartnerRecord value5(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsPartnerRecord value6(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsPartnerRecord value7(Integer value) {
        setCreateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsPartnerRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsPartnerRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsPartnerRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Byte value6, Integer value7, Timestamp value8, Timestamp value9) {
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
     * Create a detached NewsPartnerRecord
     */
    public NewsPartnerRecord() {
        super(NewsPartner.NEWS_PARTNER);
    }

    /**
     * Create a detached, initialised NewsPartnerRecord
     */
    public NewsPartnerRecord(Integer id, String name, String image, String url, Integer sort, Byte status, Integer createId, Timestamp createTime, Timestamp updateTime) {
        super(NewsPartner.NEWS_PARTNER);

        set(0, id);
        set(1, name);
        set(2, image);
        set(3, url);
        set(4, sort);
        set(5, status);
        set(6, createId);
        set(7, createTime);
        set(8, updateTime);
    }
}
