/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devz.core.lesson12;

/**
 *
 * @author devzo
 */
public class DemoArray {
    
    
    public static void main(String[] args) {
        
        int[] age = { 10,20,35,45 };
        System.out.println("the value is :"+ age[2]);
        age[1] = 50;
        
        
        
        String[] cars = { "NISSAN" ,"MICRO", "VOLVO" };
        System.out.println(cars[2]);
        
        
        System.out.println(" length of the cars array:"+cars.length);
        
        
        System.out.println("-------------------------------");
        
        int[] x = {0 , 1 , 2 , 3 , 4 , 5};
        for(int i=5;  i >= 0  ; i--  ){
            System.out.println("value :" + x[i] );
        }
        
        
        int[] myArray = new int[100];
        
        
        
        
    }
    
    
}
