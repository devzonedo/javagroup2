
package devz.core.lesson3;

import java.util.Scanner;


public class DemoInputs {
    public static void main(String[] args) {
        String fname;
        String lname;
        String greeting;
        int age;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Name:");
        fname = in.nextLine();
        System.out.println("Enter Last Name:");
        lname = in.nextLine();
        System.out.println("Enter your age");
        age = in.nextInt();
        
        greeting = "Hi "+fname + " "+ lname;
        System.out.println(greeting);
        System.out.println("age is:"+age);
        
    }
}
