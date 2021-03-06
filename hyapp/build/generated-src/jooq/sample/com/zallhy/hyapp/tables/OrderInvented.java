/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.OrderInventedRecord;

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
 * 虚拟订单
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderInvented extends TableImpl<OrderInventedRecord> {

    private static final long serialVersionUID = 1960347649;

    /**
     * The reference instance of <code>ejavashop.order_invented</code>
     */
    public static final OrderInvented ORDER_INVENTED = new OrderInvented();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderInventedRecord> getRecordType() {
        return OrderInventedRecord.class;
    }

    /**
     * The column <code>ejavashop.order_invented.id</code>.
     */
    public final TableField<OrderInventedRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.order_invented.order_sn</code>. 订单号
     */
    public final TableField<OrderInventedRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "订单号");

    /**
     * The column <code>ejavashop.order_invented.seller_id</code>. 商家ID
     */
    public final TableField<OrderInventedRecord, Integer> SELLER_ID = createField("seller_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商家ID");

    /**
     * The column <code>ejavashop.order_invented.member_id</code>. 会员ID
     */
    public final TableField<OrderInventedRecord, Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "会员ID");

    /**
     * The column <code>ejavashop.order_invented.member_name</code>. 会员name
     */
    public final TableField<OrderInventedRecord, String> MEMBER_NAME = createField("member_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "会员name");

    /**
     * The column <code>ejavashop.order_invented.order_state</code>. 虚拟订单状态：1、未付款的订单；2、待处理的订单；3、已完成的订单；
     */
    public final TableField<OrderInventedRecord, Byte> ORDER_STATE = createField("order_state", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "虚拟订单状态：1、未付款的订单；2、待处理的订单；3、已完成的订单；");

    /**
     * The column <code>ejavashop.order_invented.pay_time</code>. 在线付款时间
     */
    public final TableField<OrderInventedRecord, Timestamp> PAY_TIME = createField("pay_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "在线付款时间");

    /**
     * The column <code>ejavashop.order_invented.payment_status</code>. 付款状态：0 买家未付款 1 买家已付款
     */
    public final TableField<OrderInventedRecord, Byte> PAYMENT_STATUS = createField("payment_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "付款状态：0 买家未付款 1 买家已付款");

    /**
     * The column <code>ejavashop.order_invented.invoice_status</code>. 发票状态0、不要发票；1、单位；2个人
     */
    public final TableField<OrderInventedRecord, Byte> INVOICE_STATUS = createField("invoice_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "发票状态0、不要发票；1、单位；2个人");

    /**
     * The column <code>ejavashop.order_invented.invoice_title</code>. 发票抬头
     */
    public final TableField<OrderInventedRecord, String> INVOICE_TITLE = createField("invoice_title", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "发票抬头");

    /**
     * The column <code>ejavashop.order_invented.invioce_state</code>. 发票抬头类型1、公司；2、个人
     */
    public final TableField<OrderInventedRecord, Byte> INVIOCE_STATE = createField("invioce_state", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "发票抬头类型1、公司；2、个人");

    /**
     * The column <code>ejavashop.order_invented.invoice_type</code>. 发票类型
     */
    public final TableField<OrderInventedRecord, String> INVOICE_TYPE = createField("invoice_type", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "发票类型");

    /**
     * The column <code>ejavashop.order_invented.money_product</code>. 商品金额，等于订单中所有的商品的单价乘以数量之和
     */
    public final TableField<OrderInventedRecord, BigDecimal> MONEY_PRODUCT = createField("money_product", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "商品金额，等于订单中所有的商品的单价乘以数量之和");

    /**
     * The column <code>ejavashop.order_invented.money_order</code>. 订单总金额，等于商品总金额＋运费-优惠金额
     */
    public final TableField<OrderInventedRecord, BigDecimal> MONEY_ORDER = createField("money_order", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "订单总金额，等于商品总金额＋运费-优惠金额");

    /**
     * The column <code>ejavashop.order_invented.money_paid_balance</code>. 余额账户支付总金额
     */
    public final TableField<OrderInventedRecord, BigDecimal> MONEY_PAID_BALANCE = createField("money_paid_balance", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "余额账户支付总金额");

    /**
     * The column <code>ejavashop.order_invented.money_paid_reality</code>. 现金支付金额
     */
    public final TableField<OrderInventedRecord, BigDecimal> MONEY_PAID_REALITY = createField("money_paid_reality", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "现金支付金额");

    /**
     * The column <code>ejavashop.order_invented.money_giftcard_amount</code>. 礼品卡抵用金额
     */
    public final TableField<OrderInventedRecord, BigDecimal> MONEY_GIFTCARD_AMOUNT = createField("money_giftcard_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "礼品卡抵用金额");

    /**
     * The column <code>ejavashop.order_invented.money_couponcode</code>. 优惠码优惠金额
     */
    public final TableField<OrderInventedRecord, BigDecimal> MONEY_COUPONCODE = createField("money_couponcode", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "优惠码优惠金额");

    /**
     * The column <code>ejavashop.order_invented.money_lower_amount</code>. 下单立减金额
     */
    public final TableField<OrderInventedRecord, BigDecimal> MONEY_LOWER_AMOUNT = createField("money_lower_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "下单立减金额");

    /**
     * The column <code>ejavashop.order_invented.money_back</code>. 退款的金额，订单没有退款则为0
     */
    public final TableField<OrderInventedRecord, BigDecimal> MONEY_BACK = createField("money_back", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "退款的金额，订单没有退款则为0");

    /**
     * The column <code>ejavashop.order_invented.money_integral</code>. 订单消耗的积分数量
     */
    public final TableField<OrderInventedRecord, Integer> MONEY_INTEGRAL = createField("money_integral", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "订单消耗的积分数量");

    /**
     * The column <code>ejavashop.order_invented.lower_id</code>. 下单立减id
     */
    public final TableField<OrderInventedRecord, Integer> LOWER_ID = createField("lower_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "下单立减id");

    /**
     * The column <code>ejavashop.order_invented.giftcard_id</code>. 礼品卡ID
     */
    public final TableField<OrderInventedRecord, Integer> GIFTCARD_ID = createField("giftcard_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "礼品卡ID");

    /**
     * The column <code>ejavashop.order_invented.couponcode_id</code>. 优惠码ID
     */
    public final TableField<OrderInventedRecord, Integer> COUPONCODE_ID = createField("couponcode_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "优惠码ID");

    /**
     * The column <code>ejavashop.order_invented.ip</code>. ip
     */
    public final TableField<OrderInventedRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "ip");

    /**
     * The column <code>ejavashop.order_invented.payment_name</code>. 支付方式名称
     */
    public final TableField<OrderInventedRecord, String> PAYMENT_NAME = createField("payment_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "支付方式名称");

    /**
     * The column <code>ejavashop.order_invented.payment_code</code>. 支付方式code
     */
    public final TableField<OrderInventedRecord, String> PAYMENT_CODE = createField("payment_code", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "支付方式code");

    /**
     * The column <code>ejavashop.order_invented.mobile</code>. 接受手机号码
     */
    public final TableField<OrderInventedRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "接受手机号码");

    /**
     * The column <code>ejavashop.order_invented.code_exchange</code>. 电子兑换码
     */
    public final TableField<OrderInventedRecord, String> CODE_EXCHANGE = createField("code_exchange", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "电子兑换码");

    /**
     * The column <code>ejavashop.order_invented.is_success</code>. 短信是否发生成功0、未发生；2、发生成功；2、发送失败
     */
    public final TableField<OrderInventedRecord, Byte> IS_SUCCESS = createField("is_success", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "短信是否发生成功0、未发生；2、发生成功；2、发送失败");

    /**
     * The column <code>ejavashop.order_invented.email</code>.
     */
    public final TableField<OrderInventedRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>ejavashop.order_invented.zip_code</code>. 邮编
     */
    public final TableField<OrderInventedRecord, String> ZIP_CODE = createField("zip_code", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "邮编");

    /**
     * The column <code>ejavashop.order_invented.remark</code>. 订单备注
     */
    public final TableField<OrderInventedRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "订单备注");

    /**
     * The column <code>ejavashop.order_invented.finish_time</code>. 订单完成时间
     */
    public final TableField<OrderInventedRecord, Timestamp> FINISH_TIME = createField("finish_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "订单完成时间");

    /**
     * The column <code>ejavashop.order_invented.trade_sn</code>. 在线支付交易流水号
     */
    public final TableField<OrderInventedRecord, String> TRADE_SN = createField("trade_sn", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "在线支付交易流水号");

    /**
     * The column <code>ejavashop.order_invented.source</code>. 订单来源
     */
    public final TableField<OrderInventedRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "订单来源");

    /**
     * The column <code>ejavashop.order_invented.is_gift_card_order</code>. 是否为礼品卡订单0、不是；1、是
     */
    public final TableField<OrderInventedRecord, Byte> IS_GIFT_CARD_ORDER = createField("is_gift_card_order", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否为礼品卡订单0、不是；1、是");

    /**
     * The column <code>ejavashop.order_invented.product_comments_id</code>. 评价ID，如果为0，没有评价
     */
    public final TableField<OrderInventedRecord, Integer> PRODUCT_COMMENTS_ID = createField("product_comments_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "评价ID，如果为0，没有评价");

    /**
     * The column <code>ejavashop.order_invented.create_time</code>.
     */
    public final TableField<OrderInventedRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ejavashop.order_invented.update_time</code>.
     */
    public final TableField<OrderInventedRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>ejavashop.order_invented</code> table reference
     */
    public OrderInvented() {
        this("order_invented", null);
    }

    /**
     * Create an aliased <code>ejavashop.order_invented</code> table reference
     */
    public OrderInvented(String alias) {
        this(alias, ORDER_INVENTED);
    }

    private OrderInvented(String alias, Table<OrderInventedRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderInvented(String alias, Table<OrderInventedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "虚拟订单");
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
    public Identity<OrderInventedRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDER_INVENTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderInventedRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_INVENTED_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderInventedRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderInventedRecord>>asList(Keys.KEY_ORDER_INVENTED_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderInvented as(String alias) {
        return new OrderInvented(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderInvented rename(String name) {
        return new OrderInvented(name, null);
    }
}
