// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class InvoiceCreateParams extends ApiRequestParams {
  /**
   * A fee in %s that will be applied to the invoice and transferred to the application owner's
   * Stripe account. The request must be made with an OAuth key or the Stripe-Account header in
   * order to take an application fee. For more information, see the application fees
   * [documentation](https://stripe.com/docs/connect/subscriptions#invoices).
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * Controls whether Stripe will perform [automatic
   * collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance) of the invoice.
   * When `false`, the invoice's state will not automatically advance without an explicit action.
   */
  @SerializedName("auto_advance")
  Boolean autoAdvance;

  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
   * attempt to pay this invoice using the default source attached to the customer. When sending an
   * invoice, Stripe will email this invoice to the customer with payment instructions. Defaults to
   * `charge_automatically`.
   */
  @SerializedName("billing")
  Billing billing;

  /** A list of up to 4 custom fields to be displayed on the invoice. */
  @SerializedName("custom_fields")
  Object customFields;

  @SerializedName("customer")
  String customer;

  /**
   * The number of days from when the invoice is created until it is due. Valid only for invoices
   * where `billing=send_invoice`.
   */
  @SerializedName("days_until_due")
  Long daysUntilDue;

  /**
   * ID of the default payment method for the invoice. It must belong to the customer associated
   * with the invoice. If not set, defaults to the subscription's default payment method, if any, or
   * to the default payment method in the customer's invoice settings.
   */
  @SerializedName("default_payment_method")
  String defaultPaymentMethod;

  /**
   * ID of the default payment source for the invoice. It must belong to the customer associated
   * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
   * default source, if any, or to the customer's default source.
   */
  @SerializedName("default_source")
  String defaultSource;

  @SerializedName("default_tax_rates")
  List<String> defaultTaxRates;

  @SerializedName("description")
  String description;

  /**
   * The date on which payment for this invoice is due. Valid only for invoices where
   * `billing=send_invoice`.
   */
  @SerializedName("due_date")
  Long dueDate;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** Footer to be displayed on the invoice. */
  @SerializedName("footer")
  String footer;

  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Extra information about a charge for the customer's credit card statement. It must contain at
   * least one letter. If not specified and this invoice is part of a subscription, the default
   * `statement_descriptor` will be set to the first subscription item's product's
   * `statement_descriptor`.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * The ID of the subscription to invoice, if any. If not set, the created invoice will include all
   * pending invoice items for the customer. If set, the created invoice will exclude pending
   * invoice items that pertain to other subscriptions. The subscription's billing cycle and regular
   * subscription events won't be affected.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * The percent tax rate applied to the invoice, represented as a decimal number. This field has
   * been deprecated and will be removed in a future API version, for further information view the
   * [migration docs](https://stripe.com/docs/billing/migration/taxes) to `tax_rates`
   */
  @SerializedName("tax_percent")
  BigDecimal taxPercent;

  /**
   * If specified, the funds from the invoice will be transferred to the destination and the ID of
   * the resulting transfer will be found on the invoice's charge. This will be unset if you POST an
   * empty value.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private InvoiceCreateParams(
      Long applicationFeeAmount,
      Boolean autoAdvance,
      Billing billing,
      Object customFields,
      String customer,
      Long daysUntilDue,
      String defaultPaymentMethod,
      String defaultSource,
      List<String> defaultTaxRates,
      String description,
      Long dueDate,
      List<String> expand,
      String footer,
      Map<String, String> metadata,
      String statementDescriptor,
      String subscription,
      BigDecimal taxPercent,
      TransferData transferData) {
    this.applicationFeeAmount = applicationFeeAmount;
    this.autoAdvance = autoAdvance;
    this.billing = billing;
    this.customFields = customFields;
    this.customer = customer;
    this.daysUntilDue = daysUntilDue;
    this.defaultPaymentMethod = defaultPaymentMethod;
    this.defaultSource = defaultSource;
    this.defaultTaxRates = defaultTaxRates;
    this.description = description;
    this.dueDate = dueDate;
    this.expand = expand;
    this.footer = footer;
    this.metadata = metadata;
    this.statementDescriptor = statementDescriptor;
    this.subscription = subscription;
    this.taxPercent = taxPercent;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new com.stripe.param.InvoiceCreateParams.Builder();
  }

  public static class Builder {
    private Long applicationFeeAmount;

    private Boolean autoAdvance;

    private Billing billing;

    private Object customFields;

    private String customer;

    private Long daysUntilDue;

    private String defaultPaymentMethod;

    private String defaultSource;

    private List<String> defaultTaxRates;

    private String description;

    private Long dueDate;

    private List<String> expand;

    private String footer;

    private Map<String, String> metadata;

    private String statementDescriptor;

    private String subscription;

    private BigDecimal taxPercent;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceCreateParams build() {
      return new InvoiceCreateParams(
          this.applicationFeeAmount,
          this.autoAdvance,
          this.billing,
          this.customFields,
          this.customer,
          this.daysUntilDue,
          this.defaultPaymentMethod,
          this.defaultSource,
          this.defaultTaxRates,
          this.description,
          this.dueDate,
          this.expand,
          this.footer,
          this.metadata,
          this.statementDescriptor,
          this.subscription,
          this.taxPercent,
          this.transferData);
    }

    /**
     * A fee in %s that will be applied to the invoice and transferred to the application owner's
     * Stripe account. The request must be made with an OAuth key or the Stripe-Account header in
     * order to take an application fee. For more information, see the application fees
     * [documentation](https://stripe.com/docs/connect/subscriptions#invoices).
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * Controls whether Stripe will perform [automatic
     * collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance) of the invoice.
     * When `false`, the invoice's state will not automatically advance without an explicit action.
     */
    public Builder setAutoAdvance(Boolean autoAdvance) {
      this.autoAdvance = autoAdvance;
      return this;
    }

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
     * attempt to pay this invoice using the default source attached to the customer. When sending
     * an invoice, Stripe will email this invoice to the customer with payment instructions.
     * Defaults to `charge_automatically`.
     */
    public Builder setBilling(Billing billing) {
      this.billing = billing;
      return this;
    }

    /** A list of up to 4 custom fields to be displayed on the invoice. */
    public Builder setCustomFields(EmptyParam customFields) {
      this.customFields = customFields;
      return this;
    }

    /** A list of up to 4 custom fields to be displayed on the invoice. */
    public Builder setCustomFields(List<CustomField> customFields) {
      this.customFields = customFields;
      return this;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The number of days from when the invoice is created until it is due. Valid only for invoices
     * where `billing=send_invoice`.
     */
    public Builder setDaysUntilDue(Long daysUntilDue) {
      this.daysUntilDue = daysUntilDue;
      return this;
    }

    /**
     * ID of the default payment method for the invoice. It must belong to the customer associated
     * with the invoice. If not set, defaults to the subscription's default payment method, if any,
     * or to the default payment method in the customer's invoice settings.
     */
    public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
      this.defaultPaymentMethod = defaultPaymentMethod;
      return this;
    }

    /**
     * ID of the default payment source for the invoice. It must belong to the customer associated
     * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
     * default source, if any, or to the customer's default source.
     */
    public Builder setDefaultSource(String defaultSource) {
      this.defaultSource = defaultSource;
      return this;
    }

    /**
     * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#defaultTaxRates} for the field documentation.
     */
    public Builder addDefaultTaxRate(String element) {
      if (this.defaultTaxRates == null) {
        this.defaultTaxRates = new ArrayList<>();
      }
      this.defaultTaxRates.add(element);
      return this;
    }

    /**
     * Add all elements to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#defaultTaxRates} for the field documentation.
     */
    public Builder addAllDefaultTaxRate(List<String> elements) {
      if (this.defaultTaxRates == null) {
        this.defaultTaxRates = new ArrayList<>();
      }
      this.defaultTaxRates.addAll(elements);
      return this;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * The date on which payment for this invoice is due. Valid only for invoices where
     * `billing=send_invoice`.
     */
    public Builder setDueDate(Long dueDate) {
      this.dueDate = dueDate;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /** Footer to be displayed on the invoice. */
    public Builder setFooter(String footer) {
      this.footer = footer;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link InvoiceCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Extra information about a charge for the customer's credit card statement. It must contain at
     * least one letter. If not specified and this invoice is part of a subscription, the default
     * `statement_descriptor` will be set to the first subscription item's product's
     * `statement_descriptor`.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * The ID of the subscription to invoice, if any. If not set, the created invoice will include
     * all pending invoice items for the customer. If set, the created invoice will exclude pending
     * invoice items that pertain to other subscriptions. The subscription's billing cycle and
     * regular subscription events won't be affected.
     */
    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
      return this;
    }

    /**
     * The percent tax rate applied to the invoice, represented as a decimal number. This field has
     * been deprecated and will be removed in a future API version, for further information view the
     * [migration docs](https://stripe.com/docs/billing/migration/taxes) to `tax_rates`
     */
    public Builder setTaxPercent(BigDecimal taxPercent) {
      this.taxPercent = taxPercent;
      return this;
    }

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of
     * the resulting transfer will be found on the invoice's charge. This will be unset if you POST
     * an empty value.
     */
    public Builder setTransferData(TransferData transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  public static class CustomField {
    /** The name of the custom field. This may be up to 30 characters. */
    @SerializedName("name")
    String name;

    /** The value of the custom field. This may be up to 30 characters. */
    @SerializedName("value")
    String value;

    private CustomField(String name, String value) {
      this.name = name;
      this.value = value;
    }

    public static Builder builder() {
      return new com.stripe.param.InvoiceCreateParams.CustomField.Builder();
    }

    public static class Builder {
      private String name;

      private String value;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomField build() {
        return new CustomField(this.name, this.value);
      }

      /** The name of the custom field. This may be up to 30 characters. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The value of the custom field. This may be up to 30 characters. */
      public Builder setValue(String value) {
        this.value = value;
        return this;
      }
    }
  }

  public static class TransferData {
    /** ID of an existing, connected Stripe account. */
    @SerializedName("destination")
    String destination;

    private TransferData(String destination) {
      this.destination = destination;
    }

    public static Builder builder() {
      return new com.stripe.param.InvoiceCreateParams.TransferData.Builder();
    }

    public static class Builder {
      private String destination;

      /** Finalize and obtain parameter instance from this builder. */
      public TransferData build() {
        return new TransferData(this.destination);
      }

      /** ID of an existing, connected Stripe account. */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }
    }
  }

  public enum Billing implements ApiRequestParams.EnumParam {
    @SerializedName("charge_automatically")
    CHARGE_AUTOMATICALLY("charge_automatically"),

    @SerializedName("send_invoice")
    SEND_INVOICE("send_invoice");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Billing(String value) {
      this.value = value;
    }
  }
}
