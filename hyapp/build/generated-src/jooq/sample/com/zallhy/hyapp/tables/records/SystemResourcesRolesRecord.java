/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables.records;


import com.zallhy.hyapp.tables.SystemResourcesRoles;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 角色资源对应表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemResourcesRolesRecord extends UpdatableRecordImpl<SystemResourcesRolesRecord> implements Record4<Integer, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = 161866701;

    /**
     * Setter for <code>ejavashop.system_resources_roles.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_roles.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ejavashop.system_resources_roles.resources_id</code>.
     */
    public void setResourcesId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_roles.resources_id</code>.
     */
    public Integer getResourcesId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ejavashop.system_resources_roles.roles_id</code>.
     */
    public void setRolesId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_roles.roles_id</code>.
     */
    public Integer getRolesId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ejavashop.system_resources_roles.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>ejavashop.system_resources_roles.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SystemResourcesRoles.SYSTEM_RESOURCES_ROLES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SystemResourcesRoles.SYSTEM_RESOURCES_ROLES.RESOURCES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SystemResourcesRoles.SYSTEM_RESOURCES_ROLES.ROLES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return SystemResourcesRoles.SYSTEM_RESOURCES_ROLES.CREATE_TIME;
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
        return getResourcesId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRolesId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesRolesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesRolesRecord value2(Integer value) {
        setResourcesId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesRolesRecord value3(Integer value) {
        setRolesId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesRolesRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemResourcesRolesRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemResourcesRolesRecord
     */
    public SystemResourcesRolesRecord() {
        super(SystemResourcesRoles.SYSTEM_RESOURCES_ROLES);
    }

    /**
     * Create a detached, initialised SystemResourcesRolesRecord
     */
    public SystemResourcesRolesRecord(Integer id, Integer resourcesId, Integer rolesId, Timestamp createTime) {
        super(SystemResourcesRoles.SYSTEM_RESOURCES_ROLES);

        set(0, id);
        set(1, resourcesId);
        set(2, rolesId);
        set(3, createTime);
    }
}