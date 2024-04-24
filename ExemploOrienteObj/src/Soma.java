
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
public class Soma {
    
    private double num1;
   private double num2;
   private double resultado;

    public Soma() {
        this(0.0, 0.0, 0.0);
    }

    public Soma(double num1, double num2, double resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
   
    public void calcularSoma (){
       setNum1(Double.parseDouble(JOptionPane.showInputDialog("Digite 1 num: "))); //substitui o scanf
       
       setNum2(Double.parseDouble(JOptionPane.showInputDialog("Digite 2 num: ")));
       
       setResultado(getNum1() + getNum2());
    }
   
    public void mostrarSoma(){
        JOptionPane.showMessageDialog(null, "O resultado da soma: " + getResultado());
    }
    
}
