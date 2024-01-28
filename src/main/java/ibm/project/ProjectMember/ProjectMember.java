package ibm.project.ProjectMember;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectMember {
    @JsonProperty("user_name")
    private String userName;
    private ProjectMemberRole role;
    private String id;
    private ProjectMemberState state;
    private ProjectMemberType type;
    public String getUserName() {
        return userName;
    }
    public ProjectMemberRole getRole() {
        return role;
    }
    public String getId() {
        return id;
    }
    public ProjectMemberState getState() {
        return state;
    }
    public ProjectMemberType getType() {
        return type;
    }
    public ProjectMember() {
    }
    public ProjectMember(String userName, ProjectMemberRole role, String id, ProjectMemberState state,
            ProjectMemberType type) {
        this.userName = userName;
        this.role = role;
        this.id = id;
        this.state = state;
        this.type = type;
    }
}
