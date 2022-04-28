package test;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/hello")
public class HelloController {

    @GET
    public int hello() {
        return 1;
    }
}
