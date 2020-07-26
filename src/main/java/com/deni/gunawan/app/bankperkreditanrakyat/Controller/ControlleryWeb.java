package com.deni.gunawan.app.bankperkreditanrakyat.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControlleryWeb {

    @GetMapping(value = "/index")
    public String halloController(){
        return "/hello";
    }
}
