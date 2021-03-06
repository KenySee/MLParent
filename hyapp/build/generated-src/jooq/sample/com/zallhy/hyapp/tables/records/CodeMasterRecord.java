/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.CodeMaster;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record2;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodeMasterRecord extends UpdatableRecordImpl<CodeMasterRecord> implements Record11<String, String, String, Integer, Integer, Integer, String, Timestamp, Integer, String, Timestamp> {

    private static final long serialVersionUID = 919839430;

    /**
     * Setter for <code>ejavashop.code_master.code_div</code>. code组id
     */
    public void setCodeDiv(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.code_master.code_div</code>. code组id
     */
    public String getCodeDiv() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ejavashop.code_master.code_cd</code>. codeId
     */
    public void setCodeCd(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.code_master.code_cd</code>. codeId
     */
    public String getCodeCd() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ejavashop.code_master.code_text</code>. code中文名称
     */
    public void setCodeText(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.code_master.code_text</code>. code中文名称
     */
    public String getCodeText() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.code_master.sort_order</code>. 组内顺序为
     */
    public void setSortOrder(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.code_master.sort_order</code>. 组内顺序为
     */
    public Integer getSortOrder() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ejavashop.code_master.use_yn</code>. 是否使用
     */
    public void setUseYn(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.code_master.use_yn</code>. 是否使用
     */
    public Integer getUseYn() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ejavashop.code_master.create_user_id</code>. 创建人Id
     */
    public void setCreateUserId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.code_master.create_user_id</code>. 创建人Id
     */
    public Integer getCreateUserId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ejavashop.code_master.create_user</code>. 创建人
     */
    public void setCreateUser(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.code_master.create_user</code>. 创建人
     */
    public String getCreateUser() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ejavashop.code_master.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.code_master.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ejavashop.code_master.update_user_id</code>. 修改人Id
     */
    public void setUpdateUserId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.code_master.update_user_id</code>. 修改人Id
     */
    public Integer getUpdateUserId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>ejavashop.code_master.update_user</code>. 修改人
     */
    public void setUpdateUser(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>ejavashop.code_master.update_user</code>. 修改人
     */
    public String getUpdateUser() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ejavashop.code_master.update_time</code>. 修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>ejavashop.code_master.update_time</code>. 修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Integer, Integer, Integer, String, Timestamp, Integer, String, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Integer, Integer, Integer, String, Timestamp, Integer, String, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CodeMaster.CODE_MASTER.CODE_DIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CodeMaster.CODE_MASTER.CODE_CD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CodeMaster.CODE_MASTER.CODE_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CodeMaster.CODE_MASTER.SORT_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CodeMaster.CODE_MASTER.USE_YN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CodeMaster.CODE_MASTER.CREATE_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CodeMaster.CODE_MASTER.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return CodeMaster.CODE_MASTER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return CodeMaster.CODE_MASTER.UPDATE_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CodeMaster.CODE_MASTER.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return CodeMaster.CODE_MASTER.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCodeDiv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCodeCd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCodeText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getSortOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUseYn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCreateUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getUpdateUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord value1(String value) {
        setCodeDiv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord value2(String value) {
        setCodeCd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord value3(String value) {
        setCodeText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord value4(Integer value) {
        setSortOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord value5(Integer value) {
        setUseYn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord value6(Integer value) {
        setCreateUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord value7(String value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord value9(Integer value) {
        setUpdateUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord value10(String value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord value11(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeMasterRecord values(String value1, String value2, String value3, Integer value4, Integer value5, Integer value6, String value7, Timestamp value8, Integer value9, String value10, Timestamp value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CodeMasterRecord
     */
    public CodeMasterRecord() {
        super(CodeMaster.CODE_MASTER);
    }

    /**
     * Create a detached, initialised CodeMasterRecord
     */
    public CodeMasterRecord(String codeDiv, String codeCd, String codeText, Integer sortOrder, Integer useYn, Integer createUserId, String createUser, Timestamp createTime, Integer updateUserId, String updateUser, Timestamp updateTime) {
        super(CodeMaster.CODE_MASTER);

        set(0, codeDiv);
        set(1, codeCd);
        set(2, codeText);
        set(3, sortOrder);
        set(4, useYn);
        set(5, createUserId);
        set(6, createUser);
        set(7, createTime);
        set(8, updateUserId);
        set(9, updateUser);
        set(10, updateTime);
    }
}
