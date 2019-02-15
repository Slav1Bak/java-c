package dzien2.zd2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ZD2 {
    public static void main(String[] args) {

        int experience;
        Scanner scanner = new Scanner(System.in);


        System.out.println("podaj staż pracy");
        experience = scanner.nextInt();

        if (experience > 11) {
            System.out.println("jestes seniorem");
        } else if (experience < 6 && experience >= 0) {
            System.out.println("jestes juniorem");
        } else if (experience < 0) {
            System.out.println("błedna wartość");
        } else {
            System.out.println("jestes midem");
        }

    }
}
