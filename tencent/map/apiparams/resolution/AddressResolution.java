package com.vseadata.edu.commons.util.tencent.map.apiparams.resolution;

import com.vseadata.edu.commons.util.tencent.map.apiparams.base.MapInterfaceBase;

/**
 * 地址逆分析地址参数及返回值
 */
public class AddressResolution extends MapInterfaceBase<ParamsEntity,ReturnValue> {

    public AddressResolution() throws IllegalAccessException, InstantiationException {
        super(ParamsEntity.class,ReturnValue.class);
        this.setAPIPath(GeocoderAPI);
    }

    public ParamsEntity getParams() {
        return params;
    }
    public ReturnValue getRs() {
        return rs;
    }


}
