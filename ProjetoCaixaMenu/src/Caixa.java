
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
public class Caixa {
    private double saldo;
    private double valor;

    public Caixa() {
        this(0.0, 0.0);
    }

    public Caixa(double saldo, double valor) {
        this.saldo = saldo;
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //método sem parâmetro sem retorno
    public void depositar(){    //quando nao tem retorno é void
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito:  ")));
        
        setSaldo(getValor() + getSaldo());
}
    
    public double depositar(double v){
        setSaldo(v + getSaldo());   //v é um parâmetro que será chamado na principal
        return getSaldo();
    }
    
    //método sem parâmetro e com retorno
    public double sacar(){
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:  ")));
        setSaldo(getSaldo() - getValor());
        return getSaldo();
    }
    
    public Double ConsultarSaldo(){ //saldo pós saque ou deposito
        return getSaldo();
    }
    
}
