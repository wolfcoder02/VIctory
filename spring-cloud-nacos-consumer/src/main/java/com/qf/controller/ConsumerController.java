package com.qf.controller;

import com.qf.feign.IConsumeFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private IConsumeFegin iConsumeFegin;
    @RequestMapping("/consumerDemo")
    public String consumerDemo() {
        return "我是消费者" + iConsumeFegin.providerDemo();
    }
}
