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

    private ArrayList<Productos> lista;

    public Cinta(ArrayList<Productos> productos) {
        this.lista = productos;
    }

    public Cinta() {
        this.lista = new ArrayList<Productos>();
    }
    //método para añadir productos
    public void anadirProductos(Productos p) {
        this.lista.add(p);
    }
    //métodp para borrar productos en primer lugar lo hice una forma que daba 
    //bien luego encontre una forma mas fácil
    public void borrarProductos(Productos p) {
        if (this.lista.contains(p)) {
            this.lista.remove(p);
        }
    }
//        int pos = buscarProductos(p);
//        if(pos>=0){
//            this.lista.remove(p);
//            return true;
//        }
//        return false;
//    }
//
//    public int buscarProductos(Productos p) {
//        for (int i = 0; i < this.lista.size(); i++) {
//            if (p.equals(this.lista.get(i))) {
//                return i;
//            }
//        }
//        return -1;
//    }

    public ArrayList<Productos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Productos> lista) {
        this.lista = lista;
    }
}
