package org.ies.tierno.objects.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Objects;
@Data
@AllArgsConstructor
public class Airline {
    private String name;
    private Flight[] flights;
}
