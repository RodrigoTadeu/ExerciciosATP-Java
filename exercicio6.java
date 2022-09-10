import java.util.*;
public class exercicio6 {
    public static void main(String []args) {
        int x, y, z;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um número");
        x = scr.nextInt();

        System.out.println("Digite outro número");
        y = scr.nextInt();

        System.out.println("Digite outro número");
        z = scr.nextInt();

        if( ( x > y && x > z ) && ( y > z ) ) { 
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
        else if( ( x > y && x > z ) && ( z > y ) ) { 
            System.out.println(x);
            System.out.println(z);
            System.out.println(y);
        }
        else if( ( y > x && y > z ) && ( x > z ) ) { 
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);
        }
        else if( ( y > x && y > z ) && ( z > x ) ) { 
            System.out.println(y);
            System.out.println(z);
            System.out.println(x);
        }
        else if( ( z > x && z > y ) && ( x > y ) ) { 
            System.out.println(z);
            System.out.println(x);
            System.out.println(y);
        }
        else if( ( z > x && z > y ) && ( y > x ) ) { 
            System.out.println(z);
            System.out.println(y);
            System.out.println(x);
        }}}
