package com.tms.zl.dao;

/**
 * Created by Administrator on 13-12-24.
 */
public class UserDaoFactory implements DaoFactory {
    @Override
    public UserDao createDao() {
        return new UserDao();
    }
}
