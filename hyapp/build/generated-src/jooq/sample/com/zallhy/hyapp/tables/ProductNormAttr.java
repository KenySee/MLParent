/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.ProductNormAttrRecord;

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
 * 规格属性表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductNormAttr extends TableImpl<ProductNormAttrRecord> {

    private static final long serialVersionUID = -1834629604;

    /**
     * The reference instance of <code>ejavashop.product_norm_attr</code>
     */
    public static final ProductNormAttr PRODUCT_NORM_ATTR = new ProductNormAttr();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductNormAttrRecord> getRecordType() {
        return ProductNormAttrRecord.class;
    }

    /**
     * The column <code>ejavashop.product_norm_attr.id</code>.
     */
    public final TableField<ProductNormAttrRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.product_norm_attr.name</code>. 属性名称
     */
    public final TableField<ProductNormAttrRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "属性名称");

    /**
     * The column <code>ejavashop.product_norm_attr.product_norm_id</code>. 规格ID
     */
    public final TableField<ProductNormAttrRecord, Integer> PRODUCT_NORM_ID = createField("product_norm_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "规格ID");

    /**
     * The column <code>ejavashop.product_norm_attr.sort</code>. 排序
     */
    public final TableField<ProductNormAttrRecord, Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "排序");

    /**
     * The column <code>ejavashop.product_norm_attr.create_id</code>. 创建人
     */
    public final TableField<ProductNormAttrRecord, Integer> CREATE_ID = createField("create_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "创建人");

    /**
     * The column <code>ejavashop.product_norm_attr.create_time</code>. 创建时间
     */
    public final TableField<ProductNormAttrRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>ejavashop.product_norm_attr.image</code>. 默认图片
     */
    public final TableField<ProductNormAttrRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "默认图片");

    /**
     * Create a <code>ejavashop.product_norm_attr</code> table reference
     */
    public ProductNormAttr() {
        this("product_norm_attr", null);
    }

    /**
     * Create an aliased <code>ejavashop.product_norm_attr</code> table reference
     */
    public ProductNormAttr(String alias) {
        this(alias, PRODUCT_NORM_ATTR);
    }

    private ProductNormAttr(String alias, Table<ProductNormAttrRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProductNormAttr(String alias, Table<ProductNormAttrRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "规格属性表");
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
    public Identity<ProductNormAttrRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PRODUCT_NORM_ATTR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProductNormAttrRecord> getPrimaryKey() {
        return Keys.KEY_PRODUCT_NORM_ATTR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductNormAttrRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductNormAttrRecord>>asList(Keys.KEY_PRODUCT_NORM_ATTR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductNormAttr as(String alias) {
        return new ProductNormAttr(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductNormAttr rename(String name) {
        return new ProductNormAttr(name, null);
    }
}
