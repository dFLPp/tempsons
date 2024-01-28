package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import services.ProjectService;

@Path("/projects")
@Produces(MediaType.APPLICATION_JSON)
public class ProjectResource {
    @Inject
    ProjectService projectService;

    @GET
    @Path("/")
    public Response test(){
        projectService.teste();
        return Response.noContent().build();
    }
}
