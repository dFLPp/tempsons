package br.com.bb.nia.ibm.resources.project;

public class Project {
    private ProjectMetadata metadata;
    private ProjectEntity entity;

    public Project() {
    }

    public Project(ProjectMetadata metadata, ProjectEntity entity) {
        this.metadata = metadata;
        this.entity = entity;
    }

    public ProjectMetadata getMetadata() {
        return metadata;
    }

    public ProjectEntity getEntity() {
        return entity;
    }
}
