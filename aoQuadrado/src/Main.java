import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);

        int numero, quadrado;

        System.out.println("Digite um número inteiro: ");
        numero = Leia.nextInt();


        quadrado = numero * numero;


        System.out.println("O quadrado de " + numero + " é: " + quadrado);

        Leia.close();
    }
}
