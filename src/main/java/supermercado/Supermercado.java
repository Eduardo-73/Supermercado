/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    /**
     * En el main creo una caja con un número identificador que se genera solo 
     * y genero un ticket
    */
    public static void main(String[] args) {

        Caja caja = new Caja();
        Productos p1 = new Productos("leche", 2, 3.45, IVAProductos.CUATRO);
        Productos p2 = new Productos("Chocolate", 4, 1.25, IVAProductos.CUATRO);
        Productos p3 = new Productos("Huevos", 12, 2.56, IVAProductos.DIEZ);
        Productos p4 = new Productos("Carne", 4, 4.00, IVAProductos.VENTIUNO);
        
        caja.getCinta().anadirProductos(p1);
        caja.getCinta().anadirProductos(p2);
        caja.getCinta().anadirProductos(p3);
        caja.getCinta().anadirProductos(p4);
        
        System.out.println(caja.generarTicket());

    }
  
}
