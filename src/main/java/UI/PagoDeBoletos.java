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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import logica.AgenciaDeViajes;
import logica.CompraBoleto;
import logica.ItinerarioReserva;
import logica.TarjetaCredito;
import logica.Usuario;
import logica.Vuelo;



public class PagoDeBoletos extends javax.swing.JPanel {

    AgenciaDeViajes agencia = null;//Se crea un objeto de atributos nulos
    public PagoDeBoletos() {
        agencia = new AgenciaDeViajes();//Se instancia el objeto
        initComponents();
        cargarTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReservas = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblVuelos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        btnMostrarVuelos = new javax.swing.JButton();
        btnPagarBoleto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtIdReservacion = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEnviadoCorreo = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEnviadoAeropuerto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(89, 137, 234));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pago de Boletos");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblReservas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        tblReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblReservas);
        if (tblReservas.getColumnModel().getColumnCount() > 0) {
            tblReservas.getColumnModel().getColumn(0).setResizable(false);
            tblReservas.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblReservas.getColumnModel().getColumn(1).setResizable(false);
            tblReservas.getColumnModel().getColumn(2).setResizable(false);
            tblReservas.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 295, 479));

        tblVuelos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        tblVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblVuelos);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 6, 297, 479));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Información de Boleto");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 17, 279, -1));

        jLabel12.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel12.setText("Fecha de pago:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtFecha.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jPanel5.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 160, -1));

        jLabel13.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel13.setText("Precio total:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel15.setText("Estado:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jPanel5.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 180, -1));

        txtEstado.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jPanel5.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 160, -1));

        btnMostrarVuelos.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        btnMostrarVuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (19).png"))); // NOI18N
        btnMostrarVuelos.setBorder(null);
        btnMostrarVuelos.setBorderPainted(false);
        btnMostrarVuelos.setContentAreaFilled(false);
        btnMostrarVuelos.setPreferredSize(new java.awt.Dimension(30, 25));
        btnMostrarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVuelosActionPerformed(evt);
            }
        });
        jPanel5.add(btnMostrarVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 190, 50));

        btnPagarBoleto.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        btnPagarBoleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (20).png"))); // NOI18N
        btnPagarBoleto.setBorder(null);
        btnPagarBoleto.setBorderPainted(false);
        btnPagarBoleto.setContentAreaFilled(false);
        btnPagarBoleto.setPreferredSize(new java.awt.Dimension(30, 25));
        btnPagarBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarBoletoActionPerformed(evt);
            }
        });
        jPanel5.add(btnPagarBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 170, 50));

        jButton1.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (21).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(30, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 240, 70));

        jLabel16.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel16.setText("Id reservación:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtIdReservacion.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jPanel5.add(txtIdReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 160, -1));

        jLabel17.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel17.setText("Enviado al correo:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtEnviadoCorreo.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jPanel5.add(txtEnviadoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 110, 20));

        jLabel18.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel18.setText("Enviado al aeropuerto:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        txtEnviadoAeropuerto.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jPanel5.add(txtEnviadoAeropuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 100, 20));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 6, 300, 479));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 930, 500));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(89, 137, 234));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Lista de Reservas");

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(89, 137, 234));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lista de Vuelos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 356, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 960, 70));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SeleccionarTarjeta opcion = new SeleccionarTarjeta();
        opcion.setVisible(true);
        opcion.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPagarBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarBoletoActionPerformed
        //declaración de las variables necesarias para que el código funcione
        int filaSeleccionada = tblReservas.getSelectedRow();
        int idReserva = -1;
        String estado = "";
        int indice = -1;
        int indiceElementoFinal = -1;
        int opcion=0;
        TarjetaCredito tarjetaActual = new TarjetaCredito();

        Usuario usuarioActual = new Usuario();
        usuarioActual = agencia.leerUsuarioActual();
        tarjetaActual = agencia.leerTarjetaActual();
        /**************************************************************************************/
        CompraBoleto boleto = new CompraBoleto();
        Date fechaCompra = new Date();
        /**************************************************************************************/

        if(filaSeleccionada != -1 ){//este if verifica si se ha seleccionado o no una fila en la tabla.
            idReserva =Integer.parseInt(tblReservas.getValueAt(filaSeleccionada, 0).toString());
            estado = tblReservas.getValueAt(filaSeleccionada, 2).toString();
        }

        if(estado != "Pagada"){
            for(int i=0; i<agencia.getReservas().size(); i++){
                if(idReserva == agencia.getReservas().get(i).getId()){
                    indice= i;
                    break;
                }
            }
            //El siguiente condicional valida que el usuario tenga por lo menos una tarjeta de crédito disponible para poder hacer el pago
            if(usuarioActual.getTarjetasCredito().isEmpty()){

                JOptionPane.showMessageDialog(null, "No ha añadido ninguna tarjeta de crédito!", "Información", JOptionPane.INFORMATION_MESSAGE);
                Tarjetas ventana = new Tarjetas();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            }

            if(tarjetaActual == null){
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna tarjeta de crédito", "Información",JOptionPane.INFORMATION_MESSAGE);
            }else{
                agencia.leerBoletos();
                
                if(agencia.getBoletos().isEmpty()){
                    boleto.setIdCompra(1000);
                }else{
                    indiceElementoFinal = agencia.getBoletos().size()-1;
                    System.out.println("Este es el indice final: "+indiceElementoFinal);
                    if(agencia.getBoletos().get(indiceElementoFinal).getIdCompra() <1000){
                        boleto.setIdCompra(1000);
                    }else{
                        boleto.setIdCompra(agencia.getBoletos().get(indiceElementoFinal).getIdCompra()+1);
                    }
                }
                

                boleto.setFechaCompra(fechaCompra);
                boleto.setIdReservacion(idReserva);
                boleto.setPrecioTotal(agencia.getReservas().get(indice).getPrecioTotal());
                       do
                       {
                           String s = JOptionPane.showInputDialog(null, "Seleccione entre las siguientes opciones: \n"
                        + "1. Enviar boletos al correo\n"
                        + "2. Enviar boletos al aeropuerto para ser recogidos\n", "Seleccione una opción", JOptionPane.INFORMATION_MESSAGE);
                            
                           try
                           {
                               opcion = Integer.parseInt(s);
                            switch(opcion){
                                case 1:
                                    boleto.setBoletoEnviado(true);
                                    break;
                                case 2:
                                    boleto.setBoletoRecogido(true);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "La opción ingresada no es válida","Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                        } 
                           }catch(Exception e)
                           {
                               e.printStackTrace();
                           }
                              
                       }while(opcion<1||opcion>2);
                

                agencia.getBoletos().add(boleto);

                agencia.añadirBoleto(agencia.getBoletos());

                agencia.getReservas().get(indice).setEstado(1);
                agencia.añadirReservas(agencia.getReservas());
                
                JOptionPane.showMessageDialog(null, "Se han generado los boletos!","Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "¡Ya se han generado los boletos para esta reserva!", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        cargarTabla();
    }//GEN-LAST:event_btnPagarBoletoActionPerformed

    private void btnMostrarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVuelosActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm");
        int filaSeleccionada = tblReservas.getSelectedRow();
        int idReserva = -1;
        int indice = -1;
        int indiceBoleto = -1;
        ArrayList<Vuelo> listaVuelos = new ArrayList<Vuelo>();
        ArrayList<String>[] listaAsientos = new ArrayList[1000];

        
        //buscamos en la fila seleccionada el valor en la columna 0
        if(filaSeleccionada != -1){
            idReserva = Integer.parseInt(tblReservas.getValueAt(filaSeleccionada, 0).toString());
        }else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningúna reserva", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //con este método lo que hacemos es leer todas las reservas que se han hecho para el cliente en particular
        agencia.leerReservas();
        agencia.leerVuelos();
        agencia.leerBoletos();
        for(int i=0; i<agencia.getReservas().size(); i++){
            if(agencia.getReservas().get(i).getId() == idReserva){
                indice = i;
            }
        }

        for(int i=0; i<agencia.getReservas().get(indice).getIdVuelos().size(); i++){
            for(int j=0; j<agencia.getVuelos().size(); j++){
                if(agencia.getReservas().get(indice).getIdVuelos().get(i) == agencia.getVuelos().get(j).getIdVuelo()){
                    listaVuelos.add(agencia.getVuelos().get(j));
                }
            }
        }
        //busca en la reserva en base al Id del vuelo todos los
        listaAsientos = agencia.getReservas().get(indice).getIdAsientosTomados();
        cargarVuelos(listaVuelos, listaAsientos, idReserva);

        for(int i=0; i<agencia.getBoletos().size(); i++){
            if(agencia.getBoletos().get(i).getIdReservacion() == idReserva){
                indiceBoleto = i;
            }
        }
        
        txtFecha.setText(formato.format(agencia.getBoletos().get(indiceBoleto).getFechaCompra()));
        txtPrecio.setText(String.valueOf(agencia.getBoletos().get(indiceBoleto).getPrecioTotal()));
        if(agencia.getReservas().get(indice).getEstado() == 1){
            txtEstado.setText("Pagado");
        }else{
            txtEstado.setText("No pagado");
        }
        txtIdReservacion.setText(String.valueOf(agencia.getReservas().get(indice).getId()));
        if(agencia.getBoletos().get(indiceBoleto).isBoletoEnviado() == true){
            txtEnviadoCorreo.setText("Si");
            txtEnviadoAeropuerto.setText("No");
        }else{
            txtEnviadoCorreo.setText("No");
            txtEnviadoAeropuerto.setText("Si");
        }
        
    }//GEN-LAST:event_btnMostrarVuelosActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarVuelos;
    private javax.swing.JButton btnPagarBoleto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblReservas;
    private javax.swing.JTable tblVuelos;
    private javax.swing.JLabel txtEnviadoAeropuerto;
    private javax.swing.JLabel txtEnviadoCorreo;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtIdReservacion;
    private javax.swing.JLabel txtPrecio;
    // End of variables declaration//GEN-END:variables

        private void cargarTabla() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm");
        //Este código es una combinación de lo aprendido de #TodoCode y parte de nuestra creación
        //definimos el modelo que queremos que tenga la tabla
        Usuario u1 = new Usuario();
        ArrayList<ItinerarioReserva> listaReservas = new ArrayList<ItinerarioReserva>();
        String estado;
        
        DefaultTableModel tabla = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int columm){
                return false;
            }
        };
        
        //establecemos los nombres de las columnas
        String titulos[] = {"Id","Fecha Reservación","Estado","Precio Total"};
        tabla.setColumnIdentifiers(titulos);
        
       agencia.leerReservas();
       u1 = agencia.leerUsuarioActual();
       for(int i=0; i<agencia.getReservas().size(); i++){
           if(agencia.getReservas().get(i).getCedulaCliente() == u1.getCedula()){
               listaReservas.add(agencia.getReservas().get(i));
           }
       }
       
       
       if(listaReservas!=null){
           for(ItinerarioReserva r: listaReservas){
               if(r.getEstado() == 0){
                   estado = "No pagada";
               }else{
                   estado = "Pagada";
               }
               String fechaReservacion = formato.format(r.getFechaReservacion());
               Object[] objeto = {r.getId(),fechaReservacion, estado,r.getPrecioTotal()};
               tabla.addRow(objeto);
           }
           tblReservas.setModel(tabla);
           tblReservas.getTableHeader().setFont(new Font("Myanmar", Font.BOLD, 12));
           tblReservas.getTableHeader().setOpaque(false);
           tblReservas.getTableHeader().setBackground(new Color(32,136,206));
           tblReservas.getTableHeader().setForeground(new Color(255,255,255));
           tblReservas.setRowHeight(30);
           tblReservas.setShowVerticalLines(false);
           
           //decoración de la segunda tabla para los vuelos
           tblVuelos.getTableHeader().setFont(new Font("Myanmar", Font.BOLD, 12));
           tblVuelos.getTableHeader().setOpaque(false);
           tblVuelos.getTableHeader().setBackground(new Color(32,136,206));
           tblVuelos.getTableHeader().setForeground(new Color(255,255,255));
           tblVuelos.setRowHeight(30);
           tblVuelos.setShowVerticalLines(false);
       }
       tblReservas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   
       tblVuelos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      
         
    }

    private void cargarVuelos(ArrayList<Vuelo> listaVuelos, ArrayList<String>[] listaAsientos, int idReserva) {
        
        DefaultTableModel tabla = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int columm){
                    return false;
            }
        };
        
        //establecemos los nombres de las columnas
        String titulos[] = {"Aerolínea","Origen","Destino","Tipo de Vuelo", "Precio","Personas", "Asientos"};
        tabla.setColumnIdentifiers(titulos);

 
        for(int i=0; i<agencia.getReservas().size(); i++){
            System.out.println("Estan son las reservas: "+agencia.getReservas().get(i));
            
        }
        
       if(listaVuelos!=null){
           for(int i=0; i<listaVuelos.size(); i++){
               
               StringBuilder concatenado = new StringBuilder();
               for(String asiento : listaAsientos[i]){
                   concatenado.append(asiento).append(", ");
               }

               Object[] objeto = {listaVuelos.get(i).getNombreAerolinea(), listaVuelos.get(i).getOrigen(),listaVuelos.get(i).getDestino(), listaVuelos.get(i).getTipoVuelo(), listaVuelos.get(i).getPrecio(), agencia.getReservas().get(idReserva).getNumeroPasajeros().get(i),concatenado.toString() };
               System.out.println("valor i:"+i);
               tabla.addRow(objeto);
           }
           tblVuelos.setModel(tabla);
       }
    
    }
}
