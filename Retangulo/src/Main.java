import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Leia = new Scanner(System.in);

        float ladoA, ladoB, area, perimetro;

        System.out.println("Digite a medida do lado a do retângulo (em cm): ");
        ladoA = Leia.nextFloat();

        System.out.println("Digite a medida do lado b do retângulo (em cm): ");
        ladoB = Leia.nextFloat();

        area = ladoA * ladoB;

        perimetro = 2 * (ladoA + ladoB);

        System.out.println("A área do retângulo é: " + area + " cm²");
        System.out.println("O perímetro do retângulo é: " + perimetro + " cm");

        Leia.close();
    }
}
