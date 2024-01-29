package ibm.space;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class Space {
    private Metadata metadata;
    private Entity entity;

    public Metadata getMetadata() {
        return metadata;
    }

    public Entity getEntity() {
        return entity;
    }

    @JsonbCreator
    public static Space create(
            @JsonbProperty("metadata") Metadata metadata,
            @JsonbProperty("entity") Entity entity
        ) {
        return new Space(metadata, entity);
    }

    public Space(Metadata metadata, Entity entity) {
        this.metadata = metadata;
        this.entity = entity;
    }

    public Space() {
    }
}
