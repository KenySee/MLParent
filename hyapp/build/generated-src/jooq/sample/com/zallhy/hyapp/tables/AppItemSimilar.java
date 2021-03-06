/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.tables.records.AppItemSimilarRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class AppItemSimilar extends TableImpl<AppItemSimilarRecord> {

    private static final long serialVersionUID = 389494231;

    /**
     * The reference instance of <code>ejavashop.app_item_similar</code>
     */
    public static final AppItemSimilar APP_ITEM_SIMILAR = new AppItemSimilar();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppItemSimilarRecord> getRecordType() {
        return AppItemSimilarRecord.class;
    }

    /**
     * The column <code>ejavashop.app_item_similar.itemid</code>.
     */
    public final TableField<AppItemSimilarRecord, String> ITEMID = createField("itemid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>ejavashop.app_item_similar.peerid</code>.
     */
    public final TableField<AppItemSimilarRecord, String> PEERID = createField("peerid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>ejavashop.app_item_similar.similar</code>.
     */
    public final TableField<AppItemSimilarRecord, Double> SIMILAR = createField("similar", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>ejavashop.app_item_similar</code> table reference
     */
    public AppItemSimilar() {
        this("app_item_similar", null);
    }

    /**
     * Create an aliased <code>ejavashop.app_item_similar</code> table reference
     */
    public AppItemSimilar(String alias) {
        this(alias, APP_ITEM_SIMILAR);
    }

    private AppItemSimilar(String alias, Table<AppItemSimilarRecord> aliased) {
        this(alias, aliased, null);
    }

    private AppItemSimilar(String alias, Table<AppItemSimilarRecord> aliased, Field<?>[] parameters) {
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
    public AppItemSimilar as(String alias) {
        return new AppItemSimilar(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AppItemSimilar rename(String name) {
        return new AppItemSimilar(name, null);
    }
}
