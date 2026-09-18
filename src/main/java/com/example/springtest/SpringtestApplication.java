package com.example.springtest;

import com.example.springtest.service.ProfileService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class SpringtestApplication {

	public static void main(String[] args) {

		var app = new SpringApplication(SpringtestApplication.class);

		app.setAdditionalProfiles("prd");

		var context = app.run(args);

		System.out.println(
				"Active profiles: " +
						Arrays.toString(context.getEnvironment().getActiveProfiles())
		);


		ProfileService profileService = context.getBean(ProfileService.class);

		System.out.println(profileService.getEnvironment());
		System.out.println(profileService.saysSomething());


	}
}
