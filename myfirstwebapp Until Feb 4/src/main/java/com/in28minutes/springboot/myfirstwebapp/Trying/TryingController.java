package com.in28minutes.springboot.myfirstwebapp.Trying;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TryingController {
    @RequestMapping("Trying")
    public String gotoTryingpage() {
        return "trying";
    }
}
