package com.example.springtest;

import com.example.springtest.bean.SampleBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfiguration {

//    you can assign name to bean to access it in Main class
    @Bean
    public SampleBean firstBean(){
        return new SampleBean("Melares");
    }
    @Bean
    public SampleBean secondBean(){
        return new SampleBean("Melares2");
    }
    @Bean
    public SampleBean thirdBean(){
        return new SampleBean("Melares3");
    }
}
