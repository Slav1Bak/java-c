package dzien3.repetition;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Repetition {

    public static void main(String[] args) {
        // Instrukcje warunkowe if switch-case
        // petle for foreach while do while
        // tablica

        //deklaracja tablicy liczb calkowitych o wymiarze 10 elementow    tablica
        int numTab[] = new int[10];
        // uzytkownik w petli przypisal wartosci do wszystkich komorek tablicy   for

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numTab.length; i++) {
            System.out.println("podaj " + i + " element tablicy");
            numTab[i] = sc.nextInt();
        }
        //wypisanie elementow tablicy for each
        for (int element : numTab) {
            System.out.print(element + " ");

        }
        // w petli while wpisz tylko pARZYSTE wartosci z tablicy
        System.out.print("\nElementy parzyste: ");
        int i = 0;
        while (i < numTab.length) {
            if ((numTab[i] % 2 == 0) && numTab[i] != 0) {

                System.out.print(numTab[i] + " ");
            }
            i++;
        }

        //oblicz wartosc maksymalna w tablicy  for each
        int maxVal = numTab[0];
        for (int element : numTab){
      //      if(element > maxVal){
       //         maxVal = element;
         //   }
         maxVal = element > maxVal ? element: maxVal;
        }
        System.out.println("\nmax val: " + maxVal);
        // oblicz srednia arytmetyczna wszystkich elementow tablcy
        int sum =0;
        for (int element : numTab){
            sum = sum+element;
        }
        System.out.println("srednia: " + (double)sum/numTab.length);
    }
}
