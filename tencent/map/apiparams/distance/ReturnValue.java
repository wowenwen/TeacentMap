package com.vseadata.edu.commons.util.tencent.map.apiparams.distance;

import com.vseadata.edu.commons.util.tencent.map.apiparams.entity.DistanceResult;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ReturnValue {

    public ReturnValue(){}

    public Integer  status;
    public String  message;
    public DistanceResult result;

}