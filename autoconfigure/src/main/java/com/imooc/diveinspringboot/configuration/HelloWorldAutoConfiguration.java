package com.imooc.diveinspringboot.configuration;

import com.diveinspringboot.annotation.EnableHelloWorld;
import com.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld 自动装配
 *
 * @author dalongm
 * @date 2019/10/20 16:01
 */
@Configuration // Spring 模式注解装配
@EnableHelloWorld // Spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name", value="dalong") // 条件装配
public class HelloWorldAutoConfiguration {
}
