package spring.app.mystorebk.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
        value = "test",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE }
)
public class TestAppController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String test(){
        return "App running successfully";
    }
}
