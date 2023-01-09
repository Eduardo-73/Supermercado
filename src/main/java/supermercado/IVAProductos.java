/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package supermercado;

/**
 *
 * @author eduardo
 */
public enum IVAProductos {
   
    CUATRO(0.04), DIEZ(0.1), VENTIUNO(0.21);
    
    private double iva;

    private IVAProductos(double iva) {
        this.iva = iva;
    }

    public double getIva() {
        return iva;
    }
   
}
