// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.List;

public class ValueListItemCreateParams extends ApiParamRequest {
  @SerializedName("expand")
  List<String> expand;

  @SerializedName("value")
  String value;

  @SerializedName("value_list")
  String valueList;

  private ValueListItemCreateParams(List<String> expand, String value, String valueList) {
    this.expand = expand;
    this.value = value;
    this.valueList = valueList;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.radar.ValueListItemCreateParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    private String value;

    private String valueList;

    public ValueListItemCreateParams build() {
      return new ValueListItemCreateParams(expand, value, valueList);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder setValue(String value) {
      this.value = value;
      return this;
    }

    public Builder setValueList(String valueList) {
      this.valueList = valueList;
      return this;
    }
  }
}