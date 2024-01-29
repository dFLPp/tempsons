package resources;

import br.com.bb.nia.ibm.resources.space.Space;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
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
    public Response teste_deserializacao(){
        try {
            return Response.ok(spaceService.teste()).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    };

    @POST
    @Path("/")
    public Response teste_serializacao(Space space){
        System.out.println(space.getMetadata().getCreatedAt());
        try {
            return Response.status(Response.Status.CREATED).entity(spaceService.teste_json(space)).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    };
}
