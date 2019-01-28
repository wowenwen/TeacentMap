package com.vseadata.edu.commons.util.tencent.map.apiparams.resolution;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ParamsEntity {

  public ParamsEntity(){}

  @NotNull
  private String address="";
  private String region="";
  @Value("${tencent.key}")
  private String key="";
  private String output="";
  private String callback="";
}