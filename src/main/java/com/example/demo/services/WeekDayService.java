package com.example.demo.services;

import java.time.LocalDateTime;

public class WeekDayService {
    public double getWeekDay() {
        LocalDateTime dateNOW = LocalDateTime.now();

        int q = dateNOW.getDayOfMonth();
        int m = dateNOW.getMonthValue();
        int y = dateNOW.getYear()/100;
        int k = dateNOW.getYear()%100;

        double floorM = Math.floor((13*(m+1))/5);

        double floorK = Math.floor(k/4);

        double floorY = Math.floor(y/4);

        double h = ((q+floorM+k+floorK+floorY-2*y)%7);

        double d = ((h+5)%7)+1;

        return d;
    }
}
