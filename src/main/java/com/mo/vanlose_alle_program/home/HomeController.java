package com.mo.vanlose_alle_program.home;

import com.mo.vanlose_alle_program.rooms.Room;
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
        ArrayList<String> rules = service.readRules();
        /*for (String rule : rules){
            System.out.println(rule);
        }*/
        model.addAttribute("mainrules", rules);

        return "index";
    }

    @GetMapping("/cleaning-rules")
    public String getCleaningRules(Model model){
        ArrayList<String> cleaningRules = service.readCleaningRules();
        model.addAttribute("cleaningrules", cleaningRules);
        return "cleaning";
    }

    @GetMapping("/rooms")
    public String getRooms(Model model){
        ArrayList<Room> rooms = service.getRooms();
        model.addAttribute("rooms", rooms);
        return "rooms";
    }

    @GetMapping("/meeting-topics")
    public String getMeetingTopics(Model model){
        ArrayList<String> topics = service.getMeetingTopics();
        model.addAttribute("topics", topics);
        return "meeting-topics";
    }
}
