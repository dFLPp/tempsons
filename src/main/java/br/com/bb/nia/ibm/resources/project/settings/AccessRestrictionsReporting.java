package br.com.bb.nia.ibm.resources.project.settings;

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
