
package devz.core.lesson10;


public class DemoCar {
   
    public static void main(String[] args) {
        Car mycar = new Car();
        Car volvo = new Car(5,"Sri Lanka");
        System.out.println(volvo.speed);
        System.out.println(volvo.country);
    }
}
