package br.com.bb.nia.ibm.resources.project;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class ProjectScope {
    @JsonbProperty("bss_account_id")
    private String bssAccountId;
    @JsonbProperty("saml_instance_name")
    private String samlInstanceName;
    @JsonbProperty("enforce_members")
    private boolean enforceMembers;

    public ProjectScope() {
    }

    @JsonbCreator
    public static ProjectScope create(
            @JsonbProperty("bss_account_id") String bssAccountId,
            @JsonbProperty("saml_instance_name") String samlInstanceName,
            @JsonbProperty("enforce_members") boolean enforceMembers) {
        return new ProjectScope(bssAccountId, samlInstanceName, enforceMembers);
    }

    private ProjectScope(String bssAccountId, String samlInstanceName, boolean enforceMembers) {
        this.bssAccountId = bssAccountId;
        this.samlInstanceName = samlInstanceName;
        this.enforceMembers = enforceMembers;
    }

    public String getBssAccountId() {
        return bssAccountId;
    }

    public String getSamlInstanceName() {
        return samlInstanceName;
    }

    public boolean isEnforceMembers() {
        return enforceMembers;
    }
}
