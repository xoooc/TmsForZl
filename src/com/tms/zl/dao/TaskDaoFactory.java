package com.tms.zl.dao;

/**
 * Created by Administrator on 13-12-23.
 */
public class TaskDaoFactory implements DaoFactory{
    @Override
    public TaskDao createDao() {
        return new TaskDao();
    }
}
