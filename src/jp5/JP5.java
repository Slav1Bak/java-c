package jp5;

public class JP5 {
    public static void main(String[] args) {
        // ptawo demonraga    !(p&&q) ==  ((!p) || (!q))

        boolean p, q;

        //4 testy

        p = true;
        q = true;
        System.out.println(!(p&&q) ==  ((!p) || (!q)));
        p = true;
        q = false;
        System.out.println(!(p&&q) ==  ((!p) || (!q)));
        p = false;
        q = false;
        System.out.println(!(p&&q) ==  ((!p) || (!q)));
        p = false;
        q = true;
        System.out.println(!(p&&q) ==  ((!p) || (!q)));

    }
}
