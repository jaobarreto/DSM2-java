
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
        Area_Terreno Area = new Area_Terreno();
        
          int op;
        do{
                
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:  \n1-Calcular Area do Terreno \n2-Mostrar Area do Terreno  \n0-Sair"));
            
            switch(op){
            case 1:
            Area.calcularArea();
                JOptionPane.showMessageDialog(null,"O resultado da soma dessa operação foi: " + Area.getArea());
            break;
                
            case 2:
            double a, b;
                a = Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura do Terreno: "));
                b = Integer.parseInt(JOptionPane.showInputDialog("Digite a Largura do Terreno: "));
                
                Area.mostrarAreaTerreno(a, b);
                
                JOptionPane.showMessageDialog(null,"O resultado da area do terreno foi: " + Area.getArea());
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
