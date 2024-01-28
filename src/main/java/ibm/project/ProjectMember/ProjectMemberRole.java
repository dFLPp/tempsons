package ibm.project.ProjectMember;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum ProjectMemberRole {
    ADMIN("admin"),
    EDITOR("editor"),
    VIEWER("viewer");

    private static final Map<String, ProjectMemberRole> VALUE_MAP = new HashMap<>();

    static {
        for (ProjectMemberRole role : ProjectMemberRole.values()) {
            VALUE_MAP.put(role.value, role);
        }
    }

    private final String value;

    ProjectMemberRole(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ProjectMemberRole fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
