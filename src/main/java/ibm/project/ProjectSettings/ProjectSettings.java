package ibm.project.ProjectSettings;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectSettings {
    @JsonProperty("audit_events")
    private AuditEvents auditEvents;
    @JsonProperty("access_restrictions")
    private AccessRestrictions accessRestrictions;
    private Folders folders;
    
    public ProjectSettings() {
    }
    public ProjectSettings(AuditEvents auditEvents, AccessRestrictions accessRestrictions, Folders folders) {
        this.auditEvents = auditEvents;
        this.accessRestrictions = accessRestrictions;
        this.folders = folders;
    }
    public AuditEvents getAuditEvents() {
        return auditEvents;
    }
    public AccessRestrictions getAccessRestrictions() {
        return accessRestrictions;
    }
    public Folders getFolders() {
        return folders;
    }

    
}