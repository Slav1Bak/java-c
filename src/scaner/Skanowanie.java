package scaner;


import java.util.Scanner;

public class Skanowanie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wartosc a");
        int a= scanner.nextInt();
        System.out.println("podaj wartosc b");
        int b= scanner.nextInt();

        System.out.println(a+b);

    }
}
