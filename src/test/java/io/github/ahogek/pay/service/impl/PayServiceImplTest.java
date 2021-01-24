package io.github.ahogek.pay.service.impl;

import io.github.ahogek.pay.PayApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

class PayServiceImplTest extends PayApplicationTests {

    @Autowired
    private PayServiceImpl payServiceImpl;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    void create() {
        // BigDecimal.valueOf(0.01) & new BigDecimal("0.01") 千万不要用 new BigDecimal(0.01)
        // payService.create("ahogek-000001", BigDecimal.valueOf(0.01));
    }

    @Test
    void sendMqMsg() {
        amqpTemplate.convertAndSend("payNotify", "Hello World");
    }
}