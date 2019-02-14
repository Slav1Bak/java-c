package jp3;

public class JP3 {

    public static void main(String[] args) {

        String wyraz, wyraz2, ciag, costam;
        wyraz = "bon";
        wyraz2 = "DoM";
        ciag = wyraz + wyraz2;
        costam = ciag + "poM";

        System.out.println(ciag.toUpperCase());
        System.out.println(costam.toLowerCase());
        System.out.println(costam.length());
        System.out.println("index 2: " + ciag.charAt(2));
        System.out.println("index 5: " + ciag.charAt(5));
        System.out.println(ciag.charAt(ciag.length()-3));
        System.out.println(costam.substring(0,3));
        System.out.println(costam.substring(3,6));

    }
}
