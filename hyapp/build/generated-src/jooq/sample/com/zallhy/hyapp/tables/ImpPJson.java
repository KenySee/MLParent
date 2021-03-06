/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.ImpPJsonRecord;

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
public class ImpPJson extends TableImpl<ImpPJsonRecord> {

    private static final long serialVersionUID = 1459360277;

    /**
     * The reference instance of <code>ejavashop.imp_p_json</code>
     */
    public static final ImpPJson IMP_P_JSON = new ImpPJson();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ImpPJsonRecord> getRecordType() {
        return ImpPJsonRecord.class;
    }

    /**
     * The column <code>ejavashop.imp_p_json.id</code>.
     */
    public final TableField<ImpPJsonRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.imp_p_json.sellerId</code>.
     */
    public final TableField<ImpPJsonRecord, Integer> SELLERID = createField("sellerId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ejavashop.imp_p_json.productCateId</code>.
     */
    public final TableField<ImpPJsonRecord, Integer> PRODUCTCATEID = createField("productCateId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ejavashop.imp_p_json.productBrandId</code>.
     */
    public final TableField<ImpPJsonRecord, Integer> PRODUCTBRANDID = createField("productBrandId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ejavashop.imp_p_json.sellerCateId</code>.
     */
    public final TableField<ImpPJsonRecord, Integer> SELLERCATEID = createField("sellerCateId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ejavashop.imp_p_json.goodJson</code>. 商品json
     */
    public final TableField<ImpPJsonRecord, String> GOODJSON = createField("goodJson", org.jooq.impl.SQLDataType.CLOB, this, "商品json");

    /**
     * The column <code>ejavashop.imp_p_json.state</code>.
     */
    public final TableField<ImpPJsonRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ejavashop.imp_p_json.createTime</code>.
     */
    public final TableField<ImpPJsonRecord, Timestamp> CREATETIME = createField("createTime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ejavashop.imp_p_json.productCode</code>.
     */
    public final TableField<ImpPJsonRecord, String> PRODUCTCODE = createField("productCode", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>ejavashop.imp_p_json</code> table reference
     */
    public ImpPJson() {
        this("imp_p_json", null);
    }

    /**
     * Create an aliased <code>ejavashop.imp_p_json</code> table reference
     */
    public ImpPJson(String alias) {
        this(alias, IMP_P_JSON);
    }

    private ImpPJson(String alias, Table<ImpPJsonRecord> aliased) {
        this(alias, aliased, null);
    }

    private ImpPJson(String alias, Table<ImpPJsonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public Identity<ImpPJsonRecord, Integer> getIdentity() {
        return Keys.IDENTITY_IMP_P_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ImpPJsonRecord> getPrimaryKey() {
        return Keys.KEY_IMP_P_JSON_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ImpPJsonRecord>> getKeys() {
        return Arrays.<UniqueKey<ImpPJsonRecord>>asList(Keys.KEY_IMP_P_JSON_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImpPJson as(String alias) {
        return new ImpPJson(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ImpPJson rename(String name) {
        return new ImpPJson(name, null);
    }
}
