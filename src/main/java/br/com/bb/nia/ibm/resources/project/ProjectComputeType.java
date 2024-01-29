package br.com.bb.nia.ibm.resources.project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum ProjectComputeType {
    ANALYTICS_ENGINE("analytics_engine"),
    SPARK("spark"),
    MACHINE_LEARNING("machine_learning"),
    STREAMING_ANALYTICS("streaming_analytics"),
    WATSON("watson"),
    DATA_REPLICATION("data_replication"),
    CODE_ASSISTANT("code-assistant");

    private static final Map<String, ProjectComputeType> VALUE_MAP = new HashMap<>();

    static {
        for (ProjectComputeType type : ProjectComputeType.values()) {
            VALUE_MAP.put(type.value, type);
        }
    }

    private final String value;

    ProjectComputeType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ProjectComputeType fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}

