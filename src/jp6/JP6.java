package jp6;

import java.util.Random;

public class JP6 {
    public static void main(String[] args) {
// x>y   x*2.y    x-2<y< x+3  x*y%==0

        Random rnd = new Random();
        int x = rnd.nextInt(10) + 1;
        System.out.println("x= " + x);
        int y = rnd.nextInt(  10 )+1;
        System.out.println("y= " + y);

        System.out.println(x>y);
        System.out.println(x*2>y);
        System.out.println(x-2<y  &&  y< x+3);
        System.out.println(x*y%2);

    }
}
