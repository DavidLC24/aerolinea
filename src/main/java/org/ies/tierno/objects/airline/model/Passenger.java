package org.ies.tierno.objects.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;
@Data
@AllArgsConstructor
public class Passenger {
    private String nif;
    private String name;
    private String surname;
    private int seat;

    public void showInfo() {
        System.out.println(surname + ", " + name + " (" + nif + "). Asiento: " + seat);
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

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
