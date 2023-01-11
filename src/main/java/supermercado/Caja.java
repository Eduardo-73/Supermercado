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

    private final int identificador;
    private Cinta cinta;

    public Caja(int identificador) {
        this.identificador = identificador;
    }

    public Ticket generarTicket(){
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
