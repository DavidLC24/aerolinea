package org.ies.tierno.objects.airline.apps;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.tierno.objects.airline.model.Airline;
import org.ies.tierno.objects.airline.model.Flight;
import org.ies.tierno.objects.airline.model.Passenger;
import org.ies.tierno.objects.airline.readers.AirlineReader;
import org.ies.tierno.objects.airline.readers.FlightReader;
import org.ies.tierno.objects.airline.readers.PassengerReader;

import java.util.Scanner;
@Data
@AllArgsConstructor
public class AirlineAppMenu {
    private final Scanner sc;
    private final AirlineReader airlineReader;
    private final FlightReader flightReader;
    private final PassengerReader passengerReader;

    public void run(){
        Airline airline= airlineReader.read();
        Flight flight= flightReader.read();
        Passenger passenger= passengerReader.read();
        int opt;
        do {
            opt = chooseOption();
            if (opt == 1) {
                airline.showInfo();
            } else if (opt == 2) {
                airline.showFlightsFromOrigin(flight.getOrigin());
            } else if (opt == 3) {

            } else if (opt == 4) {

            } else if (opt == 5) {

            } else if (opt == 6) {
                System.out.println("Saliendo...");
            }
            else {
                System.out.println("Opción inválida");
            }
        }while (opt!=6);
    }

    private int chooseOption() {
        int opt;
        System.out.println("Elige una opción:");
        System.out.println("1. Muestra todos los vuelos");
        System.out.println("2. Muestra vuelos origen");
        System.out.println("3. Muestra los vuelos de un pasajero");
        System.out.println("4. Muestra asiento de pasajero");
        System.out.println("5. Cambiar asiento de pasajero");
        System.out.println("6. Salir");
        opt= sc.nextInt();
        sc.nextLine();
        return opt;
    }
}
