package com.qf.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-nacos-provider")
public interface IConsumeFegin {
    @RequestMapping("/providerDemo")
    public String providerDemo();
}
