import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);

        double salAtual, salRea, novoSal;

        System.out.println("Digite o salário mensal atual do funcionário: ");
        salAtual = Leia.nextDouble();


        System.out.println("Digite o percentual de reajuste (%): ");
        salRea = Leia.nextDouble();


        novoSal = salAtual + (salAtual * salRea / 100);


        System.out.println("O novo salário do funcionário após o reajuste é: " + novoSal);

        Leia.close();
    }
}
