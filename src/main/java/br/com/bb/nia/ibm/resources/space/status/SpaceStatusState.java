package br.com.bb.nia.ibm.resources.space.status;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum SpaceStatusState {
    PREPARING("preparing"),
    ACTIVE("active"),
    DELETING("deleting"),
    DELETED("deleted"),
    ERROR("error");

    private static final Map<String, SpaceStatusState> VALUE_MAP = new HashMap<>();

    static {
        for (SpaceStatusState state : SpaceStatusState.values()) {
            VALUE_MAP.put(state.value, state);
        }
    }

    private final String value;

    SpaceStatusState(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static SpaceStatusState fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
