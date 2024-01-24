package dto.request.SpaceCreationDTO;

import jakarta.validation.constraints.NotBlank;

public class SpaceComputeRequest {
    @NotBlank private String name;
    @NotBlank private String crn;

    
    public SpaceComputeRequest() {
    }
    public String getName() {
        return name;
    }
    public String getCrn() {
        return crn;
    }
    public SpaceComputeRequest(@NotBlank String name, @NotBlank String crn) {
        this.name = name;
        this.crn = crn;
    }
    @Override
    public String toString() {
        return "SpaceComputeRequest [name=" + name + ", crn=" + crn + "]";
    }
    
}
