package com.mihir.introduction;

import java.util.ArrayList;
import java.util.Collections;

public class sort {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Lamborghini");
//        cars.add("Mercedes");
//        cars.add("Ferrari");
//        cars.add("Roles Royce");
//        cars.add("Audi");
//        cars.add("BMW");
//        Collections.sort(cars);
//        for(String i : cars){
//            System.out.println(i);
//        }

        ArrayList<Integer> myNum = new ArrayList<>();
        myNum.add(33);
        myNum.add(6);
        myNum.add(3);
        myNum.add(12);
        myNum.add(67);
        myNum.add(23);
        myNum.add(55);
        Collections.sort(myNum);

        for (int i : myNum){
            System.out.println(i);
        }


    }
}
