package oose.ThomvanHeeswijk;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("stringer")
public class StringerControler {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String showPath(){
        return "Mijn eigen stringer";
    }

    @GET
    @Path("/reverse")
    @Produces(MediaType.APPLICATION_JSON)
    public String getReverse(@QueryParam("string") Stringer toReverse) {
        return toReverse.getReverse();
    }

    @POST
    @Path("/reverse")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Stringer postReverse(Stringer toReverse) {
        return toReverse;
    }

}
