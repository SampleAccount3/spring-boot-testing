package com.example.springtest;

import com.example.springtest.service.SampleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringtestApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringtestApplication.class, args);

//		SampleBean sampleBean = context.getBean("sampleBean",SampleBean.class);
		SampleService sampleService = context.getBean(SampleService.class);

		System.out.println(sampleService.saysSomething());

		System.out.println(sampleService.getJavaVersion());
		System.out.println(sampleService.getOSVersion());
		System.out.println(sampleService.getCustomProperties());
	}
}
