package org.ies.building.components;

import org.ies.building.models.Apartment;
import org.ies.building.models.Building;
import org.ies.building.models.Owner;

import java.util.Scanner;

public class BuildingReader {
    private final Scanner scanner;
    private final ApartmentReader apartmentReader;

    public BuildingReader(Scanner scanner, ApartmentReader apartmentReader) {
        this.scanner = scanner;
        this.apartmentReader = apartmentReader;
    }

    public Building read() {
        System.out.println("Introduce los datos del edificio");
        System.out.print("Dirección: ");
        String address = scanner.nextLine();

        System.out.print("Municipio: ");
        String city = scanner.nextLine();

        int numApartments = readNumApartments();
        Apartment[] apartments = new Apartment[numApartments];
        for (int i = 0; i < apartments.length; i++) {
            apartments[i] = apartmentReader.read();
        }

        return new Building(
                address,
                city,
                apartments
        );
    }

    private int readNumApartments() {
        int size;
        do {
            System.out.print("Cuántos apartamentos hay: ");
            size = scanner.nextInt();
            scanner.nextLine();
        } while (size < 0);
        return size;
    }
}