package com.tms.zl.dao;

/**
 * Created by Administrator on 13-12-24.
 */
public class CommentDaoFactory implements DaoFactory {
    @Override
    public CommentDao createDao() {
        return new CommentDao();
    }
}
