package Problems;

import java.util.Scanner;

// input any num
// Leap year or not
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        if (year % 400 == 0){
                System.out.println("It is a leap year.");
        }else if (year % 100 == 0){
            System.out.println("It is not a leap year");
        }else if (year % 4 == 0){
            System.out.println("It is a leap year");
        }else {
            System.out.println("It is not a leap year");
        }
    }
}
