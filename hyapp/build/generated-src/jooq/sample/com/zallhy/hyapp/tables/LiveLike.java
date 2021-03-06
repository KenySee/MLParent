/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.LiveLikeRecord;

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
public class LiveLike extends TableImpl<LiveLikeRecord> {

    private static final long serialVersionUID = -483152418;

    /**
     * The reference instance of <code>ejavashop.live_like</code>
     */
    public static final LiveLike LIVE_LIKE = new LiveLike();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LiveLikeRecord> getRecordType() {
        return LiveLikeRecord.class;
    }

    /**
     * The column <code>ejavashop.live_like.id</code>.
     */
    public final TableField<LiveLikeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.live_like.liveRoomId</code>.
     */
    public final TableField<LiveLikeRecord, Integer> LIVEROOMID = createField("liveRoomId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ejavashop.live_like.userId</code>.
     */
    public final TableField<LiveLikeRecord, Integer> USERID = createField("userId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.live_like.createTime</code>.
     */
    public final TableField<LiveLikeRecord, Timestamp> CREATETIME = createField("createTime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ejavashop.live_like</code> table reference
     */
    public LiveLike() {
        this("live_like", null);
    }

    /**
     * Create an aliased <code>ejavashop.live_like</code> table reference
     */
    public LiveLike(String alias) {
        this(alias, LIVE_LIKE);
    }

    private LiveLike(String alias, Table<LiveLikeRecord> aliased) {
        this(alias, aliased, null);
    }

    private LiveLike(String alias, Table<LiveLikeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<LiveLikeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LIVE_LIKE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LiveLikeRecord> getPrimaryKey() {
        return Keys.KEY_LIVE_LIKE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LiveLikeRecord>> getKeys() {
        return Arrays.<UniqueKey<LiveLikeRecord>>asList(Keys.KEY_LIVE_LIKE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiveLike as(String alias) {
        return new LiveLike(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LiveLike rename(String name) {
        return new LiveLike(name, null);
    }
}
