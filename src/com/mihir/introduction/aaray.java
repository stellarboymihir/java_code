package com.mihir.introduction;

// Reverse words in the given String
//eg: I love Java, the coffee
//coffee the Java, love I

import java.util.Arrays;
import java.util.Collections;

public class aaray {
//    public static void main(String[] args) {
////        int[] arr = {5, 2, 4, 6};
////        int i = 0;
////
////        for (int idx : arr){
////            System.out.println(idx + " " + i++);
////        }
////        int[] arr = {5, -2, 23, 7, 87, -42, 509};
//        Integer[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
//
////        System.out.println("The original array is: ");
////        for (int num : arr){
////            System.out.print(num + " ");
////        }
//        Arrays.sort(arr, Collections.reverseOrder());
////        System.out.println("The sorted array is: ");
////        for (int num : arr){
////            System.out.print(num + " ");
//
//        System.out.println("Modified arr[] : " + Arrays.toString(arr));
////        }
//    }


    public static void main(String[] args) {
        int[] sqNum = new int[10];

        int i = 1;
//        for (int i = 0; i < 10; i++){
//            int square = (i + 1) * (i + 1);
//

        String[] arr = {
                "practise.geeksforgeeks.org",
                "www.geeksforgeeks.org",
                "code.geeksforgeeks.org"
        };

        Arrays.sort(arr);
        System.out.println("Modified arr[]: " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Modified arr[]: " + Arrays.toString(arr));

    }
}

