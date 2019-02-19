// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class TopupCreateParams extends ApiRequestParams {
  /** A positive integer representing how much to transfer. */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The ID of a source to transfer funds from. For most users, this should be left unspecified
   * which will use the bank account that was set up in the dashboard for the specified currency. In
   * test mode, this can be a test bank token (see [Testing
   * Top-ups](/docs/connect/testing#testing-top-ups)).
   */
  @SerializedName("source")
  String source;

  /**
   * Extra information about a top-up for the source's bank statement. Limited to 15 ASCII
   * characters.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /** A string that identifies this top-up as part of a group. */
  @SerializedName("transfer_group")
  String transferGroup;

  private TopupCreateParams(
      Long amount,
      String currency,
      String description,
      List<String> expand,
      Map<String, String> metadata,
      String source,
      String statementDescriptor,
      String transferGroup) {
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.expand = expand;
    this.metadata = metadata;
    this.source = source;
    this.statementDescriptor = statementDescriptor;
    this.transferGroup = transferGroup;
  }

  public static Builder builder() {
    return new com.stripe.param.TopupCreateParams.Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String description;

    private List<String> expand;

    private Map<String, String> metadata;

    private String source;

    private String statementDescriptor;

    private String transferGroup;

    /** Finalize and obtain parameter instance from this builder. */
    public TopupCreateParams build() {
      return new TopupCreateParams(
          this.amount,
          this.currency,
          this.description,
          this.expand,
          this.metadata,
          this.source,
          this.statementDescriptor,
          this.transferGroup);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first call, and subsequent
     * calls adds additional elements to the original list. See {@link TopupCreateParams#expand} for
     * the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first call, and
     * subsequent calls adds additional key/value pairs to the original map. See {@link
     * TopupCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /** A positive integer representing how much to transfer. */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * The ID of a source to transfer funds from. For most users, this should be left unspecified
     * which will use the bank account that was set up in the dashboard for the specified currency.
     * In test mode, this can be a test bank token (see [Testing
     * Top-ups](/docs/connect/testing#testing-top-ups)).
     */
    public Builder setSource(String source) {
      this.source = source;
      return this;
    }

    /**
     * Extra information about a top-up for the source's bank statement. Limited to 15 ASCII
     * characters.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /** A string that identifies this top-up as part of a group. */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }
}