/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Ticket {

    private LocalTime hora;
    private LocalDate fechaInicio;
    private ArrayList<Productos> listaProductos;

    public Ticket(ArrayList<Productos> listaProductos) {
        this.hora = hora;
        this.fechaInicio = fechaInicio;
        this.listaProductos = listaProductos;
    }

    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public LocalTime getFecha() {
        return hora;
    }

    public void setFecha(LocalTime fecha) {
        this.hora = fecha;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket{");
        sb.append("fecha=").append(hora);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", listaProductos=").append(listaProductos);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
