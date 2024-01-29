package br.com.bb.nia.ibm.resources.space;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class SpaceCompute {
    private String name;
    private String crn;
    private String guid;
    private String type = "machine_learning";
    
    public SpaceCompute() {
    }

    public String getName() {
        return name;
    }

    public String getCrn() {
        return crn;
    }

    public String getGuid() {
        return guid;
    }

    public String getType() {
        return type;
    }

    @JsonbCreator
    public static SpaceCompute create(
            @JsonbProperty("name") String name,
            @JsonbProperty("crn") String crn,
            @JsonbProperty("guid") String guid) {
        return new SpaceCompute(name, crn, guid);
    }

    private SpaceCompute(String name, String crn, String guid) {
        this.name = name;
        this.crn = crn;
        this.guid = guid;
    }
}
