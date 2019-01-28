package com.vseadata.edu.commons.util.tencent.map.apiparams.suggestion;

import com.vseadata.edu.commons.util.tencent.map.apiparams.base.MapInterfaceBase;


/**
 * 关键词参数及返回值
 */
public class SuggestionKeyword extends MapInterfaceBase<ParamsEntity,ReturnValue>{


    public SuggestionKeyword() throws IllegalAccessException, InstantiationException {
        super(ParamsEntity.class,ReturnValue.class);
        this.setAPIPath(PlaceAPI);
    }

    public ParamsEntity getParams() {
        return params;
    }
    public ReturnValue getRs() {
        return rs;
    }


}
