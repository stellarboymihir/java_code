package com.mihir.introduction;

import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("USA", "Washington DC");
//        capitalCities.put("Spain", "Barcelona");
//        capitalCities.put("France", "Paris");
//
////       capitalCities.size();
//        for (String i : capitalCities.keySet())
//        System.out.println("Key: " + i + " Value: " + capitalCities.get(i));

//        HashMap<String, Integer> people = new HashMap<String, Integer>();
//
//        people.put("Akki", 23);
//        people.put("Ajay",19);
//        people.put("Pushkar", 20);
//        people.put("Karina", 22);
//        people.put("Mihir", 23);
//
//        for(String i : people.keySet())
//        System.out.println("People: " + i + ", Value: " + people.get(i) );

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Mango");
        map.put(2, "Banana");
        map.put(3, "Watermelon");
        map.put(4, "Apple");
        map.put(3, "Orange");

        System.out.println("Iterating HashMap....");
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
