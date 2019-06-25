package com.java.training.day1.class_design;

import com.java.training.day1.building_blocks.Dog;

import java.util.ArrayList;
import java.util.List;

public class Polimorphism {

    public static void main(String[] args) {
        Animal a = new Wolf();

        //Animal wolf = a.eat();
        Animal wolf = new Canine();

        //cast
        //wolf.hawl();  hawl is not visible for wolf refernce because its of type Animal
        if (wolf instanceof Wolf) {
            Wolf castedWolf = (Wolf) wolf; //java.lang.ClassCastException:
            ((Wolf) wolf).hawl();
            castedWolf.hawl();
        }

        methodPolimorphicParameters(new Canine());
        methodPolimorphicParameters(new Cat("Kitie"));
        methodPolimorphicParameters(new Wolf());

        List<Domestic> animaleDinOgrada = new ArrayList<>();
        animaleDinOgrada.add(new Cat(""));
        animaleDinOgrada.add(new Dog());
        animaleDinOgrada.add(new Horse());

        animaleDinOgrada.forEach((Domestic domestica) -> {
                                                            domestica.eats();
                                                        });

    }

    static void methodPolimorphicParameters(Animal a) {
        System.out.println(a.getClass());
    }
}
