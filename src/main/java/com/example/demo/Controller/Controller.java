package com.example.demo.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author paulik
 */
@RestController
public class Controller {
    
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello(){
        
        return "Hello World!";
    }
}