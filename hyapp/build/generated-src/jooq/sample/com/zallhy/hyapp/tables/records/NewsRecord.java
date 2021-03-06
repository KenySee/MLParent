/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.News;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 新闻资讯
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NewsRecord extends UpdatableRecordImpl<NewsRecord> implements Record15<Integer, Integer, String, String, String, String, String, Byte, String, Byte, Integer, Byte, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1170910899;

    /**
     * Setter for <code>ejavashop.news.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.news.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.news.type_id</code>.
     */
    public void setTypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.news.type_id</code>.
     */
    public Integer getTypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.news.type_path</code>.
     */
    public void setTypePath(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.news.type_path</code>.
     */
    public String getTypePath() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.news.title</code>. 新闻标题
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.news.title</code>. 新闻标题
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.news.content</code>.
     */
    public void setContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.news.content</code>.
     */
    public String getContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ejavashop.news.author</code>. 作者
     */
    public void setAuthor(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.news.author</code>. 作者
     */
    public String getAuthor() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ejavashop.news.source</code>. 来源
     */
    public void setSource(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.news.source</code>. 来源
     */
    public String getSource() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ejavashop.news.is_out</code>. 是否是外部链接0、不是；1、是
     */
    public void setIsOut(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.news.is_out</code>. 是否是外部链接0、不是；1、是
     */
    public Byte getIsOut() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>ejavashop.news.out_url</code>. 外部链接的URL
     */
    public void setOutUrl(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.news.out_url</code>. 外部链接的URL
     */
    public String getOutUrl() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ejavashop.news.status</code>. 0、不显示；1、显示
     */
    public void setStatus(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>ejavashop.news.status</code>. 0、不显示；1、显示
     */
    public Byte getStatus() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>ejavashop.news.sort</code>. 排序
     */
    public void setSort(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>ejavashop.news.sort</code>. 排序
     */
    public Integer getSort() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>ejavashop.news.is_recommend</code>. 是否推荐文章0、不是推荐文章；1、推荐文章
     */
    public void setIsRecommend(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>ejavashop.news.is_recommend</code>. 是否推荐文章0、不是推荐文章；1、推荐文章
     */
    public Byte getIsRecommend() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>ejavashop.news.create_id</code>.
     */
    public void setCreateId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>ejavashop.news.create_id</code>.
     */
    public Integer getCreateId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>ejavashop.news.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>ejavashop.news.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>ejavashop.news.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>ejavashop.news.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, String, String, String, String, String, Byte, String, Byte, Integer, Byte, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, String, String, String, String, String, Byte, String, Byte, Integer, Byte, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return News.NEWS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return News.NEWS.TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return News.NEWS.TYPE_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return News.NEWS.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return News.NEWS.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return News.NEWS.AUTHOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return News.NEWS.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return News.NEWS.IS_OUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return News.NEWS.OUT_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return News.NEWS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return News.NEWS.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return News.NEWS.IS_RECOMMEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return News.NEWS.CREATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return News.NEWS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return News.NEWS.UPDATE_TIME;
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
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTypePath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getIsOut();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOutUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getIsRecommend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getCreateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value2(Integer value) {
        setTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value3(String value) {
        setTypePath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value4(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value5(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value6(String value) {
        setAuthor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value7(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value8(Byte value) {
        setIsOut(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value9(String value) {
        setOutUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value10(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value11(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value12(Byte value) {
        setIsRecommend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value13(Integer value) {
        setCreateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value14(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord value15(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewsRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, Byte value8, String value9, Byte value10, Integer value11, Byte value12, Integer value13, Timestamp value14, Timestamp value15) {
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
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NewsRecord
     */
    public NewsRecord() {
        super(News.NEWS);
    }

    /**
     * Create a detached, initialised NewsRecord
     */
    public NewsRecord(Integer id, Integer typeId, String typePath, String title, String content, String author, String source, Byte isOut, String outUrl, Byte status, Integer sort, Byte isRecommend, Integer createId, Timestamp createTime, Timestamp updateTime) {
        super(News.NEWS);

        set(0, id);
        set(1, typeId);
        set(2, typePath);
        set(3, title);
        set(4, content);
        set(5, author);
        set(6, source);
        set(7, isOut);
        set(8, outUrl);
        set(9, status);
        set(10, sort);
        set(11, isRecommend);
        set(12, createId);
        set(13, createTime);
        set(14, updateTime);
    }
}
