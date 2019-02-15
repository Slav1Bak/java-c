package scaner;


import java.util.Locale;
import java.util.Scanner;

public class Skanowanie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       /* System.out.println("podaj wartosc a");
        int a= scanner.nextInt();
        System.out.println("podaj wartosc b");
        int b= scanner.nextInt();

        System.out.println(a+b);
*/
        System.out.println("podaj staz pracy");
        scanner.useLocale(Locale.US);
        double staz = scanner.nextDouble();
        System.out.println("Twoj staz to " + staz);
//      trzeba dodac linie
        scanner.nextLine();
        System.out.println("podaj imie");
        String name = scanner.nextLine();
        System.out.println("twoje imie " + name);
        scanner.close();
    }
}
