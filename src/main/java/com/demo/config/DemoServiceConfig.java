package com.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(value={"com.demo.service"})
@MapperScan("com.demo.persist")
@EnableTransactionManagement(proxyTargetClass=true)
@EnableAsync
public class DemoServiceConfig {

}
