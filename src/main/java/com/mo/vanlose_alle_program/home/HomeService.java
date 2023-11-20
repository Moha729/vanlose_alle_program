package com.mo.vanlose_alle_program.home;

import com.mo.vanlose_alle_program.rooms.Room;
import com.mo.vanlose_alle_program.rooms.RoomService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    final CsvReader csvReader;
    final FileWritter fileWritter;

    final RoomService roomService;

    public HomeService(CsvReader csvReader, FileWritter fileWritter, RoomService roomService) {
        this.csvReader = csvReader;
        this.fileWritter = fileWritter;
        this.roomService = roomService;
    }

    public ArrayList<Room> getRooms(){
        return roomService.getRooms();
    }

    public ArrayList<String> readRules(){
        return new ArrayList<>(List.of(
                "Respect housemates privacy."," Knock on doors.",
                        "Be quiet after 22:00.",
        "No discrimination will be tolerated (such as racism, homo-transphobia, misogyny, etc…).",
                "Don’t steal food. Don’t take other people’s things without permission.",
        "Be present at meetings and be certain to become aware of communications in the Whatsapp group.",
        "Don’t smoke in the house.",
                "Have personal hygiene.",
        "Leave clean and tidy common spaces after yourself.",
        "Clean everything after cooking. Nothing left anywhere in the kitchen before you leave it.",
        "Keep the toilets clean.",
        "Do not waste.","Turn off lights and household appliances.", "Don’t waste water.",
                "Throw out the garbage and change the trash-bag when needed.",
        "Mohammad (room 13) and Daniele (room 11) are the supervisors of the house.",
        "The house rules may be updated/added.",
                "For security reasons some areas of the house are under video surveillance.",
                "Keep the main door closed especially during the night time.",
                "Lock your room when leaving the house.",
        "If tenants don’t comply with the house rules the supervisors are required to notify the landlord, and with no further ado, the person will have to move out."
        ));
    }

    public ArrayList<String> readCleaningRules(){
        return new ArrayList<>(List.of(
                "It is not allowed to have anything private in the common space.",
        "If there are things in the common areas and the cleaning team are coming, they can remove your stuff on your responsibilty.",
                "The cleaning team does not empty garbage bins, they only clean. You must take out your trash.",
        "When the house is being cleaned, please do not be present. If there is an important thing, be quickly gone.",
        "If your stuff is in the kitchen not hidden away, it can result in a warning.",
                "The same goes in the bathrooms.",
                "If you have to hang your clothes to dry, you must remove them as soon as they are dry. Clothes hanging more than 48 hours can be disposed."

        ));
    }

    public ArrayList<String> getMeetingTopics(){
        return new ArrayList<>(List.of(
                ""
        ));
    }

    public ArrayList<String> getCommonSupplies(){
        return new ArrayList<>(List.of(
                "supplie1",
                "supplie2"
        ));
    }
/*
    public ArrayList<String> readRules(){
        String csvFile = "rules.csv";
        return csvReader.readRules(csvFile);
    }

    public ArrayList<String> readCleaningRules(){
        String cvsFile = "cleaning.csv";
        return csvReader.readRules(cvsFile);
    }
*//*    public void readTheFile(){
        csvReader.readFile();
    }*//*

    public String makeNewFile(){
        fileWritter.createNewFile();
        return null;
    }

    public String readCSV(){



        return null;
    }*/


}
