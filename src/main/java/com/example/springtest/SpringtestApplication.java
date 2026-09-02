package com.example.springtest;

import com.example.springtest.bean.SampleBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringtestApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringtestApplication.class, args);

		SampleBean sampleBean = context.getBean("myBean",SampleBean.class);

		System.out.println(sampleBean.getDetails());
	}


}
