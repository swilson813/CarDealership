package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealership {
   private String name;
   private String address;
   private String phone;

    //Instantiate object
    private List<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>() {
        };
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
    public ArrayList<Vehicle> getInventory() {
       return (ArrayList<Vehicle>) inventory;
    }
    public void setInventory(ArrayList<Vehicle> inventory){
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public List<Vehicle> getVehicleByPrice(double min, double max) {
        List<Vehicle> ArrayList = new ArrayList<Vehicle>();

        for (Vehicle s:inventory){
            if (s.getPrice()>=min && s.getPrice()<=max){
                ArrayList.add(s);
            }
        }
        return ArrayList;
    }
    public List<Vehicle> getVehicleByMakeModel(String make, String model){
        return null;
    }
    public List<Vehicle> getVehicleByYear(String min, String max){
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color){
        return null;
    }

    public List<Vehicle> getVehicleByMileage(double min, double max) {
        return null;
    }
    public List<Vehicle> getVehicleByType(String type) {
        return null;
    }

    public List<Vehicle> getAllVehicles() {
        return this.inventory;
    }
    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){

    }
}

