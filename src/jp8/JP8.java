package jp8;

import static java.lang.Math.sqrt;

public class JP8 {
    public static void main(String[] args) {
        /*
        pole trojkata rownobocznego bok
        pojemnosc szescianu  bok
        srednia z 4 ocen   z podanych 4
        pole prostokata  z bokow
        kwote brutto na pdst netto i stawki vat
        ile banknot
         */


        int bokTrojkata, bokSzescianu, ocena1, ocena2, ocena3, ocena4, boka, bokb, netto, kwota, iloscbanknotow20;
        double poletrojkata, vat, pojemnosc, srednia, poleprostokata, brutto;
        bokTrojkata = 5;
        bokSzescianu = 10;
        ocena1 = 3;
        ocena2 = 4;
        ocena3 = 5;
        ocena4 = 2;
        boka = 4;
        bokb = 15;
        netto = 1000;
        vat = 1.23;
        kwota = 120;
        poletrojkata = bokTrojkata * 0.5 * (bokTrojkata * sqrt(3)/ 2);
        pojemnosc = bokSzescianu ^ 3;
        srednia = (ocena1 + ocena2 + ocena3 + ocena4) / 4;
        poleprostokata = boka * bokb;
        brutto = netto * vat;
        iloscbanknotow20 = kwota;
        int x = 1;

        if (kwota % 20 == 0) {
            if (kwota / 20 <= 1) {
                System.out.println("potrzeba 1 banknot");
            } else {
                if (kwota/20 >= 5) {
                    System.out.println("potrzeba " + kwota / 20 + " banknotów");
                } else {
                    System.out.println("potrzeba " + kwota / 20 + " banknoty");
                }
            }
        } else {
            System.out.println("potrzeba " + (kwota / 20 + x));
        }

        System.out.println("pole wynosi " + poletrojkata);
        System.out.println("pojemnosc wynosi " + pojemnosc);
        System.out.println("srednia to " + srednia);
        System.out.println("pole prostokata wynosi " + poleprostokata);
        System.out.println("kwota brutto wynosi " + brutto);
        System.out.print("kwot brutto wynosi");
        System.out.printf("%10.2fzl", brutto);
        System.out.println();


    }

}