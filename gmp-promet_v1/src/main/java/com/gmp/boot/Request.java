package com.gmp.boot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@JsonPropertyOrder({"id", "sScope", "rLCC"})
public class Request {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;
    public static final String JSON_PROPERTY_SYNCHRONIZATION_SCOPE = "sScope";
    private List<Enum> sScope;
    public static final String JSON_PROPERTY_REQUESTED_LOW_COST_CARRIERS = "rLCC";
    private List<String> rLCC;

    public Request() {
    }

    public Request id(String id) {
        this.id = id;
        return this;
    }

    @Nonnull
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    public String getId() {
        return this.id;
    }

    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public Request sScope(List<Enum> sScope) {
        this.sScope = sScope;
        return this;
    }

    public Request addsScopeItem(Enum sScopeItem) {
        if (this.sScope == null) {
            this.sScope = new ArrayList();
        }

        this.sScope.add(sScopeItem);
        return this;
    }

    @Nullable
    @JsonProperty("sScope")
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    public List<Enum> getsScope() {
        return this.sScope;
    }

    @JsonProperty("sScope")
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    public void setsScope(List<Enum> sScope) {
        this.sScope = sScope;
    }

    public Request rLCC(List<String> rLCC) {
        this.rLCC = rLCC;
        return this;
    }

    public Request addrLCCItem(String rLCCItem) {
        if (this.rLCC == null) {
            this.rLCC = new ArrayList();
        }

        this.rLCC.add(rLCCItem);
        return this;
    }

    @Nullable
    @JsonProperty("rLCC")
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    public List<String> getrLCC() {
        return this.rLCC;
    }

    @JsonProperty("rLCC")
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    public void setrLCC(List<String> rLCC) {
        this.rLCC = rLCC;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Request orderSynchronizationRequest = (Request) o;
            return Objects.equals(this.id, orderSynchronizationRequest.id) && Objects.equals(this.sScope,
                    orderSynchronizationRequest.sScope) && Objects.equals(this.rLCC,
                    orderSynchronizationRequest.rLCC);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[] { this.id, this.sScope, this.rLCC });
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderSynchronizationRequest {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    sScope: ").append(this.toIndentedString(this.sScope)).append("\n");
        sb.append("    rLCC: ").append(this.toIndentedString(this.rLCC))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
