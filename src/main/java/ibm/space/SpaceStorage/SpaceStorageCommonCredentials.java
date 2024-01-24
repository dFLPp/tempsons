package ibm.space.SpaceStorage;

public class SpaceStorageCommonCredentials {
    private String api_key;
    private String service_id;
    private String access_key_id;
    private String secret_access_key;
    private String resource_key_crn;
    
    public String getApi_key() {
        return api_key;
    }
    public String getService_id() {
        return service_id;
    }
    public String getAccess_key_id() {
        return access_key_id;
    }
    public String getSecret_access_key() {
        return secret_access_key;
    }
    public String getResource_key_crn() {
        return resource_key_crn;
    }
    public SpaceStorageCommonCredentials(String api_key, String service_id, String access_key_id,
            String secret_access_key, String resource_key_crn) {
        this.api_key = api_key;
        this.service_id = service_id;
        this.access_key_id = access_key_id;
        this.secret_access_key = secret_access_key;
        this.resource_key_crn = resource_key_crn;
    }
    public SpaceStorageCommonCredentials() {
    }
    @Override
    public String toString() {
        return "SpaceStorageCommonCredentials [api_key=" + api_key + ", service_id=" + service_id + ", access_key_id="
                + access_key_id + ", secret_access_key=" + secret_access_key + ", resource_key_crn=" + resource_key_crn
                + "]";
    }
    
}
