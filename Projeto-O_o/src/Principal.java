
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa pes = new Pessoa();
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        pes.setNome(leia.nextLine());
        
        System.out.println("Digite seu Endereço: ");
        pes.setEndereco(leia.nextLine());
       
        System.out.println("Digite seu telefone: ");
        pes.setTelefone(leia.next());
        
        System.out.println("Digite sua idade: ");
        pes.setIdade(leia.nextInt());
        
        //chamar o método
        
        pes.MostraDados();
    }
    
}
