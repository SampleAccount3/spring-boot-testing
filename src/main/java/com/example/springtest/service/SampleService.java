package com.example.springtest.service;

import com.example.springtest.bean.SampleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
//For Single PropertySource
//@PropertySource("classpath:custom.properties")
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom2.properties"),
})

public class SampleService {

    private SampleBean sampleBean;
    private Environment environment;

    @Value("${my.sample}")
    private String myCustomProperties;
    @Value("${my.sample2}")
    private String mySecondCustomProperties;

//    One constructor → Spring automatically uses it for constructor injection. @Autowired is not required.
    public SampleService(
            @Qualifier("thirdBean") SampleBean sampleBean
    ) {
        this.sampleBean = sampleBean;
    }

//    Setter Injection
    @Autowired
    private void setEnvironment(Environment environment){
        this.environment = environment;
    }

    public String getJavaVersion(){
        return "The Java Version is: " + environment.getProperty("java.version");
    }

    public String getOSVersion(){
        return "The OS Used is : " + environment.getProperty("os.name");
    }

    public String getCustomProperties(){
        return "The Custom Properties is: "+ environment.getProperty("my.custom.properties");
    }
    public String getMyCustomProperties(){
        return myCustomProperties;
    }
    public String getMySecondCustomProperties(){
        return mySecondCustomProperties;
    }

    public String saysSomething(){
        return "The Sample bean Says: " + sampleBean.getDetails();
    }
}
