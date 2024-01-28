package ibm.space.SpaceStatus;

public class SpaceStatus {
    private SpaceStatusState state;
    private SpaceError failure;

    public SpaceStatusState getState() {
        return state;
    }

    public SpaceError getFailure() {
        return failure;
    }

    public SpaceStatus(SpaceStatusState state, SpaceError failure) {
        this.state = state;
        this.failure = failure;
    }

    public SpaceStatus() {
    }
}
