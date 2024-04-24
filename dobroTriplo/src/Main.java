import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);

        int primeiroNumero, segundoNumero, dobroPrimeiro, triploSegundo;

        System.out.println("Digite o primeiro número inteiro: ");
         primeiroNumero = Leia.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
         segundoNumero = Leia.nextInt();

        dobroPrimeiro = primeiroNumero * 2;

        triploSegundo = segundoNumero * 3;


        System.out.println("O dobro do primeiro número é: " + dobroPrimeiro);
        System.out.println("O triplo do segundo número é: " + triploSegundo);

        Leia.close();
    }
}
