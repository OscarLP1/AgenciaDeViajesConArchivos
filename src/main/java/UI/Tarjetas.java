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

import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import logica.AgenciaDeViajes;
import logica.OnlyNumbersDocumentFilter;
import logica.TarjetaCredito;
import logica.Usuario;

public class Tarjetas extends javax.swing.JFrame {
    
    AgenciaDeViajes agencia;
    public Tarjetas() {
        agencia = new AgenciaDeViajes();
        initComponents();
        AbstractDocument document3 = (AbstractDocument) txtNumeroTarjeta.getDocument();
        document3.setDocumentFilter(new OnlyNumbersDocumentFilter());
        ImageIcon imagen = new ImageIcon("src/main/resources/Maracaibo.png");
        setIconImage(imagen.getImage());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroTarjeta = new javax.swing.JTextField();
        cmbMes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        txtCodigoSeguridad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(89, 137, 234));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Agregar Tarjeta ");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (7).png"))); // NOI18N
        btnAñadir.setBorder(null);
        btnAñadir.setContentAreaFilled(false);
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPanel5.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 412, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (8).png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel5.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 412, -1, -1));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Número de Tarjeta");

        txtNumeroTarjeta.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtNumeroTarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroTarjeta.setPreferredSize(new java.awt.Dimension(60, 30));

        cmbMes.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fecha de Vencimiento");

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Código de Seguridad");

        txtAño.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N

        txtCodigoSeguridad.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(189, Short.MAX_VALUE)
                    .addComponent(txtCodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(183, 183, 183)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(0, 75, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(239, Short.MAX_VALUE)
                    .addComponent(txtCodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)))
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 450, 300));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 509));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        try{
            int indice = -1;
            //Declaración de los objetos ArrayList<Usuario> y Usuario
            ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
            ArrayList<TarjetaCredito> listaTarjetas = new ArrayList<TarjetaCredito>();
            Usuario c1 = new Usuario();
            /**************************************************************/

            //se lee la informacion del archivo
            agencia.leerUsuarios();
            listaUsuarios = agencia.getClientes();
            c1 = agencia.leerUsuarioActual();
            /**************************************************************/

            //Buscar el id en la lista de usuarios para cambiar la información luego al final de este bloque de código
            for(int i=0; i<listaUsuarios.size();i++){
                if(c1.getCedula() == listaUsuarios.get(i).getCedula()){
                    indice = i;
                }
            }
            /**********************************************************************************************************/

            //en las siguientes dos líneas tenemos respectivamente la creación de un objeto de tipo TarjetaCredito y Date
            TarjetaCredito t1 = new TarjetaCredito();
            Date fecha = new Date();
            /**************************************************************************************************************/

            //se obtiene la información de la interface Java Swing y se le setea al objeto de tipo TarjetaCredito
            if(txtNumeroTarjeta.getText().length() <16 || txtNumeroTarjeta.getText().length() >16 ){
                JOptionPane.showMessageDialog(null, "Una tarjeta de crédito tiene 16 dígitos, por favor verifique","Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }else if(txtAño.getText().length() <2 || txtAño.getText().length() >2){
                JOptionPane.showMessageDialog(null, "Debe ingresar los últimos dos dígitos del año, por favor verifique","Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }else if(txtCodigoSeguridad.getText().length() < 4 || txtCodigoSeguridad.getText().length() > 4){
                JOptionPane.showMessageDialog(null, "El código de seguridad es de 4 dígitos, por favor verifique","Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }else if(!agencia.BuscarTarjeta(Long.parseLong(txtNumeroTarjeta.getText()),c1)){
                t1.setNumeroTarjeta(Long.parseLong(txtNumeroTarjeta.getText()));
                fecha.setYear(Integer.parseInt(txtAño.getText()));
                fecha.setMonth(Integer.parseInt(cmbMes.getSelectedItem().toString())-1);
                t1.setFechaVencimiento(fecha);
                t1.setCodigoSeguridad(Integer.parseInt(txtCodigoSeguridad.getText()));

                //la siguiente línea agrega una tarjeta de crédito al cliente actual
                c1.getTarjetasCredito().add(t1);
                /*******************************************************************/
                //La siguiente línea de código setea los valores de la tarjeta de crédito del cliente
                //c1.setTarjetasCredito(c1.getTarjetasCredito());
                //se guarda la información en el nuevo archivo
                agencia.guardarUsuarioActual(c1);
                listaUsuarios.set(indice, c1);
                if(agencia.crearUsuario(listaUsuarios)){
                    JOptionPane.showMessageDialog(null, "Se ha agregado una tarjeta de crédito","Confirmación", JOptionPane.INFORMATION_MESSAGE);
                    agencia.guardarTarjetaActual(t1);
                    JOptionPane.showMessageDialog(null, "Intente nuevamente pagar por el boleto, se usala la tarjeta agregada", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            


        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: formato de número incorrecto." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al agregar la tarjeta de crédito." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNumeroTarjeta.setText("");
        cmbMes.setSelectedIndex(0);
        txtAño.setText("");
        txtAño.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCodigoSeguridad;
    private javax.swing.JTextField txtNumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
