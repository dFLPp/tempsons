package ibm.project.ProjectSettings;

public class AccessRestrictionsReporting {
    private boolean authorized;

    public boolean isAuthorized() {
        return authorized;
    }

    public AccessRestrictionsReporting() {
    }

    public AccessRestrictionsReporting(boolean authorized) {
        this.authorized = authorized;
    }

    
}
