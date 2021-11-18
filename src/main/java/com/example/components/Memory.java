package com.example.components;

import org.springframework.stereotype.Component;

/**
 *
 * @author Matěj Seifert
 */
@Component
public class Memory {
    private String info = "moje info";
    private int count = 0;

    public String getInfo() {
        count++;
        return info + ": " + this.count;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
}
