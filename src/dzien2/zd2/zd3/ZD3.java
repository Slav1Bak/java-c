package dzien2.zd2.zd3;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ZD3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("wykonaj dzialanie dozwolone: (+), (-), (*), (/), (%), (^)");
        double var1 = scanner.nextDouble();
        scanner.nextLine();
        char key = scanner.nextLine().charAt(0);
        double var2 = scanner.nextDouble();
        switch (key) {
            case '+':
                System.out.printf("%10.2f %c %10.2f =%10.2f", var1, key, var2, var1 + var2);
                break;
            case '-':
                System.out.printf("%10.2f %c %10.2f =%10.2f", var1, key, var2, var1 - var2);
                break;
            case '*':
                System.out.printf("%10.2f %c %10.2f =%10.2f", var1, key, var2, var1 * var2);
                break;
            case '/':
                System.out.printf("%10.2f %c %10.2f =%10.2f", var1, key, var2, var1 / var2);
                break;
            case '%':
                System.out.printf("%10.2f %c %10.2f =%10.2f", var1, key, var2, var1 % var2);
                break;
            case '^':
                System.out.printf("%10.2f %c %10.2f =%10.2f", var1, key, var2, pow(var1, var2));
                break;
        }

    }
}
