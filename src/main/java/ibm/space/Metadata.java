package ibm.space;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metadata {
    private String id;
    private String url;
    @JsonProperty("creator_id")
    private String creatorId;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Metadata() {
    }

    public Metadata(String id, String url, String creatorId, Date createdAt, Date updatedAt) {
        this.id = id;
        this.url = url;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}
