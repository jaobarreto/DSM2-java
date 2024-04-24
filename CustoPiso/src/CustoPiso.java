
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
public class CustoPiso {
    private double comprimentoComodo;
    private double larguraComodo;
    private double custoTotalComodo;
    private double precoporArea;

    public CustoPiso() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public CustoPiso(double comprimentoComodo, double larguraComodo, double custoTotalComodo, double precoporArea) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.custoTotalComodo = custoTotalComodo;
        this.precoporArea = precoporArea;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }

    public double getPrecoporArea() {
        return precoporArea;
    }

    public void setPrecoporArea(double precoporArea) {
        this.precoporArea = precoporArea;
    }
    
    public void inserirValores(){
        setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite o Comprimento do comodo: ")));
        
        setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite a Largura do comodo: ")));
        
        setPrecoporArea(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da area:  ")));
        
        
        
    }
    
}
