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
        
        //1. Arithmetic 
        // + - / * %
        int num1 = 15;
        int num2 = 10;
        int ans = num1 * num2;
        System.out.println("ans:"+ans);
        
        int mod = 13 % 5;
        System.out.println("mod:"+mod);
        
        
        System.out.println("-----2.----------------------");
        //2.
        int x = 30;
        System.out.println(x--); // 30 
        System.out.println("x is:"+x); // 31
        
        
    }
}
