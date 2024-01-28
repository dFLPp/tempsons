package ibm.project;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectScope {
    @JsonProperty("bss_account_id")
    private String bssAccountId;
    @JsonProperty("saml_instance_name")
    private String samlInstanceName;
    @JsonProperty("enforce_members")
    private boolean enforceMembers;

    public ProjectScope() {
    }

    public ProjectScope(String bssAccountId, String samlInstanceName, boolean enforceMembers) {
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

