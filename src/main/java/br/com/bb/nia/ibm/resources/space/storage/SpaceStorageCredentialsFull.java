package br.com.bb.nia.ibm.resources.space.storage;

import jakarta.json.bind.annotation.JsonbCreator;

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

    @JsonbCreator
    public static SpaceStorageCredentialsFull create(
            SpaceStorageCommonCredentials viewer,
            SpaceStorageCommonCredentials editor,
            SpaceStorageAdminCredentials admin) {
        return new SpaceStorageCredentialsFull(viewer, editor, admin);
    }

    private SpaceStorageCredentialsFull(SpaceStorageCommonCredentials viewer, SpaceStorageCommonCredentials editor,
            SpaceStorageAdminCredentials admin) {
        this.viewer = viewer;
        this.editor = editor;
        this.admin = admin;
    }

    public SpaceStorageCredentialsFull() {
    }
}
