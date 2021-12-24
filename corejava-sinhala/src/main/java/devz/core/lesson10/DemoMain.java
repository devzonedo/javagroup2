
package devz.core.lesson10;


public class DemoMain {
    
    
    public static void main(String[] args) {
        Car myCar = new Car();
        
        Car volvo = new Car(250,"Sri Lanka");
        System.out.println(volvo.speed);
        System.out.println(volvo.country);
    }
    
    
}
