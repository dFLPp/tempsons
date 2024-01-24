package dto.request;

import jakarta.validation.constraints.NotBlank;

public class PLTSpacaCreationDTO {
    @NotBlank private String ambiente;
    @NotBlank private String projectId;

    public String getAmbiente() {
        return ambiente;
    }
    public String getProjectId() {
        return projectId;
    }
    public PLTSpacaCreationDTO(String ambiente, String projectId) {
        this.ambiente = ambiente;
        this.projectId = projectId;
    }

    
}
