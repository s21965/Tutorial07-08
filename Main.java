package com.tutorial;

public class Main {


        public static void main(String[] args) {
            Furniture table = new Furniture();
            System.out.println( " This is new table ");

            House diningRoom = new House();
            System.out.println("This is the dining room");

            House.CreateHouse("New York");
        }
    }

