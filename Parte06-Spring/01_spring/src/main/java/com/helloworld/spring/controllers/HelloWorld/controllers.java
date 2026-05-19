package com.helloworld.spring.controllers.HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controllers {
@RequestMapping("/")
public String index(){
    return "index";
}

}
