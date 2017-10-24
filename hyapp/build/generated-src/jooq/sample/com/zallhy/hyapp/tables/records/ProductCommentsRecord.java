/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.ProductComments;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 商品评论管理
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductCommentsRecord extends UpdatableRecordImpl<ProductCommentsRecord> implements Record22<Integer, Integer, String, Byte, String, String, Timestamp, Integer, Integer, Integer, String, Integer, String, String, Byte, Integer, Byte, Byte, Byte, Byte, Byte, String> {

    private static final long serialVersionUID = -836826515;

    /**
     * Setter for <code>ejavashop.product_comments.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.product_comments.user_id</code>. 评价人ID
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.user_id</code>. 评价人ID
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.product_comments.user_name</code>. 评价人账号
     */
    public void setUserName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.user_name</code>. 评价人账号
     */
    public String getUserName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.product_comments.grade</code>. 评分(1到5)
     */
    public void setGrade(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.grade</code>. 评分(1到5)
     */
    public Byte getGrade() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>ejavashop.product_comments.content</code>. 评价内容
     */
    public void setContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.content</code>. 评价内容
     */
    public String getContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ejavashop.product_comments.seller_attitude</code>. 评价商家服务
     */
    public void setSellerAttitude(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.seller_attitude</code>. 评价商家服务
     */
    public String getSellerAttitude() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ejavashop.product_comments.create_time</code>. 评价时间
     */
    public void setCreateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.create_time</code>. 评价时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ejavashop.product_comments.product_id</code>. 评价商品
     */
    public void setProductId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.product_id</code>. 评价商品
     */
    public Integer getProductId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ejavashop.product_comments.product_goods_id</code>. 货品ID
     */
    public void setProductGoodsId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.product_goods_id</code>. 货品ID
     */
    public Integer getProductGoodsId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>ejavashop.product_comments.seller_id</code>. 所属商家
     */
    public void setSellerId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.seller_id</code>. 所属商家
     */
    public Integer getSellerId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ejavashop.product_comments.order_sn</code>. 订单编号
     */
    public void setOrderSn(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.order_sn</code>. 订单编号
     */
    public String getOrderSn() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ejavashop.product_comments.reply_id</code>. 回复人ID
     */
    public void setReplyId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.reply_id</code>. 回复人ID
     */
    public Integer getReplyId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>ejavashop.product_comments.reply_name</code>. 回复人名称
     */
    public void setReplyName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.reply_name</code>. 回复人名称
     */
    public String getReplyName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ejavashop.product_comments.reply_content</code>. 回复内容
     */
    public void setReplyContent(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.reply_content</code>. 回复内容
     */
    public String getReplyContent() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ejavashop.product_comments.state</code>. 1、评价；2、审核通过，前台显示；3、删除
     */
    public void setState(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.state</code>. 1、评价；2、审核通过，前台显示；3、删除
     */
    public Byte getState() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>ejavashop.product_comments.admin_id</code>. 审核上架人
     */
    public void setAdminId(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.admin_id</code>. 审核上架人
     */
    public Integer getAdminId() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>ejavashop.product_comments.description</code>. 描述相符(1到5星)
     */
    public void setDescription(Byte value) {
        set(16, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.description</code>. 描述相符(1到5星)
     */
    public Byte getDescription() {
        return (Byte) get(16);
    }

    /**
     * Setter for <code>ejavashop.product_comments.service_attitude</code>. 服务态度(1到5星)
     */
    public void setServiceAttitude(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.service_attitude</code>. 服务态度(1到5星)
     */
    public Byte getServiceAttitude() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>ejavashop.product_comments.product_speed</code>. 发货速度(1到5星)
     */
    public void setProductSpeed(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.product_speed</code>. 发货速度(1到5星)
     */
    public Byte getProductSpeed() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>ejavashop.product_comments.logistics_speed</code>. 物流态度（1到5星）
     */
    public void setLogisticsSpeed(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.logistics_speed</code>. 物流态度（1到5星）
     */
    public Byte getLogisticsSpeed() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>ejavashop.product_comments.express_attitude</code>. 快递员态度(1到5星)
     */
    public void setExpressAttitude(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.express_attitude</code>. 快递员态度(1到5星)
     */
    public Byte getExpressAttitude() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>ejavashop.product_comments.com_pic</code>. 评论图片
     */
    public void setComPic(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>ejavashop.product_comments.com_pic</code>. 评论图片
     */
    public String getComPic() {
        return (String) get(21);
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
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Integer, String, Byte, String, String, Timestamp, Integer, Integer, Integer, String, Integer, String, String, Byte, Integer, Byte, Byte, Byte, Byte, Byte, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Integer, String, Byte, String, String, Timestamp, Integer, Integer, Integer, String, Integer, String, String, Byte, Integer, Byte, Byte, Byte, Byte, Byte, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ProductComments.PRODUCT_COMMENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ProductComments.PRODUCT_COMMENTS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ProductComments.PRODUCT_COMMENTS.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return ProductComments.PRODUCT_COMMENTS.GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ProductComments.PRODUCT_COMMENTS.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ProductComments.PRODUCT_COMMENTS.SELLER_ATTITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ProductComments.PRODUCT_COMMENTS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ProductComments.PRODUCT_COMMENTS.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ProductComments.PRODUCT_COMMENTS.PRODUCT_GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ProductComments.PRODUCT_COMMENTS.SELLER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ProductComments.PRODUCT_COMMENTS.ORDER_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return ProductComments.PRODUCT_COMMENTS.REPLY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ProductComments.PRODUCT_COMMENTS.REPLY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ProductComments.PRODUCT_COMMENTS.REPLY_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return ProductComments.PRODUCT_COMMENTS.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return ProductComments.PRODUCT_COMMENTS.ADMIN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field17() {
        return ProductComments.PRODUCT_COMMENTS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field18() {
        return ProductComments.PRODUCT_COMMENTS.SERVICE_ATTITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field19() {
        return ProductComments.PRODUCT_COMMENTS.PRODUCT_SPEED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field20() {
        return ProductComments.PRODUCT_COMMENTS.LOGISTICS_SPEED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field21() {
        return ProductComments.PRODUCT_COMMENTS.EXPRESS_ATTITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field22() {
        return ProductComments.PRODUCT_COMMENTS.COM_PIC;
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSellerAttitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getProductGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getSellerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getReplyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getReplyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getReplyContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getAdminId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value17() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value18() {
        return getServiceAttitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value19() {
        return getProductSpeed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value20() {
        return getLogisticsSpeed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value21() {
        return getExpressAttitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value22() {
        return getComPic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value3(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value4(Byte value) {
        setGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value5(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value6(String value) {
        setSellerAttitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value8(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value9(Integer value) {
        setProductGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value10(Integer value) {
        setSellerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value11(String value) {
        setOrderSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value12(Integer value) {
        setReplyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value13(String value) {
        setReplyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value14(String value) {
        setReplyContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value15(Byte value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value16(Integer value) {
        setAdminId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value17(Byte value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value18(Byte value) {
        setServiceAttitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value19(Byte value) {
        setProductSpeed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value20(Byte value) {
        setLogisticsSpeed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value21(Byte value) {
        setExpressAttitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord value22(String value) {
        setComPic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCommentsRecord values(Integer value1, Integer value2, String value3, Byte value4, String value5, String value6, Timestamp value7, Integer value8, Integer value9, Integer value10, String value11, Integer value12, String value13, String value14, Byte value15, Integer value16, Byte value17, Byte value18, Byte value19, Byte value20, Byte value21, String value22) {
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
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductCommentsRecord
     */
    public ProductCommentsRecord() {
        super(ProductComments.PRODUCT_COMMENTS);
    }

    /**
     * Create a detached, initialised ProductCommentsRecord
     */
    public ProductCommentsRecord(Integer id, Integer userId, String userName, Byte grade, String content, String sellerAttitude, Timestamp createTime, Integer productId, Integer productGoodsId, Integer sellerId, String orderSn, Integer replyId, String replyName, String replyContent, Byte state, Integer adminId, Byte description, Byte serviceAttitude, Byte productSpeed, Byte logisticsSpeed, Byte expressAttitude, String comPic) {
        super(ProductComments.PRODUCT_COMMENTS);

        set(0, id);
        set(1, userId);
        set(2, userName);
        set(3, grade);
        set(4, content);
        set(5, sellerAttitude);
        set(6, createTime);
        set(7, productId);
        set(8, productGoodsId);
        set(9, sellerId);
        set(10, orderSn);
        set(11, replyId);
        set(12, replyName);
        set(13, replyContent);
        set(14, state);
        set(15, adminId);
        set(16, description);
        set(17, serviceAttitude);
        set(18, productSpeed);
        set(19, logisticsSpeed);
        set(20, expressAttitude);
        set(21, comPic);
    }
}
