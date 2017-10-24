/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.SystemResourcesBak;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 资源表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemResourcesBakRecord extends UpdatableRecordImpl<SystemResourcesBakRecord> implements Record10<Integer, Integer, String, String, Timestamp, Byte, Byte, Byte, String, String> {

    private static final long serialVersionUID = -1079628844;

    /**
     * Setter for <code>ejavashop.system_resources_bak.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_bak.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.system_resources_bak.pid</code>.
     */
    public void setPid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_bak.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.system_resources_bak.url</code>.
     */
    public void setUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_bak.url</code>.
     */
    public String getUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ejavashop.system_resources_bak.content</code>.
     */
    public void setContent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_bak.content</code>.
     */
    public String getContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ejavashop.system_resources_bak.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_bak.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>ejavashop.system_resources_bak.type</code>. 1、菜单；2、按钮
     */
    public void setType(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_bak.type</code>. 1、菜单；2、按钮
     */
    public Byte getType() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>ejavashop.system_resources_bak.status</code>. 1、未删除2、删除
     */
    public void setStatus(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_bak.status</code>. 1、未删除2、删除
     */
    public Byte getStatus() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>ejavashop.system_resources_bak.scope</code>. 应用范围: 1-商家 2-平台
     */
    public void setScope(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_bak.scope</code>. 应用范围: 1-商家 2-平台
     */
    public Byte getScope() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>ejavashop.system_resources_bak.res_id</code>. 资源id,有些菜单及按钮需要特定id以注册点击事件
     */
    public void setResId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_bak.res_id</code>. 资源id,有些菜单及按钮需要特定id以注册点击事件
     */
    public String getResId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ejavashop.system_resources_bak.res_icon</code>. 资源图标,按钮资源可能需要指定图标
     */
    public void setResIcon(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_bak.res_icon</code>. 资源图标,按钮资源可能需要指定图标
     */
    public String getResIcon() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, String, String, Timestamp, Byte, Byte, Byte, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, String, String, Timestamp, Byte, Byte, Byte, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SystemResourcesBak.SYSTEM_RESOURCES_BAK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SystemResourcesBak.SYSTEM_RESOURCES_BAK.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SystemResourcesBak.SYSTEM_RESOURCES_BAK.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SystemResourcesBak.SYSTEM_RESOURCES_BAK.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return SystemResourcesBak.SYSTEM_RESOURCES_BAK.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return SystemResourcesBak.SYSTEM_RESOURCES_BAK.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return SystemResourcesBak.SYSTEM_RESOURCES_BAK.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return SystemResourcesBak.SYSTEM_RESOURCES_BAK.SCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SystemResourcesBak.SYSTEM_RESOURCES_BAK.RES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SystemResourcesBak.SYSTEM_RESOURCES_BAK.RES_ICON;
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
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getContent();
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
    public Byte value6() {
        return getType();
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
    public Byte value8() {
        return getScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getResId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getResIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesBakRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesBakRecord value2(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesBakRecord value3(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesBakRecord value4(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesBakRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesBakRecord value6(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesBakRecord value7(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesBakRecord value8(Byte value) {
        setScope(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesBakRecord value9(String value) {
        setResId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesBakRecord value10(String value) {
        setResIcon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesBakRecord values(Integer value1, Integer value2, String value3, String value4, Timestamp value5, Byte value6, Byte value7, Byte value8, String value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemResourcesBakRecord
     */
    public SystemResourcesBakRecord() {
        super(SystemResourcesBak.SYSTEM_RESOURCES_BAK);
    }

    /**
     * Create a detached, initialised SystemResourcesBakRecord
     */
    public SystemResourcesBakRecord(Integer id, Integer pid, String url, String content, Timestamp createTime, Byte type, Byte status, Byte scope, String resId, String resIcon) {
        super(SystemResourcesBak.SYSTEM_RESOURCES_BAK);

        set(0, id);
        set(1, pid);
        set(2, url);
        set(3, content);
        set(4, createTime);
        set(5, type);
        set(6, status);
        set(7, scope);
        set(8, resId);
        set(9, resIcon);
    }
}
