package com.vseadata.edu.commons.util.tencent.map.apiparams.distance;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Component
public class ParamsEntity {

    public ParamsEntity(){

    }

    @NotNull
    private String mode="driving";
    @NotNull
    private String from="";
    @NotNull
    private String to="";
    @Value("${tencent.key}")
    private String key;

    private String output="";
    private String callback="";

}
