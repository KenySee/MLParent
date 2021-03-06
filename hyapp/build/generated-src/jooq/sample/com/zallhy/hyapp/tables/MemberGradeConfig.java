/*
 * This file is generated by jOOQ.
*/
package com.zallhy.hyapp.tables;


import com.zallhy.hyapp.Ejavashop;
import com.zallhy.hyapp.Keys;
import com.zallhy.hyapp.tables.records.MemberGradeConfigRecord;

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
 * 会员等级配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberGradeConfig extends TableImpl<MemberGradeConfigRecord> {

    private static final long serialVersionUID = 1570850859;

    /**
     * The reference instance of <code>ejavashop.member_grade_config</code>
     */
    public static final MemberGradeConfig MEMBER_GRADE_CONFIG = new MemberGradeConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberGradeConfigRecord> getRecordType() {
        return MemberGradeConfigRecord.class;
    }

    /**
     * The column <code>ejavashop.member_grade_config.id</code>.
     */
    public final TableField<MemberGradeConfigRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ejavashop.member_grade_config.grade1</code>. 注册会员经验值
     */
    public final TableField<MemberGradeConfigRecord, Integer> GRADE1 = createField("grade1", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "注册会员经验值");

    /**
     * The column <code>ejavashop.member_grade_config.grade2</code>. 铜牌会员经验值
     */
    public final TableField<MemberGradeConfigRecord, Integer> GRADE2 = createField("grade2", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "铜牌会员经验值");

    /**
     * The column <code>ejavashop.member_grade_config.grade3</code>. 银牌会员经验值
     */
    public final TableField<MemberGradeConfigRecord, Integer> GRADE3 = createField("grade3", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "银牌会员经验值");

    /**
     * The column <code>ejavashop.member_grade_config.grade4</code>. 金牌会员经验值
     */
    public final TableField<MemberGradeConfigRecord, Integer> GRADE4 = createField("grade4", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "金牌会员经验值");

    /**
     * The column <code>ejavashop.member_grade_config.grade5</code>. 钻石会员经验值
     */
    public final TableField<MemberGradeConfigRecord, Integer> GRADE5 = createField("grade5", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "钻石会员经验值");

    /**
     * Create a <code>ejavashop.member_grade_config</code> table reference
     */
    public MemberGradeConfig() {
        this("member_grade_config", null);
    }

    /**
     * Create an aliased <code>ejavashop.member_grade_config</code> table reference
     */
    public MemberGradeConfig(String alias) {
        this(alias, MEMBER_GRADE_CONFIG);
    }

    private MemberGradeConfig(String alias, Table<MemberGradeConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemberGradeConfig(String alias, Table<MemberGradeConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "会员等级配置表");
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
    public Identity<MemberGradeConfigRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MEMBER_GRADE_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberGradeConfigRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_GRADE_CONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberGradeConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberGradeConfigRecord>>asList(Keys.KEY_MEMBER_GRADE_CONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberGradeConfig as(String alias) {
        return new MemberGradeConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberGradeConfig rename(String name) {
        return new MemberGradeConfig(name, null);
    }
}
