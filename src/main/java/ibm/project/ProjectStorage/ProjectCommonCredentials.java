package ibm.project.ProjectStorage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectCommonCredentials {
    @JsonProperty("api_key")
    private String apikey;
    @JsonProperty("service_id")
    private String serviceId;
    @JsonProperty("access_key_id")
    private String accessKeyId;
    @JsonProperty("secret_access_key")
    private String secretAccessKey;
    @JsonProperty("resource_key_crn")
    private String resourceKeyCrn;
    
    public ProjectCommonCredentials() {
    }
    
    public ProjectCommonCredentials(String apikey, String serviceId, String accessKeyId, String secretAccessKey,
            String resourceKeyCrn) {
        this.apikey = apikey;
        this.serviceId = serviceId;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
        this.resourceKeyCrn = resourceKeyCrn;
    }
    public String getApikey() {
        return apikey;
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
