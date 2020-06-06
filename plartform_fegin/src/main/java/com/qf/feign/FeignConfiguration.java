package com.qf.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * 所有配置到启动类上的东西 @Bean @Enablexxxx
 * 都可以配置到@Configuration这个注解标记的类中
 */
@Configuration
@EnableFeignClients("com.qf.feign")
public class FeignConfiguration {
}
