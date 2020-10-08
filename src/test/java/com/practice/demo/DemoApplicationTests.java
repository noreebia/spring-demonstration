package com.practice.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    void contextLoads() {
    }

    @Test
    public void jpaTest(){
        try{
            testService.setValueToZero();
            testService.modifyValue();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
