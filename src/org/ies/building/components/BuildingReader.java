package org.ies.building.components;

import org.ies.building.models.Apartament;
import org.ies.building.models.Building;
import org.ies.building.models.Owner;

import java.util.Scanner;

public class BuildingReader {

    private final Scanner scanner;
    private final ApartamentReader apartamentReader;

    public BuildingReader(Scanner scanner, ApartamentReader apartamentReader) {
        this.scanner = scanner;
        this.apartamentReader = apartamentReader;
    }


    public Building read(){

        System.out.println("--Datos del edificio--");

        System.out.print("Dirección: ");
        String address = scanner.nextLine();

        System.out.print("Municipio: ");
        String municipality = scanner.nextLine();


        int size = readApartaments();

        Apartament[] apartaments = new Apartament[size];

        for (int i = 0; i < size; i++) {

            apartaments[i] = apartamentReader.read();

        }



        for (int i = 0; i < size; i++) {

            apartaments[i] = apartamentReader.read();

        }

        return new Building(

                address,
                municipality,
                apartaments


        );


    }


    private int readApartaments(){

        int size;

        do {

            System.out.print("¿Cuántos apartamentos hay? ");
            size = scanner.nextInt();
            scanner.nextLine();

        } while (size <= 0);

        return size;

    }





}