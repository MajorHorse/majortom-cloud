package com.majortom.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/7/5 21:44
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixOrderFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(HystrixOrderFeignMain.class, args);
    }
}
