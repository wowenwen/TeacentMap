package com.vseadata.edu.commons.util.tencent.map.apiparams.suggestion;


import com.vseadata.edu.commons.util.tencent.map.apiparams.entity.SuggestionData;
import com.vseadata.edu.commons.util.tencent.map.apiparams.entity.SuggestionSubPois;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReturnValue {

    public ReturnValue(){}

    private Integer  status;
    private String  message;
    private String count;
    private SuggestionData[] data;
    private SuggestionSubPois[] sub_pois;

}
