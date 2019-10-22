package com.imooc.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * Java 8 Lambda 循环实现 {@link CalculateService}
 *
 * @author dalongm
 * @date 2019/9/30 0:06
 */
@Profile("Java8")
@Service
public class Java8CalculateService implements CalculateService {

    @Override
    public Integer sum(Integer... values){
        System.out.println("Java 8 Lambda 循环实现");
        return Stream.of(values).reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        CalculateService calculateService = new Java8CalculateService();
        System.out.println("Sum 1-10 : "+calculateService.sum(1,2,3,4,5,6,7,8,9,10));
    }
}
