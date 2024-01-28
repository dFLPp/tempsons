package ibm.space.SpaceMember;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum SpaceMemberRole {
    VIEWER("viewer"),
    EDITOR("editor"),
    ADMIN("admin");

    private static final Map<String, SpaceMemberRole> VALUE_MAP = new HashMap<>();

    static {
        for (SpaceMemberRole role : SpaceMemberRole.values()) {
            VALUE_MAP.put(role.value, role);
        }
    }

    private final String value;

    SpaceMemberRole(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static SpaceMemberRole fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
