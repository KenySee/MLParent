/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.tables.records.AppUserRecommendRecord;

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
public class AppUserRecommend extends TableImpl<AppUserRecommendRecord> {

    private static final long serialVersionUID = -698935021;

    /**
     * The reference instance of <code>ejavashop.app_user_recommend</code>
     */
    public static final AppUserRecommend APP_USER_RECOMMEND = new AppUserRecommend();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppUserRecommendRecord> getRecordType() {
        return AppUserRecommendRecord.class;
    }

    /**
     * The column <code>ejavashop.app_user_recommend.userid</code>.
     */
    public final TableField<AppUserRecommendRecord, String> USERID = createField("userid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>ejavashop.app_user_recommend.itemid</code>.
     */
    public final TableField<AppUserRecommendRecord, String> ITEMID = createField("itemid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>ejavashop.app_user_recommend.similar</code>.
     */
    public final TableField<AppUserRecommendRecord, Double> SIMILAR = createField("similar", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>ejavashop.app_user_recommend</code> table reference
     */
    public AppUserRecommend() {
        this("app_user_recommend", null);
    }

    /**
     * Create an aliased <code>ejavashop.app_user_recommend</code> table reference
     */
    public AppUserRecommend(String alias) {
        this(alias, APP_USER_RECOMMEND);
    }

    private AppUserRecommend(String alias, Table<AppUserRecommendRecord> aliased) {
        this(alias, aliased, null);
    }

    private AppUserRecommend(String alias, Table<AppUserRecommendRecord> aliased, Field<?>[] parameters) {
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
    public AppUserRecommend as(String alias) {
        return new AppUserRecommend(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AppUserRecommend rename(String name) {
        return new AppUserRecommend(name, null);
    }
}
