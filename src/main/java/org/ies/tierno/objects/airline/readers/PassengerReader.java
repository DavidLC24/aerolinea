package org.ies.tierno.objects.airline.readers;

import org.ies.tierno.objects.airline.model.Passenger;

import java.util.Scanner;

public class PassengerReader {
    private final Scanner scanner;

    public PassengerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Passenger read() {
        System.out.println("Introduce los datos del pasajero");

        System.out.println("NIF:");
        String nif = scanner.nextLine();

        System.out.println("Nombre:");
        String name = scanner.nextLine();

        System.out.println("Apellidos:");
        String surname = scanner.nextLine();

        System.out.println("Asiento:");
        int seatNumber = scanner.nextInt();
        scanner.nextLine();

        return new Passenger(
                nif,
                name,
                surname,
                seatNumber
        );
    }
}
