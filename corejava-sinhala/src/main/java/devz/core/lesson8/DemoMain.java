
package devz.core.lesson8;


public class DemoMain {
    
    
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj.fname);
        obj.fname = "Kumara";
        System.out.println(obj.fname);
        
        obj.setAge(25);
        int ag =  obj.getAge();
        System.out.println("age:"+ag);
    }
    
    
}
