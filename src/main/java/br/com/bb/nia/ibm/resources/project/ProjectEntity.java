package br.com.bb.nia.ibm.resources.project;

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

import br.com.bb.nia.ibm.generic.Github;
import br.com.bb.nia.ibm.resources.project.member.ProjectMember;
import br.com.bb.nia.ibm.resources.project.settings.ProjectSettings;
import br.com.bb.nia.ibm.resources.project.storage.ProjectStorage;

import java.util.List;

public class ProjectEntity {
    private String name;
    private String description;
    private String type;
    @JsonbProperty("public")
    private boolean isPublic;
    private String creator;
    @JsonbProperty("creator_iam_id")
    private String creatorIamId;
    private ProjectScope scope;
    private ProjectStorage storage;
    private List<ProjectCompute> compute;
    private Github github;
    private ProjectSettings settings;
    private List<ProjectMember> members;
    private List<String> tools;

    public ProjectEntity() {
    }

    @JsonbCreator
    public static ProjectEntity create(
            @JsonbProperty("name") String name,
            @JsonbProperty("description") String description,
            @JsonbProperty("type") String type,
            @JsonbProperty("public") boolean isPublic,
            @JsonbProperty("creator") String creator,
            @JsonbProperty("creator_iam_id") String creatorIamId,
            @JsonbProperty("scope") ProjectScope scope,
            @JsonbProperty("storage") ProjectStorage storage,
            @JsonbProperty("compute") List<ProjectCompute> compute,
            @JsonbProperty("github") Github github,
            @JsonbProperty("settings") ProjectSettings settings,
            @JsonbProperty("members") List<ProjectMember> members,
            @JsonbProperty("tools") List<String> tools) {
        return new ProjectEntity(name, description, type, isPublic, creator, creatorIamId, scope, storage, compute, github, settings, members, tools);
    }

    private ProjectEntity(String name, String description, String type, boolean isPublic, String creator,
            String creatorIamId, ProjectScope scope, ProjectStorage storage, List<ProjectCompute> compute,
            Github github, ProjectSettings settings, List<ProjectMember> members, List<String> tools) {
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

    public String getType() {
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

    public List<String> getTools() {
        return tools;
    }
}
