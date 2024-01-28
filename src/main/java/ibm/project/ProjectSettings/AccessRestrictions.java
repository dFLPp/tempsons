package ibm.project.ProjectSettings;

public class AccessRestrictions {
    private Boolean data;
    private AccessRestrictionsReporting reporting;
    public Boolean getData() {
        return data;
    }
    public AccessRestrictionsReporting getReporting() {
        return reporting;
    }
    public AccessRestrictions() {
    }
    public AccessRestrictions(Boolean data, AccessRestrictionsReporting reporting) {
        this.data = data;
        this.reporting = reporting;
    }
}
