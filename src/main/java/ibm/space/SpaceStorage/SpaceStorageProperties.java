package ibm.space.SpaceStorage;


public class SpaceStorageProperties {
    private String resource_crn;
    private String guid;
    private String bucket_name;
    private String bucket_region;
    private String endpoint_url;
    private SpaceStorageCredentialsFull credentials;
    private Boolean key_protect;
    
    
    @Override
    public String toString() {
        return "SpaceStorageProperties [resource_crn=" + resource_crn + ", guid=" + guid + ", bucket_name="
                + bucket_name + ", bucket_region=" + bucket_region + ", endpoint_url=" + endpoint_url + ", credentials="
                + credentials.toString() + ", key_protect=" + key_protect + "]";
    }
    public SpaceStorageProperties() {
    }
    public String getResource_crn() {
        return resource_crn;
    }
    public String getGuid() {
        return guid;
    }
    public String getBucket_name() {
        return bucket_name;
    }
    public String getBucket_region() {
        return bucket_region;
    }
    public String getEndpoint_url() {
        return endpoint_url;
    }
    public SpaceStorageCredentialsFull getCredentials() {
        return credentials;
    }
    public Boolean getKey_protect() {
        return key_protect;
    }
    public SpaceStorageProperties(String resource_crn, String guid, String bucket_name, String bucket_region,
            String endpoint_url, SpaceStorageCredentialsFull credentials, Boolean key_protect) {
        this.resource_crn = resource_crn;
        this.guid = guid;
        this.bucket_name = bucket_name;
        this.bucket_region = bucket_region;
        this.endpoint_url = endpoint_url;
        this.credentials = credentials;
        this.key_protect = key_protect;
    }

    
}
