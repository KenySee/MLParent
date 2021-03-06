/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.ProductPictureBakRecord;

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
 * 商品对应图片表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductPictureBak extends TableImpl<ProductPictureBakRecord> {

    private static final long serialVersionUID = -1567517062;

    /**
     * The reference instance of <code>ejavashop.product_picture_bak</code>
     */
    public static final ProductPictureBak PRODUCT_PICTURE_BAK = new ProductPictureBak();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductPictureBakRecord> getRecordType() {
        return ProductPictureBakRecord.class;
    }

    /**
     * The column <code>ejavashop.product_picture_bak.id</code>.
     */
    public final TableField<ProductPictureBakRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.product_picture_bak.product_id</code>. 商品ID
     */
    public final TableField<ProductPictureBakRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品ID");

    /**
     * The column <code>ejavashop.product_picture_bak.image_path</code>. 图片路径
     */
    public final TableField<ProductPictureBakRecord, String> IMAGE_PATH = createField("image_path", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "图片路径");

    /**
     * The column <code>ejavashop.product_picture_bak.sort</code>. 排序
     */
    public final TableField<ProductPictureBakRecord, Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "排序");

    /**
     * The column <code>ejavashop.product_picture_bak.create_id</code>. 上传人
     */
    public final TableField<ProductPictureBakRecord, Integer> CREATE_ID = createField("create_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "上传人");

    /**
     * The column <code>ejavashop.product_picture_bak.create_time</code>. 上传时间
     */
    public final TableField<ProductPictureBakRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "上传时间");

    /**
     * The column <code>ejavashop.product_picture_bak.seller_id</code>. 商家ID
     */
    public final TableField<ProductPictureBakRecord, Integer> SELLER_ID = createField("seller_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商家ID");

    /**
     * The column <code>ejavashop.product_picture_bak.state</code>. 1、启用；2、不启用
     */
    public final TableField<ProductPictureBakRecord, Byte> STATE = createField("state", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "1、启用；2、不启用");

    /**
     * The column <code>ejavashop.product_picture_bak.product_lead</code>. 商品主图1、主图；2、非主图，主图只能有一张
     */
    public final TableField<ProductPictureBakRecord, Byte> PRODUCT_LEAD = createField("product_lead", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "商品主图1、主图；2、非主图，主图只能有一张");

    /**
     * Create a <code>ejavashop.product_picture_bak</code> table reference
     */
    public ProductPictureBak() {
        this("product_picture_bak", null);
    }

    /**
     * Create an aliased <code>ejavashop.product_picture_bak</code> table reference
     */
    public ProductPictureBak(String alias) {
        this(alias, PRODUCT_PICTURE_BAK);
    }

    private ProductPictureBak(String alias, Table<ProductPictureBakRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProductPictureBak(String alias, Table<ProductPictureBakRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "商品对应图片表");
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
    public Identity<ProductPictureBakRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PRODUCT_PICTURE_BAK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProductPictureBakRecord> getPrimaryKey() {
        return Keys.KEY_PRODUCT_PICTURE_BAK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductPictureBakRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductPictureBakRecord>>asList(Keys.KEY_PRODUCT_PICTURE_BAK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductPictureBak as(String alias) {
        return new ProductPictureBak(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductPictureBak rename(String name) {
        return new ProductPictureBak(name, null);
    }
}
