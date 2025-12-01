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
}
