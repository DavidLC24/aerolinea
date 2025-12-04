package org.ies.tierno.objects.airline;

import org.ies.tierno.objects.airline.apps.AirlineApp1;
import org.ies.tierno.objects.airline.readers.AirlineReader;
import org.ies.tierno.objects.airline.readers.FlightReader;
import org.ies.tierno.objects.airline.readers.PassengerReader;

import java.util.Scanner;

public class AirlineApp1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var passengerReader = new PassengerReader(scanner);
        var flightReader = new FlightReader(scanner, passengerReader);
        var airlineReader = new AirlineReader(scanner, flightReader);
        var airlineApp1 = new AirlineApp1(scanner, airlineReader);

        airlineApp1.run();
    }
}
