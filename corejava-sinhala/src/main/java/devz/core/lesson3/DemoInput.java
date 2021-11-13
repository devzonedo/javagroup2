
package devz.core.lesson3;

import java.util.Scanner;


public class DemoInput {
    
    public static void main(String[] args) {
        
        
        
        String fname;
        String lname;
        int age;
        
        Scanner  in = new Scanner(System.in);
        System.out.println("Enter your First Name:");
        fname = in.nextLine();
        System.out.println("Enter your Last Name:");
        lname = in.nextLine();
        System.out.println("Enter your Age:");
        age = in.nextInt();
        
        System.out.println(fname +" "+ lname);
        System.out.println(age);
        
    }
    
    
}
