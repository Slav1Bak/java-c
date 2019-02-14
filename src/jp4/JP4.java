package jp4;

public class JP4 {
    public static void main(String[] args) {

        String zdanie = "Ala ma kota a kot ma Ale";

        String words[] = zdanie.split(" ");
   /*    System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);              reczne jebanie
        System.out.println(words[4]);
        System.out.println(words[5]);
        System.out.println(words[6]);
*/
                         // automatyczne jebanie
        for (String word : words) {
            System.out.println(word);
        }
    }
}
