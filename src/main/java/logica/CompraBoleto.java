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
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class CompraBoleto implements Serializable{
    private int idCompra;
    private Date fechaCompra;
    private double precioTotal;
    private int idReservacion;
    private boolean boletoEnviado;
    private boolean boletoRecogido;

    public CompraBoleto() {
    }

    public CompraBoleto(int idCompra, Date fechaCompra, double precioTotal, int idReservacion, boolean boletoEnviado, boolean boletoRecogido) {
        this.idCompra=idCompra;
        this.fechaCompra = fechaCompra;
        this.precioTotal = precioTotal;
        this.idReservacion = idReservacion;
        this.boletoEnviado = boletoEnviado;
        this.boletoRecogido = boletoRecogido;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }


    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public boolean isBoletoEnviado() {
        return boletoEnviado;
    }

    public void setBoletoEnviado(boolean boletoEnviado) {
        this.boletoEnviado = boletoEnviado;
    }

    public boolean isBoletoRecogido() {
        return boletoRecogido;
    }

    public void setBoletoRecogido(boolean boletoRecogido) {
        this.boletoRecogido = boletoRecogido;
    }

    @Override
    public String toString() {
        return "CompraBoleto{" + "idCompra=" +", fechaCompra=" + fechaCompra + ", precioTotal=" + precioTotal + ", idReservacion=" + idReservacion + ", boletoEnviado=" + boletoEnviado + ", boletoRecogido=" + boletoRecogido + '}';
    }
    
    
    
    
}
