package com.deni.gunawan.app.bankperkreditanrakyat.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControlleryWeb {

    @GetMapping(value = "/main")
    public String MainController(){ return "/layouts/main";}


    @GetMapping(value = "/index")
    public String indexController(){ return "/pages/index";}
}
