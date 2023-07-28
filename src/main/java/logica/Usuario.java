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

/**
 *
 * @author USUARIO
 */
public class Usuario implements Serializable{
    private int cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private ArrayList<TarjetaCredito> tarjetasCredito;

    public Usuario() {
        tarjetasCredito = new ArrayList<TarjetaCredito>();
    }
    
    /*public Usuario(String correo, String password, int cedula){
        this.correo = correo;
        this.password = password;
        this.cedula = cedula;
    }*/

    public Usuario(int cedula, String nombre, String apellido, String correo, String password, ArrayList<TarjetaCredito> tarjetasCredito) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.tarjetasCredito = tarjetasCredito;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<TarjetaCredito> getTarjetasCredito() {
        return tarjetasCredito;
    }

    public void setTarjetasCredito(ArrayList<TarjetaCredito> tarjetasCredito) {
        this.tarjetasCredito = tarjetasCredito;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", password=" + password + ", tarjetasCredito=" + tarjetasCredito + '}';
    }
    
    
    
}
