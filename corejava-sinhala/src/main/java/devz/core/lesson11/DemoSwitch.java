package devz.core.lesson11;

public class DemoSwitch {

    public static void main(String[] args) {

        int age = 12;
        char myChar = 'Q';
        switch (myChar) {
            case 'A':
                System.out.println("Age is 5");
                break;
            case 'Q':
                System.out.println("Age is 10");
                break;
            case 'B':
                System.out.println("Age is 15");
                break;
            default:
                System.out.println("this is default");
        }

    }

}
