/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasidade;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class DiasIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade, dias;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a sua Idade: ");
        
        idade = leia.nextInt();
        
        dias = idade * 365;
        
        System.out.println("Levando em consideração um ano de 365 dias, você viveu " + dias + " dias");
    }
    
}
