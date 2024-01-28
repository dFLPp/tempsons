package ibm.space.SpaceMember;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum SpaceMemberState {
    ACTIVE("active"),
    PENDING("pending");

    private static final Map<String, SpaceMemberState> VALUE_MAP = new HashMap<>();

    static {
        for (SpaceMemberState state : SpaceMemberState.values()) {
            VALUE_MAP.put(state.value, state);
        }
    }

    private final String value;

    SpaceMemberState(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static SpaceMemberState fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
