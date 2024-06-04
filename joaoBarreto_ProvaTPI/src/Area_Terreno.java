
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
public class Area_Terreno {
 private double alturaTerreno;
 private double larguraTerreno;
 private double area;

    public Area_Terreno() {
        this(0.0, 0.0, 0.0);
    }

    public Area_Terreno(double alturaTerreno, double larguraTerreno, double area) {
        this.alturaTerreno = alturaTerreno;
        this.larguraTerreno = larguraTerreno;
        this.area = area;
    }

    public double getAlturaTerreno() {
        return alturaTerreno;
    }

    public void setAlturaTerreno(double alturaTerreno) {
        this.alturaTerreno = alturaTerreno;
    }

    public double getLarguraTerreno() {
        return larguraTerreno;
    }

    public void setLarguraTerreno(double larguraTerreno) {
        this.larguraTerreno = larguraTerreno;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
 
    public void calcularArea(){
        setAlturaTerreno(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do terreno: ")));
        
        setLarguraTerreno(Double.parseDouble((JOptionPane.showInputDialog("Digite a Largura do terreno: "))));
        
        setArea(getAlturaTerreno() * getLarguraTerreno());
    }
 
    public double mostrarAreaTerreno(double a, double b){
        
        setArea(a * b);
        
        return getArea();
    }
}
