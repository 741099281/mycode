package com.brx.demo.brxautoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther:
 * @Date: 星期五:2019/1/18 11
 * @Description:
 */
@ConfigurationProperties(prefix = "brx")
public class HelloProperties {

    private String weekend;

    private String name;


    public String getWeekend() {
        return weekend;
    }

    public void setWeekend(String weekend) {
        this.weekend = weekend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
