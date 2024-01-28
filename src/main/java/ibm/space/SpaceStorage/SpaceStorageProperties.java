package ibm.space.SpaceStorage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpaceStorageProperties {
    @JsonProperty("resource_crn")
    private String resourceCrn;
    private String guid;
    @JsonProperty("bucket_name")
    private String bucketName;
    @JsonProperty("bucket_region")
    private String bucketRegion;
    @JsonProperty("endpoint_url")
    private String endpointUrl;
    private SpaceStorageCredentialsFull credentials;
    @JsonProperty("key_protect")
    private Boolean keyProtect;

    public String getResourceCrn() {
        return resourceCrn;
    }

    public String getGuid() {
        return guid;
    }

    public String getBucketName() {
        return bucketName;
    }

    public String getBucketRegion() {
        return bucketRegion;
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public SpaceStorageCredentialsFull getCredentials() {
        return credentials;
    }

    public Boolean getKeyProtect() {
        return keyProtect;
    }

    public SpaceStorageProperties() {
    }

    public SpaceStorageProperties(String resourceCrn, String guid, String bucketName, String bucketRegion,
            String endpointUrl, SpaceStorageCredentialsFull credentials, Boolean keyProtect) {
        this.resourceCrn = resourceCrn;
        this.guid = guid;
        this.bucketName = bucketName;
        this.bucketRegion = bucketRegion;
        this.endpointUrl = endpointUrl;
        this.credentials = credentials;
        this.keyProtect = keyProtect;
    }

}
