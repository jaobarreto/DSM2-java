
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
public class Dobro {
    private double numero;
    private double calculo;

    public Dobro() {
        this(0.0, 0.0); // aqui eu zero os valores das variaveis
    }

    public Dobro(double numero, double calculo) {
        this.numero = numero;
        this.calculo = calculo;
    }
    
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
        public void calcularDobro(){
        setNumero(Double.parseDouble(JOptionPane.showInputDialog("Digite um número: ")));
        
        setCalculo(getNumero() * 2);
    }
        
    public void mostrarDobro(){
        JOptionPane.showMessageDialog(null, "O dobro desse resultado é: " + getCalculo());
    }

    
}
