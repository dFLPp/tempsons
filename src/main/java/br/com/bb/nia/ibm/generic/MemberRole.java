package br.com.bb.nia.ibm.generic;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum MemberRole {
    VIEWER("viewer"),
    EDITOR("editor"),
    ADMIN("admin");

    private static final Map<String, MemberRole> VALUE_MAP = new HashMap<>();

    static {
        for (MemberRole role : MemberRole.values()) {
            VALUE_MAP.put(role.value, role);
        }
    }

    private final String value;

    MemberRole(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static MemberRole fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
