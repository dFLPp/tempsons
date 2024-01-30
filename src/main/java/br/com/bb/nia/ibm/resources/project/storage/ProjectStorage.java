package br.com.bb.nia.ibm.resources.project.storage;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class ProjectStorage {
    private String type;
    private String guid;
    private ProjectStorageProperties properties;

    public ProjectStorage() {
    }

    @JsonbCreator
    public static ProjectStorage create(
            @JsonbProperty("type") String type,
            @JsonbProperty("guid") String guid,
            @JsonbProperty("properties") ProjectStorageProperties properties) {
        return new ProjectStorage(type, guid, properties);
    }

    public String getType() {
        return type;
    }

    public String getGuid() {
        return guid;
    }

    public ProjectStorageProperties getProperties() {
        return properties;
    }

    private ProjectStorage(String type, String guid, ProjectStorageProperties properties) {
        this.type = type;
        this.guid = guid;
        this.properties = properties;
    }
}
