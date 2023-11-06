package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    //Instantiate object
    private ArrayList<Vehicle> inventory;

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

    public void setInventory(ArrayList<Vehicle> inventory) {
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
        List<Vehicle> listOfVehicles = new ArrayList<Vehicle>();

        for (Vehicle s : this.inventory) {
            if (s.getPrice() >= min && s.getPrice() <= max) {
                listOfVehicles.add(s);
            }
        }
        return listOfVehicles;
    }

    public List<Vehicle> getVehicleByMakeModel(String make, String model) {
        List<Vehicle> listOfVehiclesByMakeModel = new ArrayList<Vehicle>();
        for (Vehicle s : this.inventory) {
            if (s.getMake().equalsIgnoreCase(make) || s.getModel().equalsIgnoreCase(model)) {
                listOfVehiclesByMakeModel.add(s);
            }

        }
        return listOfVehiclesByMakeModel;
    }

    public List<Vehicle> getVehicleByYear(int min, int max) {
        List<Vehicle> listOfVehiclesByYear = new ArrayList<Vehicle>();
        for (Vehicle s : this.inventory) {
            if (s.getYear() >= min && s.getYear() <= max) {
                listOfVehiclesByYear.add(s);
            }
        }
        return listOfVehiclesByYear;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> listOfVehiclesByColor = new ArrayList<Vehicle>();
        for (Vehicle s : this.inventory) {
            if (s.getColor().equalsIgnoreCase(color)) {
                listOfVehiclesByColor.add(s);
            }
        }
        return listOfVehiclesByColor;
    }

    public List<Vehicle> getVehicleByMileage(double min, double max) {
        List<Vehicle> listOfVehiclesByMileage = new ArrayList<Vehicle>();
        for (Vehicle s : this.inventory) {
            if (s.getOdometer() >= min && s.getOdometer() <= max) {
                listOfVehiclesByMileage.add(s);
            }

        }
        return listOfVehiclesByMileage;
    }

    public List<Vehicle> getVehicleByType(String type) {
        List<Vehicle> listOfVehiclesByType = new ArrayList<Vehicle>();
        for (Vehicle s : this.inventory) {
            if (s.getVehicleType().equalsIgnoreCase(type)) {
                listOfVehiclesByType.add(s);
            }
        }
        return listOfVehiclesByType;
    }


    public List<Vehicle> getAllVehicles() {
        return this.inventory;
    }
    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        this.inventory.remove(vehicle);
    }
}

