package com.brx.demo.brxautoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnWebApplication
public class BrxautoconfigApplication {

    @Autowired
    HelloProperties helloProperties;

    @Bean
    HelloService helloService(){
        HelloService helloService =  new HelloService();
        helloService.setHelloProperties(helloProperties);
        return helloService;
    }
}

