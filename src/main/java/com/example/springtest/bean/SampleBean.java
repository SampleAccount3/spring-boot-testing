package com.example.springtest.bean;

public class SampleBean {

    private String name;

    public SampleBean(String name) {
        this.name = name;
    }

    public String getDetails(){
        return "The name is: " + name;
    }
}
