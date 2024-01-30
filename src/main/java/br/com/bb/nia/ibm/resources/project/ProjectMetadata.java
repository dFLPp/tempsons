package br.com.bb.nia.ibm.resources.project;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class ProjectMetadata {
    private String guid;
    private String url;
    @JsonbProperty("created_at")
    private String createdAt;
    @JsonbProperty("updated_at")
    private String updatedAt;

    public ProjectMetadata() {
    }

    @JsonbCreator
    public static ProjectMetadata create(
            @JsonbProperty("guid") String guid,
            @JsonbProperty("url") String url,
            @JsonbProperty("created_at") String createdAt,
            @JsonbProperty("updated_at") String updatedAt) {
        return new ProjectMetadata(guid, url, createdAt, updatedAt);
    }

    public ProjectMetadata(String guid, String url, String createdAt, String updatedAt) {
        this.guid = guid;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getGuid() {
        return guid;
    }

    public String getUrl() {
        return url;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
