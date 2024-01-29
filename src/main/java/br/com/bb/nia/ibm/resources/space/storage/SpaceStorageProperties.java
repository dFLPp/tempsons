package br.com.bb.nia.ibm.resources.space.storage;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class SpaceStorageProperties {
    @JsonbProperty("resource_crn")
    private String resourceCrn;
    private String guid;
    @JsonbProperty("bucket_name")
    private String bucketName;
    @JsonbProperty("bucket_region")
    private String bucketRegion;
    @JsonbProperty("endpoint_url")
    private String endpointUrl;
    private SpaceStorageCredentialsFull credentials;
    @JsonbProperty("key_protect")
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

    @JsonbCreator
    public static SpaceStorageProperties create(
            @JsonbProperty("resource_crn") String resourceCrn,
            @JsonbProperty("guid") String guid,
            @JsonbProperty("bucket_name") String bucketName,
            @JsonbProperty("bucket_region") String bucketRegion,
            @JsonbProperty("endpoint_url") String endpointUrl,
            @JsonbProperty("credentials") SpaceStorageCredentialsFull credentials,
            @JsonbProperty("key_protect") Boolean keyProtect) {
        return new SpaceStorageProperties(resourceCrn, guid, bucketName, bucketRegion, endpointUrl, credentials, keyProtect);
    }

    private SpaceStorageProperties(String resourceCrn, String guid, String bucketName, String bucketRegion,
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
