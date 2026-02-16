package resource;

import entity.Oenologist;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import service.OenologistService;

import java.util.List;

@Path("/oenologist")
@Consumes(MediaType.APPLICATION_JSON)
public class OenologistResource {

    @Inject
    OenologistService oenologistService;

    @GET
    public List<Oenologist> getOenologists(@QueryParam("page") Integer page, @QueryParam("size") Integer size) {
        if (page == null || size == null) {
            return oenologistService.getAllOenologists();
        }

        return oenologistService.getOenologistsPaginated(page, size);
    }

}
