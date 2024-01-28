package ibm.project;

public class Project {
    private Metadata metadata;
    private Entity entity;

    public Project() {
    }

    public Project(Metadata metadata, Entity entity) {
        this.metadata = metadata;
        this.entity = entity;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public Entity getEntity() {
        return entity;
    }
}
