/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.OrderInventedProduct;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 虚拟网单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderInventedProductRecord extends UpdatableRecordImpl<OrderInventedProductRecord> {

    private static final long serialVersionUID = -1197022789;

    /**
     * Setter for <code>ejavashop.order_invented_product.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.order_invented_id</code>. 订单ID
     */
    public void setOrderInventedId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.order_invented_id</code>. 订单ID
     */
    public Integer getOrderInventedId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.order_invented_sn</code>. 订单号
     */
    public void setOrderInventedSn(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.order_invented_sn</code>. 订单号
     */
    public String getOrderInventedSn() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.seller_id</code>. 商家ID
     */
    public void setSellerId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.seller_id</code>. 商家ID
     */
    public Integer getSellerId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.product_id</code>. 商品id
     */
    public void setProductId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.product_id</code>. 商品id
     */
    public Integer getProductId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.product_name</code>. 商品名称
     */
    public void setProductName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.product_name</code>. 商品名称
     */
    public String getProductName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.product_sku</code>. 抽象商品sku
     */
    public void setProductSku(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.product_sku</code>. 抽象商品sku
     */
    public String getProductSku() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.package_groups_id</code>. 促销套装0、不是促销套装；大于0，促销套装ID，价格是促销套装的ID
     */
    public void setPackageGroupsId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.package_groups_id</code>. 促销套装0、不是促销套装；大于0，促销套装ID，价格是促销套装的ID
     */
    public Integer getPackageGroupsId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.mall_groups_id</code>. 商城套装0，不是上次套装；大于0商城套装ID
     */
    public void setMallGroupsId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.mall_groups_id</code>. 商城套装0，不是上次套装；大于0商城套装ID
     */
    public Integer getMallGroupsId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.gift_id</code>. 赠品ID0、没有赠品；大于0、不是赠品；大于0赠品的ID
     */
    public void setGiftId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.gift_id</code>. 赠品ID0、没有赠品；大于0、不是赠品；大于0赠品的ID
     */
    public Integer getGiftId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.is_gift</code>. 是否是赠品，0、不是；1、是；
     */
    public void setIsGift(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.is_gift</code>. 是否是赠品，0、不是；1、是；
     */
    public Byte getIsGift() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.money_price</code>. 商品单价
     */
    public void setMoneyPrice(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.money_price</code>. 商品单价
     */
    public BigDecimal getMoneyPrice() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.number</code>. 商品数量
     */
    public void setNumber(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.number</code>. 商品数量
     */
    public Integer getNumber() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.money_amount</code>. 网单金额
     */
    public void setMoneyAmount(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.money_amount</code>. 网单金额
     */
    public BigDecimal getMoneyAmount() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.activity_id</code>. 团购ID，为0正常购买
     */
    public void setActivityId(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.activity_id</code>. 团购ID，为0正常购买
     */
    public Integer getActivityId() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.flashsales_id</code>. 限时抢购ID，为0正常购买
     */
    public void setFlashsalesId(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.flashsales_id</code>. 限时抢购ID，为0正常购买
     */
    public Integer getFlashsalesId() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.logistics_id</code>. 物流
     */
    public void setLogisticsId(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.logistics_id</code>. 物流
     */
    public Integer getLogisticsId() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.logistics_name</code>. 物流name
     */
    public void setLogisticsName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.logistics_name</code>. 物流name
     */
    public String getLogisticsName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.logistics_number</code>. 发票快递单号
     */
    public void setLogisticsNumber(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.logistics_number</code>. 发票快递单号
     */
    public String getLogisticsNumber() {
        return (String) get(18);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.shipping_time</code>. 发货时间
     */
    public void setShippingTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.shipping_time</code>. 发货时间
     */
    public Timestamp getShippingTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.close_time</code>. 网单完成关闭或取消关闭时间
     */
    public void setCloseTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.close_time</code>. 网单完成关闭或取消关闭时间
     */
    public Timestamp getCloseTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.system_remark</code>. 系统备注，不给用户显示
     */
    public void setSystemRemark(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.system_remark</code>. 系统备注，不给用户显示
     */
    public String getSystemRemark() {
        return (String) get(21);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.member_product_back_id</code>. 退货ID，默认为0
     */
    public void setMemberProductBackId(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.member_product_back_id</code>. 退货ID，默认为0
     */
    public Integer getMemberProductBackId() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.member_product_exchange_id</code>. 换货ID，默认为0
     */
    public void setMemberProductExchangeId(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.member_product_exchange_id</code>. 换货ID，默认为0
     */
    public Integer getMemberProductExchangeId() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(24, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(24);
    }

    /**
     * Setter for <code>ejavashop.order_invented_product.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(25, value);
    }

    /**
     * Getter for <code>ejavashop.order_invented_product.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(25);
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
     * Create a detached OrderInventedProductRecord
     */
    public OrderInventedProductRecord() {
        super(OrderInventedProduct.ORDER_INVENTED_PRODUCT);
    }

    /**
     * Create a detached, initialised OrderInventedProductRecord
     */
    public OrderInventedProductRecord(Integer id, Integer orderInventedId, String orderInventedSn, Integer sellerId, Integer productId, String productName, String productSku, Integer packageGroupsId, Integer mallGroupsId, Integer giftId, Byte isGift, BigDecimal moneyPrice, Integer number, BigDecimal moneyAmount, Integer activityId, Integer flashsalesId, Integer logisticsId, String logisticsName, String logisticsNumber, Timestamp shippingTime, Timestamp closeTime, String systemRemark, Integer memberProductBackId, Integer memberProductExchangeId, Timestamp createTime, Timestamp updateTime) {
        super(OrderInventedProduct.ORDER_INVENTED_PRODUCT);

        set(0, id);
        set(1, orderInventedId);
        set(2, orderInventedSn);
        set(3, sellerId);
        set(4, productId);
        set(5, productName);
        set(6, productSku);
        set(7, packageGroupsId);
        set(8, mallGroupsId);
        set(9, giftId);
        set(10, isGift);
        set(11, moneyPrice);
        set(12, number);
        set(13, moneyAmount);
        set(14, activityId);
        set(15, flashsalesId);
        set(16, logisticsId);
        set(17, logisticsName);
        set(18, logisticsNumber);
        set(19, shippingTime);
        set(20, closeTime);
        set(21, systemRemark);
        set(22, memberProductBackId);
        set(23, memberProductExchangeId);
        set(24, createTime);
        set(25, updateTime);
    }
}
