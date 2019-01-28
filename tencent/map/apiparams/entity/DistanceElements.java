package com.vseadata.edu.commons.util.tencent.map.apiparams.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DistanceElements {


    private Location from;
    private Location to;
    private float distance;
    private float duration;

}
