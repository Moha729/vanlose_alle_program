package com.mo.vanlose_alle_program.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    final HomeService service;

    public HomeController(HomeService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getIndex(Model model){
        //ArrayList<String> rules = service.readRules();
        /*for (String rule : rules){
            System.out.println(rule);
        }*/
        //model.addAttribute("mainrules", rules);

        return "index";
    }

    @GetMapping("/cleaning-rules")
    public String getCleaningRules(Model model){
        //ArrayList<String> cleaningRules = service.readCleaningRules();
        //model.addAttribute("cleaningrules", cleaningRules);
        return "cleaning";
    }
}
