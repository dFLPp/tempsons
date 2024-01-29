package br.com.bb.nia.ibm.resources.space;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class SpaceMember {
    private String role;
    private String id;
    private String state;
    private String type;

    public String getRole() {
        return role;
    }

    public String getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public String getType() {
        return type;
    }

    @JsonbCreator
    public static SpaceMember create(
            @JsonbProperty("role") String role,
            @JsonbProperty("id") String id,
            @JsonbProperty("state") String state,
            @JsonbProperty("type") String type) {
        return new SpaceMember(role, id, state, type);
    }

    private SpaceMember(String role, String id, String state, String type) {
        this.role = role;
        this.id = id;
        this.state = state;
        this.type = type;
    }
}
