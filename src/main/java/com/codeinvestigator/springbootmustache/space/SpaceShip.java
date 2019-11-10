package com.codeinvestigator.springbootmustache.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceShip {
    private String name;
    private Integer crew;
    private Double fuelpercentage;
}
