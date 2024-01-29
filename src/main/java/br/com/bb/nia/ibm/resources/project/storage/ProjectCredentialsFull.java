package br.com.bb.nia.ibm.resources.project.storage;

public class ProjectCredentialsFull {
    private ProjectAdminCredentials admin;
    private ProjectCommonCredentials editor;
    private ProjectCommonCredentials viewer;
    
    public ProjectCredentialsFull() {
    }
    public ProjectCredentialsFull(ProjectAdminCredentials admin, ProjectCommonCredentials editor,
            ProjectCommonCredentials viewer) {
        this.admin = admin;
        this.editor = editor;
        this.viewer = viewer;
    }
    public ProjectAdminCredentials getAdmin() {
        return admin;
    }
    public ProjectCommonCredentials getEditor() {
        return editor;
    }
    public ProjectCommonCredentials getViewer() {
        return viewer;
    }
}
