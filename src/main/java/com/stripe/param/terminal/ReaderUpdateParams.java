// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;

public class ReaderUpdateParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** The new label of the reader. */
  @SerializedName("label")
  String label;

  /**
   * To [group
   * objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account)
   * on your platform account by connected account, set this parameter to the connected account ID.
   */
  @SerializedName("operator_account")
  String operatorAccount;

  private ReaderUpdateParams(List<String> expand, String label, String operatorAccount) {
    this.expand = expand;
    this.label = label;
    this.operatorAccount = operatorAccount;
  }

  public static Builder builder() {
    return new com.stripe.param.terminal.ReaderUpdateParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    private String label;

    private String operatorAccount;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderUpdateParams build() {
      return new ReaderUpdateParams(this.expand, this.label, this.operatorAccount);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderUpdateParams#expand} for the field documentation.
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
     * ReaderUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /** The new label of the reader. */
    public Builder setLabel(String label) {
      this.label = label;
      return this;
    }

    /**
     * To [group
     * objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account)
     * on your platform account by connected account, set this parameter to the connected account
     * ID.
     */
    public Builder setOperatorAccount(String operatorAccount) {
      this.operatorAccount = operatorAccount;
      return this;
    }
  }
}
