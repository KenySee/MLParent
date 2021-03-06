/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.SearchSetting;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 搜索设置
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SearchSettingRecord extends UpdatableRecordImpl<SearchSettingRecord> implements Record6<UInteger, String, Byte, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -556939127;

    /**
     * Setter for <code>ejavashop.search_setting.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.search_setting.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>ejavashop.search_setting.keyword</code>. 搜索框下关键字设置
     */
    public void setKeyword(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.search_setting.keyword</code>. 搜索框下关键字设置
     */
    public String getKeyword() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ejavashop.search_setting.keyword_filter</code>. 关键字过滤1、不过滤；2、过滤
     */
    public void setKeywordFilter(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.search_setting.keyword_filter</code>. 关键字过滤1、不过滤；2、过滤
     */
    public Byte getKeywordFilter() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>ejavashop.search_setting.index_product_id</code>. 索引处理到最大得商品ID，0为没有处理
     */
    public void setIndexProductId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.search_setting.index_product_id</code>. 索引处理到最大得商品ID，0为没有处理
     */
    public Integer getIndexProductId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ejavashop.search_setting.index_product_time</code>. 上次索引处理的时间
     */
    public void setIndexProductTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.search_setting.index_product_time</code>. 上次索引处理的时间
     */
    public Timestamp getIndexProductTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>ejavashop.search_setting.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.search_setting.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, String, Byte, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, String, Byte, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return SearchSetting.SEARCH_SETTING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SearchSetting.SEARCH_SETTING.KEYWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return SearchSetting.SEARCH_SETTING.KEYWORD_FILTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SearchSetting.SEARCH_SETTING.INDEX_PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return SearchSetting.SEARCH_SETTING.INDEX_PRODUCT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return SearchSetting.SEARCH_SETTING.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getKeyword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getKeywordFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getIndexProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getIndexProductTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchSettingRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchSettingRecord value2(String value) {
        setKeyword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchSettingRecord value3(Byte value) {
        setKeywordFilter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchSettingRecord value4(Integer value) {
        setIndexProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchSettingRecord value5(Timestamp value) {
        setIndexProductTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchSettingRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchSettingRecord values(UInteger value1, String value2, Byte value3, Integer value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SearchSettingRecord
     */
    public SearchSettingRecord() {
        super(SearchSetting.SEARCH_SETTING);
    }

    /**
     * Create a detached, initialised SearchSettingRecord
     */
    public SearchSettingRecord(UInteger id, String keyword, Byte keywordFilter, Integer indexProductId, Timestamp indexProductTime, Timestamp updateTime) {
        super(SearchSetting.SEARCH_SETTING);

        set(0, id);
        set(1, keyword);
        set(2, keywordFilter);
        set(3, indexProductId);
        set(4, indexProductTime);
        set(5, updateTime);
    }
}
