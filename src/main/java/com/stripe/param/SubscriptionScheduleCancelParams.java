// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.List;

public class SubscriptionScheduleCancelParams extends ApiParamRequest {
  @SerializedName("expand")
  List<String> expand;

  @SerializedName("invoice_now")
  Boolean invoiceNow;

  @SerializedName("prorate")
  Boolean prorate;

  private SubscriptionScheduleCancelParams(
      List<String> expand, Boolean invoiceNow, Boolean prorate) {
    this.expand = expand;
    this.invoiceNow = invoiceNow;
    this.prorate = prorate;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.SubscriptionScheduleCancelParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Boolean invoiceNow;

    private Boolean prorate;

    public SubscriptionScheduleCancelParams build() {
      return new SubscriptionScheduleCancelParams(expand, invoiceNow, prorate);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder setInvoiceNow(Boolean invoiceNow) {
      this.invoiceNow = invoiceNow;
      return this;
    }

    public Builder setProrate(Boolean prorate) {
      this.prorate = prorate;
      return this;
    }
  }
}