package br.com.bb.nia.ibm.resources.space;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class SpaceStage {
    private Boolean production;
    private String name;

    public SpaceStage() {
    }

    public Boolean getProduction() {
        return production;
    }

    public String getName() {
        return name;
    }

    @JsonbCreator
    public static SpaceStage create(
            @JsonbProperty("production") Boolean production,
            @JsonbProperty("name") String name) {
        return new SpaceStage(production, name);
    }

    private SpaceStage(Boolean production, String name) {
        this.production = production;
        this.name = name;
    }
}
