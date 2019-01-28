package com.vseadata.edu.commons.util.tencent.map.apiparams.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Town {

    private String id;
    private String title;
    private Location location;
    private float _distance;
    private String _dir_desc;

}
