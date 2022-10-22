package com.hw;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ComparisonOfMaps {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("For HashMap : order inside is not guaranteed");
        testMap(hashMap);
        System.out.println("\nFor LinkedHashMap : pairs (key, value) will be returned in the order they were added");
        testMap(linkedHashMap);
        System.out.println("\nFor TreeMap : pairs (key, value) are sorted by key (natural order)");
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(37, "Bob");
        map.put(13, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
