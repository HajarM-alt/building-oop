import org.ies.building.components.ApartamentReader;

import org.ies.building.components.BuildingApp1;

import org.ies.building.components.BuildingReader;

import org.ies.building.components.OwnerReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ownerReader = new OwnerReader(scanner);
        var apartmentReader = new ApartamentReader(scanner, ownerReader);
        var buildingReader = new BuildingReader(scanner, apartmentReader);
        var buildingApp = new BuildingApp1(scanner, buildingReader);

        buildingApp.run();

    }
}