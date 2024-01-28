package ibm.project;

import io.vertx.core.json.JsonObject;

public class ProjectCompute {
    private ProjectComputeType type;
    private String guid;
    private String name;
    private JsonObject credentials;
    private String crn;
    private String label;

    public ProjectCompute() {
    }

    public ProjectComputeType getType() {
        return type;
    }

    public String getGuid() {
        return guid;
    }

    public String getName() {
        return name;
    }

    public JsonObject getCredentials() {
        return credentials;
    }

    public String getCrn() {
        return crn;
    }

    public String getLabel() {
        return label;
    }

    public ProjectCompute(ProjectComputeType type, String guid, String name, JsonObject credentials, String crn,
            String label) {
        this.type = type;
        this.guid = guid;
        this.name = name;
        this.credentials = credentials;
        this.crn = crn;
        this.label = label;
    }
    
    
    
}
