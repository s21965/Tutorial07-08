package com.tutorial;

import java.util.ArrayList;

public class Room {

    private int area;
    private ArrayList<Furniture> furniture = new ArrayList<Furniture>();
    int VATPriceOfFurniture = 0;

    public Room(int area, ArrayList<Furniture> furniture) {
        this.area = area;
        this.furniture = furniture;
    }

    public ArrayList<Furniture> getFurniture() {
        return furniture;
    }

    public int getVATPriceOfFurniture() {

        for (int i = 0; i < furniture.size(); i++) {
            VATPriceOfFurniture += furniture.get(i).getVAT();
        }
        return VATPriceOfFurniture;
    }
}
