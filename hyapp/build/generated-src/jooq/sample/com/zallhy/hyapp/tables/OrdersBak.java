/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.OrdersBakRecord;

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
 * 订单
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrdersBak extends TableImpl<OrdersBakRecord> {

    private static final long serialVersionUID = -101018403;

    /**
     * The reference instance of <code>ejavashop.orders_bak</code>
     */
    public static final OrdersBak ORDERS_BAK = new OrdersBak();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrdersBakRecord> getRecordType() {
        return OrdersBakRecord.class;
    }

    /**
     * The column <code>ejavashop.orders_bak.id</code>.
     */
    public final TableField<OrdersBakRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.orders_bak.order_sn</code>. 订单号
     */
    public final TableField<OrdersBakRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "订单号");

    /**
     * The column <code>ejavashop.orders_bak.relation_order_sn</code>. 关联订单编号
     */
    public final TableField<OrdersBakRecord, String> RELATION_ORDER_SN = createField("relation_order_sn", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "关联订单编号");

    /**
     * The column <code>ejavashop.orders_bak.order_type</code>. 订单类型：1、普通订单，2、限时抢购订单
     */
    public final TableField<OrdersBakRecord, Byte> ORDER_TYPE = createField("order_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "订单类型：1、普通订单，2、限时抢购订单");

    /**
     * The column <code>ejavashop.orders_bak.seller_id</code>. 商家ID
     */
    public final TableField<OrdersBakRecord, Integer> SELLER_ID = createField("seller_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商家ID");

    /**
     * The column <code>ejavashop.orders_bak.member_id</code>. 会员ID
     */
    public final TableField<OrdersBakRecord, Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "会员ID");

    /**
     * The column <code>ejavashop.orders_bak.member_name</code>. 会员name
     */
    public final TableField<OrdersBakRecord, String> MEMBER_NAME = createField("member_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "会员name");

    /**
     * The column <code>ejavashop.orders_bak.order_state</code>. 订单状态：1、未付款的订单；2、待确认的订单；3、待发货的订单；4、已发货的订单；5、已完成的订单；6、取消的订单
     */
    public final TableField<OrdersBakRecord, Byte> ORDER_STATE = createField("order_state", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "订单状态：1、未付款的订单；2、待确认的订单；3、待发货的订单；4、已发货的订单；5、已完成的订单；6、取消的订单");

    /**
     * The column <code>ejavashop.orders_bak.pay_time</code>. 付款时间
     */
    public final TableField<OrdersBakRecord, Timestamp> PAY_TIME = createField("pay_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "付款时间");

    /**
     * The column <code>ejavashop.orders_bak.payment_status</code>. 付款状态：0 买家未付款 1 买家已付款
     */
    public final TableField<OrdersBakRecord, Byte> PAYMENT_STATUS = createField("payment_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "付款状态：0 买家未付款 1 买家已付款");

    /**
     * The column <code>ejavashop.orders_bak.invoice_status</code>. 发票状态0、不要发票；1、单位；2个人
     */
    public final TableField<OrdersBakRecord, Byte> INVOICE_STATUS = createField("invoice_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "发票状态0、不要发票；1、单位；2个人");

    /**
     * The column <code>ejavashop.orders_bak.invoice_title</code>. 发票抬头
     */
    public final TableField<OrdersBakRecord, String> INVOICE_TITLE = createField("invoice_title", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "发票抬头");

    /**
     * The column <code>ejavashop.orders_bak.invoice_type</code>. 发票类型（内容）
     */
    public final TableField<OrdersBakRecord, String> INVOICE_TYPE = createField("invoice_type", org.jooq.impl.SQLDataType.VARCHAR.length(50).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "发票类型（内容）");

    /**
     * The column <code>ejavashop.orders_bak.money_product</code>. 商品金额，等于订单中所有的商品的单价乘以数量之和
     */
    public final TableField<OrdersBakRecord, BigDecimal> MONEY_PRODUCT = createField("money_product", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "商品金额，等于订单中所有的商品的单价乘以数量之和");

    /**
     * The column <code>ejavashop.orders_bak.money_logistics</code>. 物流费用
     */
    public final TableField<OrdersBakRecord, BigDecimal> MONEY_LOGISTICS = createField("money_logistics", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "物流费用");

    /**
     * The column <code>ejavashop.orders_bak.money_order</code>. 订单总金额，等于商品总金额＋运费-优惠金额总额
     */
    public final TableField<OrdersBakRecord, BigDecimal> MONEY_ORDER = createField("money_order", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "订单总金额，等于商品总金额＋运费-优惠金额总额");

    /**
     * The column <code>ejavashop.orders_bak.money_paid_balance</code>. 余额账户支付总金额
     */
    public final TableField<OrdersBakRecord, BigDecimal> MONEY_PAID_BALANCE = createField("money_paid_balance", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "余额账户支付总金额");

    /**
     * The column <code>ejavashop.orders_bak.money_paid_reality</code>. 现金支付金额
     */
    public final TableField<OrdersBakRecord, BigDecimal> MONEY_PAID_REALITY = createField("money_paid_reality", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "现金支付金额");

    /**
     * The column <code>ejavashop.orders_bak.money_coupon</code>. 优惠券优惠金额
     */
    public final TableField<OrdersBakRecord, BigDecimal> MONEY_COUPON = createField("money_coupon", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "优惠券优惠金额");

    /**
     * The column <code>ejavashop.orders_bak.money_act_full</code>. 订单满减金额
     */
    public final TableField<OrdersBakRecord, BigDecimal> MONEY_ACT_FULL = createField("money_act_full", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "订单满减金额");

    /**
     * The column <code>ejavashop.orders_bak.money_discount</code>. 优惠金额总额（满减、立减、优惠券等所有优惠额的和）
     */
    public final TableField<OrdersBakRecord, BigDecimal> MONEY_DISCOUNT = createField("money_discount", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "优惠金额总额（满减、立减、优惠券等所有优惠额的和）");

    /**
     * The column <code>ejavashop.orders_bak.money_back</code>. 退款的金额，订单没有退款则为0
     */
    public final TableField<OrdersBakRecord, BigDecimal> MONEY_BACK = createField("money_back", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "退款的金额，订单没有退款则为0");

    /**
     * The column <code>ejavashop.orders_bak.money_integral</code>. 积分换算金额
     */
    public final TableField<OrdersBakRecord, BigDecimal> MONEY_INTEGRAL = createField("money_integral", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "积分换算金额");

    /**
     * The column <code>ejavashop.orders_bak.integral</code>. 订单使用的积分数量
     */
    public final TableField<OrdersBakRecord, Integer> INTEGRAL = createField("integral", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "订单使用的积分数量");

    /**
     * The column <code>ejavashop.orders_bak.coupon_user_id</code>. 优惠码ID
     */
    public final TableField<OrdersBakRecord, Integer> COUPON_USER_ID = createField("coupon_user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "优惠码ID");

    /**
     * The column <code>ejavashop.orders_bak.act_full_id</code>. 订单满减活动ID
     */
    public final TableField<OrdersBakRecord, Integer> ACT_FULL_ID = createField("act_full_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "订单满减活动ID");

    /**
     * The column <code>ejavashop.orders_bak.ip</code>. ip
     */
    public final TableField<OrdersBakRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "ip");

    /**
     * The column <code>ejavashop.orders_bak.payment_name</code>. 支付方式名称
     */
    public final TableField<OrdersBakRecord, String> PAYMENT_NAME = createField("payment_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "支付方式名称");

    /**
     * The column <code>ejavashop.orders_bak.payment_code</code>. 支付方式code
     */
    public final TableField<OrdersBakRecord, String> PAYMENT_CODE = createField("payment_code", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "支付方式code");

    /**
     * The column <code>ejavashop.orders_bak.name</code>. 收货人
     */
    public final TableField<OrdersBakRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false), this, "收货人");

    /**
     * The column <code>ejavashop.orders_bak.province_id</code>. Province
     */
    public final TableField<OrdersBakRecord, Integer> PROVINCE_ID = createField("province_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Province");

    /**
     * The column <code>ejavashop.orders_bak.city_id</code>. city
     */
    public final TableField<OrdersBakRecord, Integer> CITY_ID = createField("city_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "city");

    /**
     * The column <code>ejavashop.orders_bak.area_id</code>. area
     */
    public final TableField<OrdersBakRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "area");

    /**
     * The column <code>ejavashop.orders_bak.address_all</code>. 省市区组合
     */
    public final TableField<OrdersBakRecord, String> ADDRESS_ALL = createField("address_all", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "省市区组合");

    /**
     * The column <code>ejavashop.orders_bak.address_info</code>. 详细地址
     */
    public final TableField<OrdersBakRecord, String> ADDRESS_INFO = createField("address_info", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "详细地址");

    /**
     * The column <code>ejavashop.orders_bak.mobile</code>.
     */
    public final TableField<OrdersBakRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ejavashop.orders_bak.email</code>.
     */
    public final TableField<OrdersBakRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ejavashop.orders_bak.zip_code</code>. 邮编
     */
    public final TableField<OrdersBakRecord, String> ZIP_CODE = createField("zip_code", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "邮编");

    /**
     * The column <code>ejavashop.orders_bak.remark</code>. 订单备注
     */
    public final TableField<OrdersBakRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "订单备注");

    /**
     * The column <code>ejavashop.orders_bak.deliver_time</code>. 发货时间
     */
    public final TableField<OrdersBakRecord, Timestamp> DELIVER_TIME = createField("deliver_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "发货时间");

    /**
     * The column <code>ejavashop.orders_bak.finish_time</code>. 订单完成时间
     */
    public final TableField<OrdersBakRecord, Timestamp> FINISH_TIME = createField("finish_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "订单完成时间");

    /**
     * The column <code>ejavashop.orders_bak.trade_sn</code>. 在线支付交易流水号
     */
    public final TableField<OrdersBakRecord, String> TRADE_SN = createField("trade_sn", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "在线支付交易流水号");

    /**
     * The column <code>ejavashop.orders_bak.source</code>. 会员来源1、pc；2、H5；3、Android；4、IOS
     */
    public final TableField<OrdersBakRecord, Byte> SOURCE = createField("source", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "会员来源1、pc；2、H5；3、Android；4、IOS");

    /**
     * The column <code>ejavashop.orders_bak.logistics_id</code>. 物流公司ID
     */
    public final TableField<OrdersBakRecord, Integer> LOGISTICS_ID = createField("logistics_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "物流公司ID");

    /**
     * The column <code>ejavashop.orders_bak.logistics_name</code>. 物流公司
     */
    public final TableField<OrdersBakRecord, String> LOGISTICS_NAME = createField("logistics_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "物流公司");

    /**
     * The column <code>ejavashop.orders_bak.logistics_number</code>. 快递单号
     */
    public final TableField<OrdersBakRecord, String> LOGISTICS_NUMBER = createField("logistics_number", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "快递单号");

    /**
     * The column <code>ejavashop.orders_bak.is_codconfim</code>. 是否货到付款订单0、不是；1、是
     */
    public final TableField<OrdersBakRecord, Byte> IS_CODCONFIM = createField("is_codconfim", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "是否货到付款订单0、不是；1、是");

    /**
     * The column <code>ejavashop.orders_bak.codconfirm_id</code>. 货到付款确认人
     */
    public final TableField<OrdersBakRecord, Integer> CODCONFIRM_ID = createField("codconfirm_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "货到付款确认人");

    /**
     * The column <code>ejavashop.orders_bak.codconfirm_name</code>. 货到付款确认Name
     */
    public final TableField<OrdersBakRecord, String> CODCONFIRM_NAME = createField("codconfirm_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "货到付款确认Name");

    /**
     * The column <code>ejavashop.orders_bak.codconfirm_time</code>. 货到付款确认时间
     */
    public final TableField<OrdersBakRecord, Timestamp> CODCONFIRM_TIME = createField("codconfirm_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "货到付款确认时间");

    /**
     * The column <code>ejavashop.orders_bak.codconfirm_remark</code>. 货到付款确认备注
     */
    public final TableField<OrdersBakRecord, String> CODCONFIRM_REMARK = createField("codconfirm_remark", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "货到付款确认备注");

    /**
     * The column <code>ejavashop.orders_bak.codconfirm_state</code>. 货到付款状态 0、非货到付款；1、待确认；2、确认通过可以发货；3、订单取消
     */
    public final TableField<OrdersBakRecord, Byte> CODCONFIRM_STATE = createField("codconfirm_state", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "货到付款状态 0、非货到付款；1、待确认；2、确认通过可以发货；3、订单取消");

    /**
     * The column <code>ejavashop.orders_bak.create_time</code>.
     */
    public final TableField<OrdersBakRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ejavashop.orders_bak.update_time</code>.
     */
    public final TableField<OrdersBakRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>ejavashop.orders_bak</code> table reference
     */
    public OrdersBak() {
        this("orders_bak", null);
    }

    /**
     * Create an aliased <code>ejavashop.orders_bak</code> table reference
     */
    public OrdersBak(String alias) {
        this(alias, ORDERS_BAK);
    }

    private OrdersBak(String alias, Table<OrdersBakRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrdersBak(String alias, Table<OrdersBakRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "订单");
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
    public Identity<OrdersBakRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDERS_BAK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrdersBakRecord> getPrimaryKey() {
        return Keys.KEY_ORDERS_BAK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrdersBakRecord>> getKeys() {
        return Arrays.<UniqueKey<OrdersBakRecord>>asList(Keys.KEY_ORDERS_BAK_PRIMARY, Keys.KEY_ORDERS_BAK_ORDERSN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrdersBak as(String alias) {
        return new OrdersBak(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrdersBak rename(String name) {
        return new OrdersBak(name, null);
    }
}