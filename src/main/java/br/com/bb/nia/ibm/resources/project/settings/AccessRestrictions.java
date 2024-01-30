package br.com.bb.nia.ibm.resources.project.settings;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class AccessRestrictions {
    private Boolean data;
    private AccessRestrictionsReporting reporting;

    public Boolean getData() {
        return data;
    }

    public AccessRestrictionsReporting getReporting() {
        return reporting;
    }

    @JsonbCreator
    public static AccessRestrictions create(
            @JsonbProperty("data") Boolean data,
            @JsonbProperty("reporting") AccessRestrictionsReporting reporting) {
        return new AccessRestrictions(data, reporting);
    }

    private AccessRestrictions(Boolean data, AccessRestrictionsReporting reporting) {
        this.data = data;
        this.reporting = reporting;
    }
}
