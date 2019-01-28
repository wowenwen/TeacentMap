package com.vseadata.edu.commons.util.tencent.map.apiparams.inverse;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ParamsEntity {

    public ParamsEntity(){}

    @NotNull
    private String location="";
    private Integer get_poi=0;
    private String poi_options="";
    @Value("${tencent.key}")
    private String key="";
    private String output="";
    private String callback="";
}