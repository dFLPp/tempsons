package br.com.bb.nia.ibm.resources.project.storage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum ProjectStorageBucketRegion {
    US_GEO("us-geo"),
    EU_GEO("eu-geo"),
    AP_GEO("ap-geo"),
    US_SOUTH("us-south"),
    EU_GB("eu-gb"),
    EU_DE("eu-de"),
    JP_TOK("jp-tok");

    private static final Map<String, ProjectStorageBucketRegion> ENUM_MAP = new HashMap<>();

    static {
        for (ProjectStorageBucketRegion region : values()) {
            ENUM_MAP.put(region.value, region);
        }
    }

    private final String value;

    ProjectStorageBucketRegion(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ProjectStorageBucketRegion fromValue(String value) {
        return ENUM_MAP.get(value.toLowerCase());
    }
}
