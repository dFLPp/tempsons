package ibm.space.SpaceStatus;

import java.util.List;
import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class SpaceError {
    private String trace;
    private List<SpaceErrorObject> errors;

    public String getTrace() {
        return trace;
    }

    public List<SpaceErrorObject> getErrors() {
        return errors;
    }

    @JsonbCreator
    public static SpaceError create(
            @JsonbProperty("trace") String trace,
            @JsonbProperty("errors") List<SpaceErrorObject> errors) {

        return new SpaceError(trace, errors);
    }

    // Construtor padrão (vazio) para acomodar a deserialização do Jsonb
    public SpaceError() {
    }

    private SpaceError(String trace, List<SpaceErrorObject> errors) {
        this.trace = trace;
        this.errors = errors;
    }
}
