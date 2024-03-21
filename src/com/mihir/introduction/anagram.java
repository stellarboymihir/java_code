package com.mihir.introduction;



public class anagram {
    public static void main(String[] args) {
//        String a = "anagramm";
//        String b = "marganaa";

//        boolean status = true;
//        if(a.length() != b.length()){
////            status = false;
//            System.out.println("String are not an anagram");
//        }else {
//            char[] ch1 = a.toLowerCase().toCharArray();
//            char[] ch2 = b.toLowerCase().toCharArray();
//            Arrays.sort(ch1);
//            Arrays.sort(ch2);
//
//            status = Arrays.equals(ch1, ch2);
//            if (status){
//                System.out.println("Strings are anagram");
//
//            }else {
//                System.out.println("Strings are not an anagram");
//            }
//        }

//      char[] ch1 = a.toUpperCase().toCharArray();
//      char[] ch2 = b.toUpperCase().toCharArray();
//
//      Arrays.sort(ch1);
//      Arrays.sort(ch2);
//
//      for(int i = 0; i < a.length(); i++){
//          try {
//              if (Character.toUpperCase(ch1[i]) != Character.toUpperCase(ch2[i]))
//                  System.out.println("It is not an anagram");
//          }catch (Exception e){
//              System.out.println("It is not an anagram");
//          }
//
//
//      }
//        System.out.println("It is an anagram");

        String a = "s ilent";
        String b = "listen";

//        boolean isAnagram = false;
//        boolean[] isVisited = new boolean[b.length()];
//
//        if (a.length() == b.length()) {
//
//            for (int i = 0; i < a.length(); i++) {
//                char c = a.charAt(i);
//                isAnagram = false;
//                for (int j = 0; j < b.length(); j++) {
//                    if (b.charAt(j) == c && !isVisited[j]) {
//                        isVisited[j] = true;
//                        isAnagram = true;
//                        break;
//                    }
//                }
//                if (!isAnagram) {
//                    break;
//                }
//            }
//        }

        boolean isAnagram = true;

        int[] al = new int[256];
//        int[] bl = new int[256];

        for (char c : a.toCharArray()){
            int index = (int) c;
            al[index]++;
        }
        for (char c : b.toCharArray()){
            int index = (int) c;
            al[index]--;
        }

        for (int i = 0; i < 256; i++){
            if (al[i] !=0){
                isAnagram = false;
                break;
            }
        }

        if (isAnagram){
            System.out.println("Anagram");
        }else {
            System.out.println("Not an anagram");
        }
    }
}
