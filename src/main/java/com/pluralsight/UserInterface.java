package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner User = new Scanner(System.in);

    public UserInterface() {

    }

    public void Display() {
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
                    processAddVehicleRequest();
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

    private void helperDisplayVehicle(List<Vehicle> listOfVehicles) {

        if (listOfVehicles.isEmpty()) {
            System.out.println("No vehicles found.");
        }
        for (Vehicle vehicle : listOfVehicles) {
            System.out.println(vehicle);
        }
    }

    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
    }

    public void processGetByPriceRequest() {

        System.out.println("Please enter the minimum price: ");
        double minimumPrice = User.nextDouble();
        System.out.println("Please type in the maximum price: ");
        double maximumPrice = User.nextDouble();
        User.nextLine();
        helperDisplayVehicle(dealership.getVehicleByPrice(minimumPrice, maximumPrice));
    }

    public void processGetByMakeModelRequest(){
        System.out.println("Please enter the vehicles make: ");
        String vehiclesByMake = User.nextLine();
        System.out.println("Please enter the vehicles model: ");
        String vehiclesByModel = User.nextLine();
        helperDisplayVehicle(dealership.getVehicleByMakeModel(vehiclesByModel, vehiclesByMake));
    }
    public void processGetByYearRequest(){
        System.out.println("Please enter minimum vehicle year you prefer: ");
        int minYear = User.nextInt();
        System.out.println("Please enter the maximum vehicle year you prefer: ");
        int maxYear = User.nextInt();
        User.nextLine();
        helperDisplayVehicle(dealership.getVehicleByYear(minYear, maxYear));
    }
    public void processGetByColorRequest(){
        System.out.println("Please enter color for vehicle: ");
        String vehicleColor = User.nextLine();
        helperDisplayVehicle(dealership.getVehiclesByColor(vehicleColor));
    }
    public void processGetByMileageRequest(){
        System.out.println("Please enter the minimum mileage for your car: ");
        double minMileage = User.nextDouble();
        User.next();
        System.out.println("Please enter the maximum mileage for your car: ");
        double maxMileage = User.nextDouble();
        helperDisplayVehicle(dealership.getVehicleByMileage(minMileage, maxMileage));
    }
    public void processGetByVehicleTypeRequest(){
        System.out.println("Please enter the vehicle type you're looking for: ");
        String vehicleType = User.nextLine();
        helperDisplayVehicle(dealership.getVehicleByType(vehicleType));
    }
    public void processGetAllVehicleRequest(){
        helperDisplayVehicle(dealership.getAllVehicles());

    }
    public void processAddVehicleRequest(){
        System.out.println("Please enter vehicle information" + "\n + Please type in your vin number");
        int vin = User.nextInt();
        System.out.println("Please add the year: ");
        int year = User.nextInt();
        User.nextLine();
        System.out.println("Please enter the make:");
        String carMake = User.nextLine();
        System.out.println("Please enter the model: ");
        String carModel = User.nextLine();
        System.out.println("Please enter the type: ");
        String carType = User.nextLine();
        System.out.println("Please enter the color: ");
        String color = User.nextLine();
        int odometer = User.nextInt();
        User.nextLine();
        System.out.println("Please enter the price: ");
        double carPrice = User.nextInt();
        User.nextLine();
        System.out.println("Vehicle added successfully. ");

        Vehicle vehicle = new Vehicle(vin, year,carMake,carModel,carType,color,odometer,carPrice);
        dealership.addVehicle(vehicle);

    }

    public void processRemoveVehicleRequest() {
        System.out.println("Please enter the vin number: ");
        int vinNo = User.nextInt();
        User.nextLine();
        for (Vehicle s: dealership.getAllVehicles()){
            if (s.getVin() == vinNo){
                dealership.removeVehicle(s);
            }
        }

    }
}
