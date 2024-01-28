package ibm.space.SpaceStorage;

public class SpaceStorage {
    private String type = "bmcos_object_storage";
    private SpaceStorageProperties properties;
    
    public SpaceStorage() {
    }

    public String getType() {
        return type;
    }
    public SpaceStorageProperties getProperties() {
        return properties;
    }
    public SpaceStorage(SpaceStorageProperties properties) {
        this.properties = properties;
    }
}
