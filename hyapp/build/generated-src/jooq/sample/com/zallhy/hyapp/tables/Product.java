/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.ProductRecord;

import java.math.BigDecimal;
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
 * 商品表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Product extends TableImpl<ProductRecord> {

    private static final long serialVersionUID = 825520535;

    /**
     * The reference instance of <code>ejavashop.product</code>
     */
    public static final Product PRODUCT = new Product();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductRecord> getRecordType() {
        return ProductRecord.class;
    }

    /**
     * The column <code>ejavashop.product.id</code>.
     */
    public final TableField<ProductRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.product.product_cate_id</code>. 分类ID
     */
    public final TableField<ProductRecord, Integer> PRODUCT_CATE_ID = createField("product_cate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "分类ID");

    /**
     * The column <code>ejavashop.product.name1</code>. 商品名称建议50个字符
     */
    public final TableField<ProductRecord, String> NAME1 = createField("name1", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商品名称建议50个字符");

    /**
     * The column <code>ejavashop.product.name2</code>. 商品促销信息（建议100个字符）
     */
    public final TableField<ProductRecord, String> NAME2 = createField("name2", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商品促销信息（建议100个字符）");

    /**
     * The column <code>ejavashop.product.keyword</code>. 商品关键字，用于检索商品，用逗号分隔
     */
    public final TableField<ProductRecord, String> KEYWORD = createField("keyword", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "商品关键字，用于检索商品，用逗号分隔");

    /**
     * The column <code>ejavashop.product.product_brand_id</code>. 品牌ID
     */
    public final TableField<ProductRecord, Integer> PRODUCT_BRAND_ID = createField("product_brand_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "品牌ID");

    /**
     * The column <code>ejavashop.product.is_self</code>. 1、自营；2、商家
     */
    public final TableField<ProductRecord, Byte> IS_SELF = createField("is_self", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "1、自营；2、商家");

    /**
     * The column <code>ejavashop.product.cost_price</code>. 成本价
     */
    public final TableField<ProductRecord, BigDecimal> COST_PRICE = createField("cost_price", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "成本价");

    /**
     * The column <code>ejavashop.product.protected_price</code>. 保护价，最低价格不能低于
     */
    public final TableField<ProductRecord, BigDecimal> PROTECTED_PRICE = createField("protected_price", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "保护价，最低价格不能低于");

    /**
     * The column <code>ejavashop.product.market_price</code>. 市场价
     */
    public final TableField<ProductRecord, BigDecimal> MARKET_PRICE = createField("market_price", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "市场价");

    /**
     * The column <code>ejavashop.product.mall_pc_price</code>. 商城价
     */
    public final TableField<ProductRecord, BigDecimal> MALL_PC_PRICE = createField("mall_pc_price", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "商城价");

    /**
     * The column <code>ejavashop.product.mal_mobile_price</code>. 商城价Mobile
     */
    public final TableField<ProductRecord, BigDecimal> MAL_MOBILE_PRICE = createField("mal_mobile_price", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "商城价Mobile");

    /**
     * The column <code>ejavashop.product.virtual_sales</code>. 虚拟销量
     */
    public final TableField<ProductRecord, Integer> VIRTUAL_SALES = createField("virtual_sales", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "虚拟销量");

    /**
     * The column <code>ejavashop.product.actual_sales</code>. 实际销量
     */
    public final TableField<ProductRecord, Integer> ACTUAL_SALES = createField("actual_sales", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "实际销量");

    /**
     * The column <code>ejavashop.product.product_stock</code>. 商品库存
     */
    public final TableField<ProductRecord, Integer> PRODUCT_STOCK = createField("product_stock", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品库存");

    /**
     * The column <code>ejavashop.product.is_norm</code>. 1、没有启用规格；2、启用规格
     */
    public final TableField<ProductRecord, Integer> IS_NORM = createField("is_norm", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "1、没有启用规格；2、启用规格");

    /**
     * The column <code>ejavashop.product.norm_ids</code>. 规格ID集合
     */
    public final TableField<ProductRecord, String> NORM_IDS = createField("norm_ids", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "规格ID集合");

    /**
     * The column <code>ejavashop.product.norm_name</code>. 规格属性值集合 空
     */
    public final TableField<ProductRecord, String> NORM_NAME = createField("norm_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "规格属性值集合 空");

    /**
     * The column <code>ejavashop.product.state</code>. 1、刚创建；2、提交审核；3、审核通过；4、申请驳回；5、商品删除；6、上架；7、下架
     */
    public final TableField<ProductRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "1、刚创建；2、提交审核；3、审核通过；4、申请驳回；5、商品删除；6、上架；7、下架");

    /**
     * The column <code>ejavashop.product.is_top</code>. 1、不推荐；2、推荐
     */
    public final TableField<ProductRecord, Byte> IS_TOP = createField("is_top", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "1、不推荐；2、推荐");

    /**
     * The column <code>ejavashop.product.up_time</code>. 商品上架时间
     */
    public final TableField<ProductRecord, Timestamp> UP_TIME = createField("up_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "商品上架时间");

    /**
     * The column <code>ejavashop.product.description</code>. 商品描述信息
     */
    public final TableField<ProductRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "商品描述信息");

    /**
     * The column <code>ejavashop.product.packing</code>. 包装清单
     */
    public final TableField<ProductRecord, String> PACKING = createField("packing", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "包装清单");

    /**
     * The column <code>ejavashop.product.seller_id</code>. 商家ID
     */
    public final TableField<ProductRecord, Integer> SELLER_ID = createField("seller_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商家ID");

    /**
     * The column <code>ejavashop.product.create_id</code>. 创建人
     */
    public final TableField<ProductRecord, Integer> CREATE_ID = createField("create_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "创建人");

    /**
     * The column <code>ejavashop.product.create_time</code>. 创建时间
     */
    public final TableField<ProductRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>ejavashop.product.update_time</code>. 更新时间
     */
    public final TableField<ProductRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "更新时间");

    /**
     * The column <code>ejavashop.product.seller_cate_id</code>. 商家分类ID
     */
    public final TableField<ProductRecord, Integer> SELLER_CATE_ID = createField("seller_cate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商家分类ID");

    /**
     * The column <code>ejavashop.product.seller_is_top</code>. 商品推荐，1、不推荐；2、推荐  推荐的商品会显示到店铺的首页
     */
    public final TableField<ProductRecord, Byte> SELLER_IS_TOP = createField("seller_is_top", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "商品推荐，1、不推荐；2、推荐  推荐的商品会显示到店铺的首页");

    /**
     * The column <code>ejavashop.product.seller_state</code>. 店铺状态：1、店铺正常；2、店铺关闭 默认1
     */
    public final TableField<ProductRecord, Byte> SELLER_STATE = createField("seller_state", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "店铺状态：1、店铺正常；2、店铺关闭 默认1");

    /**
     * The column <code>ejavashop.product.comments_number</code>. 评价总数
     */
    public final TableField<ProductRecord, Integer> COMMENTS_NUMBER = createField("comments_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "评价总数");

    /**
     * The column <code>ejavashop.product.product_cate_state</code>. 平台商品分类状态：1、分类正常；2、分类关闭 默认1
     */
    public final TableField<ProductRecord, Byte> PRODUCT_CATE_STATE = createField("product_cate_state", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "平台商品分类状态：1、分类正常；2、分类关闭 默认1");

    /**
     * The column <code>ejavashop.product.is_invented_product</code>. 是否是虚拟商品：1、实物商品；2、虚拟商品
     */
    public final TableField<ProductRecord, Byte> IS_INVENTED_PRODUCT = createField("is_invented_product", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "是否是虚拟商品：1、实物商品；2、虚拟商品");

    /**
     * The column <code>ejavashop.product.transport_id</code>. 运费模板id
     */
    public final TableField<ProductRecord, Integer> TRANSPORT_ID = createField("transport_id", org.jooq.impl.SQLDataType.INTEGER, this, "运费模板id");

    /**
     * The column <code>ejavashop.product.master_img</code>. 主图
     */
    public final TableField<ProductRecord, String> MASTER_IMG = createField("master_img", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "主图");

    /**
     * The column <code>ejavashop.product.product_code</code>. 商品编码
     */
    public final TableField<ProductRecord, String> PRODUCT_CODE = createField("product_code", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商品编码");

    /**
     * The column <code>ejavashop.product.is_exhibit</code>.
     */
    public final TableField<ProductRecord, Byte> IS_EXHIBIT = createField("is_exhibit", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>ejavashop.product.sd_order</code>.
     */
    public final TableField<ProductRecord, Integer> SD_ORDER = createField("sd_order", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>ejavashop.product</code> table reference
     */
    public Product() {
        this("product", null);
    }

    /**
     * Create an aliased <code>ejavashop.product</code> table reference
     */
    public Product(String alias) {
        this(alias, PRODUCT);
    }

    private Product(String alias, Table<ProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private Product(String alias, Table<ProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "商品表");
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
    public Identity<ProductRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProductRecord> getPrimaryKey() {
        return Keys.KEY_PRODUCT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductRecord>>asList(Keys.KEY_PRODUCT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product as(String alias) {
        return new Product(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Product rename(String name) {
        return new Product(name, null);
    }
}