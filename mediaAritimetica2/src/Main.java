import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float nota1, nota2, nota3, nota4, nota5, nota6, media1, media2, notaTotal; //Aqui vou usar o float pq números de média não necessitam de muitos decimais.


        Scanner Leia = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota: ");
        nota1 = Leia.nextFloat();

        System.out.println("Digite o valor da segunda nota: ");
        nota2 = Leia.nextFloat();

        System.out.println("Digite o valor da terceira nota: ");
        nota3 = Leia.nextFloat();

        System.out.println("Digite o valor da quarta nota: ");
        nota4 = Leia.nextFloat();

        System.out.println("Digite o valor da quinta nota: ");
        nota5 = Leia.nextFloat();

        System.out.println("Digite o valor da sexta nota: ");
        nota6 = Leia.nextFloat();

        media1 = (nota1 + nota2 + nota3) / 3;

        media2 = (nota4 + nota5 + nota6) / 3;

        System.out.println("A primeira média foi: " + media1); //usando soutp é um atalho para print
        System.out.println("A segunda média foi: " + media2);

        notaTotal = media1 + media2;

        System.out.println("A nota total do aluno foi: " + notaTotal);

        Leia.close();
    }
}
