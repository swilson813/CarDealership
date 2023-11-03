package com.pluralsight;

import java.time.LocalDate;
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
            System.out.println("8)Add a vehicle: ");
            System.out.println("9)Remove a vehicle: ");
            System.out.println("0) Quit");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    System.out.println();
                    break;
                case "2":
                    System.out.println();
                    break;
                case "3":
                    System.out.println();
                    break;
                case "4":
                    System.out.println();
                    break;
                case "5":
                    System.out.println();
                    break;
                case "6":
                    System.out.println();
                    break;
                case "7":
                    System.out.println();
                    break;
                case "8":
                    System.out.println();
                    break;
                case "9":
                    System.out.println();
                    break;
                case "0":
                    running = false;
                default:
                    System.out.println("Invalid option. Please try again!");
                    break;
            }
        }

    }
    private void init(){
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
    }
    public void processGetByPriceRequest(){

    }
    public void processGetByMakeModelRequest(){

    }
    public void processGetByYearRequest(){

    }
    public void processGetByColorRequest(){

    }
    public void processGetByMileageRequest(){

    }
    public void processGetByVehicleTypeRequest(){

    }
    public void processGetAllVehicleRequest(){

    }
    public void processAddVehicleRequest(){

    }
    public void processRemoveVehicleRequest() {

    }
}
