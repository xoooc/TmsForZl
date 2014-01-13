package com.tms.zl.service;

import com.tms.zl.dao.CommentDao;
import com.tms.zl.dao.CommentDaoFactory;
import com.tms.zl.domain.CommentInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 13-12-24.
 */
public class CommentService {
    CommentDao dao = new CommentDaoFactory().createDao();

    public boolean publishComment() {
        return false;
    }

    public CommentInfo checkComment() {
        return null;
    }

    public List<CommentInfo> queryCommentListByTaskId(String taskId) throws SQLException {
        List<CommentInfo> commentInfoList = new ArrayList<CommentInfo>();
        String sql = "SELECT * FROM commentInfo WHERE taskId=?";
        ResultSet rs = dao.query(sql, new String[]{taskId});
        while (rs.next()) {
            CommentInfo info = new CommentInfo();
            info.setCommentId(rs.getString("commentId"));
            info.setCommentContent(rs.getString("commentContent"));
            info.setCommentTime(rs.getLong("commentTime"));
            commentInfoList.add(info);
        }
        return commentInfoList;
    }
}
