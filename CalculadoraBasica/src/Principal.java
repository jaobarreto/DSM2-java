
import javax.swing.JOptionPane;

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
            
        CalculadoraBasica Calc = new CalculadoraBasica();
        
        int op;
        do{
                
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:  \n1-Somar \n2-Subtrair \n3-Multiplicar \n4-Dividir \n0-Sair"));
            
            switch(op){
            case 1:
            Calc.somar();
                JOptionPane.showMessageDialog(null,"O resultado da soma dessa operação foi: " + Calc.getR());
            break;
                
            case 2:
            double a, b;
                a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro número: "));
                b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo número: "));
                
                Calc.subtrair(a, b);
                
                JOptionPane.showMessageDialog(null,"O resultado da subtração dessa operação foi: " + Calc.getR());
            break;
                
            case 3:
                Calc.multiplicar();
                JOptionPane.showInputDialog(null,"O resultado da multiplicação dessa operação foi: " +Calc.getR());
            break;
                
            case 4:
                double c, d;
                c = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro número: "));
                d = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo número: "));
                
                Calc.dividir(c, d);
                
                JOptionPane.showMessageDialog(null,"O resultado da divisão dessa operação foi: " + Calc.getR());
            break;
                
            case 0:
                JOptionPane.showMessageDialog(null, "Finalizando a Calculadora");
            break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida");
            }
        }while(op != 0);     
        
    }
    
}
