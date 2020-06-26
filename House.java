package com.tutorial;

import java.util.ArrayList;

public class House {

    private String address;
    ArrayList<Room> rooms = new ArrayList<Room>();
    public static int roomNumber = 0;

    public House(String address, ArrayList<Room> rooms) {
        this.address = address;
        this.rooms = rooms;
    }

    public House(String address) {

    }

    public House() {

    }

    public static int getRoomNumber() {
        return roomNumber;
    }

    public static void CreateHouse(String address){
        House house = new House(address);
    }

    void addRoom(Room room){
        rooms.add(room);
        roomNumber++;
    }

    void addRooms(ArrayList<Room> newRooms){
        for(int i = 0; i < newRooms.size(); i++){
            rooms.add(newRooms.get(i));
            roomNumber ++;
        }
    }

}
