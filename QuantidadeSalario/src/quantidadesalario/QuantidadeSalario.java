/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantidadesalario;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class QuantidadeSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float salMin, salFunc, qntdSal;
        
        salMin = 1421;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o seu salário: ");
        
        salFunc = leia.nextFloat();
        
        qntdSal = (salFunc/salMin);
        
        System.out.println("Você ganha " + qntdSal + " salários mínimos.");
        
        
        
        
        
    }
    
}
