package start;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(" JRE Version: " + System.getProperty("java.runtime.version"));

        //zmienne

        int lunchTimer = 123456;
        int endTimer = 12345655;

        System.out.println(lunchTimer);
        System.out.println(endTimer);

        double salary = 2100.99;

        System.out.println(salary);


        char signA = 'A';
        char sign9 = '9';
        char signTab = '\'';
        char signspace = ' ';

        System.out.println(sign9);
        System.out.println(signA);
        System.out.println(signspace);
        System.out.println(signTab);

        boolean flag = true;
        boolean isLunch = false;

        System.out.println(flag);
        System.out.println(isLunch);

        System.out.println("isLunch = " + isLunch);




   }
}
