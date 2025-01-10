package org.ies.building.components;
import org.ies.building.models.Apartment;
import org.ies.building.models.Owner;
import org.ies.building.models.Building;
import org.ies.building.components.BuildingReader;
import org.ies.building.components.ApartmentReader;
import org.ies.building.components.OwnerReader;
import java.util.Scanner;
import org.ies.building.models.Building;

public class BuildingMenuApp {

    private final Scanner scanner;
    private final BuildingReader buildingReader;


    public BuildingMenuApp(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }

    public void run() {

        Building building = buildingReader.read();
        int option;

        do {
            option = chooseOption();

            if (option ==1) {
                building.showFloorApartments();
            }else if (option ==2) {
                System.out.println("Introduce el piso");
                int floor = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce la puerta");
                var door = scanner.nextLine();
                var building1 = building.findApartment(floor, door);
                System.out.println(building1);
            }
        }


        private int chooseOption() {
            int option;
            System.out.println("-------- MENU EDIFICIO --------");
            System.out.println("1. información del edificio");
            System.out.println("2. Información apartamento");
            System.out.println("3. Apartamentos de una planta entera");
            System.out.println("4. Propietarios de un apartamento");
            System.out.println("5. Informacion de un apartamento");
            System.out.println("6. Informacion de propietarios de un apartamento");

            option = scanner.nextInt();
            scanner.nextLine();

        }
    }
}
