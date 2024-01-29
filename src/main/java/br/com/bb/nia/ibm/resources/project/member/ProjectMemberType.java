package br.com.bb.nia.ibm.resources.project.member;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum ProjectMemberType {
    USER("user"),
    GROUP("group"),
    SERVICE("service");

    private static final Map<String, ProjectMemberType> VALUE_MAP = new HashMap<>();

    static {
        for (ProjectMemberType type : ProjectMemberType.values()) {
            VALUE_MAP.put(type.value, type);
        }
    }

    private final String value;

    ProjectMemberType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ProjectMemberType fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
