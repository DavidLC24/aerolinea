package org.ies.tierno.objects.airline.readers;

import org.ies.tierno.objects.airline.model.Airline;
import org.ies.tierno.objects.airline.model.Flight;

import java.util.Scanner;

public class AirlineReader {
    private final Scanner scanner;
    private final FlightReader flightReader;

    public AirlineReader(Scanner scanner, FlightReader flightReader) {
        this.scanner = scanner;
        this.flightReader = flightReader;
    }

    public Airline read() {
        System.out.println("Introduce los datos de la aerolínea");
        System.out.println("Nombre:");
        String name = scanner.nextLine();

        System.out.println("¿Cuántos vuelos tiene?");
        int numFlights = scanner.nextInt();
        scanner.nextLine();

        Flight[] flights = new Flight[numFlights];
        for (int i = 0; i < flights.length; i++) {
            flights[i] = flightReader.read();
        }
        return new Airline(
                name,
                flights
        );
    }
}
