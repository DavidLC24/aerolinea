package org.ies.tierno.objects.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Objects;
@Data
@AllArgsConstructor
public class Flight {
    private int number;
    private String origin;
    private String destination;
    private String gate;
    private Passenger[] passengers;

    public boolean hasPassenger(String nif) {
        for (var passenger : passengers) {
            if (passenger.getNif().equals(nif)) {
                return true;
            }
        }
        return false;
    }

    public Passenger findPassenger(String nif) {
        for (var passenger : passengers) {
            if (passenger.getNif().equals(nif)) {
                return passenger;
            }
        }
        return null;
    }

    public void showInfo() {
        System.out.println("Vuelo " + number + " " + origin + " - " + destination + ". Puerta: " + gate + ". Pasajeros");
        for (var passenger : passengers) {
            System.out.print("    ");
            passenger.showInfo();
        }
    }
}
