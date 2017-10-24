/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.SearchKeywordRecord;

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
 * 搜索敏感词过滤
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SearchKeyword extends TableImpl<SearchKeywordRecord> {

    private static final long serialVersionUID = 291198964;

    /**
     * The reference instance of <code>ejavashop.search_keyword</code>
     */
    public static final SearchKeyword SEARCH_KEYWORD = new SearchKeyword();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SearchKeywordRecord> getRecordType() {
        return SearchKeywordRecord.class;
    }

    /**
     * The column <code>ejavashop.search_keyword.id</code>.
     */
    public final TableField<SearchKeywordRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>ejavashop.search_keyword.keyword</code>. 关键字
     */
    public final TableField<SearchKeywordRecord, String> KEYWORD = createField("keyword", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "关键字");

    /**
     * The column <code>ejavashop.search_keyword.create_time</code>. 添加时间
     */
    public final TableField<SearchKeywordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "添加时间");

    /**
     * The column <code>ejavashop.search_keyword.create_id</code>.
     */
    public final TableField<SearchKeywordRecord, Integer> CREATE_ID = createField("create_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.search_keyword.create_name</code>.
     */
    public final TableField<SearchKeywordRecord, String> CREATE_NAME = createField("create_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ejavashop.search_keyword.update_time</code>.
     */
    public final TableField<SearchKeywordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>ejavashop.search_keyword</code> table reference
     */
    public SearchKeyword() {
        this("search_keyword", null);
    }

    /**
     * Create an aliased <code>ejavashop.search_keyword</code> table reference
     */
    public SearchKeyword(String alias) {
        this(alias, SEARCH_KEYWORD);
    }

    private SearchKeyword(String alias, Table<SearchKeywordRecord> aliased) {
        this(alias, aliased, null);
    }

    private SearchKeyword(String alias, Table<SearchKeywordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "搜索敏感词过滤");
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
    public Identity<SearchKeywordRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_SEARCH_KEYWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SearchKeywordRecord> getPrimaryKey() {
        return Keys.KEY_SEARCH_KEYWORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SearchKeywordRecord>> getKeys() {
        return Arrays.<UniqueKey<SearchKeywordRecord>>asList(Keys.KEY_SEARCH_KEYWORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchKeyword as(String alias) {
        return new SearchKeyword(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SearchKeyword rename(String name) {
        return new SearchKeyword(name, null);
    }
}