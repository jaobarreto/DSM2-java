
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

public class Multiplicacao {
    
    private int valor;
    private int resultado;

    public Multiplicacao() {
        this(0);
    }

    public Multiplicacao(int valor) {
        this.valor = valor;
        this.resultado = valor * 4;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
  
   public void Multiplicacao4(){
       setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "))); //concatenar com int tem que inserir parseint
       
       setResultado( getValor() * 4);
   }
    
  public void MostrarMultiplicacao(){
       JOptionPane.showMessageDialog(null, "Esse número multiplicado por 4 é: " + getResultado());
  }
    
}