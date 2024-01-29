package br.com.bb.nia.ibm.resources.project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum ProjectTools {
    JUPYTER_NOTEBOOKS("jupyter_notebooks"),
    WATSON_VISUAL_RECOGNITION("watson_visual_recognition"),
    DASHBOARDS("dashboards"),
    STREAMS_DESIGNER("streams_designer"),
    SPSS_MODELER("spss_modeler"),
    EXPERIMENTS("experiments"),
    DATA_REFINERY("data_refinery");

    private static final Map<String, ProjectTools> VALUE_MAP = new HashMap<>();

    static {
        for (ProjectTools tool : ProjectTools.values()) {
            VALUE_MAP.put(tool.value, tool);
        }
    }

    private final String value;

    ProjectTools(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ProjectTools fromValue(String value) {
        return VALUE_MAP.get(value.toLowerCase());
    }
}
