package ibm.space;

import java.util.List;

import ibm.space.SpaceMember.SpaceMember;
import ibm.space.SpaceStatus.SpaceStatus;
import ibm.space.SpaceStorage.SpaceStorage;
import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class Entity {
    private String name;
    private SpaceScope scope;
    private SpaceStatus status;
    private SpaceStage stage;
    private String type;
    private String description;
    private SpaceStorage storage;
    private List<SpaceCompute> compute;
    private List<SpaceMember> members;
    private List<String> tags;
    private String generator;

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

    public String getType() {
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

    @JsonbCreator
    public static Entity create(
            @JsonbProperty("name") String name,
            @JsonbProperty("scope") SpaceScope scope,
            @JsonbProperty("status") SpaceStatus status,
            @JsonbProperty("stage") SpaceStage stage,
            @JsonbProperty("type") String type,
            @JsonbProperty("description") String description,
            @JsonbProperty("storage") SpaceStorage storage,
            @JsonbProperty("compute") List<SpaceCompute> compute,
            @JsonbProperty("members") List<SpaceMember> members,
            @JsonbProperty("tags") List<String> tags,
            @JsonbProperty("generator") String generator) {

        return new Entity(name, scope, status, stage, type, description, storage, compute, members, tags, generator);
    }

    

    public Entity(String name, SpaceScope scope, SpaceStatus status, SpaceStage stage, String type, String description,
            SpaceStorage storage, List<SpaceCompute> compute, List<SpaceMember> members, List<String> tags,
            String generator) {
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

    // Construtor padrão (vazio) para acomodar a deserialização do Jsonb
    public Entity() {
    }
}
