package br.com.bb.nia.ibm.resources.project;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.bb.nia.ibm.generic.Github;
import br.com.bb.nia.ibm.resources.project.member.ProjectMember;
import br.com.bb.nia.ibm.resources.project.settings.ProjectSettings;
import br.com.bb.nia.ibm.resources.project.storage.ProjectStorage;

import java.util.List;

public class ProjectEntity {
    private String name;
    private String description;
    private ProjectType type;
    @JsonProperty("public")
    private boolean isPublic;
    private String creator;
    @JsonProperty("creator_iam_id")
    private String creatorIamId;
    private ProjectScope scope;
    private ProjectStorage storage;
    private List<ProjectCompute> compute;
    private Github github;
    private ProjectSettings settings;
    private List<ProjectMember> members;
    private List<ProjectTools> tools;

    public ProjectEntity() {
    }

    public ProjectEntity(String name, String description, ProjectType type, boolean isPublic, String creator,
            String creatorIamId, ProjectScope scope, ProjectStorage storage, List<ProjectCompute> compute,
            Github github, ProjectSettings settings, List<ProjectMember> members, List<ProjectTools> tools) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.isPublic = isPublic;
        this.creator = creator;
        this.creatorIamId = creatorIamId;
        this.scope = scope;
        this.storage = storage;
        this.compute = compute;
        this.github = github;
        this.settings = settings;
        this.members = members;
        this.tools = tools;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ProjectType getType() {
        return type;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public String getCreator() {
        return creator;
    }

    public String getCreatorIamId() {
        return creatorIamId;
    }

    public ProjectScope getScope() {
        return scope;
    }

    public ProjectStorage getStorage() {
        return storage;
    }

    public List<ProjectCompute> getCompute() {
        return compute;
    }

    public Github getGithub() {
        return github;
    }

    public ProjectSettings getSettings() {
        return settings;
    }

    public List<ProjectMember> getMembers() {
        return members;
    }

    public List<ProjectTools> getTools() {
        return tools;
    }
    
    
}

