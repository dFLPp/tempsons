package br.com.bb.nia.ibm.generic;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum MemberState {
    ACTIVE("active"),
    PENDING("pending");

    private static final Map<String, MemberState> VALUE_MAP = new HashMap<>();

    static {
        for (MemberState state : MemberState.values()) {
            VALUE_MAP.put(state.value, state);
        }
    }

    private final String value;

    MemberState(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static MemberState fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
