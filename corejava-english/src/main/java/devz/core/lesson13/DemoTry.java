package devz.core.lesson13;

public class DemoTry {

    public static void main(String[] args) {

        int[] a = {5, 10};
        
        try {
            System.out.println("Print:" + a[15]); // 10
        }catch(NullPointerException n){    
            n.printStackTrace();
            System.out.println("something went wrong NullPointerException");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("something went wrong");
        }
        
        System.out.println("continue......");
        

    }
    
    
    
    
    
    
    
    
    
    

}
