package com.example.components;
import java.util.*;
import org.springframework.stereotype.Component;

/**
 *
 * @author Matěj Seifert
 */
@Component
public class Memory {
    
    private String info;
    private String ID;
    public Map mapA = new TreeMap();
    
    public String getInfo(String ID) {
        
        info = mapA.get("str").toString();
        this.ID = mapA.get("ID").toString();
        return ID + this.ID + " | " + info;
    } 

    public void setInfo(String info, String ID) {

        this.info = mapA.put("str", info).toString();
        this.ID = mapA.put("ID", ID).toString();
        //this.info = info;
    }
}