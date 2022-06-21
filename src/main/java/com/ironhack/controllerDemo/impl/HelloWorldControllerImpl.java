package com.ironhack.controllerDemo.impl;

import com.ironhack.controllerDemo.interfaces.HelloWorldController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HelloWorldControllerImpl implements HelloWorldController {

//    @RequestMapping(value = "/hello", method = RequestMethod.GET) //Forma general de hacer peticiones
    @GetMapping("/hello") //Forma resumida de hacer peticiones HTTP del tipo GET
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld(@RequestParam(name = "firstName", defaultValue = "Marga")
                                 Optional<String> optionalFirstName) {
        if(optionalFirstName.isPresent()){
            return "Hello " + optionalFirstName.get();
        }
        return "Hello World";
    }

//    @ResponseStatus(HttpStatus.OK)
//    public String helloWorld(@RequestParam(defaultValue = "Marga") Optional<String> firstName) { //Si pongo el mismo nombre de variable no hace falta que lo especifique
//        if(firstName.isPresent()){
//            return "Hello " + firstName.get();
//        }
//        return "Hello World";
//    }
}
