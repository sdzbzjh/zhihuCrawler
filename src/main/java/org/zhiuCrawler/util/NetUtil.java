package org.zhiuCrawler.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * 连接指定url，并返回获取的内容
 *
 * @url：目标地址
 * @result：从目标地址获取的内容
 * @getContent()：返回目标地址所有源码
 */
public class NetUtil {
    private String url;//要访问的链接
    private BufferedReader in;//输入流
    private String result = "";//存储获取的页面内容

    public NetUtil() {
    }

    public NetUtil(String url) {
        this.url = url;
    }

    public String getContent() {
        try {
            //url = "http://www.zhihu.com/explore/recommendations";
            URL realURL = new URL(url);
            URLConnection conn = realURL.openConnection();
            conn.connect();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;//临时存储输入流中每行内容
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //System.out.println(result);
        return result;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
