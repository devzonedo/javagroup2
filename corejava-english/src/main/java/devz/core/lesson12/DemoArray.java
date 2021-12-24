package devz.core.lesson12;

public class DemoArray {

    public static void main(String[] args) {

        int[] age = {12, 15, 25};
        System.out.println("the value:" + age[2]);

        age[1] = 50;
        System.out.println("value:" + age[1]);

        String[] cars = {"TOYOTA", "NISSAN", "MICRO"};
        System.out.println(cars[2]);

        int[] myArr = new int[30];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i;
        }

        System.out.println("--------showing array values------------");
        for (int i = 29; i >= 0 ; i--) {
            System.out.println("value:"+myArr[i]);
        }
        
        
        
    }

}
