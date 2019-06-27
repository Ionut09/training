package com.java.training.day3.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examples {

    public static void main(String[] args) {
        Stream<String> animals = Stream.of("dog", "cat", "horse", "horse", "horse");
        Stream<String> animals1 = Stream.of("dog", "cat", "horse");
        Stream<String> animals2 = Stream.of("dog", "cat", "horse");
        Stream<String> animals3 = Stream.of("dog", "cat", "horse");
        Stream<String> animals4 = Stream.of("dog", "cat", "horse");
        Stream<String> animals5 = Stream.of("dog", "cat", "horse");
        Stream<String> animals6 = Stream.of("dog", "cat", "horse");
        Stream<String> animals7 = Stream.of("dog", "cat", "horse");
        Stream<Object> empty = Stream.empty();

        //  String apply(String t);
        Stream<String> infiniteStream = Stream.iterate("", s -> s + "A");

//        long count = animals.count();
//        System.out.println("Avem "+count+" animale");

        Optional<String> max = animals1.max(Comparator.naturalOrder());
        if (max.isPresent()) {
            //serious logic here
            String maxString = max.get();
        }
        max.ifPresent((String s) -> System.out.println(s));
        System.out.println(max);
        Optional<String> min = animals2.min(Comparator.naturalOrder());
        System.out.println(min);

        //boolean test(String t)
        System.out.println(animals3.allMatch(s -> s.equals("dog"))); //false
        System.out.println(animals4.anyMatch(s -> s.equals("dog"))); //true
        System.out.println(animals5.noneMatch(s -> s.equals("dog"))); //false

        //    String apply(String t, String u);
        System.out.println(animals6.reduce("", (s1, s2) -> s1.concat(s2)));

        //System.out.println(animals7.collect(Collectors.joining(",")));
        //       System.out.println(animals7.collect(Collectors.toList()));
        //       System.out.println(animals7.collect(Collectors.toSet()));
        System.out.println(animals7.collect(Collectors.toMap(s -> s.length(), s -> s.toUpperCase(), (v1, v2) -> v1 + "," + v2)));
//        System.out.println(animals7.collect(Collectors.toMap(s -> s, String::toUpperCase)));


        /*
        filter(Predicate<T>), distinct(), skip(int), limit(int), sorted(Comparator), map(Function), flatMap()
         */

//        List<String> animale = animals//.filter(animal -> animal.startsWith("d"))
//                                      //.map(animal -> animal.toUpperCase())
//                                      .sorted()
//                                      .distinct()
//                                      .map(String::toUpperCase)
//                                      .collect(Collectors.toList());

        String uniqueCharacters = animals.map(string -> string.split(""))
                                         .flatMap(array -> Stream.of(array))
                                         .distinct()
                                         .sorted()
                                         .collect(Collectors.joining(","));

        System.out.println(uniqueCharacters);

    }
}
