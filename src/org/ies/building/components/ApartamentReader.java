package org.ies.building.components;

import org.ies.building.models.Apartament;
import org.ies.building.models.Owner;

import java.util.Scanner;

public class ApartamentReader {


    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public ApartamentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }

    public Apartament read(){

        System.out.println("--Datos del apartamento--");

        System.out.print("Planta:");
        int tier = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Puerta:");
        String door = scanner.nextLine();


        int size = readOwners();

        Owner[] owner = new Owner[size];

        for (int i = 0; i < size; i++) {

            owner[i] = ownerReader.read();

        }



        return new Apartament(

                tier,
                door,
                owner


        );


    }

    private int readOwners(){

        int size;

        do {

            System.out.print("¿Cuantos propietarios hay?");
            size = scanner.nextInt();
            scanner.nextLine();

        } while (size <= 0);

        return size;

    }
}