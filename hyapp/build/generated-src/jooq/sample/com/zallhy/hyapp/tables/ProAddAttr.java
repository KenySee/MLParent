/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.ProAddAttrRecord;

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
 * 商品拓展属性表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProAddAttr extends TableImpl<ProAddAttrRecord> {

    private static final long serialVersionUID = 752124194;

    /**
     * The reference instance of <code>ejavashop.pro_add_attr</code>
     */
    public static final ProAddAttr PRO_ADD_ATTR = new ProAddAttr();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProAddAttrRecord> getRecordType() {
        return ProAddAttrRecord.class;
    }

    /**
     * The column <code>ejavashop.pro_add_attr.attr_id</code>. 属性id
     */
    public final TableField<ProAddAttrRecord, Integer> ATTR_ID = createField("attr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "属性id");

    /**
     * The column <code>ejavashop.pro_add_attr.product_id</code>. 商品id
     */
    public final TableField<ProAddAttrRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品id");

    /**
     * The column <code>ejavashop.pro_add_attr.attr_name</code>. 商品属性名
     */
    public final TableField<ProAddAttrRecord, String> ATTR_NAME = createField("attr_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "商品属性名");

    /**
     * The column <code>ejavashop.pro_add_attr.attr_value</code>. 商品属性值
     */
    public final TableField<ProAddAttrRecord, String> ATTR_VALUE = createField("attr_value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "商品属性值");

    /**
     * Create a <code>ejavashop.pro_add_attr</code> table reference
     */
    public ProAddAttr() {
        this("pro_add_attr", null);
    }

    /**
     * Create an aliased <code>ejavashop.pro_add_attr</code> table reference
     */
    public ProAddAttr(String alias) {
        this(alias, PRO_ADD_ATTR);
    }

    private ProAddAttr(String alias, Table<ProAddAttrRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProAddAttr(String alias, Table<ProAddAttrRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "商品拓展属性表");
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
    public Identity<ProAddAttrRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PRO_ADD_ATTR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProAddAttrRecord> getPrimaryKey() {
        return Keys.KEY_PRO_ADD_ATTR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProAddAttrRecord>> getKeys() {
        return Arrays.<UniqueKey<ProAddAttrRecord>>asList(Keys.KEY_PRO_ADD_ATTR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProAddAttr as(String alias) {
        return new ProAddAttr(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProAddAttr rename(String name) {
        return new ProAddAttr(name, null);
    }
}