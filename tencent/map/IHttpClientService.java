package com.vseadata.edu.commons.util.tencent.map;

import com.arronlong.httpclientutil.exception.HttpProcessException;

import java.util.Map;

public interface IHttpClientService{


    public String getResult();

    public IHttpClientService BuilderParams(Map<String, Object> map);

    public IHttpClientService doRun() throws HttpProcessException;

    public IHttpClientService setUrl(String url);

}
