package com.java.training.day3.streams;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Trader {
    private final String name;
    private final String city;

    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}
