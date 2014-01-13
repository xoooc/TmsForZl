package com.tms.zl.service;

import com.tms.zl.dao.UserDao;
import com.tms.zl.dao.UserDaoFactory;
import com.tms.zl.utils.Constant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 13-12-24.
 */
public class UserService implements Constant{
    UserDao dao = new UserDaoFactory().createDao();

    public int verifyUserInfo(String userName, String passWord) {
        if(isUserExist(userName)) {
            if(isUserNameMatchPassword(userName,passWord)) {
                return IS_VALID_USERINFO;
            }else
                return IS_WRONG_PASSWORD;
        }else {
            return IS_NOT_EXIST_USERNAME;
        }
    }

    public boolean isUserExist(String userName) {
        String sql = "SELECT * FROM "+ T_USERINFO +" WHERE userName=?";
        ResultSet rs = dao.query(sql,new String[]{userName});
        try {
            if(rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String queryUserIdByName(String userName) {
        String sql = "SELECT userId FROM " + T_USERINFO + " WHERE userName=?";
        ResultSet rs = dao.query(sql,new String[]{userName});
        try {
            if(rs.next()) {
                return rs.getString("userId");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isUserNameMatchPassword(String userName, String passWord) {
        String sql = "SELECT * FROM " + T_USERINFO + " WHERE userName=? AND passWord=?";
        ResultSet rs = dao.query(sql,new String[]{userName,passWord});
        try {
            if(rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 获取某一时间段内发布任务的人员id
     * @param startTime 开始时间，格式:"2014-01-01"
     * @param endTime 结束时间，格式:"2014-01-01"
     * @return userId的列表
     */
    public List<String> queryTaskUserIdByTimeSegment(String startTime,String endTime) {
        return null;
    }
}
