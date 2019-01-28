package com.vseadata.edu.commons.util.tencent.map.apiparams.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuggestionSubPois {
    private String parent_id;
    private String id;
    private String title;
    private String address;
    private Location location;
    private Integer adcode;
    private String city;

}
