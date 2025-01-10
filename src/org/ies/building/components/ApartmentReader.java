package org.ies.building.components;

import org.ies.building.models.Apartment;
import org.ies.building.models.Owner;

import java.util.Scanner;

public class ApartmentReader {
    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public ApartmentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }

    public Apartment read() {
        System.out.println("Introduce los datos del apartamento:");
        System.out.print("Planta: ");
        int floor = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Puerta: ");
        String door = scanner.nextLine();

        int numOwners = readNumOwners();

        Owner[] owners = new Owner[numOwners];
        for (int i = 0; i < owners.length; i++) {
            owners[i] = ownerReader.read();
        }

        return new Apartment(
                floor,
                door,
                owners
        );
    }

    private int readNumOwners() {
        int numOwners;
        do {
            System.out.print("Cuántos propietarios hay: ");
            numOwners = scanner.nextInt();
            scanner.nextLine();
        } while (numOwners < 0);
        return numOwners;
    }
}