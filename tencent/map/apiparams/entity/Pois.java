package com.vseadata.edu.commons.util.tencent.map.apiparams.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pois {
    private String id;
    private String title;
    private String address;
    private String category;
    private Location location;
    private Integer _distance;
}
