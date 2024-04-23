package Problems;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int j = 10;
        for (int i = 1; i <= j; i++) {
            int table = n * i;
            System.out.println(n + " * " + i + " = " + n * i);        }

    }
}
