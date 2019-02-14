package start;

public class variables {

    public static void main(String[] args) {

        System.out.println("Klasa String");
        String word = "Lorem ipsum Lorem ipsum";

        System.out.println(word.indexOf("s"));
        //szukanie po wartosci
        System.out.println(word.charAt(8));
        //szukanie po indeksie
        System.out.println(word.indexOf("g"));
        System.out.println(word.length());

        String word2 = "Header";

        System.out.println(word.equals(word2));
        System.out.println(word2.equals("header"));
        System.out.println(word2.equals("Header"));
        System.out.println(!word2.equals(word));

        System.out.println(word.contains("ipsum"));
        System.out.println(word.substring(6, 11));
        System.out.println(word.substring(6, 11).length());
        int myStringLength = word.substring(6, 11).length();
        System.out.println("dlugoscStringa= " + myStringLength);

        //dzielenie

        String words[] = word.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);

    }
}
