package com.knoldus.controller;

import com.knoldus.Service.LocalTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    LocalTimeService localTime;
    @GetMapping("/status")
    String getCurrentTime(){

        return "Running,"+"{"+localTime.getCurrentTime()+"}";
    }
}
