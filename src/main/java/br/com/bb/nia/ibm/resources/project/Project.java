package br.com.bb.nia.ibm.resources.project;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

public class Project {
    private ProjectMetadata metadata;
    private ProjectEntity entity;

    public Project() {
    }

    @JsonbCreator
    public static Project create(
            @JsonbProperty("metadata") ProjectMetadata metadata,
            @JsonbProperty("entity") ProjectEntity entity) {
        return new Project(metadata, entity);
    }

    private Project(ProjectMetadata metadata, ProjectEntity entity) {
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
