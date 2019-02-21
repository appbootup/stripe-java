// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeIdeal extends StripeObject {
  @SerializedName("bank")
  String bank;

  @SerializedName("bic")
  String bic;

  @SerializedName("iban_last4")
  String ibanLast4;

  @SerializedName("statement_descriptor")
  String statementDescriptor;
}