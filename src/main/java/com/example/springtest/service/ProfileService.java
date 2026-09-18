package com.example.springtest.service;

import com.example.springtest.bean.SampleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    private SampleBean sampleBean;
    private Environment environment;

    public ProfileService(
            SampleBean sampleBean,
            Environment environment
    ) {
        this.sampleBean = sampleBean;
        this.environment = environment;
    }

    public String saysSomething(){
        return "The Sample bean Says: " + sampleBean.getDetails();
    }

    public String getEnvironment() {
        return environment.getProperty("env");
    }
}
