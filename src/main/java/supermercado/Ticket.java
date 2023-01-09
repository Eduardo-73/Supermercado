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

    private LocalTime fecha;
    private LocalDate fechaInicio;
    private ArrayList<Productos> listaProductos;

    public Ticket() {
        this.fecha = fecha;
        this.fechaInicio = fechaInicio;
        this.listaProductos = listaProductos;
    }

    public Ticket(LocalTime fecha) {
        this.fecha = fecha.minusHours(0);
    }

    public Ticket(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio.now();
    }
   
    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public LocalTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

}
