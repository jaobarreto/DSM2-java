import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);

        float litros, precoLitro, valorPago;


        System.out.println("Digite o número de litros de gasolina: ");
        litros = Leia.nextFloat();

        precoLitro = 4.39F; //tem que colocar um F de "float" se não ele da erro


        valorPago = litros * precoLitro;


        System.out.println("O valor a ser pago pelo cliente é: R$ " + valorPago);

        Leia.close();
    }
}
