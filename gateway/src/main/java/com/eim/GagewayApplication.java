package com.eim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Zy on 2019/2/28.
 */
@EnableZuulProxy
@SpringBootApplication
public class GagewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GagewayApplication.class,args);
    }
}
