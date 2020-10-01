package org.jefrajames.graphql;

import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello from REST";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("url")
    public URL quarkusURL() throws MalformedURLException {
        return new URL("http://quarkus.io");
    }
}