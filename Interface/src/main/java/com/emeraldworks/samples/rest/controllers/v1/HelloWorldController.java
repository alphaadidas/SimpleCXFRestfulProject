package com.emeraldworks.samples.rest.controllers.v1;

import com.emeraldworks.samples.rest.resources.WorldResource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author gmatsu@emeraldworks.com
 */
@Path("/v1/world")

@Produces(value = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
public interface HelloWorldController {

    @GET    
    public Response getWorlds();

    
    @POST
    public Response createWorld(WorldResource world);


    @GET
    @Path("/{worldGuid}")
    public Response getWorld(@PathParam("worldGuid") String worldGuid);


}
