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
    public Map mapA = new HashMap();
    
    public String getInfo(String ID) {
        
        return ID + " | " + mapA.get(ID).toString(); 
    } 

    public void setInfo(String info, String ID) {

        this.info = mapA.put(ID, info).toString();
        //this.info = info;
    }
}