package org.ies.tierno.objects.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;
@Data
@AllArgsConstructor
public class Passenger {
    private String nif;
    private String name;
    private String surname;
    private int seat;
}
