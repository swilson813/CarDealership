package com.pluralsight;

import java.io.*;

public class DealershipFileManager {

    public Dealership getDealership() {
        //Return dealership info "Car World|123 Main St|555-123-4567"
        Dealership dealership1 = new Dealership(" ", " ", " ");
        String line;

        int lineNumber = 1;

        try {
            BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));


            while ((line = br.readLine()) != null) {
                String[] pipes = line.split("\\|");
                if (lineNumber == 1) {
                    String name = pipes[0];
                    dealership1.setName(name);
                    String address = pipes[1];
                    String phoneNumber = pipes[2];
                } else {
                    int vin = Integer.parseInt(pipes[0]);
                    int year = Integer.parseInt(pipes[1]);
                    String make = pipes[2];
                    String model = pipes[3];
                    String vehicleTypes = pipes[4];
                    String color = pipes[5];
                    int odometer = Integer.parseInt(pipes[6]);
                    double price = Double.parseDouble(pipes[7]);
                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleTypes, color, odometer, price);
                    dealership1.addVehicle(vehicle);
                }

                lineNumber++;

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return dealership1;
    }
    public void saveDealership(Dealership dealership){


    }
}
