package com.imooc.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Java 7 for 循环实现 {@link CalculateService}
 *
 * @author dalongm
 * @date 2019/9/30 0:06
 */
@Profile("Java7")
@Service
public class Java7CalculateService implements CalculateService {

    @Override
    public Integer sum(Integer... values){
        System.out.println("Java 7 for 循环实现");
        int sum=0;
        for(int i=0;i<values.length;i++)
        {
            sum+=values[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        CalculateService calculateService = new Java7CalculateService();
        System.out.println("Sum 1-10 : "+calculateService.sum(1,2,3,4,5,6,7,8,9,10));
    }
}
