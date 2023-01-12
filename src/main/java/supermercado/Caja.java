/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package supermercado;

import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class Caja {

    private int identificador;
    private Cinta cinta;
    private static int id = 0;

    public Caja() {
        this.identificador = ++id;
        this.cinta = new Cinta();
    }
    //El unico metodo de esta clase era generar un ticket en el que creo un 
    //objeto Ticket pasandole la lista de la cinta y devuelvo el ticket creado
    public Ticket generarTicket() {
        Ticket t = new Ticket(this.cinta.getLista());
        return t;
    }

    public int getIdentificador() {
        return identificador;
    }

    public Cinta getCinta() {
        return cinta;
    }


}
