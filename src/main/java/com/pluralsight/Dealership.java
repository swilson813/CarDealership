package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
   private String name;
   private String address;
   private String phone;

    //Instantiate object
    private ArrayList<Vehicle>inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>();
    }

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

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public ArrayList<Vehicle> getVehicleByPrice(double min, double max) {
        return null;
    }
    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model){
        return null;
    }
    public ArrayList<Vehicle> getVehicleByYear(String min, String max){
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByMileage(double min, double max) {
        return null;
    }
    public ArrayList<Vehicle> getVehicleByType(String type) {
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return this.inventory;
    }
    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){

    }
}

