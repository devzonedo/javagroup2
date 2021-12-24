/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devz.core.lesson12;

import java.util.Scanner;

/**
 *
 * @author devzo
 */
public class InputArray {
    
    
    public static void main(String[] args) {
        
        int num;
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        
        int[] numArray = new int[100];
        
        for(int i =0 ; i <= num ; i++){
            System.out.println("i:"+i);
            numArray[i] = i;
        }
        
        System.out.println("----------printing values in array-----------");
        
        for (int i = 0; i <= num; i++) {
            System.out.println("value:"+numArray[i]);
        }
        
        
        
        
    }
    
    
}
