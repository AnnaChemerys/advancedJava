package com.hw;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        System.out.println("HashSet");
        testSet(hashSet);
        System.out.println("\nLinkedHashSet");
        testSet(linkedHashSet);
        System.out.println("\nTreeSet");
        testSet(treeSet);
        System.out.println("");
        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet);
        System.out.println("");

        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(0);
        integerSet1.add(1);
        integerSet1.add(2);
        integerSet1.add(3);
        integerSet1.add(4);
        integerSet1.add(5);

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(2);
        integerSet2.add(3);
        integerSet2.add(4);
        integerSet2.add(5);
        integerSet2.add(6);
        integerSet2.add(7);

        // union

        Set<Integer> union = new HashSet<>(integerSet1);
        union.addAll(integerSet2);
        System.out.println(union);

        // intersection

        Set<Integer> intersection = new HashSet<>(integerSet1);
        intersection.retainAll(integerSet2);
        System.out.println(intersection);

        // difference

        Set<Integer> difference = new HashSet<>(integerSet1);
        difference.removeAll(integerSet2);
        System.out.println(difference);
    }

    public static void testSet(Set<String> set) {
        set.add("Mike");
        set.add("Katy");
        set.add("Tom");
        set.add("George");
        set.add("Donald");
        set.add("Tom");
        set.add("Tom");

        for (String name : set) {
            System.out.println(name);
        }
    }
}
