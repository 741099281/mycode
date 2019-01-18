package com.brx.demo.brxautoconfig;

import com.brx.demo.brxautoconfig.HelloProperties;
import com.sun.javafx.binding.StringFormatter;

/**
 * @Auther:
 * @Date: 星期五:2019/1/18 11
 * @Description:
 */

public class HelloService {

    private HelloProperties helloProperties;


    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public String hello(){
        return StringFormatter.format("%s:你好，%s欢迎光临",helloProperties.getWeekend(),helloProperties.getName()).getValue();
    }
}
