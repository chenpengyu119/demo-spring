package com.example.demospring.primary;

import com.example.demospring.primary.Person;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author pengyu
 * @date 2021/3/25 15:59
 */
@Component

public class Student implements Person {

    @Override
    @Primary
    public void eat() {
        System.out.println("吃食堂");
    }
}
