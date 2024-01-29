package br.com.bb.nia.ibm.resources.space.storage;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class SpaceStorage {
    private String type = "bmcos_object_storage";
    private SpaceStorageProperties properties;

    public SpaceStorage() {
    }

    public String getType() {
        return type;
    }

    public SpaceStorageProperties getProperties() {
        return properties;
    }

    @JsonbCreator
    public static SpaceStorage create(
            @JsonbProperty("properties") SpaceStorageProperties properties) {
        return new SpaceStorage(properties);
    }

    private SpaceStorage(SpaceStorageProperties properties) {
        this.properties = properties;
    }
}
