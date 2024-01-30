package br.com.bb.nia.ibm.resources.project.settings;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class AuditEvents {
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    @JsonbCreator
    public static AuditEvents create(@JsonbProperty("enabled") Boolean enabled) {
        return new AuditEvents(enabled);
    }

    private AuditEvents(Boolean enabled) {
        this.enabled = enabled;
    }
}
