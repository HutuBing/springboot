package com.sblearn.rabbitmq;

import com.sblearn.rabbitmq.sender.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestRabbitmq {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void testSend(){
        for(int i = 0; i < 10; i++){
            helloSender.send1();
            //helloSender.send2();
        }
    }
}
