package br.com.bb.nia.ibm.generic;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum MemberType {
    USER("user"),
    SERVICE("service"),
    GROUP("group");

    private static final Map<String, MemberType> VALUE_MAP = new HashMap<>();

    static {
        for (MemberType type : MemberType.values()) {
            VALUE_MAP.put(type.value, type);
        }
    }

    private final String value;

    MemberType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static MemberType fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
