package org.zhiuCrawler.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 答案类，表示知乎上的答案
 * @user：回答问题的用户，默认是匿名用户
 * @agreeCount：点赞数
 * @content：内容
 * @commentList：评论列表
 */
public class Answer implements Serializable{
    private String user;
    private int agreeCount;
    private String content;
    private List<Comment> commentList;

    public Answer() {
        super();
        this.user="匿名";
        this.agreeCount=0;
        this.content="";
    }
    public Answer(String user, int agreeCount, String content, List<Comment> commentList) {
        this.user = user;
        this.agreeCount = agreeCount;
        this.content = content;
        this.commentList = commentList;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getAgreeCount() {
        return agreeCount;
    }

    public void setAgreeCount(int agreeCount) {
        this.agreeCount = agreeCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
