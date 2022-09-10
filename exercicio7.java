import java.util.*;

public class exercicio7 {
    public static void main(String []args) {
        int x, y, z;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um número");
        x = scr.nextInt();

        System.out.println("Digite outro número");
        y = scr.nextInt();

        System.out.println("Digite outro número");
        z = scr.nextInt();

        if (x+y>z && x+z>y && y+z>x) {
            if (x==y && x==z) {
                System.out.println("É um triângulo equilátero! ");
            } else if (x==y || x==z || y==z){
                System.out.println("É um triângulo isósceles!");
            } else {
                System.out.println("É um triângulo escaleno!");
            }

        } else {
            System.out.println("Não é um triângulo");
        }

    }}
    