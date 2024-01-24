package dto.request.SpaceCreationDTO;

public class SpaceStageRequest {
    private Boolean production = false;
    private String name;
    
    public SpaceStageRequest() {
    }
    public Boolean getProduction() {
        return production;
    }
    public String getName() {
        return name;
    }
    public SpaceStageRequest(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "SpaceStageRequest [production=" + production + ", name=" + name + "]";
    }
    
}
