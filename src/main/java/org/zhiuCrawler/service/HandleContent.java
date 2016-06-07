package org.zhiuCrawler.service;


import org.zhiuCrawler.entity.Question;
import org.zhiuCrawler.util.NetUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 处理抓取到的内容
 */
public class HandleContent {
    private NetUtil nu;
    private String result;
    private List<String> urlList;

    public List<String> getURLs() {
        urlList = new ArrayList<>();
        nu = new NetUtil("http://www.zhihu.com/explore/recommendations");
        result = nu.getContent();
        //匹配问题的地址
        Pattern urlPattern = Pattern.compile("question_link.+?href=\"(.*?)answer");
        Matcher urlMatcher = urlPattern.matcher(result);
        while (urlMatcher.find()) {
            String url = "http://www.zhihu.com" + urlMatcher.group(1);
            urlList.add(url);
        }
        return urlList;
    }

    public List<Question> getQuestion(String content) {
        Pattern urlPattern = Pattern.compile("\"zm-item-title zm-editable-content\">(.*?)</h2>");
        Matcher urlMatcher = urlPattern.matcher(content);
        if (urlMatcher.find()) {
            System.out.println(urlMatcher.group(1));
        }
        return null;
    }
}
