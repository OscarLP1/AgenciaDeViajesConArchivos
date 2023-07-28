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

public class Vuelo implements Serializable {
    private int idVuelo;
    private String origen;
    private String destino;
    private Date fechaSalida;
    private Date fechaLlegada;
    private String tipoVuelo;
    private String nombreAerolinea;
    private Asiento[][] asientos;
    private int [][] usuariosAsientos;
    private boolean [][] confirmarAsientoReserva;
    private double precio;
    private String estado;
    private long cantidadAsiento=90;

    public Vuelo() {
        asientos = new Asiento[6][15];
        usuariosAsientos = new int[6][15];
        confirmarAsientoReserva = new boolean[6][15];
        for(int i=0; i<6;i++){
            for(int j=0; j<15; j++){
                asientos[i][j] = new Asiento();
            }   
        }

        for(int i=0;i<6;i++)
        {
            for(int j=0;j<15;j++)
            {
                String ID="";
                switch(i)
                {
                    case 0:
                        ID= "A"+String.valueOf(j+1);
                        break;
                    case 1:
                        ID= "B"+String.valueOf(j+1);
                        break;
                    case 2:
                        ID= "C"+String.valueOf(j+1);
                        break;
                    case 3:
                        ID= "D"+String.valueOf(j+1);
                        break;
                    case 4:
                        ID= "E"+String.valueOf(j+1);
                        break;
                    case 5:
                        ID= "F"+String.valueOf(j+1);
                        break;
                                 
                }
                asientos[i][j].setId(ID);
                if(j<5)
                {
                    asientos[i][j].setTipoAsiento("Primera clase");
                    asientos[i][j].setPrecio(30000);
                }else if(j<10)
                {
                    asientos[i][j].setTipoAsiento("Clase ejecutiva");
                    asientos[i][j].setPrecio(20000);
                }else
                {
                    asientos[i][j].setTipoAsiento("Clase económica");
                    asientos[i][j].setPrecio(10000);
                }
                
            }
        }
    }

    public Vuelo(int idVuelo, String origen, String destino, Date fechaSalida, Date fechaLlegada, String tipoVuelo, String nombreAerolinea, Asiento[][] asientos, int[][] usuariosAsientos, boolean[][] confirmarAsientoReserva , double precio,String estado,long cantidadAsiento) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.tipoVuelo = tipoVuelo;
        this.nombreAerolinea = nombreAerolinea;
        this.asientos = asientos;
        this.usuariosAsientos = usuariosAsientos;
        this.confirmarAsientoReserva = confirmarAsientoReserva;
        this.precio = precio;
        this.estado=estado;
        this.cantidadAsiento=cantidadAsiento;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public int[][] getUsuariosAsientos() {
        return usuariosAsientos;
    }

    public void setUsuariosAsientos(int[][] usuariosAsientos) {
        this.usuariosAsientos = usuariosAsientos;
    }

    public boolean[][] getConfirmarAsientoReserva() {
        return confirmarAsientoReserva;
    }

    public void setConfirmarAsientoReserva(boolean[][] confirmarAsientoReserva) {
        this.confirmarAsientoReserva = confirmarAsientoReserva;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getCantidadAsiento() {
        return cantidadAsiento;
    }

    public void setCantidadAsiento(long cantidadAsiento) {
        this.cantidadAsiento = cantidadAsiento;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "idVuelo=" + idVuelo + ", origen=" + origen + ", destino=" + destino + ", fechaSalida=" + fechaSalida + ", fechaLlegada=" + fechaLlegada + ", tipoVuelo=" + tipoVuelo + ", nombreAerolinea=" + nombreAerolinea + ", asientos=" + asientos + ", usuariosAsientos=" + usuariosAsientos + ", confirmarAsientoReserva=" + confirmarAsientoReserva + ", precio=" + precio + ", estado=" + estado + ", cantidadAsiento=" + cantidadAsiento + '}';
    }
      
}
