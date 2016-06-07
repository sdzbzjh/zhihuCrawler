package test;


import org.zhiuCrawler.service.HandleContent;
import org.zhiuCrawler.service.InterviewQuestion;

import java.util.List;

/**
 * Created by Adminstrator on 2016/5/23.
 */
public class TestContent {
    public static void main(String[] args) {
        HandleContent hc=new HandleContent();
        List<String> urlList=hc.getURLs();
        InterviewQuestion iq=new InterviewQuestion();
        iq.getQuestionContent(urlList);
    }
}
