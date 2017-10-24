/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.ProductBak;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 商品表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductBakRecord extends UpdatableRecordImpl<ProductBakRecord> {

    private static final long serialVersionUID = -732180340;

    /**
     * Setter for <code>ejavashop.product_bak.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.product_bak.product_cate_id</code>. 分类ID
     */
    public void setProductCateId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.product_cate_id</code>. 分类ID
     */
    public Integer getProductCateId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.product_bak.name1</code>. 商品名称建议50个字符
     */
    public void setName1(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.name1</code>. 商品名称建议50个字符
     */
    public String getName1() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.product_bak.name2</code>. 商品促销信息（建议100个字符）
     */
    public void setName2(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.name2</code>. 商品促销信息（建议100个字符）
     */
    public String getName2() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.product_bak.keyword</code>. 商品关键字，用于检索商品，用逗号分隔
     */
    public void setKeyword(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.keyword</code>. 商品关键字，用于检索商品，用逗号分隔
     */
    public String getKeyword() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ejavashop.product_bak.product_brand_id</code>. 品牌ID
     */
    public void setProductBrandId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.product_brand_id</code>. 品牌ID
     */
    public Integer getProductBrandId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ejavashop.product_bak.is_self</code>. 1、自营；2、商家
     */
    public void setIsSelf(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.is_self</code>. 1、自营；2、商家
     */
    public Byte getIsSelf() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>ejavashop.product_bak.cost_price</code>. 成本价
     */
    public void setCostPrice(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.cost_price</code>. 成本价
     */
    public BigDecimal getCostPrice() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ejavashop.product_bak.protected_price</code>. 保护价，最低价格不能低于
     */
    public void setProtectedPrice(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.protected_price</code>. 保护价，最低价格不能低于
     */
    public BigDecimal getProtectedPrice() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>ejavashop.product_bak.market_price</code>. 市场价
     */
    public void setMarketPrice(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.market_price</code>. 市场价
     */
    public BigDecimal getMarketPrice() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>ejavashop.product_bak.mall_pc_price</code>. 商城价
     */
    public void setMallPcPrice(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.mall_pc_price</code>. 商城价
     */
    public BigDecimal getMallPcPrice() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>ejavashop.product_bak.mal_mobile_price</code>. 商城价Mobile
     */
    public void setMalMobilePrice(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.mal_mobile_price</code>. 商城价Mobile
     */
    public BigDecimal getMalMobilePrice() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>ejavashop.product_bak.virtual_sales</code>. 虚拟销量
     */
    public void setVirtualSales(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.virtual_sales</code>. 虚拟销量
     */
    public Integer getVirtualSales() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>ejavashop.product_bak.actual_sales</code>. 实际销量
     */
    public void setActualSales(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.actual_sales</code>. 实际销量
     */
    public Integer getActualSales() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>ejavashop.product_bak.product_stock</code>. 商品库存
     */
    public void setProductStock(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.product_stock</code>. 商品库存
     */
    public Integer getProductStock() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>ejavashop.product_bak.is_norm</code>. 1、没有启用规格；2、启用规格
     */
    public void setIsNorm(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.is_norm</code>. 1、没有启用规格；2、启用规格
     */
    public Integer getIsNorm() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>ejavashop.product_bak.norm_ids</code>. 规格ID集合
     */
    public void setNormIds(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.norm_ids</code>. 规格ID集合
     */
    public String getNormIds() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ejavashop.product_bak.norm_name</code>. 规格属性值集合 空
     */
    public void setNormName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.norm_name</code>. 规格属性值集合 空
     */
    public String getNormName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ejavashop.product_bak.state</code>. 1、刚创建；2、提交审核；3、审核通过；4、申请驳回；5、商品删除；6、上架；7、下架
     */
    public void setState(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.state</code>. 1、刚创建；2、提交审核；3、审核通过；4、申请驳回；5、商品删除；6、上架；7、下架
     */
    public Integer getState() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>ejavashop.product_bak.is_top</code>. 1、不推荐；2、推荐
     */
    public void setIsTop(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.is_top</code>. 1、不推荐；2、推荐
     */
    public Byte getIsTop() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>ejavashop.product_bak.up_time</code>. 商品上架时间
     */
    public void setUpTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.up_time</code>. 商品上架时间
     */
    public Timestamp getUpTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>ejavashop.product_bak.description</code>. 商品描述信息
     */
    public void setDescription(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.description</code>. 商品描述信息
     */
    public String getDescription() {
        return (String) get(21);
    }

    /**
     * Setter for <code>ejavashop.product_bak.packing</code>. 包装清单
     */
    public void setPacking(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.packing</code>. 包装清单
     */
    public String getPacking() {
        return (String) get(22);
    }

    /**
     * Setter for <code>ejavashop.product_bak.seller_id</code>. 商家ID
     */
    public void setSellerId(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.seller_id</code>. 商家ID
     */
    public Integer getSellerId() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>ejavashop.product_bak.create_id</code>. 创建人
     */
    public void setCreateId(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.create_id</code>. 创建人
     */
    public Integer getCreateId() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>ejavashop.product_bak.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(25, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(25);
    }

    /**
     * Setter for <code>ejavashop.product_bak.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(26, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(26);
    }

    /**
     * Setter for <code>ejavashop.product_bak.seller_cate_id</code>. 商家分类ID
     */
    public void setSellerCateId(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.seller_cate_id</code>. 商家分类ID
     */
    public Integer getSellerCateId() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>ejavashop.product_bak.seller_is_top</code>. 商品推荐，1、不推荐；2、推荐  推荐的商品会显示到店铺的首页
     */
    public void setSellerIsTop(Byte value) {
        set(28, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.seller_is_top</code>. 商品推荐，1、不推荐；2、推荐  推荐的商品会显示到店铺的首页
     */
    public Byte getSellerIsTop() {
        return (Byte) get(28);
    }

    /**
     * Setter for <code>ejavashop.product_bak.seller_state</code>. 店铺状态：1、店铺正常；2、店铺关闭 默认1
     */
    public void setSellerState(Byte value) {
        set(29, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.seller_state</code>. 店铺状态：1、店铺正常；2、店铺关闭 默认1
     */
    public Byte getSellerState() {
        return (Byte) get(29);
    }

    /**
     * Setter for <code>ejavashop.product_bak.comments_number</code>. 评价总数
     */
    public void setCommentsNumber(Integer value) {
        set(30, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.comments_number</code>. 评价总数
     */
    public Integer getCommentsNumber() {
        return (Integer) get(30);
    }

    /**
     * Setter for <code>ejavashop.product_bak.product_cate_state</code>. 平台商品分类状态：1、分类正常；2、分类关闭 默认1
     */
    public void setProductCateState(Byte value) {
        set(31, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.product_cate_state</code>. 平台商品分类状态：1、分类正常；2、分类关闭 默认1
     */
    public Byte getProductCateState() {
        return (Byte) get(31);
    }

    /**
     * Setter for <code>ejavashop.product_bak.is_invented_product</code>. 是否是虚拟商品：1、实物商品；2、虚拟商品
     */
    public void setIsInventedProduct(Byte value) {
        set(32, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.is_invented_product</code>. 是否是虚拟商品：1、实物商品；2、虚拟商品
     */
    public Byte getIsInventedProduct() {
        return (Byte) get(32);
    }

    /**
     * Setter for <code>ejavashop.product_bak.transport_id</code>. 运费模板id
     */
    public void setTransportId(Integer value) {
        set(33, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.transport_id</code>. 运费模板id
     */
    public Integer getTransportId() {
        return (Integer) get(33);
    }

    /**
     * Setter for <code>ejavashop.product_bak.master_img</code>. 主图
     */
    public void setMasterImg(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.master_img</code>. 主图
     */
    public String getMasterImg() {
        return (String) get(34);
    }

    /**
     * Setter for <code>ejavashop.product_bak.product_code</code>. 商品编码
     */
    public void setProductCode(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.product_code</code>. 商品编码
     */
    public String getProductCode() {
        return (String) get(35);
    }

    /**
     * Setter for <code>ejavashop.product_bak.is_exhibit</code>.
     */
    public void setIsExhibit(Byte value) {
        set(36, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.is_exhibit</code>.
     */
    public Byte getIsExhibit() {
        return (Byte) get(36);
    }

    /**
     * Setter for <code>ejavashop.product_bak.sd_order</code>.
     */
    public void setSdOrder(Integer value) {
        set(37, value);
    }

    /**
     * Getter for <code>ejavashop.product_bak.sd_order</code>.
     */
    public Integer getSdOrder() {
        return (Integer) get(37);
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
     * Create a detached ProductBakRecord
     */
    public ProductBakRecord() {
        super(ProductBak.PRODUCT_BAK);
    }

    /**
     * Create a detached, initialised ProductBakRecord
     */
    public ProductBakRecord(Integer id, Integer productCateId, String name1, String name2, String keyword, Integer productBrandId, Byte isSelf, BigDecimal costPrice, BigDecimal protectedPrice, BigDecimal marketPrice, BigDecimal mallPcPrice, BigDecimal malMobilePrice, Integer virtualSales, Integer actualSales, Integer productStock, Integer isNorm, String normIds, String normName, Integer state, Byte isTop, Timestamp upTime, String description, String packing, Integer sellerId, Integer createId, Timestamp createTime, Timestamp updateTime, Integer sellerCateId, Byte sellerIsTop, Byte sellerState, Integer commentsNumber, Byte productCateState, Byte isInventedProduct, Integer transportId, String masterImg, String productCode, Byte isExhibit, Integer sdOrder) {
        super(ProductBak.PRODUCT_BAK);

        set(0, id);
        set(1, productCateId);
        set(2, name1);
        set(3, name2);
        set(4, keyword);
        set(5, productBrandId);
        set(6, isSelf);
        set(7, costPrice);
        set(8, protectedPrice);
        set(9, marketPrice);
        set(10, mallPcPrice);
        set(11, malMobilePrice);
        set(12, virtualSales);
        set(13, actualSales);
        set(14, productStock);
        set(15, isNorm);
        set(16, normIds);
        set(17, normName);
        set(18, state);
        set(19, isTop);
        set(20, upTime);
        set(21, description);
        set(22, packing);
        set(23, sellerId);
        set(24, createId);
        set(25, createTime);
        set(26, updateTime);
        set(27, sellerCateId);
        set(28, sellerIsTop);
        set(29, sellerState);
        set(30, commentsNumber);
        set(31, productCateState);
        set(32, isInventedProduct);
        set(33, transportId);
        set(34, masterImg);
        set(35, productCode);
        set(36, isExhibit);
        set(37, sdOrder);
    }
}
