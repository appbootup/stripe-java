// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.List;

public class BankAccountVerifyParams extends ApiParamRequest {
  @SerializedName("amounts")
  List<Long> amounts;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("verification_method")
  String verificationMethod;

  private BankAccountVerifyParams(
      List<Long> amounts, List<String> expand, String verificationMethod) {
    this.amounts = amounts;
    this.expand = expand;
    this.verificationMethod = verificationMethod;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.BankAccountVerifyParams.Builder();
  }

  public static class Builder {
    private List<Long> amounts;

    private List<String> expand;

    private String verificationMethod;

    public BankAccountVerifyParams build() {
      return new BankAccountVerifyParams(amounts, expand, verificationMethod);
    }

    public Builder addAmounts(Long element) {
      if (this.amounts == null) {
        this.amounts = new ArrayList<>();
      }
      this.amounts.add(element);
      return this;
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder setVerificationMethod(String verificationMethod) {
      this.verificationMethod = verificationMethod;
      return this;
    }
  }
}