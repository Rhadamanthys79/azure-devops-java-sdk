package org.azd.memberentitlementmanagement.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserEntitlements {
    @JsonProperty("value")
    private List<UserEntitlement> userEntitlements;

    public List<UserEntitlement> getUserEntitlements() {
        return userEntitlements;
    }

    public void setUserEntitlements(List<UserEntitlement> userEntitlements) {
        this.userEntitlements = userEntitlements;
    }

    @Override
    public String toString() {
        return "UserEntitlements{" +
                "userEntitlements=" + userEntitlements +
                '}';
    }
}
