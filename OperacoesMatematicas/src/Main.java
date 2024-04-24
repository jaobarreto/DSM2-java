import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2;  //O double usa mais casas decimais do que o float (6 casas)

        Scanner Leia = new Scanner(System.in);

        System.out.println("Digite os valores de n1: ");
        n1 = Leia.nextDouble();

        System.out.println("Digite os valores de n2: ");
        n2 = Leia.nextDouble();

        double adicao = n1 + n2;
        double subtracao = n1 - n2;
        double divisao = n1 / n2;
        double multiplicacao = n1 * n2;

        System.out.println("Adição: " + adicao);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);

        Leia.close(); // fecha o scanner dps de usar
    }
}