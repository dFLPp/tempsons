package ibm.space.SpaceStatus;

import java.util.List;
import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class SpaceErrorObject {
    private String code;
    private String message;
    private String more_info;
    private List<String> parameters;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getMore_info() {
        return more_info;
    }

    public List<String> getParameters() {
        return parameters;
    }

    @JsonbCreator
    public static SpaceErrorObject create(
            @JsonbProperty("code") String code,
            @JsonbProperty("message") String message,
            @JsonbProperty("more_info") String more_info,
            @JsonbProperty("parameters") List<String> parameters) {

        return new SpaceErrorObject(code, message, more_info, parameters);
    }

    // Construtor padrão (vazio) para acomodar a deserialização do Jsonb
    public SpaceErrorObject() {
    }

    private SpaceErrorObject(String code, String message, String more_info, List<String> parameters) {
        this.code = code;
        this.message = message;
        this.more_info = more_info;
        this.parameters = parameters;
    }
}
