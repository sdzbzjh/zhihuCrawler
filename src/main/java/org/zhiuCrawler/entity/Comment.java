package org.zhiuCrawler.entity;

import java.io.Serializable;

/**
 * 评论类，既可以是问题的评论，也可以是回答的评论
 * @user：评论的用户，默认是匿名
 * @agreeCount：点赞数
 * @content：评论内容
 */
public class Comment implements Serializable{
    private String user;
    private int agreeCount;
    private String content;

    public Comment() {
        super();
        this.user="匿名";
        this.agreeCount=0;
        this.content="";
    }

    public Comment(String user, int agreeCount, String content) {
        this.user = user;
        this.agreeCount = agreeCount;
        this.content = content;
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
}
