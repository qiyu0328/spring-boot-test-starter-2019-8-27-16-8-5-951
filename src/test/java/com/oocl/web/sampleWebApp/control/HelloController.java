package com.oocl.web.sampleWebApp.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
    
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
    
    @RequestMapping("/user")
    public @ResponseBody  HashMap<String, String> user(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("user", "name");
        return map;
    }
}