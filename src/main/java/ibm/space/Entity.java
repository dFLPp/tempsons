package ibm.space;

import java.util.List;

import ibm.space.SpaceStatus.SpaceStatus;
import ibm.space.SpaceStorage.SpaceStorage;
import ibm.space.spaceMember.SpaceMember;

public class Entity {
    private String name;
    private SpaceScope scope;
    private SpaceStatus status;
    private SpaceStage stage;
    private SpaceType type;
    private String description;
    private SpaceStorage storage;
    private List<SpaceCompute> compute;
    private List<SpaceMember> members;
    private List<String> tags;
    private String generator;
    

    @Override
    public String toString() {
        return "Entity [name=" + name + ", scope=" + scope.toString() + ", status=" + status.toString() + ", stage=" + stage.toString() + ", type="
                + type + ", description=" + description + ", storage=" + storage.toString() + ", compute=" + compute.get(0).toString() + ", members="
                + members.get(0).toString() + ", tags=" + tags.get(0) + ", generator=" + generator + "]";
    }
    public Entity() {
    }
    public String getName() {
        return name;
    }
    public SpaceScope getScope() {
        return scope;
    }
    public SpaceStatus getStatus() {
        return status;
    }
    public SpaceStage getStage() {
        return stage;
    }
    public SpaceType getType() {
        return type;
    }
    public String getDescription() {
        return description;
    }
    public SpaceStorage getStorage() {
        return storage;
    }
    public List<SpaceCompute> getCompute() {
        return compute;
    }
    public List<SpaceMember> getMembers() {
        return members;
    }
    public List<String> getTags() {
        return tags;
    }
    public String getGenerator() {
        return generator;
    }
    public Entity(String name, SpaceScope scope, SpaceStatus status, SpaceStage stage, SpaceType type,
            String description, SpaceStorage storage, List<SpaceCompute> compute, List<SpaceMember> members,
            List<String> tags, String generator) {
        this.name = name;
        this.scope = scope;
        this.status = status;
        this.stage = stage;
        this.type = type;
        this.description = description;
        this.storage = storage;
        this.compute = compute;
        this.members = members;
        this.tags = tags;
        this.generator = generator;
    }
}