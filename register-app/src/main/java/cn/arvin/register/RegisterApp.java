package cn.arvin.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author weihai.xiao
 * @version 1.0
 * @date 2018/11/25 16:42
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterApp {
    public static void main(String[] args) {
        SpringApplication.run(RegisterApp.class,args);
    }
}
