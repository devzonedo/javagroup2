package devz.core.lesson7;

import java.util.Scanner;

public class ExFor1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String nm = in.nextLine();
        System.out.println("How many times Wanna repeat?");
        int r = in.nextInt();

        for (int i = 1; i <= r; i++) {
            System.out.println(i + "-" +nm);
        }

        System.out.println("--------------------------------");
        
        int val = 25;
        for (int i = val; i!=0  ; i--) {
            System.out.println(i);
        }
        
    }

}
