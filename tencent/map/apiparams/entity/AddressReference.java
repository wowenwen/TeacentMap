package com.vseadata.edu.commons.util.tencent.map.apiparams.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressReference {

    private FamousArea famous_area;
    private Town town;
    private FamousArea landmark_l1;
    private FamousArea landmark_l2;
    private FamousArea street;
    private FamousArea street_number;
    private FamousArea crossroad;
    private FamousArea water;
}
