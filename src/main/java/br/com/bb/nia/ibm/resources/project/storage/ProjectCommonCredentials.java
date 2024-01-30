package br.com.bb.nia.ibm.resources.project.storage;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class ProjectCommonCredentials {
    @JsonbProperty("api_key")
    private String apiKey;
    @JsonbProperty("service_id")
    private String serviceId;
    @JsonbProperty("access_key_id")
    private String accessKeyId;
    @JsonbProperty("secret_access_key")
    private String secretAccessKey;
    @JsonbProperty("resource_key_crn")
    private String resourceKeyCrn;

    public ProjectCommonCredentials() {
    }

    @JsonbCreator
    public static ProjectCommonCredentials create(
            @JsonbProperty("api_key") String apiKey,
            @JsonbProperty("service_id") String serviceId,
            @JsonbProperty("access_key_id") String accessKeyId,
            @JsonbProperty("secret_access_key") String secretAccessKey,
            @JsonbProperty("resource_key_crn") String resourceKeyCrn) {
        return new ProjectCommonCredentials(apiKey, serviceId, accessKeyId, secretAccessKey, resourceKeyCrn);
    }

    

    private ProjectCommonCredentials(String apiKey, String serviceId, String accessKeyId, String secretAccessKey,
            String resourceKeyCrn) {
        this.apiKey = apiKey;
        this.serviceId = serviceId;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
        this.resourceKeyCrn = resourceKeyCrn;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    public String getResourceKeyCrn() {
        return resourceKeyCrn;
    }
}
