package br.com.bb.nia.ibm.resources.space;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum SpaceType {
    CPD("cpd"),
    WX("wx"),
    WCA("wca");

    private static final Map<String, SpaceType> VALUE_MAP = new HashMap<>();

    static {
        for (SpaceType type : SpaceType.values()) {
            VALUE_MAP.put(type.value, type);
        }
    }

    private final String value;

    SpaceType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static SpaceType fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
