package ibm.space.SpaceStorage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpaceStorageAdminCredentials {
    @JsonProperty("api_key")
    private String apiKey;
    @JsonProperty("service_id")
    private String serviceId;
    @JsonProperty("access_key_id")
    private String accessKeyId;
    @JsonProperty("secret_access_key")
    private String secretAccessKey;

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

    public SpaceStorageAdminCredentials() {
    }

    public SpaceStorageAdminCredentials(String apiKey, String serviceId, String accessKeyId, String secretAccessKey) {
        this.apiKey = apiKey;
        this.serviceId = serviceId;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
    }

}
