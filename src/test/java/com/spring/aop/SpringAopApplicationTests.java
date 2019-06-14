package com.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =SpringAopApplicationTests.class)
public class SpringAopApplicationTests {

    @Test
    public void contextLoads() {
    	System.out.println("测试");
    }

}
