// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiParamRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoiceUpdateParams extends ApiParamRequest {
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  @SerializedName("auto_advance")
  Boolean autoAdvance;

  @SerializedName("custom_fields")
  List<CustomFields> customFields;

  @SerializedName("days_until_due")
  Long daysUntilDue;

  @SerializedName("default_source")
  String defaultSource;

  @SerializedName("description")
  String description;

  @SerializedName("due_date")
  Long dueDate;

  @SerializedName("expand")
  List<String> expand;

  @SerializedName("footer")
  String footer;

  @SerializedName("metadata")
  Map<String, String> metadata;

  @SerializedName("statement_descriptor")
  String statementDescriptor;

  @SerializedName("tax_percent")
  BigDecimal taxPercent;

  private InvoiceUpdateParams(
      Long applicationFeeAmount,
      Boolean autoAdvance,
      List<CustomFields> customFields,
      Long daysUntilDue,
      String defaultSource,
      String description,
      Long dueDate,
      List<String> expand,
      String footer,
      Map<String, String> metadata,
      String statementDescriptor,
      BigDecimal taxPercent) {
    this.applicationFeeAmount = applicationFeeAmount;
    this.autoAdvance = autoAdvance;
    this.customFields = customFields;
    this.daysUntilDue = daysUntilDue;
    this.defaultSource = defaultSource;
    this.description = description;
    this.dueDate = dueDate;
    this.expand = expand;
    this.footer = footer;
    this.metadata = metadata;
    this.statementDescriptor = statementDescriptor;
    this.taxPercent = taxPercent;
  }

  public static Builder newBuilder() {
    return new com.stripe.param.InvoiceUpdateParams.Builder();
  }

  public static class Builder {
    private Long applicationFeeAmount;

    private Boolean autoAdvance;

    private List<CustomFields> customFields;

    private Long daysUntilDue;

    private String defaultSource;

    private String description;

    private Long dueDate;

    private List<String> expand;

    private String footer;

    private Map<String, String> metadata;

    private String statementDescriptor;

    private BigDecimal taxPercent;

    public InvoiceUpdateParams build() {
      return new InvoiceUpdateParams(
          applicationFeeAmount,
          autoAdvance,
          customFields,
          daysUntilDue,
          defaultSource,
          description,
          dueDate,
          expand,
          footer,
          metadata,
          statementDescriptor,
          taxPercent);
    }

    public Builder addCustomFields(CustomFields.Builder element) {
      if (this.customFields == null) {
        this.customFields = new ArrayList<>();
      }
      this.customFields.add(element.build());
      return this;
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

    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    public Builder setAutoAdvance(Boolean autoAdvance) {
      this.autoAdvance = autoAdvance;
      return this;
    }

    public Builder setDaysUntilDue(Long daysUntilDue) {
      this.daysUntilDue = daysUntilDue;
      return this;
    }

    public Builder setDefaultSource(String defaultSource) {
      this.defaultSource = defaultSource;
      return this;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder setDueDate(Long dueDate) {
      this.dueDate = dueDate;
      return this;
    }

    public Builder setFooter(String footer) {
      this.footer = footer;
      return this;
    }

    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    public Builder setTaxPercent(BigDecimal taxPercent) {
      this.taxPercent = taxPercent;
      return this;
    }
  }

  public static class CustomFields {
    @SerializedName("name")
    String name;

    @SerializedName("value")
    String value;

    private CustomFields(String name, String value) {
      this.name = name;
      this.value = value;
    }

    public static Builder newBuilder() {
      return new com.stripe.param.InvoiceUpdateParams.CustomFields.Builder();
    }

    public static class Builder {
      private String name;

      private String value;

      public CustomFields build() {
        return new CustomFields(name, value);
      }

      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      public Builder setValue(String value) {
        this.value = value;
        return this;
      }
    }
  }
}