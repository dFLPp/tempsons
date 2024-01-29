package br.com.bb.nia.ibm.resources.project.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectAdminCredentials {
    @JsonProperty("api_key")
    private String apikey;
    @JsonProperty("service_id")
    private String serviceId;
    @JsonProperty("access_key_id")
    private String accessKeyId;
    @JsonProperty("secret_access_key")
    private String secretAccessKey;

    public ProjectAdminCredentials() {
    }
    
    public ProjectAdminCredentials(String apikey, String serviceId, String accessKeyId, String secretAccessKey) {
        this.apikey = apikey;
        this.serviceId = serviceId;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
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

    
}
