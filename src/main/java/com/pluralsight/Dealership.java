package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    //instance variables
    private String name;
    private String address;
    private String phone;

    // inventory array list
    ArrayList<Vehicle> vehicle;

    // Dealership constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicle = new ArrayList<Vehicle>();
    }

    // getters+setters name, address, phone (for each dealership) non static- applies to each dealership individually
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addVehicle() {
        this.vehicle
    }
    public String getAllVehicles() {
        return;
    }


//    getVehiclesByPrice(){
//        return;
//    }
//    getVehiclesByMakeModel(){
//        return;
//    }
//    void getVehiclesByYear(){
//        return;
//    }
//    getVehicles
//    }



}
