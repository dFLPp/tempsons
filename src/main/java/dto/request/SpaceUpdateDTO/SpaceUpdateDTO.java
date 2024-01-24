package dto.request.SpaceUpdateDTO;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.validation.constraints.NotBlank;

public class SpaceUpdateDTO {
    @NotBlank private String op = "replace";
    @NotBlank private String path = "/description";
    private String value;

    public SpaceUpdateDTO() {
    }
    public String getOp() {
        return op;
    }
    public String getPath() {
        return path;
    }
    public String getValue() {
        return value;
    }

    @JsonbCreator
    public SpaceUpdateDTO(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "SpaceUpdateDTO [op=" + op + ", path=" + path + ", value=" + value + "]";
    }



}
