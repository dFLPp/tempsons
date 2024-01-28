package ibm.project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum ProjectType {
    CPD("cpd"),
    WX("wx"),
    WCA("wca");

    private static final Map<String, ProjectType> VALUE_MAP = new HashMap<>();

    static {
        for (ProjectType type : ProjectType.values()) {
            VALUE_MAP.put(type.value, type);
        }
    }

    private final String value;

    ProjectType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ProjectType fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}

