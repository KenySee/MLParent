/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.MemberProductBackRecord;

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
 * 用户退货
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberProductBack extends TableImpl<MemberProductBackRecord> {

    private static final long serialVersionUID = -612136196;

    /**
     * The reference instance of <code>ejavashop.member_product_back</code>
     */
    public static final MemberProductBack MEMBER_PRODUCT_BACK = new MemberProductBack();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberProductBackRecord> getRecordType() {
        return MemberProductBackRecord.class;
    }

    /**
     * The column <code>ejavashop.member_product_back.id</code>.
     */
    public final TableField<MemberProductBackRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.member_product_back.seller_id</code>. 所属商家
     */
    public final TableField<MemberProductBackRecord, Integer> SELLER_ID = createField("seller_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "所属商家");

    /**
     * The column <code>ejavashop.member_product_back.order_id</code>. 订单ID
     */
    public final TableField<MemberProductBackRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "订单ID");

    /**
     * The column <code>ejavashop.member_product_back.order_product_id</code>. 网单ID
     */
    public final TableField<MemberProductBackRecord, Integer> ORDER_PRODUCT_ID = createField("order_product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "网单ID");

    /**
     * The column <code>ejavashop.member_product_back.product_id</code>. 商品ID
     */
    public final TableField<MemberProductBackRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品ID");

    /**
     * The column <code>ejavashop.member_product_back.member_id</code>. 用户ID
     */
    public final TableField<MemberProductBackRecord, Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户ID");

    /**
     * The column <code>ejavashop.member_product_back.member_name</code>. 用户Name
     */
    public final TableField<MemberProductBackRecord, String> MEMBER_NAME = createField("member_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "用户Name");

    /**
     * The column <code>ejavashop.member_product_back.province_id</code>. Province
     */
    public final TableField<MemberProductBackRecord, Integer> PROVINCE_ID = createField("province_id", org.jooq.impl.SQLDataType.INTEGER, this, "Province");

    /**
     * The column <code>ejavashop.member_product_back.city_id</code>. city
     */
    public final TableField<MemberProductBackRecord, Integer> CITY_ID = createField("city_id", org.jooq.impl.SQLDataType.INTEGER, this, "city");

    /**
     * The column <code>ejavashop.member_product_back.area_id</code>. area
     */
    public final TableField<MemberProductBackRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER, this, "area");

    /**
     * The column <code>ejavashop.member_product_back.address_all</code>. 省市区组合
     */
    public final TableField<MemberProductBackRecord, String> ADDRESS_ALL = createField("address_all", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "省市区组合");

    /**
     * The column <code>ejavashop.member_product_back.address_info</code>. 详细地址
     */
    public final TableField<MemberProductBackRecord, String> ADDRESS_INFO = createField("address_info", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "详细地址");

    /**
     * The column <code>ejavashop.member_product_back.phone</code>. 退货人手机
     */
    public final TableField<MemberProductBackRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "退货人手机");

    /**
     * The column <code>ejavashop.member_product_back.return_name</code>. 联系人姓名
     */
    public final TableField<MemberProductBackRecord, String> RETURN_NAME = createField("return_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "联系人姓名");

    /**
     * The column <code>ejavashop.member_product_back.zip_code</code>. 邮编
     */
    public final TableField<MemberProductBackRecord, String> ZIP_CODE = createField("zip_code", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "邮编");

    /**
     * The column <code>ejavashop.member_product_back.question</code>. 问题描述
     */
    public final TableField<MemberProductBackRecord, String> QUESTION = createField("question", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "问题描述");

    /**
     * The column <code>ejavashop.member_product_back.image</code>. 图片
     */
    public final TableField<MemberProductBackRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "图片");

    /**
     * The column <code>ejavashop.member_product_back.state_return</code>. 退货状态：1、未处理；2、审核通过待收货；3、已经收货；4、不予处理
     */
    public final TableField<MemberProductBackRecord, Byte> STATE_RETURN = createField("state_return", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "退货状态：1、未处理；2、审核通过待收货；3、已经收货；4、不予处理");

    /**
     * The column <code>ejavashop.member_product_back.state_money</code>. 退款状态：1、未退款；2、退款到账户；3、退款到银行
     */
    public final TableField<MemberProductBackRecord, Byte> STATE_MONEY = createField("state_money", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "退款状态：1、未退款；2、退款到账户；3、退款到银行");

    /**
     * The column <code>ejavashop.member_product_back.back_money</code>. 退款金额
     */
    public final TableField<MemberProductBackRecord, BigDecimal> BACK_MONEY = createField("back_money", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "退款金额");

    /**
     * The column <code>ejavashop.member_product_back.back_integral</code>. 退回积分
     */
    public final TableField<MemberProductBackRecord, Integer> BACK_INTEGRAL = createField("back_integral", org.jooq.impl.SQLDataType.INTEGER, this, "退回积分");

    /**
     * The column <code>ejavashop.member_product_back.back_integral_money</code>. 退回积分金额（退回积分转换成金额）
     */
    public final TableField<MemberProductBackRecord, BigDecimal> BACK_INTEGRAL_MONEY = createField("back_integral_money", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "退回积分金额（退回积分转换成金额）");

    /**
     * The column <code>ejavashop.member_product_back.back_coupon_user_id</code>. 退回优惠券ID，0表示没有
     */
    public final TableField<MemberProductBackRecord, Integer> BACK_COUPON_USER_ID = createField("back_coupon_user_id", org.jooq.impl.SQLDataType.INTEGER, this, "退回优惠券ID，0表示没有");

    /**
     * The column <code>ejavashop.member_product_back.back_money_time</code>. 退款时间
     */
    public final TableField<MemberProductBackRecord, Timestamp> BACK_MONEY_TIME = createField("back_money_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "退款时间");

    /**
     * The column <code>ejavashop.member_product_back.create_time</code>.
     */
    public final TableField<MemberProductBackRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ejavashop.member_product_back.update_time</code>.
     */
    public final TableField<MemberProductBackRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ejavashop.member_product_back.opt_id</code>. 处理人
     */
    public final TableField<MemberProductBackRecord, Integer> OPT_ID = createField("opt_id", org.jooq.impl.SQLDataType.INTEGER, this, "处理人");

    /**
     * The column <code>ejavashop.member_product_back.remark</code>. 备注
     */
    public final TableField<MemberProductBackRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");

    /**
     * Create a <code>ejavashop.member_product_back</code> table reference
     */
    public MemberProductBack() {
        this("member_product_back", null);
    }

    /**
     * Create an aliased <code>ejavashop.member_product_back</code> table reference
     */
    public MemberProductBack(String alias) {
        this(alias, MEMBER_PRODUCT_BACK);
    }

    private MemberProductBack(String alias, Table<MemberProductBackRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemberProductBack(String alias, Table<MemberProductBackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户退货");
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
    public Identity<MemberProductBackRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MEMBER_PRODUCT_BACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberProductBackRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_PRODUCT_BACK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberProductBackRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberProductBackRecord>>asList(Keys.KEY_MEMBER_PRODUCT_BACK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberProductBack as(String alias) {
        return new MemberProductBack(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberProductBack rename(String name) {
        return new MemberProductBack(name, null);
    }
}
