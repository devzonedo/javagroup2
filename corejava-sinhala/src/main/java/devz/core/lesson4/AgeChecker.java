
package devz.core.lesson4;

import java.util.Scanner;




public class AgeChecker {
  
    public static void main(String[] args) {
        
        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = in.nextInt();
        System.out.println("age:"+age);
        
        if(age < 18){
            System.out.println("you are a child");
        }else{
            System.out.println("you are elder");
        }
        
    }
    
    
}
