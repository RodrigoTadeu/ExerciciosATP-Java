import java.util.*;

public class exercicio5 {
    public static void main(String []args) {
        double peso , tempoCorrida, tempoPedala, tempoNadar;
        double energiaGastaCorrida, energiaGastaPedalar, energiaGastaNadar;
        double total;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite seu peso :");
        peso = scr.nextDouble();

        System.out.println("Digite seu tempo de corrida :");
        tempoCorrida = scr.nextDouble();

        System.out.println("Digite seu tempo de pedalar :");
        tempoPedala = scr.nextDouble();

        System.out.println("Digite seu tempo de nadar :");
        tempoNadar = scr.nextDouble();

        energiaGastaCorrida = 7d * peso * (tempoCorrida / 60);
        energiaGastaPedalar = 7d * peso * (tempoPedala / 60);
        energiaGastaNadar = 8d * peso * (tempoNadar / 60);
        total = energiaGastaCorrida + energiaGastaPedalar + energiaGastaNadar;

        System.out.printf("A caloria que o usuário gasta por semana é de : %2.2f calorias ", total);
    }}