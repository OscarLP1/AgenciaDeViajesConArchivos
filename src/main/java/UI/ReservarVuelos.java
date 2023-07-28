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
package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.AbstractDocument;
import logica.AgenciaDeViajes;
import logica.Asiento;
import logica.ItinerarioReserva;
import logica.OnlyNumbersDocumentFilter;
import logica.Usuario;
import logica.Vuelo;


public class ReservarVuelos extends javax.swing.JPanel {

    //Declaración de atributos necesarios para la correcta ejecución del programa
    int recargar =0;
    private TableRowSorter trs;
    AgenciaDeViajes agencia = null;
    //se crean ArrayList auxiliares
    ArrayList<Vuelo> listaVuelos;
    ArrayList<Integer> contadorPersonas;
    ArrayList<String>[] idVuelosTomados =  new ArrayList[1000];
    ArrayList<Integer> idVuelos;
    
    public ReservarVuelos() {
        //inicialización de los ArrayLists y objetos
        contadorPersonas = new ArrayList<Integer>();
        agencia = new AgenciaDeViajes();
        listaVuelos = new ArrayList<Vuelo>();
        idVuelos = new ArrayList<Integer>();
        //inicializar el vector de ArrayList<String> para poder almacenar los id de los asientos para cada vuelo en especifico
        for(int i =0; i<1000; i++){
            idVuelosTomados[i] = new ArrayList<String>();
        }
        
        initComponents();
        
        //Verificación para que solamente reciba valores númericos en precio
        AbstractDocument document3 = (AbstractDocument) jtxtSPrecio.getDocument();
        document3.setDocumentFilter(new OnlyNumbersDocumentFilter());
        //setear los botones a false para que el usuario no los pueda presionar a menos de que sea necesario
        btnReservar.setEnabled(false);
        btnCancelar.setEnabled(false);
        //se carga la tabla y los datos de la reserva
        cargarTabla();
        cargarDatosReserva();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVuelos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCantidadVuelos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioAsientos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioVuelos = new javax.swing.JLabel();
        btnRevisarAsientos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnReservar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtTotalNeto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtSPrecio = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnRevisarAsientos1 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnTarifa = new javax.swing.JButton();
        btnConsultaHorario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtxtSOrigen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtSDestino = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(89, 137, 234));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Reservar Vuelos");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 954, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 90));

        tblVuelos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Origen", "Destino", "fechaSalida", "fechaLlegada", "tipoVuelo", "nombreAerolinea", "asientos", "precio", "Estado"
            }
        ));
        jScrollPane2.setViewportView(tblVuelos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 670, 440));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Datos de Reserva Actual");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 17, 240, -1));

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel10.setText("Cantidad de vuelos..................");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 62, -1, -1));

        txtCantidadVuelos.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        txtCantidadVuelos.setText("0");
        jPanel3.add(txtCantidadVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 62, 50, -1));

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel7.setText("Total asientos............................");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 91, -1, -1));

        txtPrecioAsientos.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        txtPrecioAsientos.setText("0");
        jPanel3.add(txtPrecioAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 91, 50, -1));

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel8.setText("Total vuelos...............................");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 120, -1, -1));

        txtPrecioVuelos.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        txtPrecioVuelos.setText("0");
        jPanel3.add(txtPrecioVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 120, 50, -1));

        btnRevisarAsientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (22).png"))); // NOI18N
        btnRevisarAsientos.setBorderPainted(false);
        btnRevisarAsientos.setContentAreaFilled(false);
        btnRevisarAsientos.setPreferredSize(new java.awt.Dimension(100, 45));
        btnRevisarAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarAsientosActionPerformed(evt);
            }
        });
        jPanel3.add(btnRevisarAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, -1));

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel9.setText("Total neto..................................");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 149, -1, -1));

        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (23).png"))); // NOI18N
        btnReservar.setBorderPainted(false);
        btnReservar.setContentAreaFilled(false);
        btnReservar.setPreferredSize(new java.awt.Dimension(100, 45));
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        jPanel3.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 200, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (24).png"))); // NOI18N
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 45));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 200, -1));

        txtTotalNeto.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        txtTotalNeto.setText("0");
        jPanel3.add(txtTotalNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 149, 50, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 240, 440));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jLabel1.setText("FIltrar Precio");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(6, 6, 66, 30);

        jtxtSPrecio.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jtxtSPrecio.setPreferredSize(new java.awt.Dimension(30, 25));
        jtxtSPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSPrecioActionPerformed(evt);
            }
        });
        jtxtSPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSPrecioKeyTyped(evt);
            }
        });
        jPanel4.add(jtxtSPrecio);
        jtxtSPrecio.setBounds(81, 9, 90, 25);

        cmbEstado.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "En tierra", "En vuelo", " " }));
        cmbEstado.setPreferredSize(new java.awt.Dimension(30, 25));
        cmbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadoItemStateChanged(evt);
            }
        });
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });
        jPanel4.add(cmbEstado);
        cmbEstado.setBounds(274, 9, 100, 25);

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jLabel4.setText("Filtrar Estado");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(189, 6, 68, 30);

        btnRevisarAsientos1.setText("Ver Asientos");
        btnRevisarAsientos1.setPreferredSize(new java.awt.Dimension(30, 25));
        btnRevisarAsientos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarAsientos1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnRevisarAsientos1);
        btnRevisarAsientos1.setBounds(618, 6, 150, 25);

        btnReiniciar.setText("Reiniciar Filtros");
        btnReiniciar.setPreferredSize(new java.awt.Dimension(30, 25));
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        jPanel4.add(btnReiniciar);
        btnReiniciar.setBounds(786, 6, 140, 25);

        btnTarifa.setText("Consulta por Tarifa");
        btnTarifa.setPreferredSize(new java.awt.Dimension(30, 25));
        btnTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarifaActionPerformed(evt);
            }
        });
        jPanel4.add(btnTarifa);
        btnTarifa.setBounds(618, 42, 150, 25);

        btnConsultaHorario.setText("Consulta por Horario");
        btnConsultaHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaHorarioActionPerformed(evt);
            }
        });
        jPanel4.add(btnConsultaHorario);
        btnConsultaHorario.setBounds(620, 80, 150, 23);

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jLabel2.setText("Filtrar Origen");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(6, 74, 69, 30);

        jtxtSOrigen.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jtxtSOrigen.setPreferredSize(new java.awt.Dimension(30, 25));
        jtxtSOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSOrigenKeyTyped(evt);
            }
        });
        jPanel4.add(jtxtSOrigen);
        jtxtSOrigen.setBounds(81, 77, 90, 25);

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jLabel3.setText("Filtrar Destino");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(189, 74, 73, 30);

        jtxtSDestino.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jtxtSDestino.setPreferredSize(new java.awt.Dimension(30, 25));
        jtxtSDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSDestinoKeyTyped(evt);
            }
        });
        jPanel4.add(jtxtSDestino);
        jtxtSDestino.setBounds(274, 77, 100, 25);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 960, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        
        //declaración de variables locales
        ArrayList<ItinerarioReserva> listaReservas = new ArrayList<ItinerarioReserva>();
        ItinerarioReserva reserva =  new ItinerarioReserva();
        Usuario u1 = new Usuario();
        ArrayList<Vuelo> listaVuelos = new ArrayList<Vuelo>();
        Date fecha = new Date();
        int indiceElementoFinal = -1;
        Usuario c1 = new Usuario();
        int contador =0;
        String id = "";
        int indicadorUno = -1;
        int indicadorDos = -1;

        //llamado de métodos de agencia para cargar el usuario actual y la lista de compra de todos los vuelos que quiera comprar
        u1 = agencia.leerUsuarioActual();
        listaVuelos = agencia.leerVuelosListaDeCompra();
        
        /*******************************************************************************************************************************************/
        c1 = agencia.leerUsuarioActual();

        /********************************************************************************************************************************************************************************/
        //Este bloque de código se usa para revisar cuales fueron los vuelos, asientos, cantidad de personas que van en cada vuelo.
        //Se tienen dos matrices, una que tiene la cedula del usuario y otra que es booleana
        //La booleana se usa para confirmar si el usuario en la reserva actual hizo una reserva para un puesto en particular. No nos quiamos por la de las cedulas porque puede suceder que el usuario ya haya reservado asientos y se mezclan.
        //Por lo tanto, para evitar eso usamos esas dos matrices y comparamos sus estados
        for(int i =0; i<listaVuelos.size(); i++){
            
            for(int j=0; j<6; j++){
                for(int k=0; k<15; k++){
                    if((listaVuelos.get(i).getUsuariosAsientos()[j][k] == c1.getCedula()) && (listaVuelos.get(i).getConfirmarAsientoReserva()[j][k] == true) ){
                        
                        contador++;
                        indicadorUno = j;
                        indicadorDos = k+1;
                        //Hace la asignación de los Id's de los vuelos
                        switch(indicadorUno){
                            case 0:
                                id= "A";
                                break;
                            case 1:
                                id= "B";
                                break;
                            case 2:
                                id= "C";
                                break;
                            case 3:
                                id= "D";
                                break;
                            case 4:
                                id= "E";
                                break;
                            case 5:
                                id= "F";
                                break;
                                
                        }
                        idVuelosTomados[i].add(id+String.valueOf(indicadorDos));
                    }
                    
                 }    
            }
            //cuenta la cantidad de personas de cada vuelo y los guarda en un ArrayList<Integer>
            //añade la cantidad de personas para el vuelo en la posición del arraylist
            contadorPersonas.add(contador);
            contador=0; //se vuelve a reiniciar en 0
            idVuelos.add(listaVuelos.get(i).getIdVuelo()); //esto carga cada asiento para poder mostrarlo en pago de boletos
        }
        //Final del bloque de código
        /********************************************************************************************************************************************************************************/


        /*for(int i=0; i<2; i++){
            for(int j=0; j<idVuelosTomados[i].size(); j++)
            System.out.println("Aquí estan los iD's"+idVuelosTomados[i].get(j).toString());
        }
        */
        /*******************************************************************************************************************************************/
        
        /********************************************************************************************************************************************************************************/
        //Este bloque de código asigna la información al objeto de tipo reserva
        reserva.setNumeroPasajeros(contadorPersonas);
        reserva.setFechaReservacion(fecha);
        reserva.setPrecioTotal(Double.parseDouble(txtTotalNeto.getText()));
        reserva.setCedulaCliente(u1.getCedula());
        reserva.setEstado(0);

        reserva.setIdVuelos(idVuelos);
        reserva.setIdAsientosTomados(idVuelosTomados);
        //reserva.setIdVuelos(0);
        
        agencia.leerReservas();// se leen todas las reservas de agencia
        listaReservas = agencia.getReservas(); // se pasan a un ArrayList del mismo tipo de dato

        indiceElementoFinal = listaReservas.size()-1; //se obtiene el tamaño del arrayList

        //Esto setea el indice en base a la reserva anterior. En caso de no haberla, asigna el valor 0
        if(indiceElementoFinal<0){
            reserva.setId(0);
        }else{
            reserva.setId(listaReservas.get(indiceElementoFinal).getId()+1);
        }

        //aquí añade la reserva nueva a la lista de reservas
        listaReservas.add(reserva);
        
        //finalmente envia las reservas al metodo añadir reservas que guarda la nueva información en el archivo
        agencia.añadirReservas(listaReservas);

        //En base a la cantidad de vuelos dice que se ha generado una reserva normal o un itinerario compuesto
        if(Integer.parseInt(txtCantidadVuelos.getText()) > 1){
            JOptionPane.showMessageDialog(null, "¡Se ha generado su reserva de un itinerario compuesto!", "Reserva", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Se ha generado su reserva", "Reserva", JOptionPane.INFORMATION_MESSAGE);
        }
        
        //después de haber generado la reserva c
        btnCancelar.setEnabled(false);

        //se crea una matriz de tipo booleano
        boolean[][] confirmarAsiento = new boolean[6][15]; // se usa para almacenar un vector que confirma si el asiento del vuelo se tomo en la reserva
        //se leen los vuelos que estan
        agencia.leerVuelos();

        /*********************************************************************************************************************************************/
        for(int i=0; i<agencia.getVuelos().size(); i++){//este for itera en los vuelos de la lista de vuelos de la empresa

            for(int j = 0; j<listaVuelos.size(); j++){ // este otro for más interno itera entre los vuelos de la lista de vuelos de compra del usuario

                if(agencia.getVuelos().get(i).getIdVuelo() == listaVuelos.get(j).getIdVuelo()){ // este condicional verifica si existe el vuelo de la lista de compra con el id en la lista de vuelos de la empresa

                    for(int k=0; k<6; k++){//este for es para iterar las columnas de las matrices de confirmacion de asientos

                        for(int l=0; l<15; l++){//este for es para iterar las filas de las matrices de confirmacion de asientos

                            if(agencia.getVuelos().get(i).getConfirmarAsientoReserva()[k][l] == true){//esta condicional verifica que si en la matriz confirmarAsientoReserva se activo para crear la reserva de ese asiento

                                confirmarAsiento = agencia.getVuelos().get(i).getConfirmarAsientoReserva();
                                confirmarAsiento[k][l] = false;
                                agencia.getVuelos().get(i).setConfirmarAsientoReserva(confirmarAsiento);
                            }
                        }
                    }
                }
            }
        }
        /*********************************************************************************************************************************************/
        agencia.añadirVuelos(agencia.getVuelos());
        
        /**************************************************************************************/
        //Este segmento de código es para vaciar el archivo y así poder evitar que el usuario pueda generar una reserva con los datos en pantalla
        try {
            FileWriter fileWriter = new FileWriter("vuelosagregados.ser");
            fileWriter.write(""); // Escribir una cadena vacía para borrar el contenido
            fileWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        /***************************************************************************************/
        cargarDatosReserva();
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //se llama a este metodo que lo que hace es eliminar cualquier informacion de la reserva que no se completo
        borrarDatosReservaIncompleta();
        
        //se vacia el archivo para poder tener un archivo nuevo
        try {
            FileWriter fileWriter = new FileWriter("vuelosagregados.ser");
            fileWriter.write(""); // Escribir una cadena vacía para borrar el contenido
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Se ha borrado la información de la reserva actual correctamente!", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //se vuelve a cargar la información de la tabla y reservas
        cargarTabla();
        cargarDatosReserva();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRevisarAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarAsientosActionPerformed
        
        //declaración de variables locales
        int filaSeleccionada= tblVuelos.getSelectedRow();
        int indice=-1;
        agencia.leerVuelos();
        int idVuelo=0;
        
        
        //se busca la fila seleccionada por el usuario que contiene el ID del vuelo
        if(filaSeleccionada != -1){
            idVuelo = Integer.parseInt(tblVuelos.getValueAt(filaSeleccionada, 0).toString());
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún vuelo!","Error",JOptionPane.ERROR_MESSAGE);
        }

        //se hace una busqueda en la lista de vuelos del id para conseguir el indice y operar más adelante
        for(int i=0; i<agencia.getVuelos().size(); i++){
            if(agencia.getVuelos().get(i).getIdVuelo()==idVuelo){
                indice = i;
                System.out.println("Tamaño hoy: "+ agencia.getVuelos().size());
            }
        }

        //Se hace una matriz de asientos
        Asiento[][] a= new Asiento[6][15];
        
               a = agencia.getVuelos().get(indice).getAsientos();
               long s = 0;
               for(int i=0;i<6;i++)
               {
                   for(int j=0;j<15;j++)
                   {
                       s+=a[i][j].getEstado();
                   }
               }

        if(((agencia.getVuelos().get(indice).getEstado().equals("En tierra")) || (agencia.getVuelos().get(indice).getEstado().equals("Retrasado"))) && s<90)
        {
            agencia.guardarVueloActual(agencia.getVuelos().get(indice));

            AsientosMatriz asientos = new AsientosMatriz();
            asientos.setVisible(true);
            asientos.setLocationRelativeTo(null);

            //Se le añade un WindowListener al JFrame para poder cargar los datos de nuevo si se cierra la ventana
            asientos.addWindowListener(new WindowAdapter() {

                @Override
                public void windowClosing(WindowEvent e){
                    cargarTabla();
                    cargarDatosReserva();
                }

            });

        }else
        {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN REALIZAR MAS RESERVAS EN ESTE VUELO");
        }

    }//GEN-LAST:event_btnRevisarAsientosActionPerformed

    private void jtxtSPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSPrecioActionPerformed

    }//GEN-LAST:event_jtxtSPrecioActionPerformed

    private void jtxtSPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSPrecioKeyTyped
        //Filtros del precio
        jtxtSPrecio.addKeyListener(new KeyAdapter (){

            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena= jtxtSPrecio.getText();
                jtxtSPrecio.setText(cadena);
                trs.setRowFilter(RowFilter.regexFilter(jtxtSPrecio.getText(), 7));
            }
        });
        trs = new TableRowSorter(tblVuelos.getModel());
        tblVuelos.setRowSorter(trs);
    }//GEN-LAST:event_jtxtSPrecioKeyTyped

    private void cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadoItemStateChanged
        //Filtros del combo box
        if(recargar==1)
        {
            cargarTabla();
            recargar=0;
        }
        String estado=cmbEstado.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> tr= new TableRowSorter(tblVuelos.getModel());
        tblVuelos.setRowSorter(tr);
        if(estado !=" ")
        {
            tr.setRowFilter(RowFilter.regexFilter(estado));
        }else
        {
            tblVuelos.setRowSorter(tr);
        }
    }//GEN-LAST:event_cmbEstadoItemStateChanged

    private void btnRevisarAsientos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarAsientos1ActionPerformed
        //declaración de variables locales
        int filaSeleccionada= tblVuelos.getSelectedRow();
        int indice=-1;
        agencia.leerVuelos();
        int idVuelo=0;

        //se busca el id del vuelo de la fila seleccionada
        if(filaSeleccionada != -1){
            idVuelo = Integer.parseInt(tblVuelos.getValueAt(filaSeleccionada, 0).toString());
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún vuelo!","Error",JOptionPane.ERROR_MESSAGE);
        }

        //se busca el indice en la lista de vuelos para poder operarlo más adelante
        for(int i=0; i<agencia.getVuelos().size(); i++){
            if(agencia.getVuelos().get(i).getIdVuelo()==idVuelo){
                indice = i;
            }
        }

        //se guarda el vuelo en el archivo de vuelo actual
        agencia.guardarVueloActual(agencia.getVuelos().get(indice));

        //se llama al JFrame de consulta de asientos para ver los vuelos
        ConsultaAsientos asientos = new ConsultaAsientos();
        asientos.setVisible(true);
        asientos.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRevisarAsientos1ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void btnTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarifaActionPerformed
        //Este es el funcionamiento del filtro por tarifa
        
        BusquedaPorTarifa ventana = new BusquedaPorTarifa();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        //Un evento para que cuando se precione el boton de buscar en el JFrame de busquedatarifa regrese al panel y llame a cargarTablaTarifa que funciona en base al valor mínimo y máximo
        ActionListener evento = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double precioMinimo, precioMaximo;

                precioMinimo = Double.parseDouble(ventana.txtPrecioMinimo.getText());
                precioMaximo = Double.parseDouble(ventana.txtPrecioMaximo.getText());
                cargarTablaTarifa(precioMinimo, precioMaximo);
                ventana.dispose();
            }
        };
        ventana.btnConfirmar.addActionListener(evento);
    }//GEN-LAST:event_btnTarifaActionPerformed

    private void btnConsultaHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaHorarioActionPerformed
        //Este es el funcionamiento del filtro por tarifa
        BusquedaPorHorario ventana = new BusquedaPorHorario();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
                //Un evento para que cuando se precione el boton de buscar en el JFrame de busquedahorario regrese al panel y llame a cargarTablaHorario que funciona en base a la fecha de llegada y salida

        ActionListener evento = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int diaSalida, mesSalida,  anioSalida, diaLlegada,  mesLlegada,  anioLlegada;

                diaSalida = Integer.parseInt(ventana.cmbDia.getSelectedItem().toString());
                mesSalida = Integer.parseInt(ventana.cmbMes.getSelectedItem().toString());
                anioSalida = Integer.parseInt(ventana.cmbAño.getSelectedItem().toString());
                diaLlegada = Integer.parseInt(ventana.cmbDia1.getSelectedItem().toString());
                mesLlegada = Integer.parseInt(ventana.cmbMes1.getSelectedItem().toString());
                anioLlegada = Integer.parseInt(ventana.cmbAño1.getSelectedItem().toString());

                cargarTablaFecha(diaSalida, mesSalida,  anioSalida, diaLlegada,  mesLlegada,  anioLlegada);
                ventana.dispose();
            };

        };
        ventana.btnConfirmar.addActionListener(evento);
    }//GEN-LAST:event_btnConsultaHorarioActionPerformed

    private void jtxtSOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSOrigenKeyTyped
        //Filtros en base al origen
        if(recargar==1)
        {
            cargarTabla();
            recargar=0;
        }
        jtxtSOrigen.addKeyListener(new KeyAdapter (){

            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena= jtxtSOrigen.getText();
                jtxtSOrigen.setText(cadena);
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+jtxtSOrigen.getText(), 1));
            }

        });
        trs = new TableRowSorter(tblVuelos.getModel());
        tblVuelos.setRowSorter(trs);
    }//GEN-LAST:event_jtxtSOrigenKeyTyped

    private void jtxtSDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSDestinoKeyTyped
        //Filtro en base al destino
        if(recargar==1)
        {
            cargarTabla();
            recargar=0;
        }
        jtxtSDestino.addKeyListener(new KeyAdapter (){

            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena= jtxtSDestino.getText();
                jtxtSDestino.setText(cadena);
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+jtxtSDestino.getText(), 2));
            }
        });
        trs = new TableRowSorter(tblVuelos.getModel());
        tblVuelos.setRowSorter(trs);
    }//GEN-LAST:event_jtxtSDestinoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultaHorario;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnRevisarAsientos;
    private javax.swing.JButton btnRevisarAsientos1;
    private javax.swing.JButton btnTarifa;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtxtSDestino;
    private javax.swing.JTextField jtxtSOrigen;
    private javax.swing.JTextField jtxtSPrecio;
    private javax.swing.JTable tblVuelos;
    private javax.swing.JLabel txtCantidadVuelos;
    private javax.swing.JLabel txtPrecioAsientos;
    private javax.swing.JLabel txtPrecioVuelos;
    private javax.swing.JLabel txtTotalNeto;
    // End of variables declaration//GEN-END:variables
    
/****************************************************************************************************************************************************/  
    //Método que se encarga de cargar la información de los vuelos en pantalla
    private void cargarTabla(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm");
        //Este código es una combinación de lo aprendido de #TodoCode y parte de nuestra creación
        //definimos el modelo que queremos que tenga la tabla
        DefaultTableModel tabla = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int columm){
                return false;
            }
        };
        
        //establecemos los nombres de las columnas
        String titulos[] = {"Id","Origen","Destino","Fecha Salida","Fecha LLegada","Tipo Vuelo","Nombre Aerolinea","Precio","Estado","Asientos Disponibles"};
        tabla.setColumnIdentifiers(titulos);
        
       agencia.leerVuelos();
       if(agencia.getVuelos()!=null){
           for(Vuelo v: agencia.getVuelos()){
               
               Asiento[][] a= new Asiento[6][15];
               a=v.getAsientos();
               long s=0;
               for(int i=0;i<6;i++)
               {
                   for(int j=0;j<15;j++)
                   {
                       s+=a[i][j].getEstado();
                               
                   }
               }
               
               String fechaSalida = formato.format(v.getFechaSalida());
               String fechaLlegada = formato.format(v.getFechaLlegada());
               
               Object[] objeto = {v.getIdVuelo(),v.getOrigen(),v.getDestino(),
                fechaSalida,fechaLlegada,v.getTipoVuelo(), v.getNombreAerolinea(),
                v.getPrecio(),v.getEstado(),v.getCantidadAsiento()-s};
               System.out.println(v.toString());
               tabla.addRow(objeto);
           }
           tblVuelos.setModel(tabla);
           tblVuelos.setModel(tabla);
           tblVuelos.getTableHeader().setFont(new Font("Myanmar", Font.BOLD, 12));
           tblVuelos.getTableHeader().setOpaque(false);
           tblVuelos.getTableHeader().setBackground(new Color(32,136,206));
           tblVuelos.getTableHeader().setForeground(new Color(255,255,255));
           tblVuelos.setRowHeight(30);
           tblVuelos.setShowVerticalLines(false);
       }
       
       tblVuelos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);        
    }
/****************************************************************************************************************************************************/    

/****************************************************************************************************************************************************/    
//Este método se encargar de cargar los datos de la reserva actual
    private void cargarDatosReserva() {
        
        //instanciacioón de objeto de tipo ArrayList<Vuelo>
        Usuario c1 = new Usuario();
        double acumulado=0;
        double acumuladoAsientos = 0;
        int contador =0;
        String id = "";
        int indicadorUno = -1;
        int indicadorDos = -1;

        c1 = agencia.leerUsuarioActual();
        listaVuelos = agencia.leerVuelosListaDeCompra();
        
        if(listaVuelos!=null){
            for(int i=0; i<listaVuelos.size(); i++){
                acumulado+=listaVuelos.get(i).getPrecio();
                }
            String precio = String.valueOf(acumulado);
            txtPrecioVuelos.setText(precio);
        }

        for(int i =0; i<listaVuelos.size(); i++){
            
            for(int j=0; j<6; j++){
                for(int k=0; k<15; k++){
                    if((listaVuelos.get(i).getUsuariosAsientos()[j][k] == c1.getCedula()) && (listaVuelos.get(i).getConfirmarAsientoReserva()[j][k] == true) ){
                        
                        acumuladoAsientos+=listaVuelos.get(i).getAsientos()[j][k].getPrecio();
                    }
                 }    
            }
            
        }

        txtPrecioAsientos.setText(String.valueOf(acumuladoAsientos));
        double total = Double.parseDouble(txtPrecioAsientos.getText())+Double.parseDouble(txtPrecioVuelos.getText());
        txtTotalNeto.setText(String.valueOf(total));
        
        
        if(Double.parseDouble(txtTotalNeto.getText()) > 0){
            btnReservar.setEnabled(true);
            btnCancelar.setEnabled(true);
        }else{
            btnReservar.setEnabled(false);
            btnCancelar.setEnabled(false);
        }
        
    }
/****************************************************************************************************************************************************/  
    
/****************************************************************************************************************************************************/    
//Método que se encargar de borrar la información de las reservas incompletas
    private void borrarDatosReservaIncompleta(){
        boolean[][] confirmarAsiento = new boolean[6][15]; // se usa para almacenar un vector que confirma si el asiento del vuelo se tomo en la reserva
        int[][] usuarioAsientos = new int[6][15];// se usa para almacenar un vector que confirma mediante el uso de la cédula del cliente el asiento del vuelo se tomo en la reserva
        agencia.leerVuelos();
        
        
        for(int i=0; i<agencia.getVuelos().size(); i++){//este for itera en los vuelos de la lista de vuelos de la empresa
            
            for(int j = 0; j<listaVuelos.size(); j++){ // este otro for más interno itera entre los vuelos de la lista de vuelos de compra del usuario
                
                if(agencia.getVuelos().get(i).getIdVuelo() == listaVuelos.get(j).getIdVuelo()){ // este condicional verifica si existe el vuelo de la lista de compra con el id en la lista de vuelos de la empresa
                    
                    for(int k=0; k<6; k++){//este for es para iterar las columnas de las matrices de confirmacion de asientos
                        
                        for(int l=0; l<15; l++){//este for es para iterar las filas de las matrices de confirmacion de asientos
                            
                            if(agencia.getVuelos().get(i).getConfirmarAsientoReserva()[k][l] == true){//esta condicional verifica que si en la matriz confirmarAsientoReserva se activo para crear la reserva de ese asiento
                                
                                confirmarAsiento = agencia.getVuelos().get(i).getConfirmarAsientoReserva();
                                usuarioAsientos = agencia.getVuelos().get(i).getUsuariosAsientos();
                                confirmarAsiento[k][l] = false;
                                usuarioAsientos[k][l] = -1;
                                agencia.getVuelos().get(i).setConfirmarAsientoReserva(confirmarAsiento);
                                agencia.getVuelos().get(i).getAsientos()[k][l].setEstado(0);
                                agencia.getVuelos().get(i).setUsuariosAsientos(usuarioAsientos);
                            }
                        }
                    }
                }
            }
        }
        
        agencia.añadirVuelos(agencia.getVuelos());
        
    }
/****************************************************************************************************************************************************/    

/****************************************************************************************************************************************************/    
    //Método que carga la información en base a la fecha de los vuelos
        private void cargarTablaFecha(int diaSalida,int mesSalida, int anioSalida,int diaLlegada, int mesLlegada, int anioLlegada) {
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm");
        Date fechaAntes = new Date();
        Date fechaDespues = new Date();
        
        fechaAntes.setDate(diaSalida);
        fechaAntes.setMonth(mesSalida);
        fechaAntes.setYear(anioSalida);
        fechaAntes.setHours(0);
        fechaAntes.setMinutes(0);
        
        fechaDespues.setDate(diaLlegada);
        fechaDespues.setMonth(mesLlegada);
        fechaDespues.setYear(anioLlegada);
        fechaDespues.setHours(0);
        fechaDespues.setMinutes(0);

        //Este código es una combinación de lo aprendido de #TodoCode y parte de nuestra creación
        //definimos el modelo que queremos que tenga la tabla
        
        DefaultTableModel tabla = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int columm){
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas
        String titulos[] = {"Id","Origen","Destino","Fecha Salida","Fecha LLegada","Tipo Vuelo","Nombre Aerolinea","Precio","Estado"};
        tabla.setColumnIdentifiers(titulos);
        
       agencia.leerVuelos();//Se leen los vuelos del archivo
       
       if(agencia.getVuelos()!=null){//Si existe algun vuelo se envian sus datos a la tabla
           for(Vuelo v: agencia.getVuelos()){
               
               System.out.println("Aquí estan los dias: "+formato.format(v.getFechaSalida())+"Fecha salida"+formato.format(v.getFechaSalida()));
               System.out.println("Aquí estan los dias enviados: "+formato.format(fechaAntes)+"Fecha salida"+formato.format(fechaDespues) );
               if(v.getFechaSalida().after(fechaAntes) && v.getFechaLlegada().before(fechaDespues)){
                   
                    String fechaSalida = formato.format(v.getFechaSalida());
                    String fechaLlegada = formato.format(v.getFechaLlegada());
               
                    Object[] objeto = {v.getIdVuelo(),v.getOrigen(),v.getDestino(),
                            fechaSalida, fechaLlegada ,v.getTipoVuelo(), v.getNombreAerolinea(),
                            v.getPrecio(),v.getEstado()};
                          
                    tabla.addRow(objeto);//Se añade la informacion al modelos de la tabla
               }
           }
           
           tblVuelos.setModel(tabla);//Se asigna el modelo de la tabla con todo la informacion
           tblVuelos.setModel(tabla);
           tblVuelos.setModel(tabla);
           tblVuelos.getTableHeader().setFont(new Font("Myanmar", Font.BOLD, 12));
           tblVuelos.getTableHeader().setOpaque(false);
           tblVuelos.getTableHeader().setBackground(new Color(32,136,206));
           tblVuelos.getTableHeader().setForeground(new Color(255,255,255));
           tblVuelos.setRowHeight(30);
           tblVuelos.setShowVerticalLines(false);
       }
    }
/****************************************************************************************************************************************************/    

/****************************************************************************************************************************************************/    
//Método que carga la información de los vuelos en base a la tarifa máxima y mínima
   private void cargarTablaTarifa(double precioMinimo, double precioMaximo){
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm");
        //Este código es una combinación de lo aprendido de #TodoCode y parte de nuestra creación
        //definimos el modelo que queremos que tenga la tabla
        
        DefaultTableModel tabla = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int columm){
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas
        String titulos[] = {"Id","Origen","Destino","Fecha Salida","Fecha LLegada","Tipo Vuelo","Nombre Aerolinea","Precio","Estado"};
        tabla.setColumnIdentifiers(titulos);
        
       agencia.leerVuelos();//Se leen los vuelos del archivo
       
       if(agencia.getVuelos()!=null){//Si existe algun vuelo se envian sus datos a la tabla
           for(Vuelo v: agencia.getVuelos()){
               if(v.getPrecio() >= precioMinimo && v.getPrecio() <= precioMaximo){
                String fechaSalida = formato.format(v.getFechaSalida());
                String fechaLlegada = formato.format(v.getFechaLlegada());
               
                Object[] objeto = {v.getIdVuelo(),v.getOrigen(),v.getDestino(),
                    fechaSalida, fechaLlegada ,v.getTipoVuelo(), v.getNombreAerolinea(),
                    v.getPrecio(),v.getEstado()};
               
               
                tabla.addRow(objeto);//Se añade la informacion al modelos de la tabla
                }
           }
           
           tblVuelos.setModel(tabla);//Se asigna el modelo de la tabla con todo la informacion
           tblVuelos.setModel(tabla);
           tblVuelos.setModel(tabla);
           tblVuelos.getTableHeader().setFont(new Font("Myanmar", Font.BOLD, 12));
           tblVuelos.getTableHeader().setOpaque(false);
           tblVuelos.getTableHeader().setBackground(new Color(32,136,206));
           tblVuelos.getTableHeader().setForeground(new Color(255,255,255));
           tblVuelos.setRowHeight(30);
           tblVuelos.setShowVerticalLines(false);
       }
   }
/****************************************************************************************************************************************************/    

}
