package org.ies.building.models;

import java.util.Objects;

public class Owner {

    private String nif;
    private String name;
    private String surname;

    public Owner(String nif, String name, String surname) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }

    public void showInfo(){

        System.out.println("--Informacion del propietario--");

        System.out.print("Nombre: " + name);
        System.out.print("Apellido: " + surname);
        System.out.print("NIF: " + name);
    }


    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(nif, owner.nif) && Objects.equals(name, owner.name) && Objects.equals(surname, owner.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname);
    }


    @Override
    public String toString() {
        return "Owner{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
