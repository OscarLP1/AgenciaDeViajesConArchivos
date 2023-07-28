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


public class Asiento implements Serializable {
    private String id;
    private String tipoAsiento;
    private int estado;
    private double precio;

    public Asiento() {
    }

    public Asiento(String id, String tipoAsiento, int estado) {
        this.id = id;
        this.tipoAsiento = tipoAsiento;
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Asiento{" + "id=" + id + ", tipoAsiento=" + tipoAsiento + ", estado=" + estado + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
}
