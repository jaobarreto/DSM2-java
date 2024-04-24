
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
public class Fornecedores {
    
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;

    public Fornecedores() {
        this("", "", "");
    }

    public Fornecedores(String nomeFornecedor, String nomeProduto, String descricaoProduto) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    public void cadastrarFornecedor(){
        setNomeFornecedor(JOptionPane.showInputDialog("Digite o nome do Fornecedor: "));
        
        setNomeProduto(JOptionPane.showInputDialog("Digite o nome do Produto: "));
        
        setDescricaoProduto(JOptionPane.showInputDialog("Digite a descrição desse produto: "));
    }
    
    public void listarFornecedor(){
    
        JOptionPane.showMessageDialog(null, "Nome do Fornecedor: " + getNomeFornecedor());
            
            JOptionPane.showMessageDialog(null, "Nome do Produto: " + getNomeProduto());
            
            JOptionPane.showMessageDialog(null, "Descrição do Produto: " + getDescricaoProduto());
    }
    
    
}
