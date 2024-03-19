package com.mihir.introduction;

public class string {
    public static void main(String[] args) {
        String A = "hello";
        String B = "java";
        int sum = A.length() + B.length();
//
        System.out.println(sum);
        if(A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        String outA = A.substring(0,1).toUpperCase() + A.substring(1);
        String outB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(outA + " " + outB);


    }


}
