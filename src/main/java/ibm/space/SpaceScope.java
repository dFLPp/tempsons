package ibm.space;

public class SpaceScope {
    private String bss_account_id;

    public String getBss_account_id() {
        return bss_account_id;
    }
    
    public SpaceScope() {
    }

    @Override
    public String toString() {
        return "SpaceScope [bss_account_id=" + bss_account_id + "]";
    }

    public SpaceScope(String bss_account_id) {
        this.bss_account_id = bss_account_id;
    }
    
}
