package com.knoldus.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class LocalTimeService {
    public String getCurrentTime(){
       LocalTime time= LocalTime.now();
        int hour =time.getHour();
        int minute = time.getMinute();
        int seconds=time.getSecond();
        return hour+":"+minute+":"+seconds;
    }
}
