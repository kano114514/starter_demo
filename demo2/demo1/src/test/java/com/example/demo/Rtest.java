package com.example.demo;

import com.example.demo.entity.Entity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author wuhaoyu
 * @date 2024/8/12  下午6:05
 * @description:
 */
@SpringBootTest
public class Rtest {
    @Autowired
    Entity ntity;
    @Test
    public void test() {
        System.out.println(ntity.getTest());
    }
}
