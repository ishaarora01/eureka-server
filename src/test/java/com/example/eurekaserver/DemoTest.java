package com.example.eurekaserver;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.stereotype.Component;

@RunWith(MockitoJUnitRunner.class)
public class DemoTest {

    @InjectMocks
    Demo demo;

    @Test
    public void hello(){
        Assert.assertEquals("hi1", demo.hello());
    }

    @Test
    public void getNum(){
        Assert.assertEquals(1, demo.getNum());
    }
}
