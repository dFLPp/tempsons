package ibm.space.SpaceMember;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum SpaceMemberType {
    USER("user"),
    SERVICE("service"),
    GROUP("group");

    private static final Map<String, SpaceMemberType> VALUE_MAP = new HashMap<>();

    static {
        for (SpaceMemberType type : SpaceMemberType.values()) {
            VALUE_MAP.put(type.value, type);
        }
    }

    private final String value;

    SpaceMemberType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static SpaceMemberType fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
