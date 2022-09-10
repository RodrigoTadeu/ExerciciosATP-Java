import java.util.*;

class exercicio3 {

    public static void main(String []args) {
        
        String nome;
        double carrosVendidos, totalVendas;

        Scanner scr = new Scanner(System.in);

        System.out.println("Nome do vendedor: ");
        nome = scr.nextLine();

        System.out.println("Número de carros vendidos:");
        carrosVendidos = scr.nextDouble();

        totalVendas = (500d + (carrosVendidos * 50d )) + (500d + (carrosVendidos * 50d )) * 0.05 ;
        System.out.printf("O salário do vendedor " + nome + " no mês é de : %2.2f reais " , totalVendas);

    }
}