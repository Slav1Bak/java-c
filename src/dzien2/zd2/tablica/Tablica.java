package dzien2.zd2.tablica;

public class Tablica {
    public static void main(String[] args) {
        double signal[] = {0.5, 0.11, 0.43, 0.67, 0.01, 0.011};
        //wypisanie
        System.out.println(signal[0]);
        System.out.println(signal[1]);
        System.out.println(signal[2]);
        System.out.println(signal[3]);
        System.out.println(signal[4]);
        System.out.println(signal[5]);

        //modyfikacja
        signal[4] = 0;
        System.out.println(signal[0]);
        System.out.println(signal[1]);
        System.out.println(signal[2]);
        System.out.println(signal[3]);
        System.out.println(signal[4]);
        System.out.println(signal[5]);

        //dlugosc tablicy
        System.out.println("dlugosc: " + signal.length);
        String names [] = new String[150];
        System.out.println("dlugosc imiona: " + names.length);
    }
}
