package ibm.space;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpaceScope {
    @JsonProperty("bss_account_id")
    private String bssAccountId;

    public String getBssAccountId() {
        return bssAccountId;
    }

    public SpaceScope() {
    }

    public SpaceScope(String bssAccountId) {
        this.bssAccountId = bssAccountId;
    }
}
