/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.SearchSettingRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
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
public class SearchSetting extends TableImpl<SearchSettingRecord> {

    private static final long serialVersionUID = -775319379;

    /**
     * The reference instance of <code>ejavashop.search_setting</code>
     */
    public static final SearchSetting SEARCH_SETTING = new SearchSetting();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SearchSettingRecord> getRecordType() {
        return SearchSettingRecord.class;
    }

    /**
     * The column <code>ejavashop.search_setting.id</code>.
     */
    public final TableField<SearchSettingRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>ejavashop.search_setting.keyword</code>. 搜索框下关键字设置
     */
    public final TableField<SearchSettingRecord, String> KEYWORD = createField("keyword", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "搜索框下关键字设置");

    /**
     * The column <code>ejavashop.search_setting.keyword_filter</code>. 关键字过滤1、不过滤；2、过滤
     */
    public final TableField<SearchSettingRecord, Byte> KEYWORD_FILTER = createField("keyword_filter", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "关键字过滤1、不过滤；2、过滤");

    /**
     * The column <code>ejavashop.search_setting.index_product_id</code>. 索引处理到最大得商品ID，0为没有处理
     */
    public final TableField<SearchSettingRecord, Integer> INDEX_PRODUCT_ID = createField("index_product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "索引处理到最大得商品ID，0为没有处理");

    /**
     * The column <code>ejavashop.search_setting.index_product_time</code>. 上次索引处理的时间
     */
    public final TableField<SearchSettingRecord, Timestamp> INDEX_PRODUCT_TIME = createField("index_product_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "上次索引处理的时间");

    /**
     * The column <code>ejavashop.search_setting.update_time</code>. 更新时间
     */
    public final TableField<SearchSettingRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "更新时间");

    /**
     * Create a <code>ejavashop.search_setting</code> table reference
     */
    public SearchSetting() {
        this("search_setting", null);
    }

    /**
     * Create an aliased <code>ejavashop.search_setting</code> table reference
     */
    public SearchSetting(String alias) {
        this(alias, SEARCH_SETTING);
    }

    private SearchSetting(String alias, Table<SearchSettingRecord> aliased) {
        this(alias, aliased, null);
    }

    private SearchSetting(String alias, Table<SearchSettingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "搜索设置");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Ejavashop.EJAVASHOP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SearchSettingRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_SEARCH_SETTING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SearchSettingRecord> getPrimaryKey() {
        return Keys.KEY_SEARCH_SETTING_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SearchSettingRecord>> getKeys() {
        return Arrays.<UniqueKey<SearchSettingRecord>>asList(Keys.KEY_SEARCH_SETTING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchSetting as(String alias) {
        return new SearchSetting(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SearchSetting rename(String name) {
        return new SearchSetting(name, null);
    }
}
