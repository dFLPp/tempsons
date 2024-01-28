package ibm.project;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metadata {
    private String guid;
    private String url;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;

    public Metadata() {
    }

    public Metadata(String guid, String url, String createdAt, String updatedAt) {
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