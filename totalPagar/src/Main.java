import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);

        String nomeProd; //string é uma classe
        int qtdCompra;
        float precoUnit, totalPagar;

        System.out.println("Digite a descrição do produto (nome): ");
        nomeProd = Leia.nextLine(); //nextline ele conta os espaços


        System.out.println("Digite a quantidade comprada do produto: ");
         qtdCompra = Leia.nextInt();


        System.out.println("Digite o preço unitário do produto: ");
         precoUnit = Leia.nextFloat();


         totalPagar = qtdCompra * precoUnit;


        System.out.println("Produto: " + nomeProd);
        System.out.println("Total a pagar: R$ " + totalPagar);

        Leia.close();
    }
}
