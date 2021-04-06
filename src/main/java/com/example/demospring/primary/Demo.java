package com.example.demospring.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author pengyu
 * @date 2021/3/25 16:00
 */
@Component
public class Demo {


    @Autowired
    private Person person;

    @PostConstruct
    public void demo1(){
        person.eat();
    }
}
