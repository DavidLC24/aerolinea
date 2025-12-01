package org.ies.tierno.objects.airline.model;

import java.util.Arrays;
import java.util.Objects;

public class Flight {
    private int number;
    private String origin;
    private String destination;
    private String gate;
    private Passenger[] passengers;

    public Flight(int number, String origin, String destination, String gate, Passenger[] passengers) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        this.gate = gate;
        this.passengers = passengers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return number == flight.number && Objects.equals(origin, flight.origin) && Objects.equals(destination, flight.destination) && Objects.equals(gate, flight.gate) && Objects.deepEquals(passengers, flight.passengers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, origin, destination, gate, Arrays.hashCode(passengers));
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number=" + number +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", gate='" + gate + '\'' +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
