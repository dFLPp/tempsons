package br.com.bb.nia.ibm.resources.project.storage;

import jakarta.json.bind.annotation.JsonbCreator;

public class ProjectCredentialsFull {
    private ProjectAdminCredentials admin;
    private ProjectCommonCredentials editor;
    private ProjectCommonCredentials viewer;
    
    public ProjectCredentialsFull() {
    }

    @JsonbCreator
    public static ProjectCredentialsFull create(
            ProjectAdminCredentials admin,
            ProjectCommonCredentials editor,
            ProjectCommonCredentials viewer) {
        return new ProjectCredentialsFull(admin, editor, viewer);
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

    private ProjectCredentialsFull(ProjectAdminCredentials admin, ProjectCommonCredentials editor,
            ProjectCommonCredentials viewer) {
        this.admin = admin;
        this.editor = editor;
        this.viewer = viewer;
    }

    
}
