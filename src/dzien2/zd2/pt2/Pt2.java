package dzien2.zd2.pt2;

public class Pt2 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 2, 7, 8, 1, 9};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        int szukane = 2;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == szukane) {
                System.out.println("na indeksie " + i + " jest " + numbers[i]);
            }
        }
    }
}
