package br.com.bb.nia.ibm.resources.project.settings;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class ProjectSettings {
    @JsonbProperty("audit_events")
    private AuditEvents auditEvents;
    @JsonbProperty("access_restrictions")
    private AccessRestrictions accessRestrictions;
    private Folders folders;

    public ProjectSettings() {
    }

    @JsonbCreator
    public static ProjectSettings create(
            @JsonbProperty("audit_events") AuditEvents auditEvents,
            @JsonbProperty("access_restrictions") AccessRestrictions accessRestrictions,
            @JsonbProperty("folders") Folders folders) {
        return new ProjectSettings(auditEvents, accessRestrictions, folders);
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

    private ProjectSettings(AuditEvents auditEvents, AccessRestrictions accessRestrictions, Folders folders) {
        this.auditEvents = auditEvents;
        this.accessRestrictions = accessRestrictions;
        this.folders = folders;
    }
}
