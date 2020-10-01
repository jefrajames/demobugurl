package org.jefrajames.graphql;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class HelloGraphQL {

    @Query
    public String hello() {
        return "Hello from GrahQL";
    }

    @Query
    public URL quarkusURL() throws MalformedURLException {
        return new URL("http://quarkus.io");
    }

}