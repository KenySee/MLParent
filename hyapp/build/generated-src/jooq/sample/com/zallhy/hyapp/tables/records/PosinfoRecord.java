/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.Posinfo;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PosinfoRecord extends UpdatableRecordImpl<PosinfoRecord> implements Record17<Integer, String, String, String, String, String, String, String, String, BigDecimal, Timestamp, Timestamp, String, String, BigDecimal, String, Byte> {

    private static final long serialVersionUID = 1582711435;

    /**
     * Setter for <code>ejavashop.posinfo.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.posinfo.transType</code>. 交易类型
     */
    public void setTranstype(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.transType</code>. 交易类型
     */
    public String getTranstype() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ejavashop.posinfo.agentNo</code>. 代理商编号
     */
    public void setAgentno(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.agentNo</code>. 代理商编号
     */
    public String getAgentno() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.posinfo.customerNo</code>. 商户编号
     */
    public void setCustomerno(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.customerNo</code>. 商户编号
     */
    public String getCustomerno() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.posinfo.orderOptimistic</code>. 版本号
     */
    public void setOrderoptimistic(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.orderOptimistic</code>. 版本号
     */
    public String getOrderoptimistic() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ejavashop.posinfo.orderNo</code>. 订单号
     */
    public void setOrderno(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.orderNo</code>. 订单号
     */
    public String getOrderno() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ejavashop.posinfo.posBatch</code>. 批次号
     */
    public void setPosbatch(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.posBatch</code>. 批次号
     */
    public String getPosbatch() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ejavashop.posinfo.posRequestId</code>. Pos流水号
     */
    public void setPosrequestid(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.posRequestId</code>. Pos流水号
     */
    public String getPosrequestid() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ejavashop.posinfo.posCati</code>. 终端号
     */
    public void setPoscati(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.posCati</code>. 终端号
     */
    public String getPoscati() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ejavashop.posinfo.amount</code>. 交易金额
     */
    public void setAmount(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.amount</code>. 交易金额
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>ejavashop.posinfo.createTime</code>. 创建时间
     */
    public void setCreatetime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.createTime</code>. 创建时间
     */
    public Timestamp getCreatetime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ejavashop.posinfo.completeTime</code>. 完成时间
     */
    public void setCompletetime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.completeTime</code>. 完成时间
     */
    public Timestamp getCompletetime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>ejavashop.posinfo.status</code>. 订单交易状态（查看编码结果）INIT未付
     */
    public void setStatus(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.status</code>. 订单交易状态（查看编码结果）INIT未付
     */
    public String getStatus() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ejavashop.posinfo.pan</code>. 卡号
     */
    public void setPan(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.pan</code>. 卡号
     */
    public String getPan() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ejavashop.posinfo.customerFee</code>. 核算手续费
     */
    public void setCustomerfee(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.customerFee</code>. 核算手续费
     */
    public BigDecimal getCustomerfee() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>ejavashop.posinfo.sign</code>.
     */
    public void setSign(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.sign</code>.
     */
    public String getSign() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ejavashop.posinfo.fjstatus</code>.
     */
    public void setFjstatus(Byte value) {
        set(16, value);
    }

    /**
     * Getter for <code>ejavashop.posinfo.fjstatus</code>.
     */
    public Byte getFjstatus() {
        return (Byte) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, String, String, String, String, String, String, String, BigDecimal, Timestamp, Timestamp, String, String, BigDecimal, String, Byte> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, String, String, String, String, String, String, String, BigDecimal, Timestamp, Timestamp, String, String, BigDecimal, String, Byte> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Posinfo.POSINFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Posinfo.POSINFO.TRANSTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Posinfo.POSINFO.AGENTNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Posinfo.POSINFO.CUSTOMERNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Posinfo.POSINFO.ORDEROPTIMISTIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Posinfo.POSINFO.ORDERNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Posinfo.POSINFO.POSBATCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Posinfo.POSINFO.POSREQUESTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Posinfo.POSINFO.POSCATI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return Posinfo.POSINFO.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Posinfo.POSINFO.CREATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Posinfo.POSINFO.COMPLETETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Posinfo.POSINFO.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Posinfo.POSINFO.PAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return Posinfo.POSINFO.CUSTOMERFEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Posinfo.POSINFO.SIGN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field17() {
        return Posinfo.POSINFO.FJSTATUS;
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
    public String value2() {
        return getTranstype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAgentno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCustomerno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOrderoptimistic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOrderno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPosbatch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPosrequestid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPoscati();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCompletetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getPan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getCustomerfee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getSign();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value17() {
        return getFjstatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value2(String value) {
        setTranstype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value3(String value) {
        setAgentno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value4(String value) {
        setCustomerno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value5(String value) {
        setOrderoptimistic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value6(String value) {
        setOrderno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value7(String value) {
        setPosbatch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value8(String value) {
        setPosrequestid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value9(String value) {
        setPoscati(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value10(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value11(Timestamp value) {
        setCreatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value12(Timestamp value) {
        setCompletetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value13(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value14(String value) {
        setPan(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value15(BigDecimal value) {
        setCustomerfee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value16(String value) {
        setSign(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord value17(Byte value) {
        setFjstatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PosinfoRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, BigDecimal value10, Timestamp value11, Timestamp value12, String value13, String value14, BigDecimal value15, String value16, Byte value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PosinfoRecord
     */
    public PosinfoRecord() {
        super(Posinfo.POSINFO);
    }

    /**
     * Create a detached, initialised PosinfoRecord
     */
    public PosinfoRecord(Integer id, String transtype, String agentno, String customerno, String orderoptimistic, String orderno, String posbatch, String posrequestid, String poscati, BigDecimal amount, Timestamp createtime, Timestamp completetime, String status, String pan, BigDecimal customerfee, String sign, Byte fjstatus) {
        super(Posinfo.POSINFO);

        set(0, id);
        set(1, transtype);
        set(2, agentno);
        set(3, customerno);
        set(4, orderoptimistic);
        set(5, orderno);
        set(6, posbatch);
        set(7, posrequestid);
        set(8, poscati);
        set(9, amount);
        set(10, createtime);
        set(11, completetime);
        set(12, status);
        set(13, pan);
        set(14, customerfee);
        set(15, sign);
        set(16, fjstatus);
    }
}