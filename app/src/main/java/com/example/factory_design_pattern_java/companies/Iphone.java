package com.example.factory_design_pattern_java.companies;

import com.example.factory_design_pattern_java.interfaces.Mobile;

public class Iphone implements Mobile {
    private String ramSize;
    private String gpu;
    private String processor;


    public Iphone(String ramSize, String gpu, String processor) {
        this.ramSize = ramSize;
        this.gpu = gpu;
        this.processor = processor;
    }
}
