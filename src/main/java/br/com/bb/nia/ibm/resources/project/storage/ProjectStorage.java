package br.com.bb.nia.ibm.resources.project.storage;

public class ProjectStorage {
    private ProjectStorageType type;
    private String guid;
    private ProjectStorageProperties properties;

    public ProjectStorage() {
    }

    public ProjectStorageType getType() {
        return type;
    }

    public String getGuid() {
        return guid;
    }

    public ProjectStorageProperties getProperties() {
        return properties;
    }

    public ProjectStorage(ProjectStorageType type, String guid, ProjectStorageProperties properties) {
        this.type = type;
        this.guid = guid;
        this.properties = properties;
    }

    
}
