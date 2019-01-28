package com.vseadata.edu.commons.util.tencent.map.apiparams.distance;

import com.vseadata.edu.commons.util.tencent.map.apiparams.base.MapInterfaceBase;

/**
 *          使用方式
 *
 *          DistanceCalc calc=new DistanceCalc();
 *
 *          //添加参数
 * 			calc.getParams().setFrom("39.983171,116.308479");
 * 			calc.getParams().setTo("39.996060,116.353455;39.949227,116.394310");
 *
 * 			MapServiceImpl.DistanceCalcAction(calc);
 *
 * 		    //获取返回结果
 * 			calc.getRs();
 *
 */
public class DistanceCalc extends MapInterfaceBase<ParamsEntity,ReturnValue> {


    public DistanceCalc() throws IllegalAccessException, InstantiationException {
        super(ParamsEntity.class,ReturnValue.class);
        this.setAPIPath(DistanceAPI);
    }

    public ParamsEntity getParams() {
        return params;
    }
    public ReturnValue getRs() {
        return rs;
    }




}
