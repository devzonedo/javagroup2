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
public class Teacher {

    int id;
    String fname;
    String lname;
    String nic;
    String addressLine1;
    String addressLine2;
    String addressLine3;
    int age = 30;

    //1.No-Args No-Return Type
    void getTeacherCountry() {
        System.out.println("Sri Lanka");
    }

    //2.No-Args  Return Type
    int getTeacherAge() {
        int a = 0;
        a = this.age;
        return a;
    }

    //3. Args  No-Return Type
    void calculateSalary(int days, int pay) {
        int ttlSal = days * pay;
        System.out.println("Total Salary:" + ttlSal);
    }

    //4. Args Return Type
    String getTeacherName(String fn, String ln, String gender) {
        String fullName = "";
        
        if (gender.equalsIgnoreCase("M")) {
            fullName = "Mr." + fn + " " + ln;
        } else if (gender.equalsIgnoreCase("F")) {
            fullName = "Ms." + fn + " " + ln;
        }
        
       return fullName; 
    }

}
