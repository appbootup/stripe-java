// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayoutCreateParams extends ApiParamRequest {
  @SerializedName("amount")
  Long amount;

  @SerializedName("currency")
  String currency;

  @SerializedName("description")
  String description;

  @SerializedName("destination")
  String destination;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("metadata")
  Map<String, String> metadata;

  @SerializedName("method")
  Method method;

  @SerializedName("source_type")
  SourceType sourceType;

  @SerializedName("statement_descriptor")
  String statementDescriptor;

  private PayoutCreateParams(
      Long amount,
      String currency,
      String description,
      String destination,
      List<String> expand,
      Map<String, String> metadata,
      Method method,
      SourceType sourceType,
      String statementDescriptor) {
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.destination = destination;
    this.expand = expand;
    this.metadata = metadata;
    this.method = method;
    this.sourceType = sourceType;
    this.statementDescriptor = statementDescriptor;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.PayoutCreateParams.Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String description;

    private String destination;

    private List<String> expand;

    private Map<String, String> metadata;

    private Method method;

    private SourceType sourceType;

    private String statementDescriptor;

    public PayoutCreateParams build() {
      return new PayoutCreateParams(
          amount,
          currency,
          description,
          destination,
          expand,
          metadata,
          method,
          sourceType,
          statementDescriptor);
    }

    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder setDestination(String destination) {
      this.destination = destination;
      return this;
    }

    public Builder setMethod(Method method) {
      this.method = method;
      return this;
    }

    public Builder setSourceType(SourceType sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }
  }

  public enum Method {
    @SerializedName("instant")
    INSTANT("instant"),

    @SerializedName("standard")
    STANDARD("standard");

    private final String value;

    Method(String value) {
      this.value = value;
    }
  }

  public enum SourceType {
    @SerializedName("alipay_account")
    ALIPAY_ACCOUNT("alipay_account"),

    @SerializedName("bank_account")
    BANK_ACCOUNT("bank_account"),

    @SerializedName("bitcoin_receiver")
    BITCOIN_RECEIVER("bitcoin_receiver"),

    @SerializedName("card")
    CARD("card"),

    @SerializedName("financing")
    FINANCING("financing"),

    @SerializedName("source")
    SOURCE("source"),

    @SerializedName("stripe_account")
    STRIPE_ACCOUNT("stripe_account");

    private final String value;

    SourceType(String value) {
      this.value = value;
    }
  }
}