package com.deploy.simple.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class MainController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String requestIndex() {
        return "hello spring!!!";
    }
    
}
