/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.SettlementOpRecord;

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
 * 结算网单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SettlementOp extends TableImpl<SettlementOpRecord> {

    private static final long serialVersionUID = -928647839;

    /**
     * The reference instance of <code>ejavashop.settlement_op</code>
     */
    public static final SettlementOp SETTLEMENT_OP = new SettlementOp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SettlementOpRecord> getRecordType() {
        return SettlementOpRecord.class;
    }

    /**
     * The column <code>ejavashop.settlement_op.id</code>.
     */
    public final TableField<SettlementOpRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.settlement_op.orders_id</code>. 订单ID
     */
    public final TableField<SettlementOpRecord, Integer> ORDERS_ID = createField("orders_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "订单ID");

    /**
     * The column <code>ejavashop.settlement_op.orders_sn</code>. 订单号
     */
    public final TableField<SettlementOpRecord, String> ORDERS_SN = createField("orders_sn", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "订单号");

    /**
     * The column <code>ejavashop.settlement_op.seller_id</code>. 商家ID
     */
    public final TableField<SettlementOpRecord, Integer> SELLER_ID = createField("seller_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商家ID");

    /**
     * The column <code>ejavashop.settlement_op.product_id</code>. 商品id
     */
    public final TableField<SettlementOpRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品id");

    /**
     * The column <code>ejavashop.settlement_op.product_goods_id</code>. 货品ID
     */
    public final TableField<SettlementOpRecord, Integer> PRODUCT_GOODS_ID = createField("product_goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "货品ID");

    /**
     * The column <code>ejavashop.settlement_op.spec_info</code>. 规格详情
     */
    public final TableField<SettlementOpRecord, String> SPEC_INFO = createField("spec_info", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "规格详情");

    /**
     * The column <code>ejavashop.settlement_op.product_name</code>. 商品名称
     */
    public final TableField<SettlementOpRecord, String> PRODUCT_NAME = createField("product_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "商品名称");

    /**
     * The column <code>ejavashop.settlement_op.product_sku</code>. 抽象商品sku
     */
    public final TableField<SettlementOpRecord, String> PRODUCT_SKU = createField("product_sku", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false), this, "抽象商品sku");

    /**
     * The column <code>ejavashop.settlement_op.package_groups_id</code>. 促销套装0、不是促销套装；大于0，促销套装ID，价格是促销套装的ID
     */
    public final TableField<SettlementOpRecord, Integer> PACKAGE_GROUPS_ID = createField("package_groups_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "促销套装0、不是促销套装；大于0，促销套装ID，价格是促销套装的ID");

    /**
     * The column <code>ejavashop.settlement_op.mall_groups_id</code>. 商城套装0，不是上次套装；大于0商城套装ID
     */
    public final TableField<SettlementOpRecord, Integer> MALL_GROUPS_ID = createField("mall_groups_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "商城套装0，不是上次套装；大于0商城套装ID");

    /**
     * The column <code>ejavashop.settlement_op.gift_id</code>. 赠品ID 0:不是赠品；大于0：是赠品，存赠品的ID
     */
    public final TableField<SettlementOpRecord, Integer> GIFT_ID = createField("gift_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "赠品ID 0:不是赠品；大于0：是赠品，存赠品的ID");

    /**
     * The column <code>ejavashop.settlement_op.is_gift</code>. 是否是赠品，0、不是；1、是；
     */
    public final TableField<SettlementOpRecord, Byte> IS_GIFT = createField("is_gift", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否是赠品，0、不是；1、是；");

    /**
     * The column <code>ejavashop.settlement_op.money_price</code>. 商品单价
     */
    public final TableField<SettlementOpRecord, BigDecimal> MONEY_PRICE = createField("money_price", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "商品单价");

    /**
     * The column <code>ejavashop.settlement_op.number</code>. 商品数量
     */
    public final TableField<SettlementOpRecord, Integer> NUMBER = createField("number", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品数量");

    /**
     * The column <code>ejavashop.settlement_op.money_amount</code>. 网单金额（减去立减优惠后的金额和）
     */
    public final TableField<SettlementOpRecord, BigDecimal> MONEY_AMOUNT = createField("money_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "网单金额（减去立减优惠后的金额和）");

    /**
     * The column <code>ejavashop.settlement_op.money_act_single</code>. 立减优惠金额和
     */
    public final TableField<SettlementOpRecord, BigDecimal> MONEY_ACT_SINGLE = createField("money_act_single", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "立减优惠金额和");

    /**
     * The column <code>ejavashop.settlement_op.act_single_id</code>. 单品立减活动ID，无设置0
     */
    public final TableField<SettlementOpRecord, Integer> ACT_SINGLE_ID = createField("act_single_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "单品立减活动ID，无设置0");

    /**
     * The column <code>ejavashop.settlement_op.activity_id</code>. 团购ID，为0正常购买
     */
    public final TableField<SettlementOpRecord, Integer> ACTIVITY_ID = createField("activity_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "团购ID，为0正常购买");

    /**
     * The column <code>ejavashop.settlement_op.act_flash_sale_id</code>. 限时抢购ID，为0正常购买
     */
    public final TableField<SettlementOpRecord, Integer> ACT_FLASH_SALE_ID = createField("act_flash_sale_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "限时抢购ID，为0正常购买");

    /**
     * The column <code>ejavashop.settlement_op.act_flash_sale_product_id</code>. 限时抢购活动商品ID
     */
    public final TableField<SettlementOpRecord, Integer> ACT_FLASH_SALE_PRODUCT_ID = createField("act_flash_sale_product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "限时抢购活动商品ID");

    /**
     * The column <code>ejavashop.settlement_op.logistics_id</code>. 物流
     */
    public final TableField<SettlementOpRecord, Integer> LOGISTICS_ID = createField("logistics_id", org.jooq.impl.SQLDataType.INTEGER, this, "物流");

    /**
     * The column <code>ejavashop.settlement_op.logistics_name</code>. 物流name
     */
    public final TableField<SettlementOpRecord, String> LOGISTICS_NAME = createField("logistics_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "物流name");

    /**
     * The column <code>ejavashop.settlement_op.logistics_number</code>. 发票快递单号
     */
    public final TableField<SettlementOpRecord, String> LOGISTICS_NUMBER = createField("logistics_number", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "发票快递单号");

    /**
     * The column <code>ejavashop.settlement_op.shipping_time</code>. 发货时间
     */
    public final TableField<SettlementOpRecord, Timestamp> SHIPPING_TIME = createField("shipping_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "发货时间");

    /**
     * The column <code>ejavashop.settlement_op.close_time</code>. 网单完成关闭或取消关闭时间
     */
    public final TableField<SettlementOpRecord, Timestamp> CLOSE_TIME = createField("close_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "网单完成关闭或取消关闭时间");

    /**
     * The column <code>ejavashop.settlement_op.system_remark</code>. 系统备注，不给用户显示
     */
    public final TableField<SettlementOpRecord, String> SYSTEM_REMARK = createField("system_remark", org.jooq.impl.SQLDataType.CLOB, this, "系统备注，不给用户显示");

    /**
     * The column <code>ejavashop.settlement_op.member_product_back_id</code>. 退货ID，默认为0
     */
    public final TableField<SettlementOpRecord, Integer> MEMBER_PRODUCT_BACK_ID = createField("member_product_back_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "退货ID，默认为0");

    /**
     * The column <code>ejavashop.settlement_op.member_product_exchange_id</code>. 换货ID，默认为0
     */
    public final TableField<SettlementOpRecord, Integer> MEMBER_PRODUCT_EXCHANGE_ID = createField("member_product_exchange_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "换货ID，默认为0");

    /**
     * The column <code>ejavashop.settlement_op.create_time</code>.
     */
    public final TableField<SettlementOpRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ejavashop.settlement_op.update_time</code>.
     */
    public final TableField<SettlementOpRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ejavashop.settlement_op.settlement_id</code>. 结算ID
     */
    public final TableField<SettlementOpRecord, Integer> SETTLEMENT_ID = createField("settlement_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "结算ID");

    /**
     * The column <code>ejavashop.settlement_op.settle_cycle</code>. 结算周期
     */
    public final TableField<SettlementOpRecord, String> SETTLE_CYCLE = createField("settle_cycle", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "结算周期");

    /**
     * The column <code>ejavashop.settlement_op.product_cate_id</code>. 商品分类ID
     */
    public final TableField<SettlementOpRecord, Integer> PRODUCT_CATE_ID = createField("product_cate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品分类ID");

    /**
     * The column <code>ejavashop.settlement_op.product_cate_name</code>. 商品分类名称
     */
    public final TableField<SettlementOpRecord, String> PRODUCT_CATE_NAME = createField("product_cate_name", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "商品分类名称");

    /**
     * The column <code>ejavashop.settlement_op.scaling</code>. 商品分类分佣比例
     */
    public final TableField<SettlementOpRecord, BigDecimal> SCALING = createField("scaling", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "商品分类分佣比例");

    /**
     * The column <code>ejavashop.settlement_op.commision</code>. 网单佣金
     */
    public final TableField<SettlementOpRecord, BigDecimal> COMMISION = createField("commision", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "网单佣金");

    /**
     * The column <code>ejavashop.settlement_op.settle_time</code>. 结算日期
     */
    public final TableField<SettlementOpRecord, Timestamp> SETTLE_TIME = createField("settle_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "结算日期");

    /**
     * Create a <code>ejavashop.settlement_op</code> table reference
     */
    public SettlementOp() {
        this("settlement_op", null);
    }

    /**
     * Create an aliased <code>ejavashop.settlement_op</code> table reference
     */
    public SettlementOp(String alias) {
        this(alias, SETTLEMENT_OP);
    }

    private SettlementOp(String alias, Table<SettlementOpRecord> aliased) {
        this(alias, aliased, null);
    }

    private SettlementOp(String alias, Table<SettlementOpRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "结算网单表");
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
    public Identity<SettlementOpRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SETTLEMENT_OP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SettlementOpRecord> getPrimaryKey() {
        return Keys.KEY_SETTLEMENT_OP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SettlementOpRecord>> getKeys() {
        return Arrays.<UniqueKey<SettlementOpRecord>>asList(Keys.KEY_SETTLEMENT_OP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SettlementOp as(String alias) {
        return new SettlementOp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SettlementOp rename(String name) {
        return new SettlementOp(name, null);
    }
}
