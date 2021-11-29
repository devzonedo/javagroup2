
package devz.core.lesson7;

import java.util.Scanner;


public class ExFor {
    
    public static void main(String[] args) {
        
        System.out.println("Enter your Name:");
        Scanner in = new Scanner(System.in);
        String nm = in.nextLine();
        System.out.println("How many times want to repeat this?");
        int r = in.nextInt();
        
        for(int i=1; i <= r; i++){
            System.out.println(i + "-"+nm);
        }
        
        
        
        
    }
    
}
