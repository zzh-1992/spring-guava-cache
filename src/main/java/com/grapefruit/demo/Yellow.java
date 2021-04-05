package com.grapefruit.demo;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;

@Getter
@Setter
public class Yellow {


    private int i;
    private String j;
    public Yellow() {
        System.out.println("Yellow constructor===>");
        System.out.println("i:" + i + " j:" + j);
    }

    @PostConstruct
    public void init(){
        System.out.println("Yellow init===>");
        i = 1;
        j = "hello";
    }
}
