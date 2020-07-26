package com.deni.gunawan.app.bankperkreditanrakyat.Controller.master;

import com.deni.gunawan.app.bankperkreditanrakyat.Entity.Agama;
import com.deni.gunawan.app.bankperkreditanrakyat.Service.AgamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/agama")
public class AgamaController {

    @Autowired
    private AgamaService agamaService;

    @GetMapping(value ={"/","list"})
    public String listAgama(ModelMap params){
        params.addAttribute("listAgama", agamaService.findAll());
        return "/pages/agama/list";
    }

    @GetMapping("/form")
    public String formAgama(Agama agama, ModelMap params){
        params.addAttribute("agama", agama);
        return "/pages/agama/form";
    }

    @PostMapping("/submit")
    public String submitAgama(@ModelAttribute Agama agama){
        agama.setCreatedDate(Timestamp.valueOf(LocalDateTime.now()));
        agama.setCreatedBy("Admin");
        agamaService.save(agama);
        return "redirect:/agama/list";
    }
    @GetMapping("/hapus/{id}")
    public String removeAgamaById(@PathVariable("id") String kodeAgama){
        agamaService.deletById(kodeAgama);
        return "redirect:/agama/list";
    }
}
