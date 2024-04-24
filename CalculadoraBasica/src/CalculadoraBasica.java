
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
public class CalculadoraBasica {
    private double n1;
    private double n2;
    private double r;

    public CalculadoraBasica() {
        this(0.0, 0.0, 0.0);
    }

    public CalculadoraBasica(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public void somar(){
    setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:  ")));
    
    setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:  ")));
        
        setR(getN1() + getN2());
}
    
    public double subtrair(double a, double b){
               
        setR(a - b);
       
        return getR();
    }
    
    public double multiplicar(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:  ")));
    
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:  ")));
        
        setR(getN1() * getN2());
        
        return getR();
    }
    
    public double dividir(double a, double b){
        
        setR(a / b);
        
        return getR();
    }
}
