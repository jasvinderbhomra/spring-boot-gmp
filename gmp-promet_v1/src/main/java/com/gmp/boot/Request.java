package com.gmp.boot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@JsonPropertyOrder({"id", "synchronizationScope", "requestedLowCostCarriers"})
public class Request {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;
    public static final String JSON_PROPERTY_SYNCHRONIZATION_SCOPE = "synchronizationScope";
    private List<Enum> synchronizationScope;
    public static final String JSON_PROPERTY_REQUESTED_LOW_COST_CARRIERS = "requestedLowCostCarriers";
    private List<String> requestedLowCostCarriers;

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

    public Request synchronizationScope(List<Enum> synchronizationScope) {
        this.synchronizationScope = synchronizationScope;
        return this;
    }

    public Request addSynchronizationScopeItem(Enum synchronizationScopeItem) {
        if (this.synchronizationScope == null) {
            this.synchronizationScope = new ArrayList();
        }

        this.synchronizationScope.add(synchronizationScopeItem);
        return this;
    }

    @Nullable
    @JsonProperty("synchronizationScope")
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    public List<Enum> getSynchronizationScope() {
        return this.synchronizationScope;
    }

    @JsonProperty("synchronizationScope")
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    public void setSynchronizationScope(List<Enum> synchronizationScope) {
        this.synchronizationScope = synchronizationScope;
    }

    public Request requestedLowCostCarriers(List<String> requestedLowCostCarriers) {
        this.requestedLowCostCarriers = requestedLowCostCarriers;
        return this;
    }

    public Request addRequestedLowCostCarriersItem(String requestedLowCostCarriersItem) {
        if (this.requestedLowCostCarriers == null) {
            this.requestedLowCostCarriers = new ArrayList();
        }

        this.requestedLowCostCarriers.add(requestedLowCostCarriersItem);
        return this;
    }

    @Nullable
    @JsonProperty("requestedLowCostCarriers")
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    public List<String> getRequestedLowCostCarriers() {
        return this.requestedLowCostCarriers;
    }

    @JsonProperty("requestedLowCostCarriers")
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    public void setRequestedLowCostCarriers(List<String> requestedLowCostCarriers) {
        this.requestedLowCostCarriers = requestedLowCostCarriers;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Request orderSynchronizationRequest = (Request) o;
            return Objects.equals(this.id, orderSynchronizationRequest.id) && Objects.equals(this.synchronizationScope,
                    orderSynchronizationRequest.synchronizationScope) && Objects.equals(this.requestedLowCostCarriers,
                    orderSynchronizationRequest.requestedLowCostCarriers);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[] { this.id, this.synchronizationScope, this.requestedLowCostCarriers });
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderSynchronizationRequest {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    synchronizationScope: ").append(this.toIndentedString(this.synchronizationScope)).append("\n");
        sb.append("    requestedLowCostCarriers: ").append(this.toIndentedString(this.requestedLowCostCarriers))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
