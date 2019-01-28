package com.vseadata.edu.commons.util.tencent.map.apiparams.inverse;

import com.vseadata.edu.commons.util.tencent.map.apiparams.entity.InverseResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReturnValue  {

    public ReturnValue(){}

    private Integer  status;
    private String  message;
    private String request_id;
    private InverseResult result;

}
