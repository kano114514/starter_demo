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
    Entity myentity;
    @Test
    public void test() {
        System.out.println(myentity.getName());
    }
}
