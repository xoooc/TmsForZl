package com.tms.zl.service;

import com.alibaba.fastjson.JSON;
import com.tms.zl.dao.UserDao;
import com.tms.zl.dao.UserDaoFactory;
import com.tms.zl.domain.CommentInfo;
import com.tms.zl.domain.TaskInfo;
import com.tms.zl.utils.Constant;
import com.tms.zl.utils.DataUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 13-12-24.
 */
public class TaskService implements Constant{
    UserDao dao = new UserDaoFactory().createDao();

    public boolean publishTask() {
        return false;
    }

    /**
     * 返回任务信息的json字符串
     * @param userId 用户id
     * @return jsonStrin
     */
    public String queryTaskInfoByUserId(String userId){
        List<TaskInfo> taskInfoList = new ArrayList<TaskInfo>();
        String sql = "SELECT * FROM " + T_TASKINFO+ " WHERE userId=?";
        ResultSet rs = dao.query(sql,new String[]{userId});
        try {
            while (rs.next()) {
                TaskInfo info = new TaskInfo();
                String taskId = rs.getString("taskId");
                info.setTaskId(taskId);
                info.setContent(rs.getString("content"));
                info.setPubTaskTime(rs.getLong("pubTaskTime"));
                info.setType(rs.getString("type"));
                List<CommentInfo> commentInfos = new CommentService().queryCommentListByTaskId(taskId);
//                info.setCommentList(commentInfos);

                taskInfoList.add(info);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        return DataUtils.wrapJsonDataForDataGrid(taskInfoList);
        return JSON.toJSONString(taskInfoList);
    }
}
