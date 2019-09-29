package com.diveinspringboot.repository;

import com.diveinspringboot.annotation.FirstLevelRepository;
import com.diveinspringboot.annotation.SecondLevelRepository;

/**
 * @author dalongm
 * @date 2019/9/29 22:09
 * @description
 */

@SecondLevelRepository(value = "myFirstLevelRepository")
public class MyFirstLevelRepository {
}
