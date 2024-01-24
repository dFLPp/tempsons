package ibm.space.SpaceStatus;

import java.util.List;

public class SpaceError {
    private String trace;
    private List<SpaceErrorObject> errors;
    public String getTrace() {
        return trace;
    }
    public List<SpaceErrorObject> getErrors() {
        return errors;
    }
    public SpaceError(String trace, List<SpaceErrorObject> errors) {
        this.trace = trace;
        this.errors = errors;
    }
    public SpaceError() {
    }
    @Override
    public String toString() {
        return "SpaceError [trace=" + trace + ", errors=" + errors.get(0).toString() + "]";
    }
    
}
