package ibm.space;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class Metadata {
    private String id;
    private String url;
    private String creatorId;
    private String createdAt;
    private String updatedAt;

    @JsonbCreator
    public static Metadata create(
            @JsonbProperty("id") String id,
            @JsonbProperty("url") String url,
            @JsonbProperty("creator_id") String creatorId,
            @JsonbProperty("created_at") String createdAt,
            @JsonbProperty("updated_at") String updatedAt) {

        return new Metadata(id, url, creatorId, createdAt, updatedAt);
    }

    // Construtor padrão (vazio) para acomodar a deserialização do Jsonb
    public Metadata() {
    }

    private Metadata(String id, String url, String creatorId, String createdAt, String updatedAt) {
        this.id = id;
        this.url = url;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
