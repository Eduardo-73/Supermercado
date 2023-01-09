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

    int numIdentificador;
    ArrayList<Productos> lista;

    public Cinta(ArrayList<Productos> lista) {
        this.lista = lista;
    }

    public void anadirProductos(Productos p) {
        this.lista.add(p);
    }

    public boolean borrarProductos(Productos p) {
        int pos = buscarProductos(p);
        if(pos>=0){
            this.lista.remove(p);
            return true;
        }
        return false;
    }

    public int buscarProductos(Productos p) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (p.equals(this.lista.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Productos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Productos> lista) {
        this.lista = lista;
    }
}
