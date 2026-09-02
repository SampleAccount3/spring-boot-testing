package com.example.springtest;

import com.example.springtest.bean.SampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

//    you can assign name to bean to access it in Main class
    @Bean("myBean")
    public SampleBean sampleBean(){
        return new SampleBean();
    }
}
