/************************************************************************
* Palabra de honor:
* - No he discutido ni mostrado el código de mi programa con alguien que no sea mi *compañero,
Profesor o con el monitor asignado a este curso.
* 
* - No he utilizado código obtenido de otro u otros estudiantes,
* O cualquier otra fuente no autorizada, ya sea modificado o sin modificar.
*  Si cualquier código o documentación utilizada en mi programa
* Fue obtenido de otra fuente, tal como un libro de texto, notas del curso o Internet
* debe ser claramente señalado con una cita apropiada en
* los comentarios de mi programa.
*  Oscar Alberto Lozano Posso 0222120012
*  Juan Camilo Caro Rodriguez 0222121001
*************************************************************************/

package logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class ItinerarioReserva implements Serializable {
    private int id;
    private ArrayList<Integer> numeroPasajeros;
    private Date fechaReservacion;
    private double precioTotal;
    private int cedulaCliente;
    private int estado;
    private ArrayList<Integer> idVuelos;
    private ArrayList<String>[] idAsientosTomados;

    public ItinerarioReserva() {
        idVuelos = new ArrayList<Integer>();
        numeroPasajeros = new ArrayList<Integer>();
        idAsientosTomados = new ArrayList[1000];
        for(int i=0; i<1000; i++){
            idAsientosTomados[i] = new ArrayList<String>();
        }
        
    }

    public ItinerarioReserva(int id, ArrayList<Integer> numeroPasajeros, Date fechaReservacion, double precioTotal, int cedulaCliente, int estado, ArrayList<Integer> idVuelos, ArrayList<String>[] idAsientosTomados) {
        this.id = id;
        this.numeroPasajeros = numeroPasajeros;
        this.fechaReservacion = fechaReservacion;
        this.precioTotal = precioTotal;
        this.cedulaCliente = cedulaCliente;
        this.estado = estado;
        this.idVuelos = idVuelos;
        this.idAsientosTomados = idAsientosTomados;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(ArrayList<Integer> numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public Date getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(Date fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public ArrayList<Integer> getIdVuelos() {
        return idVuelos;
    }

    public void setIdVuelos(ArrayList<Integer> idVuelos) {
        this.idVuelos = idVuelos;
    }

    public ArrayList<String>[] getIdAsientosTomados() {
        return idAsientosTomados;
    }

    public void setIdAsientosTomados(ArrayList<String>[] idAsientosTomados) {
        this.idAsientosTomados = idAsientosTomados;
    }

    @Override
    public String toString() {
        return "ItinerarioReserva{" + "id=" + id + ", numeroPasajeros=" + numeroPasajeros + ", fechaReservacion=" + fechaReservacion + ", precioTotal=" + precioTotal + ", cedulaCliente=" + cedulaCliente + ", estado=" + estado + ", idVuelos=" + idVuelos + ", idAsientosTomados=" + idAsientosTomados + '}';
    }
    
   
    
    
    
}
