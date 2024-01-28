package ibm.space;

public class SpaceStage {
    private Boolean production;
    private String name;

    public SpaceStage() {
    }
    public Boolean getProduction() {
        return production;
    }
    public String getName() {
        return name;
    }
    public SpaceStage(Boolean production, String name) {
        this.production = production;
        this.name = name;
    }
    
}
