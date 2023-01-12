/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Ticket {
    
    private LocalTime hora;
    private LocalDate fecha;
    private ArrayList<Productos> listaProductos;
    
    public Ticket(ArrayList<Productos> listaProductos) {
        this.hora = LocalTime.now();
        this.fecha = LocalDate.now();
        this.listaProductos = listaProductos;
    }
    
    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public LocalTime getHora() {
        return hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "-------------------------------------------------------------------------------------\n"
                + "                            Supermercados Mercadona\n"
                + "Fecha:\t" + fecha + "Hora: " + hora + "\n"
                + "-------------------------------------------------------------------------------------" +
                "\nProducto     Precio     Cantidad      IVA      Precio sin IVA\n"
                + "--------------------------------------------------------------------------------------\n"
                + mostrarProductos() 
                + "-------------------------------------------------------------------------------------\n" +
                listaPorcentajes();
    }
   //recorro la lista del array de los productos, le sumo uno para que lea todos
   //de uno en uno y con el método listaProductos los muestro por consola
    public String mostrarProductos(){
        String txt = "";
        for (int i = 0; i <this.listaProductos.size(); i++) {
            txt += listaProductos(this.listaProductos.get(i))+ "\n";
        }
        return txt;
    }
    
    public String listaProductos(Productos p){
        String txt = p.nombre() + " " + p.precio() + " " + p.cantidad() + " " + 
                p.iva() + " " + (p.precio()*p.cantidad()); 
        return txt;
    }
    //Hago un contador para cada porcentaje que suma uno da la suma total y la 
    //la suma con y sin IVA
    public String listaPorcentajes(){
        int contadorIvaProdu4 = 0;
        int contadorIvaProdu10 = 0;
        int contadorIvaProdu21 = 0;
        double precioSinIva4 = 0;
        double precioSinIva10 = 0;
        double precioSinIva21 = 0;
        double precioConIva4 = 0;
        double precioConIva10 = 0;
        double precioConIva21 = 0;
        
        for (int i = 0; i < listaProductos.size(); i++) {
            Productos get = listaProductos.get(i);
            if(listaProductos.get(i).iva().equals(IVAProductos.CUATRO)){
                ++contadorIvaProdu4;
                precioSinIva4 += listaProductos.get(i).cantidad() * listaProductos.get(i).precio();
                precioConIva4 += listaProductos.get(i).cantidad() * (listaProductos.get(i).precio() * 1.04);
            }else if(listaProductos.get(i).iva().equals(IVAProductos.DIEZ)){
                ++contadorIvaProdu10;
                precioSinIva10 += listaProductos.get(i).cantidad() * listaProductos.get(i).precio();
                precioConIva10 += listaProductos.get(i).cantidad() * (listaProductos.get(i).precio() * 1.10);
            }else{
                ++contadorIvaProdu21;
                precioSinIva21 += listaProductos.get(i).cantidad() * listaProductos.get(i).precio();
                precioConIva21 += listaProductos.get(i).cantidad() * (listaProductos.get(i).precio() * 1.21);
            }
        }
        
        String txt = """
                     Nº prod. iva 4%%:  %d    Precio sin IVA: %.2f       Precio con IVA: %.2f
                     Nº prod. iva 10%%: %d    Precio sin IVA: %.2f       Precio con IVA: %.2f
                     Nº prod. iva 21%%: %d    Precio sin IVA: %.2f       Precio con IVA: %.2f
                     ------------------------------------------------------------------------------------
                     Total a pagar: %.2f   --  Gracias por su visita
                     ------------------------------------------------------------------------------------
                     """.formatted(contadorIvaProdu4 , precioSinIva4, precioConIva4,
                             contadorIvaProdu10, precioSinIva10, precioConIva10,
                             contadorIvaProdu21, precioSinIva21, precioConIva21,(precioConIva4+precioConIva10+precioConIva21));
        return txt;
    }
}
