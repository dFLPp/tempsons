package dto.request.SpaceCreationDTO;

import java.util.List;
import jakarta.validation.constraints.NotBlank;

public class SpaceCreationDTO {
    @NotBlank private String name;
    private String description;
    private SpaceStorageRequest storage;
    private List<SpaceComputeRequest> compute;
    private List<String> tags;
    private String generator;
    private SpaceStageRequest stage;
    private String type = "cpd";

    public SpaceCreationDTO() {
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public SpaceStorageRequest getStorage() {
        return storage;
    }
    public List<SpaceComputeRequest> getCompute() {
        return compute;
    }
    public List<String> getTags() {
        return tags;
    }
    public String getGenerator() {
        return generator;
    }
    public SpaceStageRequest getStage() {
        return stage;
    }
    public String getType() {
        return type;
    }
    public SpaceCreationDTO(@NotBlank String name, String description, SpaceStorageRequest storage,
            List<SpaceComputeRequest> compute, List<String> tags, String generator, SpaceStageRequest stage) {
        this.name = name;
        this.description = description;
        this.storage = storage;
        this.compute = compute;
        this.tags = tags;
        this.generator = generator;
        this.stage = stage;
    }
    @Override
    public String toString() {
        return "SpaceCreationDTO [name=" + name + ", description=" + description + ", storage=" + storage.toString() + ", compute="
                + compute.get(0).toString() + ", tags=" + tags.get(0) + ", generator=" + generator + ", stage=" + stage.toString() + ", type=" + type + "]";
    }

    
    
}
