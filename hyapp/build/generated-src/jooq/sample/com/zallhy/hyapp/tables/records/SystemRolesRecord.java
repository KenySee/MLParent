/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.SystemRoles;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 角色表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemRolesRecord extends UpdatableRecordImpl<SystemRolesRecord> implements Record8<Integer, String, String, Integer, Timestamp, Timestamp, Byte, String> {

    private static final long serialVersionUID = -839984607;

    /**
     * Setter for <code>ejavashop.system_roles.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.system_roles.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.system_roles.roles_name</code>. 角色名称
     */
    public void setRolesName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.system_roles.roles_name</code>. 角色名称
     */
    public String getRolesName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ejavashop.system_roles.content</code>. 角色描述
     */
    public void setContent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.system_roles.content</code>. 角色描述
     */
    public String getContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.system_roles.user_id</code>. 创建人
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.system_roles.user_id</code>. 创建人
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ejavashop.system_roles.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.system_roles.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>ejavashop.system_roles.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.system_roles.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ejavashop.system_roles.status</code>. 1、未删除2、删除
     */
    public void setStatus(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.system_roles.status</code>. 1、未删除2、删除
     */
    public Byte getStatus() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>ejavashop.system_roles.role_code</code>. 角色code,唯一
     */
    public void setRoleCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.system_roles.role_code</code>. 角色code,唯一
     */
    public String getRoleCode() {
        return (String) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, Integer, Timestamp, Timestamp, Byte, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, Integer, Timestamp, Timestamp, Byte, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SystemRoles.SYSTEM_ROLES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SystemRoles.SYSTEM_ROLES.ROLES_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SystemRoles.SYSTEM_ROLES.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SystemRoles.SYSTEM_ROLES.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return SystemRoles.SYSTEM_ROLES.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return SystemRoles.SYSTEM_ROLES.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return SystemRoles.SYSTEM_ROLES.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SystemRoles.SYSTEM_ROLES.ROLE_CODE;
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
        return getRolesName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRoleCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRolesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRolesRecord value2(String value) {
        setRolesName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRolesRecord value3(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRolesRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRolesRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRolesRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRolesRecord value7(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRolesRecord value8(String value) {
        setRoleCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemRolesRecord values(Integer value1, String value2, String value3, Integer value4, Timestamp value5, Timestamp value6, Byte value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemRolesRecord
     */
    public SystemRolesRecord() {
        super(SystemRoles.SYSTEM_ROLES);
    }

    /**
     * Create a detached, initialised SystemRolesRecord
     */
    public SystemRolesRecord(Integer id, String rolesName, String content, Integer userId, Timestamp createTime, Timestamp updateTime, Byte status, String roleCode) {
        super(SystemRoles.SYSTEM_ROLES);

        set(0, id);
        set(1, rolesName);
        set(2, content);
        set(3, userId);
        set(4, createTime);
        set(5, updateTime);
        set(6, status);
        set(7, roleCode);
    }
}