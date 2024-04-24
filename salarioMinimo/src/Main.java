import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        double salMin, salFunc, qtdSalMin;

        System.out.println("Digite o valor do salário mínimo: ");
        salMin = Leia.nextDouble();

        System.out.println("Digite o salário do funcionário: ");
        salFunc = Leia.nextDouble();

        qtdSalMin = salFunc / salMin;

        System.out.println("O funcionário ganha aproximadamente " + qtdSalMin + " salários mínimos.");

        Leia.close();
    }
}
