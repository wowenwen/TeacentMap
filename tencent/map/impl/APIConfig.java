package com.vseadata.edu.commons.util.tencent.map.impl;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class APIConfig {

    @Value("${tencent.key}")
    private String key;
    @Value("${tencent.sk}")
    private String sk;
}
