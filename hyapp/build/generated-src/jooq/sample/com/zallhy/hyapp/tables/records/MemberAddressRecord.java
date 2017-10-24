/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.MemberAddress;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MemberAddressRecord extends UpdatableRecordImpl<MemberAddressRecord> implements Record15<Integer, Integer, String, Integer, Integer, Integer, String, String, String, String, String, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1472041664;

    /**
     * Setter for <code>ejavashop.member_address.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.member_address.member_id</code>.
     */
    public void setMemberId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.member_id</code>.
     */
    public Integer getMemberId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.member_address.member_name</code>. 收货人
     */
    public void setMemberName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.member_name</code>. 收货人
     */
    public String getMemberName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.member_address.province_id</code>. 省ID
     */
    public void setProvinceId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.province_id</code>. 省ID
     */
    public Integer getProvinceId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ejavashop.member_address.city_id</code>. 市ID
     */
    public void setCityId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.city_id</code>. 市ID
     */
    public Integer getCityId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ejavashop.member_address.area_id</code>. 地区ID
     */
    public void setAreaId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.area_id</code>. 地区ID
     */
    public Integer getAreaId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ejavashop.member_address.add_all</code>. 省市区组合
     */
    public void setAddAll(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.add_all</code>. 省市区组合
     */
    public String getAddAll() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ejavashop.member_address.address_info</code>. 详细地址
     */
    public void setAddressInfo(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.address_info</code>. 详细地址
     */
    public String getAddressInfo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ejavashop.member_address.mobile</code>. 手机
     */
    public void setMobile(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.mobile</code>. 手机
     */
    public String getMobile() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ejavashop.member_address.phone</code>. 电话
     */
    public void setPhone(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.phone</code>. 电话
     */
    public String getPhone() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ejavashop.member_address.email</code>. 邮箱
     */
    public void setEmail(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.email</code>. 邮箱
     */
    public String getEmail() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ejavashop.member_address.zip_code</code>. 邮编
     */
    public void setZipCode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.zip_code</code>. 邮编
     */
    public String getZipCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ejavashop.member_address.state</code>. 1、默认；2、不是默认
     */
    public void setState(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.state</code>. 1、默认；2、不是默认
     */
    public Byte getState() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>ejavashop.member_address.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>ejavashop.member_address.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>ejavashop.member_address.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, String, Integer, Integer, Integer, String, String, String, String, String, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, String, Integer, Integer, Integer, String, String, String, String, String, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MemberAddress.MEMBER_ADDRESS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return MemberAddress.MEMBER_ADDRESS.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MemberAddress.MEMBER_ADDRESS.MEMBER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MemberAddress.MEMBER_ADDRESS.PROVINCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MemberAddress.MEMBER_ADDRESS.CITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return MemberAddress.MEMBER_ADDRESS.AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MemberAddress.MEMBER_ADDRESS.ADD_ALL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return MemberAddress.MEMBER_ADDRESS.ADDRESS_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MemberAddress.MEMBER_ADDRESS.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return MemberAddress.MEMBER_ADDRESS.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return MemberAddress.MEMBER_ADDRESS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return MemberAddress.MEMBER_ADDRESS.ZIP_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return MemberAddress.MEMBER_ADDRESS.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return MemberAddress.MEMBER_ADDRESS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return MemberAddress.MEMBER_ADDRESS.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMemberName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getProvinceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getAreaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAddAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getAddressInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getZipCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value2(Integer value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value3(String value) {
        setMemberName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value4(Integer value) {
        setProvinceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value5(Integer value) {
        setCityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value6(Integer value) {
        setAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value7(String value) {
        setAddAll(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value8(String value) {
        setAddressInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value9(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value10(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value11(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value12(String value) {
        setZipCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value13(Byte value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value14(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord value15(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberAddressRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, Integer value6, String value7, String value8, String value9, String value10, String value11, String value12, Byte value13, Timestamp value14, Timestamp value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MemberAddressRecord
     */
    public MemberAddressRecord() {
        super(MemberAddress.MEMBER_ADDRESS);
    }

    /**
     * Create a detached, initialised MemberAddressRecord
     */
    public MemberAddressRecord(Integer id, Integer memberId, String memberName, Integer provinceId, Integer cityId, Integer areaId, String addAll, String addressInfo, String mobile, String phone, String email, String zipCode, Byte state, Timestamp createTime, Timestamp updateTime) {
        super(MemberAddress.MEMBER_ADDRESS);

        set(0, id);
        set(1, memberId);
        set(2, memberName);
        set(3, provinceId);
        set(4, cityId);
        set(5, areaId);
        set(6, addAll);
        set(7, addressInfo);
        set(8, mobile);
        set(9, phone);
        set(10, email);
        set(11, zipCode);
        set(12, state);
        set(13, createTime);
        set(14, updateTime);
    }
}
