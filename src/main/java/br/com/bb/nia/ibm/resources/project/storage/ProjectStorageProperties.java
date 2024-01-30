package br.com.bb.nia.ibm.resources.project.storage;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class ProjectStorageProperties {
    @JsonbProperty("bucket_name")
    private String bucketName;
    @JsonbProperty("bucket_region")
    private String bucketRegion;
    private ProjectCredentialsFull credentials;
    @JsonbProperty("key_protect")
    private boolean keyProtect;

    public ProjectStorageProperties() {
    }

    @JsonbCreator
    public static ProjectStorageProperties create(
            @JsonbProperty("bucket_name") String bucketName,
            @JsonbProperty("bucket_region") String bucketRegion,
            @JsonbProperty("credentials") ProjectCredentialsFull credentials,
            @JsonbProperty("key_protect") boolean keyProtect) {
        return new ProjectStorageProperties(bucketName, bucketRegion, credentials, keyProtect);
    }

    public String getBucketName() {
        return bucketName;
    }

    public String getBucketRegion() {
        return bucketRegion;
    }

    public ProjectCredentialsFull getCredentials() {
        return credentials;
    }

    public boolean isKeyProtect() {
        return keyProtect;
    }

    private ProjectStorageProperties(String bucketName, String bucketRegion,
            ProjectCredentialsFull credentials, boolean keyProtect) {
        this.bucketName = bucketName;
        this.bucketRegion = bucketRegion;
        this.credentials = credentials;
        this.keyProtect = keyProtect;
    }
}
