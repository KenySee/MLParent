/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.MemberProductBack;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MemberProductBackRecord extends UpdatableRecordImpl<MemberProductBackRecord> {

    private static final long serialVersionUID = 501050181;

    /**
     * Setter for <code>ejavashop.member_product_back.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.seller_id</code>. 所属商家
     */
    public void setSellerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.seller_id</code>. 所属商家
     */
    public Integer getSellerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.order_id</code>. 订单ID
     */
    public void setOrderId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.order_id</code>. 订单ID
     */
    public Integer getOrderId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.order_product_id</code>. 网单ID
     */
    public void setOrderProductId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.order_product_id</code>. 网单ID
     */
    public Integer getOrderProductId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.product_id</code>. 商品ID
     */
    public void setProductId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.product_id</code>. 商品ID
     */
    public Integer getProductId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.member_id</code>. 用户ID
     */
    public void setMemberId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.member_id</code>. 用户ID
     */
    public Integer getMemberId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.member_name</code>. 用户Name
     */
    public void setMemberName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.member_name</code>. 用户Name
     */
    public String getMemberName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.province_id</code>. Province
     */
    public void setProvinceId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.province_id</code>. Province
     */
    public Integer getProvinceId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.city_id</code>. city
     */
    public void setCityId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.city_id</code>. city
     */
    public Integer getCityId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.area_id</code>. area
     */
    public void setAreaId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.area_id</code>. area
     */
    public Integer getAreaId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.address_all</code>. 省市区组合
     */
    public void setAddressAll(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.address_all</code>. 省市区组合
     */
    public String getAddressAll() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.address_info</code>. 详细地址
     */
    public void setAddressInfo(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.address_info</code>. 详细地址
     */
    public String getAddressInfo() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.phone</code>. 退货人手机
     */
    public void setPhone(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.phone</code>. 退货人手机
     */
    public String getPhone() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.return_name</code>. 联系人姓名
     */
    public void setReturnName(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.return_name</code>. 联系人姓名
     */
    public String getReturnName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.zip_code</code>. 邮编
     */
    public void setZipCode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.zip_code</code>. 邮编
     */
    public String getZipCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.question</code>. 问题描述
     */
    public void setQuestion(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.question</code>. 问题描述
     */
    public String getQuestion() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.image</code>. 图片
     */
    public void setImage(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.image</code>. 图片
     */
    public String getImage() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.state_return</code>. 退货状态：1、未处理；2、审核通过待收货；3、已经收货；4、不予处理
     */
    public void setStateReturn(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.state_return</code>. 退货状态：1、未处理；2、审核通过待收货；3、已经收货；4、不予处理
     */
    public Byte getStateReturn() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.state_money</code>. 退款状态：1、未退款；2、退款到账户；3、退款到银行
     */
    public void setStateMoney(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.state_money</code>. 退款状态：1、未退款；2、退款到账户；3、退款到银行
     */
    public Byte getStateMoney() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.back_money</code>. 退款金额
     */
    public void setBackMoney(BigDecimal value) {
        set(19, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.back_money</code>. 退款金额
     */
    public BigDecimal getBackMoney() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.back_integral</code>. 退回积分
     */
    public void setBackIntegral(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.back_integral</code>. 退回积分
     */
    public Integer getBackIntegral() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.back_integral_money</code>. 退回积分金额（退回积分转换成金额）
     */
    public void setBackIntegralMoney(BigDecimal value) {
        set(21, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.back_integral_money</code>. 退回积分金额（退回积分转换成金额）
     */
    public BigDecimal getBackIntegralMoney() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.back_coupon_user_id</code>. 退回优惠券ID，0表示没有
     */
    public void setBackCouponUserId(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.back_coupon_user_id</code>. 退回优惠券ID，0表示没有
     */
    public Integer getBackCouponUserId() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.back_money_time</code>. 退款时间
     */
    public void setBackMoneyTime(Timestamp value) {
        set(23, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.back_money_time</code>. 退款时间
     */
    public Timestamp getBackMoneyTime() {
        return (Timestamp) get(23);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(24, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(24);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(25, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(25);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.opt_id</code>. 处理人
     */
    public void setOptId(Integer value) {
        set(26, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.opt_id</code>. 处理人
     */
    public Integer getOptId() {
        return (Integer) get(26);
    }

    /**
     * Setter for <code>ejavashop.member_product_back.remark</code>. 备注
     */
    public void setRemark(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>ejavashop.member_product_back.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(27);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MemberProductBackRecord
     */
    public MemberProductBackRecord() {
        super(MemberProductBack.MEMBER_PRODUCT_BACK);
    }

    /**
     * Create a detached, initialised MemberProductBackRecord
     */
    public MemberProductBackRecord(Integer id, Integer sellerId, Integer orderId, Integer orderProductId, Integer productId, Integer memberId, String memberName, Integer provinceId, Integer cityId, Integer areaId, String addressAll, String addressInfo, String phone, String returnName, String zipCode, String question, String image, Byte stateReturn, Byte stateMoney, BigDecimal backMoney, Integer backIntegral, BigDecimal backIntegralMoney, Integer backCouponUserId, Timestamp backMoneyTime, Timestamp createTime, Timestamp updateTime, Integer optId, String remark) {
        super(MemberProductBack.MEMBER_PRODUCT_BACK);

        set(0, id);
        set(1, sellerId);
        set(2, orderId);
        set(3, orderProductId);
        set(4, productId);
        set(5, memberId);
        set(6, memberName);
        set(7, provinceId);
        set(8, cityId);
        set(9, areaId);
        set(10, addressAll);
        set(11, addressInfo);
        set(12, phone);
        set(13, returnName);
        set(14, zipCode);
        set(15, question);
        set(16, image);
        set(17, stateReturn);
        set(18, stateMoney);
        set(19, backMoney);
        set(20, backIntegral);
        set(21, backIntegralMoney);
        set(22, backCouponUserId);
        set(23, backMoneyTime);
        set(24, createTime);
        set(25, updateTime);
        set(26, optId);
        set(27, remark);
    }
}
