package io.swagger.util.common1.network;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;
import java.util.Set;


public class MPayHttpClient {
    private final static Logger logger = LoggerFactory.getLogger(MPayHttpClient.class);

    public static int post(String url, Map<String, String> params) {
        HttpClient httpclient = new HttpClient();

        //post请求
        PostMethod postmethod = new PostMethod(url);
        NameValuePair[] postData = new NameValuePair[params.size()];

        Set<String> keySet = params.keySet();
        int i = 0;
        for (String key : keySet) {
            postData[i++] = new NameValuePair(key, params.get(key));
        }
        postmethod.addParameters(postData);

//      //返回结果int
        int sendStatus = 0;
        try {
            sendStatus = httpclient.executeMethod(postmethod);
        } catch (IOException e) {
            logger.error(e.getMessage());
            return -1;
        } finally {
            //释放
            postmethod.releaseConnection();
        }
        return sendStatus;
    }

    public static int get(String url) {
        HttpClient httpclient = new HttpClient();

        //get请求
        GetMethod getmethod = new GetMethod(url);

//      //返回结果int
        int sendStatus = 0;
        try {
            sendStatus = httpclient.executeMethod(getmethod);
        } catch (IOException e) {
            logger.error(e.getMessage());
            return -1;
        } finally {
            //释放
            getmethod.releaseConnection();
        }
        return sendStatus;
    }
}
