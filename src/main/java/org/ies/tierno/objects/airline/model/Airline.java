package org.ies.tierno.objects.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Objects;
@Data
@AllArgsConstructor
public class Airline {
    private String name;
    private Flight[] flights;
    public void showInfo() {
        System.out.println("Aerolínea " + name + ". Vuelos: ");
        for (var flight : flights) {
            flight.showInfo();
        }
    }

    public void showFlightsFromOrigin(String origin) {
        for (var flight : flights) {
            if (flight.getOrigin().equals(origin)) {
                flight.showInfo();
            }
        }
    }

    public Flight findFlight(int number) {
        for (var flight : flights) {
            if (flight.getNumber() == number) {
                return flight;
            }
        }
        return null;
    }

    public void showPassengerFlights(String nif) {
        System.out.println("Los vuelos del pasajero " + nif + " son:");
        for (var flight : flights) {
            if (flight.hasPassenger(nif)) {
                System.out.print("    - ");
                flight.showInfo();
            }
        }
    }

    public Integer getPassengerSeat(int flightNumber, String nif) {
        var flight = findFlight(flightNumber);
        if (flight != null) {
            var passenger = flight.findPassenger(nif);
            if (passenger != null) {
                return passenger.getSeat();
            }
        }
        return null;
    }

    public void updateSeatNumber(int flightNumber, String nif, int seatNumber) {
        var flight = findFlight(flightNumber);
        if (flight != null) {
            var passenger = flight.findPassenger(nif);
            if (passenger != null) {
                passenger.setSeat(seatNumber);
            } else {
                System.out.println("No se ha encontrado el pasajero con nif " + nif);
            }
        } else {
            System.out.println("No se ha encontrado el vuelo " + flightNumber);
        }
    }
}

