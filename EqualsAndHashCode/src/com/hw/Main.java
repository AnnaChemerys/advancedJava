package com.hw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Tom");
        Person person2 = new Person(1, "Tom");

        map.put(person1, "Hi");
        map.put(person2, "Hi");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);
    }
}
