/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.ConfigRecord;

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
 * 系统配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Config extends TableImpl<ConfigRecord> {

    private static final long serialVersionUID = 572995155;

    /**
     * The reference instance of <code>ejavashop.config</code>
     */
    public static final Config CONFIG = new Config();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConfigRecord> getRecordType() {
        return ConfigRecord.class;
    }

    /**
     * The column <code>ejavashop.config.id</code>.
     */
    public final TableField<ConfigRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>ejavashop.config.integral_scale</code>. 积分换算比例，多少积分换算成1元人民币
     */
    public final TableField<ConfigRecord, Integer> INTEGRAL_SCALE = createField("integral_scale", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "积分换算比例，多少积分换算成1元人民币");

    /**
     * Create a <code>ejavashop.config</code> table reference
     */
    public Config() {
        this("config", null);
    }

    /**
     * Create an aliased <code>ejavashop.config</code> table reference
     */
    public Config(String alias) {
        this(alias, CONFIG);
    }

    private Config(String alias, Table<ConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private Config(String alias, Table<ConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "系统配置表");
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
    public Identity<ConfigRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ConfigRecord> getPrimaryKey() {
        return Keys.KEY_CONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<ConfigRecord>>asList(Keys.KEY_CONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Config as(String alias) {
        return new Config(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Config rename(String name) {
        return new Config(name, null);
    }
}
