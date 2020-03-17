package com.example.factory_design_pattern_java.companies;

import com.example.factory_design_pattern_java.interfaces.Mobile;

public class Sony implements Mobile {

    private String ramSize;
    private String display;

    public Sony(String ramSize, String display) {
        this.ramSize = ramSize;
        this.display = display;
    }
}
