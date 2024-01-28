package ibm.space;

public class Space {
    private Metadata metadata;
    private Entity entity;

    public Metadata getMetadata() {
        return metadata;
    }

    public Entity getEntity() {
        return entity;
    }

    public Space(ibm.space.Metadata metadata, Entity entity) {
        this.metadata = metadata;
        this.entity = entity;
    }

    public Space() {
    }
}
