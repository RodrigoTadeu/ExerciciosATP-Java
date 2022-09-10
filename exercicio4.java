import java.util.*;

class exercicio4 {

    public static void main(String []args) {
        
        int funcionario;
        double salarioAtual, reposicaoSalarial, produtividade, novoSalario, aumento;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o código do funcionário: ");
        funcionario = scr.nextInt();
        
        System.out.println("Digite o salário atual: ");
        salarioAtual = scr.nextDouble();

        System.out.println("Digite a reposição salarial em porcentagem (sem o %): ");
        reposicaoSalarial = scr.nextDouble();

        System.out.println("Digite a produtividade em porentagem (sem o %): ");
        produtividade = scr.nextDouble();

        reposicaoSalarial = reposicaoSalarial/100d * salarioAtual ;
        produtividade = produtividade/100d * (salarioAtual + reposicaoSalarial); 

        aumento = reposicaoSalarial + produtividade;
        novoSalario = salarioAtual + reposicaoSalarial + produtividade;

        System.out.println ("O código do funcionário é : " +  funcionario);
        System.out.printf("Salário atual é de %2.2f reais \n", salarioAtual );
        System.out.printf("O funcionário terá aumento de %2.2f reais \n", aumento);
        System.out.printf("O novo salário do funcionário é de %2.2f reais ", novoSalario);
    }
}