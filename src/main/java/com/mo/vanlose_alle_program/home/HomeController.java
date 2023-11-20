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
        ArrayList<String> mainRules = service.readRules();
        model.addAttribute("simpletableTitle", "Main rules");
        model.addAttribute("rules", mainRules);
        return "index";
    }

    @GetMapping("/cleaning-rules")
    public String getCleaningRules(Model model){
        ArrayList<String> cleaningRules = service.readCleaningRules();
        model.addAttribute("simpletableTitle", "Cleaning rules");
        model.addAttribute("rules", cleaningRules);
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
        model.addAttribute("simpletableTitle", "Topics of discussion");
        model.addAttribute("rules", topics);
        return "meeting-topics";
    }

    @GetMapping("/common-supplies")
    public String getCommonSuppliesSettings(Model model){
        ArrayList<String> commonSuppliesSettings = service.getCommonSupplies();
        model.addAttribute("simpletableTitle", "Common supplies");
        model.addAttribute("rules", commonSuppliesSettings);
        return "comming-supplies";
    }
}
