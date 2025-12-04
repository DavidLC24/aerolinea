package org.ies.tierno.objects.airline.apps;

import org.ies.tierno.objects.airline.model.Airline;
import org.ies.tierno.objects.airline.model.Flight;
import org.ies.tierno.objects.airline.model.Passenger;
import org.ies.tierno.objects.airline.readers.AirlineReader;

import java.util.Scanner;

public class AirlineApp1 {
    private final Scanner scanner;
    private final AirlineReader airlineReader;

    public AirlineApp1(Scanner scanner, AirlineReader airlineReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
    }

    public void run() {
        Airline airline = airlineReader.read();
        System.out.println("Número de vuelo");
        int fligthNumber = scanner.nextInt();
        scanner.nextLine();

        Flight flight = airline.findFlight(fligthNumber);
        if (flight != null) {
            System.out.println("Se ha producido un error");
        } else {
            System.out.println("Introduzca su NIF");
            String nif = scanner.nextLine();

            Passenger passenger = flight.findPassenger(nif);
            if (passenger != null) {
                System.out.println("Se ha producido un error");
            } else {
                passenger.showInfo();
                System.out.println("¿ A qué asiento se quiere cambiar al pasajero ?");
                int setNumber = scanner.nextInt();
                scanner.nextLine();
                airline.updateSeatNumber(fligthNumber, nif, setNumber);
                passenger.showInfo();
            }
        }
    }
}