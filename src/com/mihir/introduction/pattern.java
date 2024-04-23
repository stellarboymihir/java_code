package com.mihir.introduction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern {
//    public static void main(String[] args) {
////        int count = 0;
//////        Pattern p  = Pattern.compile("\u00de", Pattern.MULTILINE |
//////                Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE | Pattern.COMMENTS);
//////        Matcher m = p.matcher("\u00fE \n \u00fe");
////
////        Pattern p = Pattern.compile("@Gmail", Pattern.CASE_INSENSITIVE);
////        Matcher m = p.matcher("abc@gmail.com");
//////        while (m.find()){
//////            count = count  + 1;
//////            System.out.println("Start : " + m.start() + ", End: " + m.end() + " Pattern group: " + m.group());
//////
//////        }
////
////        if(m.find())
////            System.out.println("Result: " + m);
//////        System.out.println("Number of matches: " + count);
//
////        String regex = "[a-z]*";
////
////        boolean isValid = Pattern.matches(regex, "hello");
////        System.out.println("Is valid? " + isValid);
//
//
//        String pattern = ".";
//        String text = "rr";
//        Pattern pt = Pattern.compile(pattern);
//        Matcher m = pt.matcher(text);
//
//        System.out.println(m.matches());
//
//    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
           try {
                Pattern.compile(pattern);
               System.out.println("Valid");
           } catch (Exception e) {
               System.out.println("Invalid");
           }
           testCases--;


        }
    }
}
