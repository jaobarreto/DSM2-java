import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Leia = new Scanner(System.in);

        int diasVividos, idade;

        System.out.println("Digite sua idade: ");
        idade = Leia.nextInt();

        diasVividos = idade * 365;

        System.out.println("Com essa idade " + idade + ", você viveu: " + diasVividos + " dias");

    }
}