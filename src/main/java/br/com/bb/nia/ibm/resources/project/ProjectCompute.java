package br.com.bb.nia.ibm.resources.project;

import jakarta.json.JsonObject;
import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class ProjectCompute {
    private String type;
    private String guid;
    private String name;
    private JsonObject credentials;
    private String crn;
    private String label;

    public ProjectCompute() {
    }

    @JsonbCreator
    public static ProjectCompute create(
            @JsonbProperty("type") String type,
            @JsonbProperty("guid") String guid,
            @JsonbProperty("name") String name,
            @JsonbProperty("credentials") JsonObject credentials,
            @JsonbProperty("crn") String crn,
            @JsonbProperty("label") String label) {
        return new ProjectCompute(type, guid, name, credentials, crn, label);
    }

    private ProjectCompute(String type, String guid, String name, JsonObject credentials, String crn, String label) {
        this.type = type;
        this.guid = guid;
        this.name = name;
        this.credentials = credentials;
        this.crn = crn;
        this.label = label;
    }

    public String getType() {
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
}
