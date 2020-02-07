package com.lzxs.dengji.controllor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ResourceBundle;

@RestController
public class Test {
    @GetMapping("/mysrc")
    public String mysrc(){
        ResourceBundle rb = ResourceBundle.getBundle("application_dev");
       return rb.getString("myserpath");
    }
    @GetMapping("/")
    public String index(){
       return "/static/html/3人员上报页.html";
    }


}
