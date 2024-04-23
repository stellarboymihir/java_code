//package com.mihir.introduction;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Student {
//    int rollNo;
//    String name, address;
//
//    public Student(int rollNo, String name, String address) {
//        this.rollNo = rollNo;
//        this.name = name;
//        this.address = address;
//    }
//
//    public String toString() {
//        return this.rollNo + " " + this.name + " " + this.address;
//    }
//}
//
//class Sortbyroll implements Comparator<Students> {
//    public int compare(Students a, Students b) {
//        return Integer.compare(a.rollNo, b.rollNo);
//    }
//}
//
//class Sortbyname implements Comparator<Students> {
//    public int compare(Students a, Students b) {
//        return a.name.compareTo(b.name);
//    }
//}
//
//class ComparatorExample {
//    public static void main(String[] args) {
//        ArrayList<Students> arr = new ArrayList<>();
//        arr.add(new Students(111, "Mayank", "London"));
//        arr.add(new Students(131, "Anshul", "NYC"));
//        arr.add(new Students(121, "Solanki", "Jaipur"));
//        arr.add(new Students(101, "Aggarwal", "HongKong"));
//
//        System.out.println("Unsorted:");
//        for (Students students : arr) {
//            System.out.println(students);
//        }
//
//        Collections.sort(arr, new Sortbyroll());
//        System.out.println("\nSorted By RollNo:");
//        for (Students students : arr) {
//            System.out.println(students);
//        }
//
//        Collections.sort(arr, new Sortbyname());
//        System.out.println("\nSorted by Name:");
//        for (Students students : arr) {
//            System.out.println(students);
//        }
//    }
//}
