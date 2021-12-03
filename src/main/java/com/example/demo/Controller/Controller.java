package com.example.demo.Controller;
import com.example.components.Memory;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author paulik
 */
@RestController
public class Controller {
    
    
    
    @Autowired
    Memory memory;
    
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello(){
        
        return "Hello World!";
    }
    
    @RequestMapping(value="/info/{ID}", method=RequestMethod.GET)
    public String getInfo(@PathVariable String ID){
        
        //memory.mapA.get("ID");
        return memory.getInfo(ID);
    }
       
    @RequestMapping(value="/info/{ID}", method=RequestMethod.POST, consumes = "application/json")
    public void value (@RequestBody String value, @PathVariable String ID){
        
        //memory.mapA.put("ID", ID);       
        memory.setInfo(value, ID);
    }
}