package com.example.springtest;

import com.example.springtest.bean.SampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
public class ApplicationConfiguration {

//    The Profile Can be Assigned to the Class Level and Method Level

    @Bean()
    @Profile("dev")
    public SampleBean firstBean() {
        return new SampleBean("This is in Dev");
    }

    @Bean
    @Profile("prd")
    public SampleBean secondBean() {
        return new SampleBean("This is in Prod");
    }
}