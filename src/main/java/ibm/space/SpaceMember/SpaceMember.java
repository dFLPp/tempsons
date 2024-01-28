package ibm.space.SpaceMember;

public class SpaceMember {
    private SpaceMemberRole role;
    private String id;
    private SpaceMemberState state;
    private SpaceMemberType type;

    public SpaceMember() {
    }
    public SpaceMemberRole getRole() {
        return role;
    }
    public String getId() {
        return id;
    }
    public SpaceMemberState getState() {
        return state;
    }
    public SpaceMemberType getType() {
        return type;
    }
    public SpaceMember(SpaceMemberRole role, String id, SpaceMemberState state, SpaceMemberType type) {
        this.role = role;
        this.id = id;
        this.state = state;
        this.type = type;
    }
}
