package com.mihir.introduction;

public class Main {
    public static void main(String[] args) {
        Student[] student=new Student[5];
        Student kunal =new Student();
        System.out.println(kunal.name);
    }

}
class Student{
    int rno;
    String name;
    float marks;
}

