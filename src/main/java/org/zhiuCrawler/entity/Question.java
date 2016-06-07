package org.zhiuCrawler.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 问题类，表示一个知乎上的问题
 * @title：问题标题
 * @url：问题地址
 * @desc：问题的描述
 * @labelList：问题所属标签列表
 * @commentList：评论列表
 * @answerList：答案列表
 */
public class Question implements Serializable{
    private String title;
    private String user;
    private String url;
    private String desc;
    private List<String> labelList;
    private List<Comment> commentList;
    private List<Answer> answerList;

    public Question() {
        super();
        this.title="";
        this.user="匿名";
        this.url="";
        this.desc="";
        this.labelList=null;
        this.commentList=null;
        this.answerList=null;
    }

    public Question(String title, String user, String url, String desc, List<String> labelList, List<Comment> commentList, List<Answer> answerList) {
        this.title = title;
        this.user = user;
        this.url = url;
        this.desc = desc;
        this.labelList = labelList;
        this.commentList = commentList;
        this.answerList = answerList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<String> labelList) {
        this.labelList = labelList;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
