package dzien2.zd2.pt1;

import java.util.Scanner;

public class Pt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //  System.out.println("Co chcesz zrobić: \n(1) Zadanie1 \n(2) Zadanie2 \n(3) Zadanie3 \n(0) Wyjście");
        // klucz do instrukcji switch-case
        // int key = scanner.nextInt();

        int key = 1;
        int promien;

        while (key != 0) {
            System.out.println("wpisz wartosc promienia");
            promien = scanner.nextInt();
            System.out.println("wybierz funkcje: \n (1)Pole \n (2)obwod\n (3)sfera ");
            key = scanner.nextInt();
            switch (key) {
                case 1:
                    System.out.printf("Pole %.2f\n",Math.PI*Math.pow(promien, 2));
                    break;
                case 2:
                    System.out.printf("Obwod %.2f\n",Math.PI*2*promien);
                    break;
                case 3:
                    System.out.printf("Sfera %.2f\n",Math.PI*4*Math.pow(promien, 3)/3);
                    break;
                case 0:
                    System.out.println("Wyjście");
                    break;
                default:
                    System.out.println("Błędny wybór!");
            }
        }
        System.out.println("END");
    }
}