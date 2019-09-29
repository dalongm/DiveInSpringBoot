package com.diveinspringboot.bootstrap;

import com.diveinspringboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link com.diveinspringboot.service.CalculateService}
 * @author dalongm
 * @date 2019/9/30 0:12
 */
@SpringBootApplication(scanBasePackages = "com.diveinspringboot.service")
public class CalculateServiceBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE).profiles("Java8").run(args);

        // myFirstLevelRepository Bean是否存在
        CalculateService calculateService = context.getBean(CalculateService.class);

        System.out.println("CalculateService sum(1...10): " + calculateService.sum(1,2,3,4,5,6,7,8,9,10));

        // 关闭上下文
        context.close();
    }
}
