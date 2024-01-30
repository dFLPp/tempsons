package br.com.bb.nia.ibm.resources.project.member;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class ProjectMember {
    @JsonbProperty("user_name")
    private String userName;
    private String role;
    private String id;
    private String state;
    private String type;

    @JsonbCreator
    public static ProjectMember create(
            @JsonbProperty("user_name") String userName,
            @JsonbProperty("role") String role,
            @JsonbProperty("id") String id,
            @JsonbProperty("state") String state,
            @JsonbProperty("type") String type) {
        return new ProjectMember(userName, role, id, state, type);
    }

    private ProjectMember(String userName, String role, String id, String state, String type) {
        this.userName = userName;
        this.role = role;
        this.id = id;
        this.state = state;
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

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

    
}
