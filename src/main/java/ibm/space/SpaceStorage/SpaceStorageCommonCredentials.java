package ibm.space.SpaceStorage;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class SpaceStorageCommonCredentials {
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

    public SpaceStorageCommonCredentials() {
    }

    @JsonbCreator
    public static SpaceStorageCommonCredentials create(
            @JsonbProperty("api_key") String apiKey,
            @JsonbProperty("service_id") String serviceId,
            @JsonbProperty("access_key_id") String accessKeyId,
            @JsonbProperty("secret_access_key") String secretAccessKey,
            @JsonbProperty("resource_key_crn") String resourceKeyCrn) {
        return new SpaceStorageCommonCredentials(apiKey, serviceId, accessKeyId, secretAccessKey, resourceKeyCrn);
    }

    private SpaceStorageCommonCredentials(String apiKey, String serviceId, String accessKeyId, String secretAccessKey,
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
