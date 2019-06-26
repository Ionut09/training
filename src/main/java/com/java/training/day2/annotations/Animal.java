package com.java.training.day2.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
//@Data asta le face pe toate
public class Animal {
    private String name;

    @EqualsAndHashCode.Exclude
    private String species;

    public void setName(String name){
        this.name = name;
    }
}
