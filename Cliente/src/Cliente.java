
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
public class Cliente {
    
    private String nome;
    private String endereco;
    private String rg;

    public Cliente() {
        this("", "", "");
    }

    public Cliente(String nome, String endereco, String rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

        public void cadastrarCliente(){
            setNome(JOptionPane.showInputDialog("Digite o nome do Cliente: "));
            
            setEndereco(JOptionPane.showInputDialog("Digite o endereço do Cliente: "));
            
            setRg(JOptionPane.showInputDialog("Digite o RG do Cliente: "));
        }

        public void listarCliente (){
            JOptionPane.showMessageDialog(null, "Nome do Cliente: " + getNome());
            
            JOptionPane.showMessageDialog(null, "Endereço do Cliente: " + getEndereco());
            
            JOptionPane.showMessageDialog(null, "RG do Cliente: " + getRg());
        }
    
    
}


