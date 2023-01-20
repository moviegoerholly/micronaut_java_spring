package store_svc.web;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.MediaType;

@Controller("/hello")
public class HelloWorldController {
    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloMicronaut() {
        return "Hello, Micronaut!";
    }
}
