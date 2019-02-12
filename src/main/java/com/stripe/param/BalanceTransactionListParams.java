// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.List;

public class BalanceTransactionListParams extends ApiParamRequest {
  @SerializedName("available_on")
  Object availableOn;

  @SerializedName("created")
  Object created;

  @SerializedName("currency")
  String currency;

  @SerializedName("ending_before")
  String endingBefore;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("limit")
  Long limit;

  @SerializedName("payout")
  String payout;

  @SerializedName("source")
  String source;

  @SerializedName("starting_after")
  String startingAfter;

  @SerializedName("type")
  String type;

  private BalanceTransactionListParams(
      Object availableOn,
      Object created,
      String currency,
      String endingBefore,
      List<String> expand,
      Long limit,
      String payout,
      String source,
      String startingAfter,
      String type) {
    this.availableOn = availableOn;
    this.created = created;
    this.currency = currency;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.limit = limit;
    this.payout = payout;
    this.source = source;
    this.startingAfter = startingAfter;
    this.type = type;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.BalanceTransactionListParams.Builder();
  }

  public static class Builder {
    private Object availableOn;

    private Object created;

    private String currency;

    private String endingBefore;

    private List<String> expand;

    private Long limit;

    private String payout;

    private String source;

    private String startingAfter;

    private String type;

    public BalanceTransactionListParams build() {
      return new BalanceTransactionListParams(
          availableOn,
          created,
          currency,
          endingBefore,
          expand,
          limit,
          payout,
          source,
          startingAfter,
          type);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder setAvailableOn(Long availableOn) {
      this.availableOn = availableOn;
      return this;
    }

    public Builder setAvailableOn(AvailableOn.Builder availableOn) {
      this.availableOn = availableOn.build();
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

    public Builder setCurrency(String currency) {
      this.currency = currency;
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

    public Builder setPayout(String payout) {
      this.payout = payout;
      return this;
    }

    public Builder setSource(String source) {
      this.source = source;
      return this;
    }

    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    public Builder setType(String type) {
      this.type = type;
      return this;
    }
  }

  public static class AvailableOn {
    @SerializedName("gt")
    Long gt;

    @SerializedName("gte")
    Long gte;

    @SerializedName("lt")
    Long lt;

    @SerializedName("lte")
    Long lte;

    private AvailableOn(Long gt, Long gte, Long lt, Long lte) {
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.BalanceTransactionListParams.AvailableOn.Builder();
    }

    public static class Builder {
      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      public AvailableOn build() {
        return new AvailableOn(gt, gte, lt, lte);
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
      return new com.stripe.param.BalanceTransactionListParams.Created.Builder();
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