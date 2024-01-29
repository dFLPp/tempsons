package br.com.bb.nia.ibm.resources.space.status;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class SpaceStatus {
    private String state;
    private SpaceError failure;

    public String getState() {
        return state;
    }

    public SpaceError getFailure() {
        return failure;
    }

    @JsonbCreator
    public static SpaceStatus create(
            @JsonbProperty("state") String state,
            @JsonbProperty("failure") SpaceError failure) {

        return new SpaceStatus(state, failure);
    }

    // Construtor padrão (vazio) para acomodar a deserialização do Jsonb
    public SpaceStatus() {
    }

    private SpaceStatus(String state, SpaceError failure) {
        this.state = state;
        this.failure = failure;
    }
}
