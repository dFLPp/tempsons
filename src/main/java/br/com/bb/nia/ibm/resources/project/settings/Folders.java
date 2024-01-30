package br.com.bb.nia.ibm.resources.project.settings;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class Folders {
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    @JsonbCreator
    public static Folders create(
            @JsonbProperty("enabled") Boolean enabled) {
        return new Folders(enabled);
    }

    private Folders(Boolean enabled) {
        this.enabled = enabled;
    }
}
