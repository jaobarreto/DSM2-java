
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
        // TODO code application logic here
        
        Caixa cx = new Caixa();
         int op;
        do{
        
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:  \n1-Depositar \n2-Depositar(parâmetro)\n3-Sacar \n4-Consultar Saldo \n0-Sair"));
        
        switch(op){
            case 1:
            cx.depositar();
            break;
                
            case 2:
            double val;
                val = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito:  "));
                cx.depositar(val);
            break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "Valor Saldo: " + cx.sacar()); //O valor do saldo vai retornar aqui.
            break;
                
            case 4:
                JOptionPane.showMessageDialog(null, "Saldo Atual: " + cx.ConsultarSaldo());
            break;
                
            case 0:
                JOptionPane.showMessageDialog(null, "Finalizando Programa");
            break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida");
        }
        
        
        }while(op != 0);
    }
    
}
