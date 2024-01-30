package br.com.bb.nia.ibm.resources.project.settings;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class AccessRestrictionsReporting {
    private boolean authorized;

    public boolean isAuthorized() {
        return authorized;
    }

    @JsonbCreator
    public static AccessRestrictionsReporting create(
            @JsonbProperty("authorized") boolean authorized) {
        return new AccessRestrictionsReporting(authorized);
    }

    private AccessRestrictionsReporting(boolean authorized) {
        this.authorized = authorized;
    }
}
