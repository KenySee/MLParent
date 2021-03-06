/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.MemberProductExchangeRecord;

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
 * 用户换货
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberProductExchange extends TableImpl<MemberProductExchangeRecord> {

    private static final long serialVersionUID = 775191964;

    /**
     * The reference instance of <code>ejavashop.member_product_exchange</code>
     */
    public static final MemberProductExchange MEMBER_PRODUCT_EXCHANGE = new MemberProductExchange();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberProductExchangeRecord> getRecordType() {
        return MemberProductExchangeRecord.class;
    }

    /**
     * The column <code>ejavashop.member_product_exchange.id</code>.
     */
    public final TableField<MemberProductExchangeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.member_product_exchange.seller</code>. 所属商家
     */
    public final TableField<MemberProductExchangeRecord, Integer> SELLER = createField("seller", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "所属商家");

    /**
     * The column <code>ejavashop.member_product_exchange.order_id</code>. 订单ID
     */
    public final TableField<MemberProductExchangeRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "订单ID");

    /**
     * The column <code>ejavashop.member_product_exchange.order_product_id</code>. 网单ID
     */
    public final TableField<MemberProductExchangeRecord, Integer> ORDER_PRODUCT_ID = createField("order_product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "网单ID");

    /**
     * The column <code>ejavashop.member_product_exchange.product_id</code>. 商品ID
     */
    public final TableField<MemberProductExchangeRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品ID");

    /**
     * The column <code>ejavashop.member_product_exchange.member_id</code>. 用户ID
     */
    public final TableField<MemberProductExchangeRecord, Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户ID");

    /**
     * The column <code>ejavashop.member_product_exchange.member_name</code>. 用户Name
     */
    public final TableField<MemberProductExchangeRecord, String> MEMBER_NAME = createField("member_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "用户Name");

    /**
     * The column <code>ejavashop.member_product_exchange.province_id2</code>. Province
     */
    public final TableField<MemberProductExchangeRecord, Integer> PROVINCE_ID2 = createField("province_id2", org.jooq.impl.SQLDataType.INTEGER, this, "Province");

    /**
     * The column <code>ejavashop.member_product_exchange.city_id2</code>. city
     */
    public final TableField<MemberProductExchangeRecord, Integer> CITY_ID2 = createField("city_id2", org.jooq.impl.SQLDataType.INTEGER, this, "city");

    /**
     * The column <code>ejavashop.member_product_exchange.area_id2</code>. area
     */
    public final TableField<MemberProductExchangeRecord, Integer> AREA_ID2 = createField("area_id2", org.jooq.impl.SQLDataType.INTEGER, this, "area");

    /**
     * The column <code>ejavashop.member_product_exchange.address_all2</code>. 省市区组合
     */
    public final TableField<MemberProductExchangeRecord, String> ADDRESS_ALL2 = createField("address_all2", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "省市区组合");

    /**
     * The column <code>ejavashop.member_product_exchange.address_info2</code>. 详细地址
     */
    public final TableField<MemberProductExchangeRecord, String> ADDRESS_INFO2 = createField("address_info2", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "详细地址");

    /**
     * The column <code>ejavashop.member_product_exchange.phone2</code>.
     */
    public final TableField<MemberProductExchangeRecord, String> PHONE2 = createField("phone2", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>ejavashop.member_product_exchange.change_name2</code>. 换货收货人
     */
    public final TableField<MemberProductExchangeRecord, String> CHANGE_NAME2 = createField("change_name2", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "换货收货人");

    /**
     * The column <code>ejavashop.member_product_exchange.province_id</code>. Province
     */
    public final TableField<MemberProductExchangeRecord, Integer> PROVINCE_ID = createField("province_id", org.jooq.impl.SQLDataType.INTEGER, this, "Province");

    /**
     * The column <code>ejavashop.member_product_exchange.city_id</code>. city
     */
    public final TableField<MemberProductExchangeRecord, Integer> CITY_ID = createField("city_id", org.jooq.impl.SQLDataType.INTEGER, this, "city");

    /**
     * The column <code>ejavashop.member_product_exchange.area_id</code>. area
     */
    public final TableField<MemberProductExchangeRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER, this, "area");

    /**
     * The column <code>ejavashop.member_product_exchange.address_all</code>. 省市区组合
     */
    public final TableField<MemberProductExchangeRecord, String> ADDRESS_ALL = createField("address_all", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "省市区组合");

    /**
     * The column <code>ejavashop.member_product_exchange.address_info</code>. 详细地址
     */
    public final TableField<MemberProductExchangeRecord, String> ADDRESS_INFO = createField("address_info", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "详细地址");

    /**
     * The column <code>ejavashop.member_product_exchange.change_name</code>. 收货人地址
     */
    public final TableField<MemberProductExchangeRecord, String> CHANGE_NAME = createField("change_name", org.jooq.impl.SQLDataType.CHAR.length(10), this, "收货人地址");

    /**
     * The column <code>ejavashop.member_product_exchange.phone</code>.
     */
    public final TableField<MemberProductExchangeRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>ejavashop.member_product_exchange.email</code>.
     */
    public final TableField<MemberProductExchangeRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>ejavashop.member_product_exchange.zip_code</code>. 邮编
     */
    public final TableField<MemberProductExchangeRecord, String> ZIP_CODE = createField("zip_code", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "邮编");

    /**
     * The column <code>ejavashop.member_product_exchange.question</code>. 问题描述
     */
    public final TableField<MemberProductExchangeRecord, String> QUESTION = createField("question", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "问题描述");

    /**
     * The column <code>ejavashop.member_product_exchange.image</code>. 图片
     */
    public final TableField<MemberProductExchangeRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "图片");

    /**
     * The column <code>ejavashop.member_product_exchange.name</code>. 联系人姓名
     */
    public final TableField<MemberProductExchangeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "联系人姓名");

    /**
     * The column <code>ejavashop.member_product_exchange.state</code>. 换货状态：1、未处理；2、审核通过待收货；3、已经收货；4、发货处理完成；5、不予处理原件退还；6、不处理
     */
    public final TableField<MemberProductExchangeRecord, Byte> STATE = createField("state", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "换货状态：1、未处理；2、审核通过待收货；3、已经收货；4、发货处理完成；5、不予处理原件退还；6、不处理");

    /**
     * The column <code>ejavashop.member_product_exchange.create_time</code>.
     */
    public final TableField<MemberProductExchangeRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ejavashop.member_product_exchange.update_time</code>.
     */
    public final TableField<MemberProductExchangeRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ejavashop.member_product_exchange.opt_id</code>. 处理人
     */
    public final TableField<MemberProductExchangeRecord, Integer> OPT_ID = createField("opt_id", org.jooq.impl.SQLDataType.INTEGER, this, "处理人");

    /**
     * The column <code>ejavashop.member_product_exchange.remark</code>. 备注
     */
    public final TableField<MemberProductExchangeRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");

    /**
     * The column <code>ejavashop.member_product_exchange.address_result</code>. 退货地址
     */
    public final TableField<MemberProductExchangeRecord, String> ADDRESS_RESULT = createField("address_result", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "退货地址");

    /**
     * Create a <code>ejavashop.member_product_exchange</code> table reference
     */
    public MemberProductExchange() {
        this("member_product_exchange", null);
    }

    /**
     * Create an aliased <code>ejavashop.member_product_exchange</code> table reference
     */
    public MemberProductExchange(String alias) {
        this(alias, MEMBER_PRODUCT_EXCHANGE);
    }

    private MemberProductExchange(String alias, Table<MemberProductExchangeRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemberProductExchange(String alias, Table<MemberProductExchangeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户换货");
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
    public Identity<MemberProductExchangeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MEMBER_PRODUCT_EXCHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberProductExchangeRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_PRODUCT_EXCHANGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberProductExchangeRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberProductExchangeRecord>>asList(Keys.KEY_MEMBER_PRODUCT_EXCHANGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberProductExchange as(String alias) {
        return new MemberProductExchange(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberProductExchange rename(String name) {
        return new MemberProductExchange(name, null);
    }
}
