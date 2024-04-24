import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);

        double valorPrest, taxaJuros, valorAtraso;
        int  mesesAtraso;

        System.out.println("Digite o valor da prestação: ");
        valorPrest = Leia.nextDouble();


        System.out.println("Digite a taxa de juros imposta pelo banco (%): ");
        taxaJuros = Leia.nextDouble();


        System.out.println("Digite a quantidade de meses em atraso: ");
        mesesAtraso = Leia.nextInt();


         valorAtraso = valorPrest + (valorPrest * (taxaJuros / 100) * mesesAtraso);


        System.out.println("O valor da prestação em atraso é: R$ " + valorAtraso);

        Leia.close();
    }
}
