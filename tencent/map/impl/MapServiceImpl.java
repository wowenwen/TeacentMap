package com.vseadata.edu.commons.util.tencent.map.impl;

import com.vseadata.edu.commons.util.tencent.map.IHttpClientService;
import com.vseadata.edu.commons.util.tencent.map.apiparams.distance.DistanceCalc;
import com.vseadata.edu.commons.util.tencent.map.apiparams.inverse.InverseAddress;
import com.vseadata.edu.commons.util.tencent.map.apiparams.resolution.AddressResolution;
import com.vseadata.edu.commons.util.tencent.map.apiparams.suggestion.SuggestionKeyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mapService")
public class MapServiceImpl {

    private static IHttpClientService httpClientService;
    private static APIConfig apiconfig;

    @Autowired
    public MapServiceImpl(IHttpClientService httpClientService,APIConfig apiconfig) {
        MapServiceImpl.httpClientService = httpClientService;
        MapServiceImpl.apiconfig = apiconfig;
    }

    /**
     * 地址逆向解析
     */
    public static AddressResolution AddressResolutionAction(AddressResolution clazz) throws Exception {
        clazz.setHttpClientService(MapServiceImpl.httpClientService);
        clazz.setApiconfig(MapServiceImpl.apiconfig);
        clazz.doGet();
        return clazz;
    }

    /**
     * 地址解析
     */
    public static InverseAddress InverseAddressAction(InverseAddress clazz)throws Exception {

        clazz.setHttpClientService(MapServiceImpl.httpClientService);
        clazz.setApiconfig(MapServiceImpl.apiconfig);
        clazz.doGet();
        return clazz;
    }

    /**
     * 距离计算
     */
    public static DistanceCalc DistanceCalcAction(DistanceCalc clazz)throws Exception {
        clazz.setHttpClientService(MapServiceImpl.httpClientService);
        clazz.setApiconfig(MapServiceImpl.apiconfig);
        clazz.doGet();
        return clazz;
    }

    /**
     * 关键词提醒
     */
    public static SuggestionKeyword SuggestionKeyword(SuggestionKeyword clazz)throws Exception {
        clazz.setHttpClientService(MapServiceImpl.httpClientService);
        clazz.setApiconfig(MapServiceImpl.apiconfig);
        clazz.doGet();
        return clazz;
    }



}
