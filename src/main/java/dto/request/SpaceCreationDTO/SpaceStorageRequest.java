package dto.request.SpaceCreationDTO;

import jakarta.validation.constraints.NotBlank;

public class SpaceStorageRequest {
    @NotBlank private String resource_crn;
    private Boolean delegated = false;
    
    public SpaceStorageRequest() {
    }
    public String getResource_crn() {
        return resource_crn;
    }
    public Boolean getDelegated() {
        return delegated;
    }
    public SpaceStorageRequest(String resource_crn) {
        this.resource_crn = resource_crn;
    }
    @Override
    public String toString() {
        return "SpaceStorageRequest [resource_crn=" + resource_crn + ", delegated=" + delegated + "]";
    }
    
    
}
