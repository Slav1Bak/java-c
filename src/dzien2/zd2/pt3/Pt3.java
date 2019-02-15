package dzien2.zd2.pt3;

public class Pt3 {
    public static void main(String[] args) {


        int[] numbers = {3, 5, 6, 2, 7, 8, 1, 9, 2};
        int szukana = 2;
        int licznik = 0;
        for (
                int i = 0;
                i < numbers.length; i++) {
            if (numbers[i] == szukana) {
                licznik++;
            }

        }
        System.out.println(szukana + " występuje " + licznik + " razy");

        int sum_mniejsze = 0;
        int sum_wieksze = 0;
        for (int k : numbers) {
            if (k > szukana) {
                sum_wieksze += k;
            } else if (k < szukana) {
                sum_mniejsze += k;
            }

        }
        System.out.println(sum_wieksze - sum_mniejsze);

        int max_value = numbers[0];
        int max_value2= numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max_value) {
                max_value = numbers[i];
                index = i;
            }
        }

        for (int i = 0; i< numbers.length; i++){
            if(numbers[i] > max_value2 && index != i){
                max_value2 = numbers[i];
            }
        }
        System.out.println(max_value);
        System.out.println(max_value2);
        System.out.println(max_value*max_value2);

    }
}
