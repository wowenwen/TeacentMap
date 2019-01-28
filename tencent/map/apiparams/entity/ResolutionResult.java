package com.vseadata.edu.commons.util.tencent.map.apiparams.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResolutionResult {

    private Location location;
    private AddressComponents address_components;
    private AdInfo ad_info;
    private Integer similarity;
    private Integer deviation;
    private Integer reliability;
    private Integer level;

}
