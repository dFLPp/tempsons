package br.com.bb.nia.ibm.resources.project.storage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum ProjectStorageType {
    BMCOS_OBJECT_STORAGE("bmcos_object_storage"),
    ASSETFILES("assetfiles"),
    LOCAL_GIT_STORAGE("local_git_storage"),
    AMAZON_S3("amazon_s3");

    private static final Map<String, ProjectStorageType> VALUE_MAP = new HashMap<>();

    static {
        for (ProjectStorageType type : ProjectStorageType.values()) {
            VALUE_MAP.put(type.value, type);
        }
    }

    private final String value;

    ProjectStorageType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ProjectStorageType fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
