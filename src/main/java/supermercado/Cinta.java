/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class Cinta {
    
    
    ArrayList<Productos> lista;

    public Cinta(ArrayList<Productos> lista) {
        this.lista = lista;
    }

    public ArrayList<Productos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Productos> lista) {
        this.lista = lista;
    }
}
