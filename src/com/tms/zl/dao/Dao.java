package com.tms.zl.dao;

import java.sql.ResultSet;

/**
 * Created by Administrator on 13-12-24.
 */
public interface Dao {
    public ResultSet query(String sql, String[] whereConditiions);

    public boolean modify(String sql, String[] whereConditiions);
}
