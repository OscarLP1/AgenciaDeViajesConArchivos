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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import logica.AgenciaDeViajes;
import logica.TarjetaCredito;
import logica.Usuario;
import logica.Vuelo;


public class OpcionesSeleccionarUno extends javax.swing.JFrame {

    AgenciaDeViajes agencia;
    ArrayList<Vuelo> listaVuelos;
    public OpcionesSeleccionarUno() {
        agencia = new AgenciaDeViajes();
        listaVuelos = new ArrayList<Vuelo>();
        setResizable(false);//Hacemos que la ventana no pueda ser redimensionada
        setMaximumSize(new Dimension(400, 500));//Asignamos su tamaño
        initComponents();
        cargarUsuarioActualInfo();
        ImageIcon imagen = new ImageIcon("src/main/resources/Maracaibo.png");
        setIconImage(imagen.getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtConsulta = new javax.swing.JLabel();
        txtSalir = new javax.swing.JLabel();
        txtImagen = new javax.swing.JLabel();
        txtReserva = new javax.swing.JLabel();
        txtPagoBoleto = new javax.swing.JLabel();
        txtTarjeta = new javax.swing.JLabel();
        txtEditar = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panPrincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(getSize());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtConsulta.setBackground(new java.awt.Color(153, 204, 255));
        txtConsulta.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search_FILL0_wght700_GRAD200_opsz48.png"))); // NOI18N
        txtConsulta.setText("       Consultar");
        txtConsulta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(136, 191, 246)));
        txtConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtConsultaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtConsultaMouseReleased(evt);
            }
        });
        jPanel5.add(txtConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 60));

        txtSalir.setBackground(new java.awt.Color(153, 204, 255));
        txtSalir.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout_FILL0_wght700_GRAD200_opsz48.png"))); // NOI18N
        txtSalir.setText("       Cerrar Sesión");
        txtSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(136, 191, 246)));
        txtSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSalirMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSalirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSalirMouseReleased(evt);
            }
        });
        jPanel5.add(txtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 240, 60));

        txtImagen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jPanel5.add(txtImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, 80));

        txtReserva.setBackground(new java.awt.Color(153, 204, 255));
        txtReserva.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar_month_FILL0_wght700_GRAD200_opsz48.png"))); // NOI18N
        txtReserva.setText("      Reservar Vuelo");
        txtReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(136, 191, 246)));
        txtReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReservaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtReservaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtReservaMouseReleased(evt);
            }
        });
        jPanel5.add(txtReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, 60));

        txtPagoBoleto.setBackground(new java.awt.Color(153, 204, 255));
        txtPagoBoleto.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtPagoBoleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payments_FILL0_wght700_GRAD200_opsz48.png"))); // NOI18N
        txtPagoBoleto.setText("      Pago de Boletos");
        txtPagoBoleto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(136, 191, 246)));
        txtPagoBoleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPagoBoletoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPagoBoletoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPagoBoletoMouseReleased(evt);
            }
        });
        jPanel5.add(txtPagoBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 240, 60));

        txtTarjeta.setBackground(new java.awt.Color(153, 204, 255));
        txtTarjeta.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/credit_card_FILL0_wght700_GRAD200_opsz48.png"))); // NOI18N
        txtTarjeta.setText("      Tarjeta Credito");
        txtTarjeta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(136, 191, 246)));
        txtTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTarjetaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTarjetaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtTarjetaMouseReleased(evt);
            }
        });
        jPanel5.add(txtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 240, 60));

        txtEditar.setBackground(new java.awt.Color(153, 204, 255));
        txtEditar.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_FILL0_wght700_GRAD200_opsz48.png"))); // NOI18N
        txtEditar.setText("      Editar Información");
        txtEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(136, 191, 246)));
        txtEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEditarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEditarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtEditarMouseReleased(evt);
            }
        });
        jPanel5.add(txtEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 240, 60));

        txtUsuario.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuario.setText("Nombre del Usuario");
        jPanel5.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 40));

        jLabel1.setBackground(new java.awt.Color(124, 181, 238));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(136, 191, 246)));
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 250, 670));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 670));

        panPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undraw_Airport_re_oqk1.png"))); // NOI18N

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                .addGap(0, 85, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        jPanel4.add(panPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 940, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultaMouseClicked
        ConsultarVuelos panel = new ConsultarVuelos();
        cargarPanel(panel);
    }//GEN-LAST:event_txtConsultaMouseClicked

    private void txtSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseClicked
        dispose();
    }//GEN-LAST:event_txtSalirMouseClicked

    private void txtTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTarjetaMouseClicked
        TarjetasCredito panel = new TarjetasCredito();
        cargarPanel(panel);
    }//GEN-LAST:event_txtTarjetaMouseClicked

    private void txtReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReservaMouseClicked
        //Antes de entrar al JPanel de reserva lo que se hace es borrar la información de reservas que no hayan sido completadas
        borrarDatosReservaIncompleta();
        
        //luego se vacia el archivo que tiene los datos de los vuelos agregados en la lista de compra de usuario
        try {
            FileWriter fileWriter = new FileWriter("vuelosagregados.ser");
            fileWriter.write(""); // Escribir una cadena vacía para borrar el contenido
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //finalmente se llama al JPanel de reservas para que se muestre en pantalla
        ReservarVuelos panel = new ReservarVuelos();
        //este metodo es polimorfico porque recibe un panel de diferentes tipo y los muestra en tiempo de ejecución
        cargarPanel(panel);
    }//GEN-LAST:event_txtReservaMouseClicked

    private void txtPagoBoletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPagoBoletoMouseClicked
        TarjetaCredito tarjetaActual = null;
        
        agencia.guardarTarjetaActual(tarjetaActual);
        PagoDeBoletos panel = new PagoDeBoletos();
        cargarPanel(panel);
    }//GEN-LAST:event_txtPagoBoletoMouseClicked

    private void txtEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEditarMouseClicked
        EditarInformacion panel = new EditarInformacion();
        cargarPanel(panel);
    }//GEN-LAST:event_txtEditarMouseClicked

    private void txtConsultaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultaMousePressed
        txtConsulta.setOpaque(true);
        txtConsulta.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
    }//GEN-LAST:event_txtConsultaMousePressed

    private void txtConsultaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultaMouseReleased
        txtConsulta.setOpaque(false);
        txtConsulta.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_txtConsultaMouseReleased

    private void txtReservaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReservaMousePressed
        txtReserva.setOpaque(true);
        txtReserva.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_txtReservaMousePressed

    private void txtReservaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReservaMouseReleased
        txtReserva.setOpaque(false);
        txtReserva.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_txtReservaMouseReleased

    private void txtPagoBoletoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPagoBoletoMousePressed
        txtPagoBoleto.setOpaque(true);
        txtPagoBoleto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_txtPagoBoletoMousePressed

    private void txtPagoBoletoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPagoBoletoMouseReleased
        txtPagoBoleto.setOpaque(false);
        txtPagoBoleto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_txtPagoBoletoMouseReleased

    private void txtTarjetaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTarjetaMousePressed
        txtTarjeta.setOpaque(true);
        txtTarjeta.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_txtTarjetaMousePressed

    private void txtTarjetaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTarjetaMouseReleased
        txtTarjeta.setOpaque(false);
        txtTarjeta.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_txtTarjetaMouseReleased

    private void txtEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEditarMousePressed
        txtEditar.setOpaque(true);
        txtEditar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_txtEditarMousePressed

    private void txtEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEditarMouseReleased
        txtEditar.setOpaque(false);
        txtEditar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_txtEditarMouseReleased

    private void txtSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMousePressed
        txtSalir.setOpaque(true);
        txtSalir.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_txtSalirMousePressed

    private void txtSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseReleased
        txtConsulta.setOpaque(false);
        txtConsulta.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_txtSalirMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JLabel txtConsulta;
    private javax.swing.JLabel txtEditar;
    private javax.swing.JLabel txtImagen;
    private javax.swing.JLabel txtPagoBoleto;
    private javax.swing.JLabel txtReserva;
    private javax.swing.JLabel txtSalir;
    private javax.swing.JLabel txtTarjeta;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void cargarPanel(JPanel panel) {
        panel.setSize(940,670);
        panel.setLocation(0, 0);
  
        panPrincipal.removeAll();//Se elimina todo del JFrame principal
        panPrincipal.add(panel, BorderLayout.CENTER);//
        panPrincipal.revalidate();//Se recarga el diseño nuevo del JFrame
        panPrincipal.repaint();//Se hacen visible los cambios
        cargarUsuarioActualInfo();
        
    }

    private void cargarUsuarioActualInfo() {
       Usuario c1 = new Usuario();
       
        c1 = agencia.leerUsuarioActual();
        txtUsuario.setText("¡Bienvenido, "+c1.getNombre()+" "+c1.getApellido()+"!");
    }

    private void borrarDatosReservaIncompleta(){
        boolean[][] confirmarAsiento = new boolean[6][15]; // se usa para almacenar un vector que confirma si el asiento del vuelo se tomo en la reserva
        int[][] usuarioAsientos = new int[6][15];// se usa para almacenar un vector que confirma mediante el uso de la cédula del cliente el asiento del vuelo se tomo en la reserva
        listaVuelos = agencia.leerVuelosListaDeCompra();
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
}
