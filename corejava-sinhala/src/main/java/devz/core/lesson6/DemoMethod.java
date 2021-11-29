package devz.core.lesson6;

public class DemoMethod {

    public static void main(String[] args) {

        int myAge = 0;

        Teacher myT = new Teacher();
        myT.getTeacherCountry();
        System.out.println("myAge:" + myAge);
        myAge = myT.getAge();
        System.out.println("myAge:" + myAge);

        int d = 25;
        int p = 30;
        String asd = "Gayan";
        myT.calculateSalary(d, p);

        String fullName = myT.getTeacherFullName("Kumara", "Fernando", "M");
        System.out.println("fullName:" + fullName);

        fullName = myT.getTeacherFullName("Gayathri", "Perera", "F");
        System.out.println("fullName:" + fullName);

    }

}
