package com.emeraldworks.samples.rest.controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author gmatsu@emeraldworks.com
 *
 */
@Path("/monitor")
@Produces(value = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
public interface MonitorController {

    /**
     * Service Instance HealthCheck
     *
      * @param key
     * @return
     */
    @GET
    public Response healthCheck(@QueryParam("key") String key);

}
