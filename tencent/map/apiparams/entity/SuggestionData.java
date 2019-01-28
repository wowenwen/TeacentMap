package com.vseadata.edu.commons.util.tencent.map.apiparams.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuggestionData {
    private String id;
    private String address;
    private String title;
    private String province;
    private String city;
    private String adcode;
    private Integer type;
    private Float _distance;
    private Location location;
}
