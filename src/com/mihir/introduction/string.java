package com.mihir.introduction;

import java.sql.SQLOutput;
import java.util.Arrays;

public class string {
    public static void main(String[] args) {
//        String A = "helloworld";
//        String a = A.substring(3, 7);
//        System.out.println(a);
//        String B = "java";
//        int sum = A.length() + B.length();
////
//        System.out.println(sum);
//        if(A.charAt(0) > B.charAt(0)){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
//        String outA = A.substring(0,1).toUpperCase() + A.substring(1);
//        String outB = B.substring(0,1).toUpperCase() + B.substring(1);
//        System.out.println(outA + " " + outB);

//
//        String cric = "SachinTendulkar";
//        System.out.println(cric.substring(0, 6));

//        String text = new String("Hello, My Name is Sachin");
//        String[] sentences = text.split("//");
//        System.out.println(Arrays.toString(sentences));

//        String s = "welcometojava";
//        int k = 3;
//        String smallest = s.substring(0,k);
//        String largest = s.substring(0, k);
//
//        for(int i = 0; i < s.length() - k + 1; i++){
//            String sub = s.substring(i, i + k);
//
//            if(i == 0){
//                smallest = sub;
//            }
//            if (sub.compareTo(smallest) < 0 ){
//                smallest = sub;
//            }
//            else  if (sub.compareTo(largest) > 0 ){
//                largest = sub;
//            }
//        }
//        System.out.println(smallest + "\n" +  largest);
//

        String s = "madam";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();

        if (s.equals(rev)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }


}
