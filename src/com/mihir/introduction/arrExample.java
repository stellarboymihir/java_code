package com.mihir.introduction;

public class arrExample {

    public static void main(String[] args) {
        int[] intArr = new int[6];
        int length = 0;

        for (int i = 0; i < 3; i++){
            intArr[length] = i;
            length++;
        }

        intArr[3] += 10;

        for (int i = 3; i >= 0; i--){
            intArr[i + 1] = intArr[i];
        }

        intArr[0] = 20;

        for (int i = 4; i >= 2; i--){
            intArr[i+1] = intArr[i];
        }

        intArr[2] = 30;

        for (int i = 0; i < intArr.length; i++){
            System.out.println("Index " + i + " contains " + intArr[i]);
        }


    }


}
