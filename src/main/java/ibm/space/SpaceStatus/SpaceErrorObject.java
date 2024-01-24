package ibm.space.SpaceStatus;

import java.util.List;

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
    public SpaceErrorObject(String code, String message, String more_info, List<String> parameters) {
        this.code = code;
        this.message = message;
        this.more_info = more_info;
        this.parameters = parameters;
    }
    public SpaceErrorObject() {
    }
    @Override
    public String toString() {
        return "SpaceErrorObject [code=" + code + ", message=" + message + ", more_info=" + more_info + ", parameters="
                + parameters + "]";
    }

    
    
}
