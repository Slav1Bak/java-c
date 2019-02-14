package jp7;

public class JP7 {
    public static void main(String[] args) {

        // if a true to kobieta if nie to facet
        // a ostania litera
        String name = "Ewa";

        System.out.println(name);

        System.out.println(name.charAt(name.length()-1));

        if(name.charAt(name.length()-1)== 'a'){
            System.out.println("kobiece imie");
        }
            else {
            System.out.println("meskie imie");
        }

    }
}
