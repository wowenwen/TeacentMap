package com.vseadata.edu.commons.util.tencent.map.apiparams.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InverseResult {
    private String address;
    private FormattedAddresses formatted_addresses;
    private AddressComponent address_component;
    private AdInfo ad_info;
    private AddressReference address_reference;
    private Integer poi_count;
    private Pois[] pois;
}
