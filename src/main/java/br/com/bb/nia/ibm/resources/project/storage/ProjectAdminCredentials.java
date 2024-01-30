package br.com.bb.nia.ibm.resources.project.storage;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class ProjectAdminCredentials {
    @JsonbProperty("api_key")
    private String apiKey;
    @JsonbProperty("service_id")
    private String serviceId;
    @JsonbProperty("access_key_id")
    private String accessKeyId;
    @JsonbProperty("secret_access_key")
    private String secretAccessKey;

    public ProjectAdminCredentials() {
    }

    @JsonbCreator
    public static ProjectAdminCredentials create(
            @JsonbProperty("api_key") String apiKey,
            @JsonbProperty("service_id") String serviceId,
            @JsonbProperty("access_key_id") String accessKeyId,
            @JsonbProperty("secret_access_key") String secretAccessKey) {
        return new ProjectAdminCredentials(apiKey, serviceId, accessKeyId, secretAccessKey);
    }

    private ProjectAdminCredentials(String apiKey, String serviceId, String accessKeyId, String secretAccessKey) {
        this.apiKey = apiKey;
        this.serviceId = serviceId;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
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
}
