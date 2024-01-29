package br.com.bb.nia.ibm.resources.space;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class Space {
    private SpaceMetadata metadata;
    private SpaceEntity entity;

    public SpaceMetadata getMetadata() {
        return metadata;
    }

    public SpaceEntity getEntity() {
        return entity;
    }

    @JsonbCreator
    public static Space create(
            @JsonbProperty("metadata") SpaceMetadata metadata,
            @JsonbProperty("entity") SpaceEntity entity
        ) {
        return new Space(metadata, entity);
    }

    public Space(SpaceMetadata metadata, SpaceEntity entity) {
        this.metadata = metadata;
        this.entity = entity;
    }

    public Space() {
    }
}
