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
    
    public Caja(int identificador) {
        this.identificador = identificador;
    }
    
    public void generarTicket(){
        
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
 
}