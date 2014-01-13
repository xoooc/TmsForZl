package com.tms.zl.dao;

import com.tms.zl.utils.SqlHelper;

import java.sql.ResultSet;

/**
 * Created by Administrator on 13-12-20.
 */
public class TaskDao implements Dao {
    @Override
    public ResultSet query(String sql, String[] whereConditiions) {
        return new SqlHelper().query(sql,whereConditiions);
    }

    @Override
    public boolean modify(String sql, String[] whereConditiions) {
        return new SqlHelper().modifyOpertion(sql, whereConditiions);
    }
}
