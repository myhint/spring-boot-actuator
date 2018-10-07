package com.example.actuator.springbootactuator.controller.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Blake on 2018/10/6
 */
@RestController
@RequestMapping("/api/actuator")
public class SprintBootActuatorController {

    @GetMapping("/hello")
    public String hello() {

        return "hello";
    }

}
