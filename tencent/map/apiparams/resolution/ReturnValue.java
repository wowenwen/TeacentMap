package com.vseadata.edu.commons.util.tencent.map.apiparams.resolution;


import com.vseadata.edu.commons.util.tencent.map.apiparams.entity.ResolutionResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReturnValue {

    public ReturnValue(){}

    private Integer status;
    private String message;
    private ResolutionResult result;
}
