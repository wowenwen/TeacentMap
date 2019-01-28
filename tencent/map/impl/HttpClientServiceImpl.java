package com.vseadata.edu.commons.util.tencent.map.impl;

import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.builder.HCB;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.common.HttpMethods;
import com.arronlong.httpclientutil.common.SSLs;
import com.arronlong.httpclientutil.exception.HttpProcessException;
import com.vseadata.edu.commons.util.tencent.map.IHttpClientService;
import org.apache.http.client.HttpClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("httpClientService")
public class HttpClientServiceImpl implements IHttpClientService {

    private HCB hcb=null;
    private HttpConfig config=null;
    private String httpresult="";
    private HttpMethods httpmethods=HttpMethods.GET;
    private String url="";


    public HttpClientServiceImpl() throws HttpProcessException {
        hcb = HCB.custom()
                .pool(100, 10)
                .sslpv(SSLs.SSLProtocolVersion.TLSv1_2)
                .ssl()
                .retry(5);

        HttpClient client = hcb.build();

        config = HttpConfig.custom()
                .method(httpmethods)
                .encoding("utf-8")
                .client(client);

    }


    @Override
    public IHttpClientService BuilderParams(Map<String, Object> map) {

        config.map(null);// 清空之前的参数因为注入本类对象是单例
        config.map(map);

        return this;
    }

    @Override
    public IHttpClientService doRun() throws HttpProcessException{

        if(httpmethods.equals(HttpMethods.GET)){

            StringBuffer sb=new StringBuffer();

            config.map().forEach((k,v)->{
                if(!v.toString().isEmpty()){
                    sb.append("&"+k+"="+v);
                }
            });

            this.url = this.url+"?"+sb.toString().substring(1);

            config.url(this.url);

        }else{
            config.url(this.url);
        }

        httpresult=HttpClientUtil.get(config);
        return this;
    }


    @Override
    public String getResult() {

        return httpresult;
    }

    @Override
    public IHttpClientService setUrl(String url) {
        this.url=url;
        return this;
    }
}
