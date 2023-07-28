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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class AgenciaDeViajes implements Serializable {
    private ArrayList<Usuario> clientes;
    private ArrayList<ItinerarioReserva> reservas;
    private ArrayList<Vuelo> vuelos;
    private ArrayList<CompraBoleto> boletos;

    public AgenciaDeViajes() {
         clientes = new ArrayList<Usuario>();
         reservas = new ArrayList<ItinerarioReserva>();
         vuelos = new ArrayList<Vuelo>();
         boletos = new ArrayList<CompraBoleto>();
    }

    public AgenciaDeViajes(ArrayList<Usuario> clientes, ArrayList<ItinerarioReserva> registro, ArrayList<Vuelo> vuelos, ArrayList<CompraBoleto> boletos) {
        this.clientes = clientes;
        this.reservas = registro;
        this.vuelos = vuelos;
        this.boletos = boletos;
    }

    public ArrayList<Usuario> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Usuario> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<ItinerarioReserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<ItinerarioReserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public ArrayList<CompraBoleto> getBoletos() {
        return boletos;
    }

    public void setBoletos(ArrayList<CompraBoleto> boletos) {
        this.boletos = boletos;
    }
    
    public boolean crearUsuario(ArrayList<Usuario> clientes){
        try{
            FileOutputStream archivoSalida = new FileOutputStream("usuarios.ser");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(clientes);
            objetoSalida.close();
            archivoSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
    
    public void leerUsuarios(){
        
            File archivo = new File("usuarios.ser");
            if(!archivo.exists()){
                try{
                    archivo.createNewFile();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            
            ArrayList<Usuario> listaUsuarios= null;
            try{
            FileInputStream archivoEntrada = new FileInputStream("usuarios.ser");
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            listaUsuarios = (ArrayList<Usuario>) objetoEntrada.readObject();
            this.clientes = listaUsuarios;
            objetoEntrada.close();
            archivoEntrada.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean añadirVuelos(ArrayList<Vuelo> vuelos){
    try{
        FileOutputStream archivoSalida = new FileOutputStream("vuelos.ser");
        ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
        objetoSalida.writeObject(vuelos);
        objetoSalida.close();
        archivoSalida.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    return true;
}

    public void leerVuelos() {
        
            File archivo = new File("vuelos.ser");
            if(!archivo.exists()){
                try{
                    archivo.createNewFile();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            
            ArrayList<Vuelo> listaVuelos= null;
            try{
            FileInputStream archivoEntrada = new FileInputStream("vuelos.ser");
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            listaVuelos = (ArrayList<Vuelo>) objetoEntrada.readObject();
            this.vuelos = listaVuelos;
            objetoEntrada.close();
            archivoEntrada.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
    public boolean añadirReservas(ArrayList<ItinerarioReserva> reservas){
        try{
            FileOutputStream archivoSalida = new FileOutputStream("reservas.ser");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(reservas);
            objetoSalida.close();
            archivoSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
    
        public void leerReservas() {
        
            File archivo = new File("reservas.ser");
            if(!archivo.exists()){
                try{
                    archivo.createNewFile();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            
            ArrayList<ItinerarioReserva> listaReservas= null;
            try{
            FileInputStream archivoEntrada = new FileInputStream("reservas.ser");
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            listaReservas = (ArrayList<ItinerarioReserva>) objetoEntrada.readObject();
            this.reservas = listaReservas;
            objetoEntrada.close();
            archivoEntrada.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }

    }
        
        
     public boolean añadirBoleto(ArrayList<CompraBoleto> boletos){
        try{
            FileOutputStream archivoSalida = new FileOutputStream("boletos.ser");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(boletos);
            objetoSalida.close();
            archivoSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
    
        public void leerBoletos() {
        
            File archivo = new File("boletos.ser");
            if(!archivo.exists()){
                try{
                    archivo.createNewFile();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            
            ArrayList<CompraBoleto> listaBoletos= null;
            try{
            FileInputStream archivoEntrada = new FileInputStream("boletos.ser");
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            listaBoletos = (ArrayList<CompraBoleto>) objetoEntrada.readObject();
            this.boletos = listaBoletos;
            objetoEntrada.close();
            archivoEntrada.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }

    }   
        
    
    
    
    public void guardarUsuarioActual(Usuario u1){
        try{
            FileOutputStream archivoSalida = new FileOutputStream("usuario.ser");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(u1);
            objetoSalida.close();
            archivoSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Usuario leerUsuarioActual(){
        Usuario u1 = null;
        try{
            FileInputStream archivoSalida = new FileInputStream("usuario.ser");
            ObjectInputStream objetoSalida = new ObjectInputStream(archivoSalida);
            u1 = (Usuario)objetoSalida.readObject();
            objetoSalida.close();
            archivoSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return u1;
    }

    public void guardarVueloActual(Vuelo v1) {
        try{
            FileOutputStream archivoSalida = new FileOutputStream("vuelo.ser");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(v1);
            objetoSalida.close();
            archivoSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public Vuelo leerVueloActual() {
        Vuelo v1 = null;
        try{
            FileInputStream archivoSalida = new FileInputStream("vuelo.ser");
            ObjectInputStream objetoSalida = new ObjectInputStream(archivoSalida);
            v1 = (Vuelo)objetoSalida.readObject();
            objetoSalida.close();
            archivoSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return v1;
    }
    
    public boolean añadirVueloListaDeCompra(ArrayList<Vuelo> listaVuelos){
    try{
        FileOutputStream archivoSalida = new FileOutputStream("vuelosagregados.ser");
        ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
        objetoSalida.writeObject(listaVuelos);
        objetoSalida.close();
        archivoSalida.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    return true;
    }
    
    public ArrayList<Vuelo> leerVuelosListaDeCompra() {

        File archivo = new File("vuelosagregados.ser");
        if(!archivo.exists()){
            try{
                archivo.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    ArrayList<Vuelo> listaVuelos= new ArrayList<Vuelo>();
    try{
        FileInputStream archivoEntrada = new FileInputStream("vuelosagregados.ser");
        ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
        listaVuelos = (ArrayList<Vuelo>) objetoEntrada.readObject();
        this.vuelos = listaVuelos;
        objetoEntrada.close();
        archivoEntrada.close();

    }catch(Exception e){
        e.printStackTrace();
    }
        return listaVuelos;
       
    }
    
    public ArrayList<String> leerListaId(){
        File archivo = new File("listaId.ser");
        if(!archivo.exists()){
            try{
                archivo.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        ArrayList<String> listaId = new ArrayList<String>();
        try{
            FileInputStream archivoEntrada = new FileInputStream("listaId.ser");
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            listaId = (ArrayList<String>) objetoEntrada.readObject();
            objetoEntrada.close();
            archivoEntrada.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaId;
    }
    public void guardarListaId(ArrayList<String> listaId) {
        try{
            FileOutputStream archivoSalida = new FileOutputStream("listaId.ser");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(listaId);
            objetoSalida.close();
            archivoSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(listaId.toString());
    }
    
    public boolean buscarUsuario(String correo,int cedula)
    {
        for(int i=0;i<clientes.size();i++)
        {
            if(clientes.get(i).getCorreo().equals(correo) || clientes.get(i).getCedula()==cedula)
            {
                return true;
            }
        }
        return false;
    }

    public void guardarTarjetaActual(TarjetaCredito tarjetaActual) {
        try{
            FileOutputStream archivoSalida = new FileOutputStream("tarjetaActual.ser");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(tarjetaActual);
            objetoSalida.close();
            archivoSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public TarjetaCredito leerTarjetaActual() {
        TarjetaCredito t1 = null;
        try{
            FileInputStream archivoSalida = new FileInputStream("tarjetaActual.ser");
            ObjectInputStream objetoSalida = new ObjectInputStream(archivoSalida);
            t1 = (TarjetaCredito)objetoSalida.readObject();
            objetoSalida.close();
            archivoSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return t1;
    }
    
    public boolean buscarVuelo(int ID)
    {
        leerVuelos();
        for(int i=0;i<vuelos.size();i++)
        {
            if(vuelos.get(i).getIdVuelo()==ID)return true;
        }
        return false;
    }
    
    public void generadorDeVuelos()
    {
        File archivo;
        FileReader fr = null;
        BufferedReader br ;
        leerVuelos();
        try
        {
            archivo = new File ("BaseDatos.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            String linea ="";
            int x=0;
            
            while(((linea != null)&&(x<50)))
            {
                Date fechaSalida= new Date();
                Date fechaLlegada= new Date();
                linea=br.readLine();
                
                Vuelo v1 = new Vuelo();
                String partes[] = linea.split(";");
                v1.setIdVuelo(Integer.parseInt(partes[0]));
                v1.setOrigen(partes[1]);
                v1.setDestino(partes[2]);
                fechaSalida.setDate(Integer.parseInt(partes[3]));
                fechaSalida.setMonth(Integer.parseInt(partes[4]));
                fechaSalida.setYear(Integer.parseInt(partes[5]));
                fechaSalida.setHours(Integer.parseInt(partes[6]));
                fechaSalida.setMinutes(Integer.parseInt(partes[7]));
                v1.setFechaSalida(fechaSalida);
                fechaLlegada.setDate(Integer.parseInt(partes[8]));
                fechaLlegada.setMonth(Integer.parseInt(partes[9]));
                fechaLlegada.setYear(Integer.parseInt(partes[10]));
                fechaLlegada.setHours(Integer.parseInt(partes[11]));
                fechaLlegada.setMinutes(Integer.parseInt(partes[12]));
                v1.setFechaLlegada(fechaLlegada);
                v1.setPrecio(Double.parseDouble(partes[13]));
                v1.setEstado(partes[14]);
                v1.setTipoVuelo(partes[15]);
                v1.setNombreAerolinea(partes[16]);
                vuelos.add(v1);
                x++;
            }
            añadirVuelos(vuelos);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public boolean BuscarTarjeta(long numero,Usuario c1)
    {
        for(int i=0;i<c1.getTarjetasCredito().size();i++)
        {
            if(c1.getTarjetasCredito().get(i).getNumeroTarjeta()==numero)
            {
                return true;
            }
        }
        
        return false;
    }
    
}


