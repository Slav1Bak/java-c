package start;

public class operatory {
    public static void main(String[] args) {

        int x = 1;
        System.out.println(x++);
        //1
        System.out.println(x);
        //tu juz 2
        int y = 1;
        System.out.println((--y));
        //0 i tu tez 0
        System.out.println((y));

        int a =1, b = 2, c = 3;
        System.out.println((--a) * (b++) + (11+(c--)));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //= przypisanie wartosci == porownanie wartosci
       //&& i || albo ! negacja

        }

    }

