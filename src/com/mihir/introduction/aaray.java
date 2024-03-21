package com.mihir.introduction;

// Reverse words in the given String
//eg: I love Java, the coffee
//coffee the Java, love I

public class aaray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6};
        int i = 0;

        for (int idx : arr){
            System.out.println(idx + " " + i++);
        }
    }
}
