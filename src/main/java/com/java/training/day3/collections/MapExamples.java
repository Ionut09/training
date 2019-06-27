package com.java.training.day3.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExamples {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();

        map.put("Andrei", new Student("Andrei", 25));
        map.put("Radu", new Student("Radu", 25));
        map.put("Diana", new Student("Diana", 25));
        map.put("Ionut", new Student("Ionut", 25));
        map.put("Mihai", new Student("Mihai", 25));
        map.putIfAbsent("Mihai", new Student("AltStudent", 25));
        //pt ca deja exista cheia Mihai o sa suprascrie vechea valoare

        System.out.println(map);

        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println("entry:" + entry.getKey() + "=" + entry.getValue());
            if (entry.getKey().equals("Radu")) {
                entry.setValue(new Student("Radu2", 25));
            }
        }

        // Student apply(String t, Student u){
            // return new Student("Radu2", 25);
        //}
        map.computeIfPresent("Radu", (string, student) ->{return new Student("Radu2", 25);});

        Student radu = map.get("Radu");
        System.out.println(radu);
        System.out.println("Mihai e in Map --> "+map.containsValue(new Student("Mihai", 25)));

        Set<String> strings = map.keySet();
        strings.forEach(string -> System.out.println(string));

        Collection<Student> values = map.values();
        values.forEach(student -> System.out.println(student));


        Map<String, Student> sortedMap = new TreeMap<>();

        sortedMap.put("Andrei", new Student("Andrei", 25));
        sortedMap.put("Radu", new Student("Radu", 25));
        sortedMap.put("Diana", new Student("Diana", 25));
        sortedMap.put("Mihai", new Student("Mihai", 25));
        sortedMap.put("Ionut", new Student("Ionut", 25));

        //void accept(Entry<String, Student> entry);
        System.out.println("TreeMap content: ");
        sortedMap.entrySet()
                 .forEach((Map.Entry<String, Student> entry) -> System.out.println(entry));


    }

}
