package com.vseadata.edu.commons.util.tencent.map.apiparams.inverse;

import com.vseadata.edu.commons.util.tencent.map.apiparams.base.MapInterfaceBase;


/**
 * 解析地址参数和返回值
 */
public class InverseAddress extends MapInterfaceBase<ParamsEntity,ReturnValue> {


        public InverseAddress() throws IllegalAccessException, InstantiationException {
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
