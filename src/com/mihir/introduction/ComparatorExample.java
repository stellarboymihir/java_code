package com.mihir.introduction;
//package com.mihir.introduction;
// Java Program to Demonstrate Working of
//// Comparator Interface
//
//// Importing required classes
//import java.io.*;
//import java.lang.*;
//import java.util.*;
//
//// Class 1
//// A class to represent a Student
//class Student {
//
//    // Attributes of a student
//    int rollno;
//    String name, address;
//
//    // Constructor
//    public Student(int rollno, String name, String address)
//    {
//
//        // This keyword refers to current instance itself
//        this.rollno = rollno;
//        this.name = name;
//        this.address = address;
//    }
//
//    // Method of Student class
//    // To print student details in main()
//    public String toString()
//    {
//
//        // Returning attributes of Student
//        return this.rollno + " " + this.name + " "
//                + this.address;
//    }
//}
//
//// Class 2
//// Helper class implementing Comparator interface
//class Sortbyroll implements Comparator<Student> {
//
//    // Method
//    // Sorting in ascending order of roll number
//    public int compare(Student a, Student b)
//    {
//
//        return a.rollno - b.rollno;
//    }
//}
//
//// Class 3
//// Helper class implementing Comparator interface
//class Sortbyname implements Comparator<Student> {
//
//    // Method
//    // Sorting in ascending order of name
//    public int compare(Student a, Student b)
//    {
//
//        return a.name.compareTo(b.name);
//    }
//}
//
//// Class 4
//// Main class
//class GFG {
//
//    // Main driver method
//    public static void main(String[] args)
//    {
//
//        // Creating an empty ArrayList of Student type
//        ArrayList<Student> ar = new ArrayList<Student>();
//
//        // Adding entries in above List
//        // using add() method
//        ar.add(new Student(111, "Mayank", "london"));
//        ar.add(new Student(131, "Anshul", "nyc"));
//        ar.add(new Student(121, "Solanki", "jaipur"));
//        ar.add(new Student(101, "Aggarwal", "Hongkong"));
//
//        // Display message on console for better readability
//        System.out.println("Unsorted");
//
//        // Iterating over entries to print them
//        for (int i = 0; i < ar.size(); i++)
//            System.out.println(ar.get(i));
//
//        // Sorting student entries by roll number
//        Collections.sort(ar, new Sortbyroll());
//
//        // Display message on console for better readability
//        System.out.println("\nSorted by rollno");
//
//        // Again iterating over entries to print them
//        for (int i = 0; i < ar.size(); i++)
//            System.out.println(ar.get(i));
//
//        // Sorting student entries by name
//        Collections.sort(ar, new Sortbyname());
//
//        // Display message on console for better readability
//        System.out.println("\nSorted by name");
//
//        // // Again iterating over entries to print them
//        for (int i = 0; i < ar.size(); i++)
//            System.out.println(ar.get(i));
//    }
//}

import java.util.*;

class Students {
    String name;
    int Age;

    public Students(String name, Integer Age){
        this.name = name;
        this.Age = Age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return Age;
    }

    public void setAge(){
        this.Age = Age;
    }

    public String toString(){
        return "Customer {" + "Name = " + name + ", Age = " + Age + '}';
    }
}

class CustomersSortingComparator implements Comparator<Students>{
    public int compare(Students customer1, Students customer2){
        int nameCompare = customer1.getName().compareTo(customer2.getName());
        int ageCompare = customer1.getAge().compareTo(customer2.getAge());

        return (nameCompare == 0) ? ageCompare : nameCompare;
    }
}

class Comp{
    public static void main(String[] args) {
        List<Students> al = new ArrayList<>();

        Students obj1 = new Students("Ajay", 27);
        Students onj2 = new Students("Sneha", 23);
        Students obj3 = new Students("Simran", 37);
        Students obj4 = new Students("Akki", 28);
        Students obj5 = new Students("Aryan", 25);
        Students obj6 = new Students("Ashok", 24);
        Students obj7 = new Students("Gauri", 26);

        al.add(obj1);
        al.add(onj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);
        al.add(obj7);

        Iterator<Students> custIterator = al.iterator();
        System.out.println("Before Sorting: \n");

        while (custIterator.hasNext()){
            System.out.println(custIterator.next());
        }
        Collections.sort(al, new CustomersSortingComparator());
        System.out.println("\n \n After sorting: \n");

        for (Students customer: al){
            System.out.println(customer);
        }
    }
}