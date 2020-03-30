package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car exhibitCar = new Car();
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(exhibitCar);
        String colour = exhibitCar.colour;
        int hp = exhibitCar.hp;
        Fuel fuel = exhibitCar.fuel;
        TypeOfDrive typeOfDrive = exhibitCar.typeOfDrive;
        String customerWish;

        System.out.println("Sie möchten ein Auto wie unser Ausstellungsmodel kaufen? Wie schön. Natürlich gehen wir auf " +
                "Ihre individuellen Wünsche ein. Welche Änderungen möchten Sie vornehmen? \n" +
                "Sollten Sie zufrieden mit den Angaben sein, sagen Sie einfach <ok>\n" +
                "Farbe: derzeit " + exhibitCar.colour);
        customerWish = scanner.next();
        if (customerWish != null) {
            if (!customerWish.equalsIgnoreCase("ok")) {
                colour = customerWish;
            }
        }
        System.out.println("Horsepower: derzeit " + exhibitCar.hp);
        customerWish = scanner.next();
        if (customerWish != null) {
            if (!customerWish.equalsIgnoreCase("ok")) {
                hp = Integer.parseInt(customerWish);
            }
        }

        try {
            Car orderedCar = (Car) exhibitCar.clone();          //warum muss exhibitCar zu Car gecastet werden?
            orderedCar.setColour(colour);
            orderedCar.setHp(hp);
            orderedCar.getSerialNumber();
            cars.add(orderedCar);
            System.out.println("Herzlichen Dank. Ihr gewünschtes Auto geht in Produktion und wird bald geliefert. " +
                    "Hier noch einmal alle Details:\n"
                    + orderedCar.brand + '\n'
                    + orderedCar.colour + '\n'
                    + orderedCar.typeOfDrive + '\n'
                    + orderedCar.fuel + '\n'
                    + orderedCar.hp);
        } catch (CloneNotSupportedException ex) {

        }


    }
}
