/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoentradadados;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class ProjetoEntradaDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaraçao de variaveis
        double n1, n2, divisao, mult, soma, sub;
        
        
        //biblioteca para leitura dos dados
        Scanner leia = new Scanner(System.in);
        //Comando Escreva
        System.out.println("Digite o Primeiro Valor ");
        //Comando Leia
        n1 = leia.nextDouble();
        
        System.out.println("Digite o Segundo Valor ");
        
        n2 = leia.nextDouble();
        
        soma = n1 + n2;
        
        System.out.println("o resultado da soma é " + soma);
        
        sub = n1 - n2;
        
        System.out.println("O resultado da subtração é " + sub);
        
        mult = n1 * n2;
        
        System.out.println("O resultado da multiplicação é " + mult);
        
        divisao = n1 / n2;
        
        //arredondar valores decimais
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.println("O resultado da divisão é " + deci.format(divisao));
        //outra forma de arredondamento muda o print e add o %2.f
        System.out.printf("O resultado é %2.f" , divisao);
    }
}
