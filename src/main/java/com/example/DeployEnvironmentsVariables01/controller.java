package com.example.DeployEnvironmentsVariables01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    Environment environment;

    @GetMapping("/get")
    public String getMessage(){
        String message = environment.getProperty("varTree.authCode")+ environment.getProperty("varTree.devName");

        return "welcome " + message;
    }
}
