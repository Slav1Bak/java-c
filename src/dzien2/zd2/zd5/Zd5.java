package dzien2.zd2.zd5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zd5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe od 1 do 5");

        int key = scanner.nextInt();

        switch (key) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            default:
                System.out.println("nie ta liczba cwoku, tylko 1-5");
                break;
        }
    }
}
