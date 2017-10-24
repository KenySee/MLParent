/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.SellerTypeRecord;

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


/**
 * 商家类型
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SellerType extends TableImpl<SellerTypeRecord> {

    private static final long serialVersionUID = -2117901621;

    /**
     * The reference instance of <code>ejavashop.seller_type</code>
     */
    public static final SellerType SELLER_TYPE = new SellerType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SellerTypeRecord> getRecordType() {
        return SellerTypeRecord.class;
    }

    /**
     * The column <code>ejavashop.seller_type.id</code>.
     */
    public final TableField<SellerTypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.seller_type.name</code>. 类型名称
     */
    public final TableField<SellerTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "类型名称");

    /**
     * The column <code>ejavashop.seller_type.money</code>. 保证金数额
     */
    public final TableField<SellerTypeRecord, Integer> MONEY = createField("money", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "保证金数额");

    /**
     * The column <code>ejavashop.seller_type.state</code>. 状态1、显示；2、不显示
     */
    public final TableField<SellerTypeRecord, Byte> STATE = createField("state", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "状态1、显示；2、不显示");

    /**
     * The column <code>ejavashop.seller_type.sort</code>. 排序
     */
    public final TableField<SellerTypeRecord, Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "排序");

    /**
     * The column <code>ejavashop.seller_type.create_id</code>. 创建人
     */
    public final TableField<SellerTypeRecord, Integer> CREATE_ID = createField("create_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "创建人");

    /**
     * The column <code>ejavashop.seller_type.create_time</code>. 创建时间
     */
    public final TableField<SellerTypeRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>ejavashop.seller_type.update_time</code>. 更新时间
     */
    public final TableField<SellerTypeRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "更新时间");

    /**
     * Create a <code>ejavashop.seller_type</code> table reference
     */
    public SellerType() {
        this("seller_type", null);
    }

    /**
     * Create an aliased <code>ejavashop.seller_type</code> table reference
     */
    public SellerType(String alias) {
        this(alias, SELLER_TYPE);
    }

    private SellerType(String alias, Table<SellerTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private SellerType(String alias, Table<SellerTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "商家类型");
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
    public Identity<SellerTypeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SELLER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SellerTypeRecord> getPrimaryKey() {
        return Keys.KEY_SELLER_TYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SellerTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<SellerTypeRecord>>asList(Keys.KEY_SELLER_TYPE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerType as(String alias) {
        return new SellerType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerType rename(String name) {
        return new SellerType(name, null);
    }
}
