package com.example.MA18demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/greeting")
public class GreetingController {


    @RequestMapping(method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue = "world") String name, @RequestParam(value="greet") String greet) {
        String strGreet = greet  + " " + name + "!";
        Greeting greeting = new Greeting(0, strGreet);

        return  greeting; //"Hello " + name + "!" ;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String deleteGreeting() {
        return "deleted";
    }

}
