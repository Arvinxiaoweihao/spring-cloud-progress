package cn.arvin.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

/**
 * @author weihai.xiao
 * @version 1.0
 * @date 2018/11/25 17:24
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class AdminApp {

    private static Logger logger = LoggerFactory.getLogger(AdminApp.class);

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(AdminApp.class, args);
        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
        for (String profile : activeProfiles) {
            logger.warn("Spring Boot 使用profile为:{}" , profile);
        }
    }
}
