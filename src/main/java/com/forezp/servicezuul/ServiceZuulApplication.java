package com.forezp.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul启动类
 * @author windows
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ServiceZuulApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }
}
