package com.example.demo.controllers;

import com.example.demo.services.WeekDayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeekDayController {
    @GetMapping("/amir")
    @ResponseBody
    public double getWeekDay() {
        WeekDayService service = new WeekDayService();
        return service.getWeekDay();
    }

}
