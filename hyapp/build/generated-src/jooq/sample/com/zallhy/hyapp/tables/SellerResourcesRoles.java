/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.SellerResourcesRolesRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 商家角色资源对应表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SellerResourcesRoles extends TableImpl<SellerResourcesRolesRecord> {

    private static final long serialVersionUID = -1502674502;

    /**
     * The reference instance of <code>ejavashop.seller_resources_roles</code>
     */
    public static final SellerResourcesRoles SELLER_RESOURCES_ROLES = new SellerResourcesRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SellerResourcesRolesRecord> getRecordType() {
        return SellerResourcesRolesRecord.class;
    }

    /**
     * The column <code>ejavashop.seller_resources_roles.id</code>.
     */
    public final TableField<SellerResourcesRolesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.seller_resources_roles.resources_id</code>.
     */
    public final TableField<SellerResourcesRolesRecord, Integer> RESOURCES_ID = createField("resources_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ejavashop.seller_resources_roles.seller_roles_id</code>.
     */
    public final TableField<SellerResourcesRolesRecord, Integer> SELLER_ROLES_ID = createField("seller_roles_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ejavashop.seller_resources_roles.create_time</code>.
     */
    public final TableField<SellerResourcesRolesRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ejavashop.seller_resources_roles</code> table reference
     */
    public SellerResourcesRoles() {
        this("seller_resources_roles", null);
    }

    /**
     * Create an aliased <code>ejavashop.seller_resources_roles</code> table reference
     */
    public SellerResourcesRoles(String alias) {
        this(alias, SELLER_RESOURCES_ROLES);
    }

    private SellerResourcesRoles(String alias, Table<SellerResourcesRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SellerResourcesRoles(String alias, Table<SellerResourcesRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "商家角色资源对应表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Ejavashop.EJAVASHOP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SellerResourcesRolesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SELLER_RESOURCES_ROLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SellerResourcesRolesRecord> getPrimaryKey() {
        return Keys.KEY_SELLER_RESOURCES_ROLES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SellerResourcesRolesRecord>> getKeys() {
        return Arrays.<UniqueKey<SellerResourcesRolesRecord>>asList(Keys.KEY_SELLER_RESOURCES_ROLES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SellerResourcesRoles as(String alias) {
        return new SellerResourcesRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerResourcesRoles rename(String name) {
        return new SellerResourcesRoles(name, null);
    }
}
