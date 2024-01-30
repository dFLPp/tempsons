package resources;

import br.com.bb.nia.ibm.resources.project.Project;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
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
        return Response.ok(projectService.teste()).build();
    }

    @POST
    @Path("/")
    public Response test_json(Project projeto){
        return Response.status(Response.Status.CREATED).entity(projectService.teste_json(projeto)).build();
    }
}
