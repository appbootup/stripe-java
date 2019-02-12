// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.List;

public class TransactionListParams extends ApiParamRequest {
  @SerializedName("card")
  String card;

  @SerializedName("cardholder")
  String cardholder;

  @SerializedName("created")
  Object created;

  @SerializedName("dispute")
  String dispute;

  @SerializedName("ending_before")
  String endingBefore;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("limit")
  Long limit;

  @SerializedName("settlement")
  String settlement;

  @SerializedName("starting_after")
  String startingAfter;

  private TransactionListParams(
      String card,
      String cardholder,
      Object created,
      String dispute,
      String endingBefore,
      List<String> expand,
      Long limit,
      String settlement,
      String startingAfter) {
    this.card = card;
    this.cardholder = cardholder;
    this.created = created;
    this.dispute = dispute;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.limit = limit;
    this.settlement = settlement;
    this.startingAfter = startingAfter;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.issuing.TransactionListParams.Builder();
  }

  public static class Builder {
    private String card;

    private String cardholder;

    private Object created;

    private String dispute;

    private String endingBefore;

    private List<String> expand;

    private Long limit;

    private String settlement;

    private String startingAfter;

    public TransactionListParams build() {
      return new TransactionListParams(
          card,
          cardholder,
          created,
          dispute,
          endingBefore,
          expand,
          limit,
          settlement,
          startingAfter);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder setCard(String card) {
      this.card = card;
      return this;
    }

    public Builder setCardholder(String cardholder) {
      this.cardholder = cardholder;
      return this;
    }

    public Builder setCreated(Created.Builder created) {
      this.created = created.build();
      return this;
    }

    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    public Builder setDispute(String dispute) {
      this.dispute = dispute;
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

    public Builder setSettlement(String settlement) {
      this.settlement = settlement;
      return this;
    }

    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
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
      return new com.stripe.param.issuing.TransactionListParams.Created.Builder();
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
}