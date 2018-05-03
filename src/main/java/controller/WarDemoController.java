package controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WarDemoController {

    @RequestMapping(value = "/v1/test/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name){

        return "hello, " + name;
    }
}
