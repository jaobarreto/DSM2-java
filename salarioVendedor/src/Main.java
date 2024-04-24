import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);

        final double salarioFixo = 1000.0; // o final pode ser usado para variaves constantes (como const em js), como o salario é fixo ele não pode ser alterado.
        final double bonusPorMovel = 50.0;

        System.out.println("Digite a quantidade de móveis vendidos: ");
        int quantidadeMóveisVendidos = Leia.nextInt();


        double bonusTotal = quantidadeMóveisVendidos * bonusPorMovel;


        double salarioTotal = salarioFixo + bonusTotal;


        System.out.println("O salário total do vendedor é: R$ " + salarioTotal);

        Leia.close();
    }
}
