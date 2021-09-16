package com.marcelo.javaNotes.demo.timeStamp;

import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Time {
    Date date = new Date();

    public String getTimeToString(){
        System.out.println(date);
         String dateSt = date.toString();

        return dateSt;

    }

}
