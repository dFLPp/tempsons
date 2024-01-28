package ibm.project.ProjectStorage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectStorageProperties {
    @JsonProperty("bucket_name")
    private String bucketName;
    @JsonProperty("bucket_region")
    private ProjectStorageBucketRegion bucketRegion;
    private ProjectCredentialsFull credentials;
    @JsonProperty("key_protect")
    private boolean keyProtect;

    public ProjectStorageProperties() {
    }

    public String getBucketName() {
        return bucketName;
    }

    public ProjectStorageBucketRegion getBucketRegion() {
        return bucketRegion;
    }

    public ProjectCredentialsFull getCredentials() {
        return credentials;
    }

    public boolean isKeyProtect() {
        return keyProtect;
    }

    public ProjectStorageProperties(String bucketName, ProjectStorageBucketRegion bucketRegion,
            ProjectCredentialsFull credentials, boolean keyProtect) {
        this.bucketName = bucketName;
        this.bucketRegion = bucketRegion;
        this.credentials = credentials;
        this.keyProtect = keyProtect;
    }

    
    
    
}
