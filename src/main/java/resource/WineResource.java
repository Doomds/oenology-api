package resource;

import entity.Wine;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import service.WineService;

import java.util.List;

@Path("/wines")
@Consumes(MediaType.APPLICATION_JSON)
public class WineResource {

    @Inject
    WineService wineService;

    @GET
    public List<Wine> GetWinesPaginated(@QueryParam("page") Integer page, @QueryParam("size") Integer size)
    {
        if (page == null || size == null) {
            return wineService.GetAllWines();
        }

        return wineService.getWinesPaginated(page, size);
    }

}
