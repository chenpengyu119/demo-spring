package com.example.demospring.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author pengyu
 * @date 2021/3/25 15:59
 */

@Component
public class Boss implements Person {
    @Override
    public void eat() {
        System.out.println("吃鲍鱼");
    }
}
