/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devz.core.lesson13;

import java.util.Scanner;

/**
 *
 * @author devzo
 */
public class Demo2Try {

    public static void main(String[] args) {
        System.out.println("Start....");
        
        try {
             new Demo2Try().getUserInput();
        
        }catch(NameException n){
            System.out.println(n.getMessage());
        }catch(MyInputException m){
            System.out.println(m.getMessage());
        } catch (Exception e) {
            System.out.println("error occour");
        }
        System.out.println("End....");
    }

    
    
    void getUserInput() throws MyInputException,NameException {
        int age = 0;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Age:");
            age = in.nextInt();
            System.out.println("Age is:" + age);
            
        } catch (Exception e) {
            throw new MyInputException("Invalid input found");
        }
        
        
        try {
            if(age < 10){
                throw new NameException("Name Exception placed");
            }
        }catch(NameException n){    
            System.out.println(n.getMessage());
             throw new NameException("I found Name Exepction");
        } catch (Exception e) {
            
        }
        
        
    }

}
