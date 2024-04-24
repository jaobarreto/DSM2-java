/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaaritmetica;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class MediaAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        float media1, media2, nota1, nota2, nota3, nota4, nota5, nota6, soma;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        
        nota1 = leia.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        
        nota2 = leia.nextFloat();
        
        System.out.println("Digite a terceira nota: ");
        
        nota3 = leia.nextFloat();
        
        media1 = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("O valor da primeira média é " + media1);
        
         System.out.println("Digite a quarta nota: ");
        
        nota4 = leia.nextFloat();
        
        System.out.println("Digite a quinta nota: ");
        
        nota5 = leia.nextFloat();
        
        System.out.println("Digite a sexta nota: ");
        
        nota6 = leia.nextFloat();
        
        media2 = (nota4 + nota5 + nota6) / 3;
        
        System.out.println("O valor da segunda média é " + media2);
        
        
        soma = media1 + media2;
        
        System.out.println("A primeira média é " + media1);
        
        System.out.println("A segunda média é " + media2);
        
        System.out.println("A soma das médias 1 e 2 é:  " + soma);
        
    }
    
}
