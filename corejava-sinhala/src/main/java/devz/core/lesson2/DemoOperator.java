/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devz.core.lesson2;

/**
 *
 * @author devzo
 */
public class DemoOperator {
    
    
    
    
    public static void main(String[] args) {
        
        //1.Arithmetic Operators 
        //System.out.println(5+8);
        int num1 = 52;
        int num2 = 25;
        int ans = num1 / num2;
        System.out.println("the answer is:"+ans);
        
        int mod = 12 % 5;
        System.out.println("the mod is:"+mod);
        
        
        System.out.println("------Unary Operators-----------------------------");
        //2.Unary Operators in Java
        int x = 30;
        ++x;
        System.out.println("x:"+x);
        --x;
        
        
        int y = 5;
        System.out.println(y--); //5
        System.out.println("Y is:"+y);  // 6
        
    }
    
    
    
}
