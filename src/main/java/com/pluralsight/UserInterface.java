package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {

    }
    public void Display(){
        Scanner scanner = new Scanner(System.in);
        init();
        boolean running = true;
        while (running) {
            System.out.println("Main menu. Please select an option: ");
            System.out.println("1)Find vehicles within a price range ");
            System.out.println("2)Find vehicles by your make/model ");
            System.out.println("3)Find vehicle by year range ");
            System.out.println("4)Find vehicle by color ");
            System.out.println("5)Find vehicle mileage range ");
            System.out.println("6)Find vehicle type(car, truck, SUV, van) ");
            System.out.println("7)List ALL vehicles: ");
            System.out.println("8)Add a vehicle ");
            System.out.println("9)Remove a vehicle ");
            System.out.println("99) Quit");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetByYearRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                   processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTypeRequest();
                    break;
                case "7":
                    processGetAllVehicleRequest();
                    break;
                case "8":
                    processAddVehicleRequest(" ");
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "0":
                    running = false;
                default:
                    System.out.println("Invalid option. Please try again!");
                    break;
            }
        }

    }
    private void displayVehicle(List<Vehicle> listOfVehicles){

       if (listOfVehicles.isEmpty()){
           System.out.println("No vehicles found.");
       }
        for (Vehicle vehicle: listOfVehicles){
            System.out.println(vehicle);
        }
    }
    private void init(){
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
    }
    public List<Vehicle> processGetByPriceRequest(){
        List<Vehicle> vehiclesByPrice = processGetByPriceRequest();
                //call the display vehicle method
        displayVehicle(vehiclesByPrice);

        return vehiclesByPrice;
    }
    public void processGetByMakeModelRequest(){
       // List<Vehicle> vehiclesByMakeModel = ;
                //call the displayVehicles by make /model
       // displayVehicle(vehiclesByMakeModel);
    }
    public void processGetByYearRequest(){
       // List<Vehicle> vehiclesByYear = /* your logic here */
      //  displayVehicle(vehiclesByYear);
    }
    public void processGetByColorRequest(){

    }
    public void processGetByMileageRequest(){
       // List<Vehicle> vehiclesByMileage = /* insert logic*/;
        // Call the displayVehicles method
      //  displayVehicle(vehiclesByMileage);
    }
    public void processGetByVehicleTypeRequest(){

    }
    public void processGetAllVehicleRequest(){
        List<Vehicle> allVehicles =  dealership.getAllVehicles();
        displayVehicle(allVehicles);

        //Add/remove vehicles within this method
        processAddVehicleRequest(allVehicles);
        processRemoveVehicleRequest(allVehicles);
    }
    public void processAddVehicleRequest(List<Vehicle> allVehicles){
        Vehicle vehicle= new Vehicle();
        listOfVehicles.add(newVehicle);
        System.out.println("Vehicle added successfully. ");
    }
    boolean removed;
    public void processRemoveVehicleRequest() {
        Vehicle vehicleToRemove = ;
        //remove vehicles from list
        boolean removed = listOfVehicles.remove(vehicleToRemove);
        if (removed){
            System.out.println("Vehicle removed successfully. ");

        }else {
            System.out.println("Vehicle not found or could not be removed successfully. ");
        }
    }
}
