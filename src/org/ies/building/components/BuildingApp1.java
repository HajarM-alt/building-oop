package org.ies.building.components;

import org.ies.building.models.Apartament;
import org.ies.building.models.Building;

import java.util.Scanner;

public class BuildingApp1 {

    //Necesitamos el Scanner y el reader  --> BuildingReader

    private final Scanner scanner;
    private final BuildingReader buildingReader;


    public BuildingApp1(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }


    //Tendrá un método run() que realice lo siguiente:

    public void run(){

        //Lee un edificio  --> El buildingReader tiene un READ, hay que usarlo y meterlo en una variable
        Scanner scanner = new Scanner(System.in);
        var building = buildingReader.read();



        //Pide al usuario un piso y una planta
        System.out.println("Introduce una puerta");
        String door = scanner.nextLine();

        System.out.println("Introduce una planta");
        int tier = scanner.nextInt();
        scanner.nextLine();


        //Busca el apartamento de en el piso y planta que ha pasado el usuario

        //Voy a usar un método que ya tengo hecho anteriormente, no se guarda en ninguna variable ya que es void (no devuelve nada).
        building.showSpecificApartament(tier, door);


        //Después, muestra la información de los apartamentos de la segunda planta
        building.showTierApartament(2);












    }


}