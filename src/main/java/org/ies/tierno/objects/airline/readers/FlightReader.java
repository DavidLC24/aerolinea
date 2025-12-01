package org.ies.tierno.objects.airline.readers;

import org.ies.tierno.objects.airline.model.Flight;
import org.ies.tierno.objects.airline.model.Passenger;

import java.util.Scanner;

public class FlightReader {
    private final Scanner scanner;
    private final PassengerReader passengerReader;

    public FlightReader(Scanner scanner, PassengerReader passengerReader) {
        this.scanner = scanner;
        this.passengerReader = passengerReader;
    }

    public Flight read() {
        System.out.println("Introduce los datos del vuelo");

        System.out.println("Número de vuelo:");
        int numFlight = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Origen:");
        String origin = scanner.nextLine();

        System.out.println("Destino:");
        String destination = scanner.nextLine();

        System.out.println("Puerta:");
        String gate = scanner.nextLine();

        System.out.println("¿Cuántos pasajeros tiene?");
        int numPassengers = scanner.nextInt();
        scanner.nextLine();

        Passenger[] passengers = new Passenger[numPassengers];
        for (int i = 0; i < passengers.length; i++) {
            passengers[i] = passengerReader.read();
        }

        return new Flight(
                numFlight,
                origin,
                destination,
                gate,
                passengers
        );
    }
}
