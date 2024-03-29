package com.imooc.diveinspringboot.annotation;

import java.lang.annotation.*;

/**
 * @author dalongm
 * @date 2019/9/29 22:29
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {

    String value() default "";
}
