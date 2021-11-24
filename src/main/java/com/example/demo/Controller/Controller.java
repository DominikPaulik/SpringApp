package com.example.demo.Controller;
import com.example.components.Memory;
import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @RequestMapping(value="/info", method=RequestMethod.GET)
    public String getInfo(){
        
        return memory.getInfo();
    }
       
    @RequestMapping(value="/info", method=RequestMethod.POST, consumes = "application/json")
    public void value (@RequestBody String value){
       
        memory.setInfo(value);
    }
}