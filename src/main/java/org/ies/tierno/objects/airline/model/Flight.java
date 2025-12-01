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

    public void showInfo(){
        System.out.println("Vuelo " + number+origin+destination+". Puerta "+gate+" .");
        for (var passenger:passengers){
            passenger.showInfo();
            System.out.println(", ");
        }
    }

     /*public Passenger hasPassenger(String nif){

     }*/


}
