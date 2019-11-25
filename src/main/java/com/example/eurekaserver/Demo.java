package com.example.eurekaserver;

import org.springframework.stereotype.Component;

@Component
public class Demo {

    public String hello(){
        return "hi1";
    }

    public int getNum(){
        return 1;
    }
}
