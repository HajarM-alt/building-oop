package org.ies.building.components;


import org.ies.building.models.Building;


import java.util.Scanner;

public class BuildingMenuApp {


    private final Scanner scanner;
    private final BuildingReader buildingReader;

    public BuildingMenuApp(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Building building = buildingReader.read();


        //Inicia un bucle de menú con las siguientes opciones:


        //Se declara la opcion fuera del bucle, y luego la leemos
        int option;

        do {

            System.out.println("1.Mostrar toda la información del edificio");
            System.out.println("2.Dado una planta y una puerto, devuelve el apartamento en esa planta y puerta");
            System.out.println("3.Muestra los datos del apartamento");
            System.out.println("4.Muestra los propietarios de un apartamento");
            System.out.println("5.Salir");


            //Se lee la opcion
            option = scanner.nextInt();
            scanner.nextLine();

            //Muestra toda la información del edificio

            if (option == 1) {

                building.showInfo();


            } else if (option == 2) {

                System.out.println("Planta: ");
                int tier = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Puerta: ");
                String door = scanner.nextLine();


                building.findApartament(tier, door);



                //Dado un número de planta, muestra los apartamentos de esa planta


            } else if (option == 3) {

                System.out.println("Introduce una planta");
                int tier = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Introduce una puerta");
                String door = scanner.nextLine();

                building.findOwners(tier, door);




                //Muestra los propietarios de un apartamento situado en una planta y puerta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"

            } else if (option == 4) {


                System.out.println("Introduce una planta");
                int tier = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Introduce una puerta");
                String door = scanner.nextLine();

                building.showSpecificApartament(tier, door);




            } else if (option == 5) {

                System.out.println("Saliendo del menu...");

            } else {

                System.out.println("Opcion invalida");
            }

        } while (option != 5);


    }

}


