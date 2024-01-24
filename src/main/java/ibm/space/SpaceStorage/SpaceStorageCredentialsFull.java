package ibm.space.SpaceStorage;

public class SpaceStorageCredentialsFull {
    private SpaceStorageCommonCredentials viewer;
    private SpaceStorageCommonCredentials editor;
    private SpaceStorageAdminCredentials admin;
    
    public SpaceStorageCommonCredentials getViewer() {
        return viewer;
    }
    public SpaceStorageCommonCredentials getEditor() {
        return editor;
    }
    public SpaceStorageAdminCredentials getAdmin() {
        return admin;
    }
    public SpaceStorageCredentialsFull(SpaceStorageCommonCredentials viewer, SpaceStorageCommonCredentials editor,
            SpaceStorageAdminCredentials admin) {
        this.viewer = viewer;
        this.editor = editor;
        this.admin = admin;
    }
    public SpaceStorageCredentialsFull() {
    }
    @Override
    public String toString() {
        return "SpaceStorageCredentialsFull [viewer=" + viewer.toString() + ", editor=" + editor.toString() + ", admin=" + admin.toString() + "]";
    }

    

    
}
