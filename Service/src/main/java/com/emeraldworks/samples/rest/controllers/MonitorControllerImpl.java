package com.emeraldworks.samples.rest.controllers;

import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;

/**
 *
 */
@Service("monitorController")
public class MonitorControllerImpl  implements MonitorController{


    public Response healthCheck(String key) {

        return Response.ok().build();
    }

}
