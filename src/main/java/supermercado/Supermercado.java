/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

/**
 *
 * @author eduardo
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Caja caja = new Caja(0);
        Productos p1 = new Productos("leche", 2, 3.45, IVAProductos.CUATRO);
        Productos p2 = new Productos("Chocolate", 4, 1.25, IVAProductos.CUATRO);
        Productos p3 = new Productos("Huevos", 12, 2.56, IVAProductos.DIEZ);
        Productos p4 = new Productos("Carne", 4, 4.00, IVAProductos.VENTIUNO);
//        Cinta c1 = new Cinta(caja);

    }
  
}
