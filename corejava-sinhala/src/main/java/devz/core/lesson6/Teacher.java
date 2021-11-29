package devz.core.lesson6;

public class Teacher {

    int id;
    String fname;
    String lname;
    String nic;
    String addressLine1;
    String addressLine2;
    String addressLine3;
    String city;
    int age = 30;

    //1. No Args , No return-type
    void getTeacherCountry() {
        System.out.println("Sri Lanka");
    }

    //2. No Args , Return Type
    int getAge() {
        int a;
        a = this.age; // a  = 30
        return a;
    }

    //3. Args , No return type
    void calculateSalary(int dayPay, int noDays) {
        int ttlSalary = dayPay * noDays;
        System.out.println("Total Salary:" + ttlSalary);
    }

    //4. Args  , Return Type
    String getTeacherFullName(String fname, String lname, String gender) {
        String full = "";
        if (gender.equalsIgnoreCase("M")) {
            full = "Mr." + fname + " " + lname;
        } else if (gender.equalsIgnoreCase("F")) {
            full = "Ms." + fname + " " + lname;
        }
        return full;
    }

}
