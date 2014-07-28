package com.rest.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@ApplicationPath("/web")
@Path("/api")
public class RestApi extends Application {
	@GET
	public String  lista() {
		System.out.println("listagem :::: ");
		return "ok";
	}
}
