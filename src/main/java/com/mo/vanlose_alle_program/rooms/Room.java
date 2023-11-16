package com.mo.vanlose_alle_program.rooms;

public class Room {

    private String roomNumber;

    private boolean active;

    private boolean signedContract;
    private boolean haveSeenPage;

    public Room() {
    }

    public Room(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isHaveSeenPage() {
        return haveSeenPage;
    }

    public void setHaveSeenPage(boolean haveSeenPage) {
        this.haveSeenPage = haveSeenPage;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedContract() {
        return signedContract;
    }

    public void setSignedContract(boolean signedContract) {
        this.signedContract = signedContract;
    }
}
