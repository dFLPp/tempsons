package ibm.space;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class SpaceScope {
    @JsonbProperty("bss_account_id")
    private String bssAccountId;

    public SpaceScope() {
    }

    public String getBssAccountId() {
        return bssAccountId;
    }
    
    @JsonbCreator
    public static SpaceScope create(@JsonbProperty("bss_account_id") String bssAccountId) {
        return new SpaceScope(bssAccountId);
    }

    private SpaceScope(String bssAccountId) {
        this.bssAccountId = bssAccountId;
    }
}

