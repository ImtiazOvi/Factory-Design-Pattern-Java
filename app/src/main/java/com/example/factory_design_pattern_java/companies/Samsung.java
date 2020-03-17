package com.example.factory_design_pattern_java.companies;

import com.example.factory_design_pattern_java.interfaces.Mobile;

public class Samsung implements Mobile {

    private String ramSize;
    private String rom;
    private String display;

    public Samsung(String ramSize, String rom, String display) {
        this.ramSize = ramSize;
        this.rom = rom;
        this.display = display;
    }
}
