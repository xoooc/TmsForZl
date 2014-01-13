package com.tms.zl.domain;

import java.util.List;

/**
 * Created by Administrator on 13-12-16.
 */
public class TaskInfo {
    private String taskId;
    private String content;
    private long pubTaskTime;
    private String type;
    private List<CommentInfo> commentList;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getPubTaskTime() {
        return pubTaskTime;
    }

    public void setPubTaskTime(long pubTaskTime) {
        this.pubTaskTime = pubTaskTime;
    }

    public List<CommentInfo> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentInfo> commentList) {
        this.commentList = commentList;
    }
}
