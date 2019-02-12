// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.List;

public class ProductListParams extends ApiParamRequest {
  @SerializedName("active")
  Boolean active;

  @SerializedName("created")
  Object created;

  @SerializedName("ending_before")
  String endingBefore;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("ids")
  List<String> ids;

  @SerializedName("limit")
  Long limit;

  @SerializedName("shippable")
  Boolean shippable;

  @SerializedName("starting_after")
  String startingAfter;

  @SerializedName("type")
  Type type;

  @SerializedName("url")
  String url;

  private ProductListParams(
      Boolean active,
      Object created,
      String endingBefore,
      List<String> expand,
      List<String> ids,
      Long limit,
      Boolean shippable,
      String startingAfter,
      Type type,
      String url) {
    this.active = active;
    this.created = created;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.ids = ids;
    this.limit = limit;
    this.shippable = shippable;
    this.startingAfter = startingAfter;
    this.type = type;
    this.url = url;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.ProductListParams.Builder();
  }

  public static class Builder {
    private Boolean active;

    private Object created;

    private String endingBefore;

    private List<String> expand;

    private List<String> ids;

    private Long limit;

    private Boolean shippable;

    private String startingAfter;

    private Type type;

    private String url;

    public ProductListParams build() {
      return new ProductListParams(
          active, created, endingBefore, expand, ids, limit, shippable, startingAfter, type, url);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder addIds(String element) {
      if (this.ids == null) {
        this.ids = new ArrayList<>();
      }
      this.ids.add(element);
      return this;
    }

    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    public Builder setCreated(Created.Builder created) {
      this.created = created.build();
      return this;
    }

    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    public Builder setShippable(Boolean shippable) {
      this.shippable = shippable;
      return this;
    }

    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    public Builder setType(Type type) {
      this.type = type;
      return this;
    }

    public Builder setUrl(String url) {
      this.url = url;
      return this;
    }
  }

  public static class Created {
    @SerializedName("gt")
    Long gt;

    @SerializedName("gte")
    Long gte;

    @SerializedName("lt")
    Long lt;

    @SerializedName("lte")
    Long lte;

    private Created(Long gt, Long gte, Long lt, Long lte) {
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.ProductListParams.Created.Builder();
    }

    public static class Builder {
      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      public Created build() {
        return new Created(gt, gte, lt, lte);
      }

      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum Type {
    @SerializedName("good")
    GOOD("good"),

    @SerializedName("service")
    SERVICE("service");

    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}