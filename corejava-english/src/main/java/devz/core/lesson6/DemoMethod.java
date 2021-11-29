/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devz.core.lesson6;

/**
 *
 * @author devzo
 */
public class DemoMethod {
   
    public static void main(String[] args) {
        
        int temp = 0;
        
        Teacher myT = new Teacher();
        
        myT.getTeacherCountry();
        System.out.println("Temp:"+temp);
        temp = myT.getTeacherAge();
        System.out.println("Temp:"+temp);
        
        
        int d = 25;
        int p = 30;
        
        myT.calculateSalary(d, p);
        String full = myT.getTeacherName("Saman", "Kumara", "M");
        System.out.println("full:"+full);
        full = myT.getTeacherName("Kumari", "Perera", "F");
         System.out.println("full:"+full);
        
    }
    
}
