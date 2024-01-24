package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import services.SpaceService;

@Path("/spaces")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SpaceResource {

    @Inject
    SpaceService spaceService;

    @GET
    @Path("/")
    public Response teste(){
        try {
            spaceService.teste();
            return Response.noContent().build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    };
}
