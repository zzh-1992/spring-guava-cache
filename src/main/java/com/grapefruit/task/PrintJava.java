package com.grapefruit.task;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Component
public class PrintJava {
    public void print(){
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss"));
        System.out.println(time + ": java");
    }

}
