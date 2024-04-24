/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novosalario;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class NovoSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float novoSal, salario, percentual;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o seu salário: ");
        
        salario = leia.nextFloat();
        
        System.out.println("Digite a porcentagem do reajuste: ");
        
        percentual = leia.nextFloat();
        
        novoSal = salario + (salario * percentual) / 100;
        
        System.out.println("Seu novo sálario após o reajuste é " + novoSal + ".");
        
    }
    
}
