package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 仓储的引导类
 *
 * @author dalongm
 * @date 2019/9/29 22:07
 * @description
 */
@ComponentScan(basePackages = "com.diveinspringboot.repository")
public class RepositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE).run(args);

        // myFirstLevelRepository Bean是否存在
        MyFirstLevelRepository myFirstLevelRepository = context.getBean("myFirstLevelRepository",MyFirstLevelRepository.class);

        System.out.println("myFirstLevelRepository Bean: " + myFirstLevelRepository);

        // 关闭上下文
        context.close();
    }
}
