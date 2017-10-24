/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.MemberAddressRecord;

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
 * 收货地址
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberAddress extends TableImpl<MemberAddressRecord> {

    private static final long serialVersionUID = 266838314;

    /**
     * The reference instance of <code>ejavashop.member_address</code>
     */
    public static final MemberAddress MEMBER_ADDRESS = new MemberAddress();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberAddressRecord> getRecordType() {
        return MemberAddressRecord.class;
    }

    /**
     * The column <code>ejavashop.member_address.id</code>.
     */
    public final TableField<MemberAddressRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.member_address.member_id</code>.
     */
    public final TableField<MemberAddressRecord, Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.member_address.member_name</code>. 收货人
     */
    public final TableField<MemberAddressRecord, String> MEMBER_NAME = createField("member_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "收货人");

    /**
     * The column <code>ejavashop.member_address.province_id</code>. 省ID
     */
    public final TableField<MemberAddressRecord, Integer> PROVINCE_ID = createField("province_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "省ID");

    /**
     * The column <code>ejavashop.member_address.city_id</code>. 市ID
     */
    public final TableField<MemberAddressRecord, Integer> CITY_ID = createField("city_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "市ID");

    /**
     * The column <code>ejavashop.member_address.area_id</code>. 地区ID
     */
    public final TableField<MemberAddressRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "地区ID");

    /**
     * The column <code>ejavashop.member_address.add_all</code>. 省市区组合
     */
    public final TableField<MemberAddressRecord, String> ADD_ALL = createField("add_all", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "省市区组合");

    /**
     * The column <code>ejavashop.member_address.address_info</code>. 详细地址
     */
    public final TableField<MemberAddressRecord, String> ADDRESS_INFO = createField("address_info", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "详细地址");

    /**
     * The column <code>ejavashop.member_address.mobile</code>. 手机
     */
    public final TableField<MemberAddressRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "手机");

    /**
     * The column <code>ejavashop.member_address.phone</code>. 电话
     */
    public final TableField<MemberAddressRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "电话");

    /**
     * The column <code>ejavashop.member_address.email</code>. 邮箱
     */
    public final TableField<MemberAddressRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "邮箱");

    /**
     * The column <code>ejavashop.member_address.zip_code</code>. 邮编
     */
    public final TableField<MemberAddressRecord, String> ZIP_CODE = createField("zip_code", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "邮编");

    /**
     * The column <code>ejavashop.member_address.state</code>. 1、默认；2、不是默认
     */
    public final TableField<MemberAddressRecord, Byte> STATE = createField("state", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "1、默认；2、不是默认");

    /**
     * The column <code>ejavashop.member_address.create_time</code>.
     */
    public final TableField<MemberAddressRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ejavashop.member_address.update_time</code>.
     */
    public final TableField<MemberAddressRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ejavashop.member_address</code> table reference
     */
    public MemberAddress() {
        this("member_address", null);
    }

    /**
     * Create an aliased <code>ejavashop.member_address</code> table reference
     */
    public MemberAddress(String alias) {
        this(alias, MEMBER_ADDRESS);
    }

    private MemberAddress(String alias, Table<MemberAddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemberAddress(String alias, Table<MemberAddressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "收货地址");
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
    public Identity<MemberAddressRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MEMBER_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberAddressRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_ADDRESS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberAddressRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberAddressRecord>>asList(Keys.KEY_MEMBER_ADDRESS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddress as(String alias) {
        return new MemberAddress(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberAddress rename(String name) {
        return new MemberAddress(name, null);
    }
}
