package com.mo.vanlose_alle_program.rooms;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    public ArrayList<Room> getRooms(){
        ArrayList<Room> rooms = initRooms();
        signedContract(rooms);
        seenPage(rooms);
        isActive(rooms);
        ArrayList<Room> activeRooms = new ArrayList<>();

        for (Room room : rooms){
            if (room.isActive())
                activeRooms.add(room);
        }


        return activeRooms;
    }

    private void isActive(ArrayList<Room> rooms){
        rooms.get(0).setActive(true);
        rooms.get(1).setActive(false);
        rooms.get(2).setActive(true);
        rooms.get(3).setActive(true);
        rooms.get(4).setActive(false);
        rooms.get(5).setActive(true);
        rooms.get(6).setActive(true);
        rooms.get(7).setActive(true);
        rooms.get(8).setActive(true);
        rooms.get(9).setActive(true);
        rooms.get(10).setActive(true);
        rooms.get(11).setActive(false);
        rooms.get(12).setActive(true);
        rooms.get(13).setActive(false);
        rooms.get(14).setActive(true);
        rooms.get(15).setActive(true);

    }

    private void signedContract(ArrayList<Room> rooms){
        rooms.get(0).setSignedContract(false);
        rooms.get(1).setSignedContract(false);
        rooms.get(2).setSignedContract(false);
        rooms.get(3).setSignedContract(false);
        rooms.get(4).setSignedContract(false);
        rooms.get(5).setSignedContract(false);
        rooms.get(6).setSignedContract(false);
        rooms.get(7).setSignedContract(false);
        rooms.get(8).setSignedContract(false);
        rooms.get(9).setSignedContract(false);
        rooms.get(10).setSignedContract(false);
        rooms.get(11).setSignedContract(false);
        rooms.get(12).setSignedContract(false);
        rooms.get(13).setSignedContract(false);
        rooms.get(14).setSignedContract(false);
        rooms.get(15).setSignedContract(false);

    }

    private void seenPage(ArrayList<Room> rooms){
        rooms.get(0).setHaveSeenPage(false);
        rooms.get(1).setHaveSeenPage(false);
        rooms.get(2).setHaveSeenPage(false);
        rooms.get(3).setHaveSeenPage(false);
        rooms.get(4).setHaveSeenPage(false);
        rooms.get(5).setHaveSeenPage(true);
        rooms.get(6).setHaveSeenPage(true);
        rooms.get(7).setHaveSeenPage(false);
        rooms.get(8).setHaveSeenPage(true);
        rooms.get(9).setHaveSeenPage(false);
        rooms.get(10).setHaveSeenPage(true);
        rooms.get(11).setHaveSeenPage(false);
        rooms.get(12).setHaveSeenPage(true);
        rooms.get(13).setHaveSeenPage(false);
        rooms.get(14).setHaveSeenPage(true);
        rooms.get(15).setHaveSeenPage(false);

    }

    public ArrayList<Room> initRooms(){
        return new ArrayList<>(List.of(
                new Room("1"),
                new Room("2"),
                new Room("3"),
                new Room("4"),
                new Room("5"),
                new Room("6"),
                new Room("7"),
                new Room("8"),
                new Room("9"),
                new Room("10"),
                new Room("11"),
                new Room("12"),
                new Room("13"),
                new Room("14"),
                new Room("15"),
                new Room("16")
        ));
    }
}
