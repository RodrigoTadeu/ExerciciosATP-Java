import java.util.*;

class exercicio2 {

    public static void main(String []args) {
        
        int computadores, portaSwitch;
        int quantidadeSwitch;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o número de computadores :");
        computadores = scr.nextInt();

        System.out.println("Digite quantas portas cada switch tem :");
        portaSwitch = scr.nextInt();
       
        quantidadeSwitch = computadores / portaSwitch;

        System.out.println("Deverão ser adquiridos : " + quantidadeSwitch + " switchs");

    }
}