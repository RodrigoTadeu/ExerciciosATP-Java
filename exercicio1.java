import java.util.*;

class exercicio1 {

    public static void main(String []args) {
        
        int comprimentoPista, voltasTotais, reabastecimentoDesejado, mediaDeKmPorLitro;
        float LitrosMinimosPrimeiroAbastecimento;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o comprimento da pista em metro :");
        comprimentoPista = scr.nextInt(); 

        System.out.println("Número total de voltas a serem percorridas :");
        voltasTotais = scr.nextInt();

        System.out.println("Número de reabastecimentos desejados :");
        reabastecimentoDesejado = scr.nextInt();

        System.out.println("consumo de combutível do carro em Km/l :");
        mediaDeKmPorLitro = scr.nextInt();

        comprimentoPista = comprimentoPista/1000;

        LitrosMinimosPrimeiroAbastecimento = comprimentoPista * voltasTotais / reabastecimentoDesejado;

        LitrosMinimosPrimeiroAbastecimento = LitrosMinimosPrimeiroAbastecimento/ mediaDeKmPorLitro;

        System.out.printf("O número mínimo de litros necessários é : %.2f litos", LitrosMinimosPrimeiroAbastecimento);
}}