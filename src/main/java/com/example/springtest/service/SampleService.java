package com.example.springtest.service;

import com.example.springtest.bean.SampleBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    private SampleBean sampleBean;

//    One constructor → Spring automatically uses it for constructor injection. @Autowired is not required.
    public SampleService(
            @Qualifier("thirdBean") SampleBean sampleBean
    ) {
        this.sampleBean = sampleBean;
    }

    public String saysSomething(){
        return "The Sample bean Says: " + sampleBean.getDetails();
    }
}
