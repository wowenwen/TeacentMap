package com.vseadata.edu.commons.util.tencent.map.apiparams.base;

import com.vseadata.edu.commons.util.BeanUtil;
import com.vseadata.edu.commons.util.FastJsonUtils;
import com.vseadata.edu.commons.util.MD5Util;
import com.vseadata.edu.commons.util.tencent.map.IHttpClientService;
import com.vseadata.edu.commons.util.tencent.map.IWebServiceAPI;
import com.vseadata.edu.commons.util.tencent.map.impl.APIConfig;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class MapInterfaceBase<T,K> implements IWebServiceAPI {


    private APIConfig apiconfig;
    protected Map<String, Object> paramsMap = new HashMap<String, Object>();
    protected IHttpClientService httpClientService;
    protected String APIPath="";
    public Class<K> clazzK;
    public T params ;
    public K rs;


    public MapInterfaceBase(){}
    public MapInterfaceBase(Class<T> clazzT,Class<K> clazzK) throws InstantiationException, IllegalAccessException {

        this.params= clazzT.newInstance();
        this.rs=clazzK.newInstance();
        this.clazzK=clazzK;
    }


    public void setHttpClientService(IHttpClientService httpClientService) { this.httpClientService = httpClientService; }
    public IHttpClientService getHttpClientService() {return httpClientService;}
	
    public String getAPIPath() {return APIPath;}
    public void setAPIPath(String APIPath) {this.APIPath = APIPath;}
	
	public APIConfig getApiconfig() {return apiconfig;}
    public void setApiconfig(APIConfig apiconfig) { this.apiconfig = apiconfig;}



    public  Map<String, Object>  doSig(Map<String, Object> unsortMap,String path){

        unsortMap.put("key",apiconfig.getKey());

        Map<String, Object> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        StringBuffer sb=new StringBuffer();
        result.forEach((k,v)->{
            if(!v.toString().isEmpty()){
                sb.append("&"+k+"="+v);
            }
        });

        String queryStr=path+"?"+sb.toString().substring(1)+apiconfig.getSk();
        String shaStr = MD5Util.getMD5(queryStr,false,32);

        result.put("sig",shaStr);
        return result;

    }

    public void doGet() throws Exception {

        paramsMap= BeanUtil.transBean2Map(this.params);
        paramsMap=this.doSig(paramsMap,getAPIPath());

        httpClientService
                .setUrl(HOST+getAPIPath())
                .BuilderParams(paramsMap)
                .doRun();

        String jsonStr= httpClientService.getResult();

        this.rs=(K) FastJsonUtils.getJsonToBean(jsonStr, this.clazzK);

    }


    
}
