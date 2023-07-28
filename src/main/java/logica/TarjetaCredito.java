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
public class TarjetaCredito implements Serializable{
    private long numeroTarjeta;
    private Date fechaVencimiento;
    private int codigoSeguridad;

    public TarjetaCredito() {
    }

    public TarjetaCredito(int numeroTarjeta, Date fechaVencimiento, int codigoSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSeguridad = codigoSeguridad;
    }

    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "numeroTarjeta=" + numeroTarjeta + ", fechaVencimiento=" + fechaVencimiento + ", codigoSeguridad=" + codigoSeguridad + '}';
    }
    
    
    
}
