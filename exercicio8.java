import java.util.*;

public class exercicio8 {
    public static void main(String []args) {
        int a, b, c;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um número");
        a = scr.nextInt();

        System.out.println("Digite outro número");
        b = scr.nextInt();

        System.out.println("Digite outro número");
        c = scr.nextInt();

        if (a+b<c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        } else {
            System.out.println("Erro!");
        }

    }}
    