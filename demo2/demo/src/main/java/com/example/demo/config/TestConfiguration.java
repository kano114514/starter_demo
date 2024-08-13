package com.example.demo.config;

import com.example.demo.entity.Entity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuhaoyu
 * @date 2024/8/12  下午5:23
 * @description:
 */

@Configuration
public class TestConfiguration {
    @Bean
    public Entity myentity(){
        return new Entity("test","ok");
    }
}
