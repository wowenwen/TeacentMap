package com.vseadata.edu.commons.util.tencent.map.apiparams.suggestion;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ParamsEntity {

    public ParamsEntity(){}

    @NotNull
    private String keyword="";
    @NotNull
    private String region="天津";
    @Value("${tencent.key}")
    private String key="";
    private Integer region_fix=1;
    private String location="";
    private Integer get_subpois=0;
    private Integer policy=1;
    private Integer page_index=1;
    private Integer page_size=10;

}