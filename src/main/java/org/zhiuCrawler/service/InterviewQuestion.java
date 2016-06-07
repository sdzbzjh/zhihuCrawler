package org.zhiuCrawler.service;


import org.zhiuCrawler.entity.Question;
import org.zhiuCrawler.util.NetUtil;

import java.util.List;

/**
 * Created by Adminstrator on 2016/5/27.
 */
public class InterviewQuestion {
    private List<Question> questionList;
    private HandleContent handleContent;
    private NetUtil nu;

    public void getQuestionContent(List<String> urlList) {
        nu = new NetUtil();
        for (String url : urlList) {
            nu.setUrl(url);
            String result=nu.getContent();
            System.out.println(result);
            HandleContent handleContent=new HandleContent();
            handleContent.getQuestion(result);
            break;
        }
    }
}
