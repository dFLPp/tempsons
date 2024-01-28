package ibm.space;

public class SpaceCompute {
    private String name;
    private String crn;
    private String guid;
    private String type = "machine_learning";
    
    public SpaceCompute() {
    }
    public String getName() {
        return name;
    }
    public String getCrn() {
        return crn;
    }
    public String getGuid() {
        return guid;
    }
    public String getType() {
        return type;
    }
    public SpaceCompute(String name, String crn, String guid) {
        this.name = name;
        this.crn = crn;
        this.guid = guid;
    }
}
