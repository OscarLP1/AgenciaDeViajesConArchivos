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
import static javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import logica.AgenciaDeViajes;
import logica.OnlyNumbersDocumentFilter;
import logica.TarjetaCredito;
import logica.Usuario;



public class TarjetasCredito extends javax.swing.JPanel {

    AgenciaDeViajes agencia;
    public TarjetasCredito() {
        agencia = new AgenciaDeViajes();
        initComponents();
        AbstractDocument document3 = (AbstractDocument) txtNumeroTarjeta.getDocument();
        document3.setDocumentFilter(new OnlyNumbersDocumentFilter());
        btnEliminarTarjeta.setEnabled(false);
        cargarTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroTarjeta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbMes = new javax.swing.JComboBox<>();
        txtAño = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoSeguridad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTarjetas = new javax.swing.JTable();
        btnEliminarTarjeta = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(960, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(940, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(89, 137, 234));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tarjetas de Credito");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(89, 137, 234));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lista de Tarjetas");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 480, 70));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(89, 137, 234));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Agregar Tarjeta");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 80));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 960, 80));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Número de Tarjeta");

        txtNumeroTarjeta.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtNumeroTarjeta.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fecha de Vencimiento");

        cmbMes.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "5", "6", "7", "8", "9", "10", "11", "12" }));

        txtAño.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Código de Seguridad");

        txtCodigoSeguridad.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (8).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (7).png"))); // NOI18N
        btnAñadir.setBorder(null);
        btnAñadir.setBorderPainted(false);
        btnAñadir.setContentAreaFilled(false);
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(txtAño)
                        .addGap(128, 128, 128))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAñadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(36, 36, 36))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtCodigoSeguridad)
                .addGap(76, 76, 76)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(btnAñadir))
                .addGap(95, 95, 95))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 450, 460));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tblTarjetas.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        tblTarjetas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTarjetas.setFocusable(false);
        tblTarjetas.setSelectionBackground(new java.awt.Color(160, 205, 249));
        tblTarjetas.getTableHeader().setReorderingAllowed(false);
        tblTarjetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTarjetasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTarjetas);
        if (tblTarjetas.getColumnModel().getColumnCount() > 0) {
            tblTarjetas.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        btnEliminarTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (29).png"))); // NOI18N
        btnEliminarTarjeta.setBorderPainted(false);
        btnEliminarTarjeta.setContentAreaFilled(false);
        btnEliminarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnEliminarTarjeta)
                        .addGap(182, 182, 182))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarTarjeta)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 510, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtNumeroTarjeta.setText("");
        cmbMes.setSelectedIndex(-1);
        txtAño.setText("");
        txtCodigoSeguridad.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        if((txtNumeroTarjeta.getText()!="") && (txtAño.getText()!="") && (txtCodigoSeguridad.getText()!=""))
        {
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
            }else
            {
                JOptionPane.showMessageDialog(null, "EL NUMERO DE TARJETA QUE INTENTA INGRESAR YA SE ENCUENTRA REGISTRADO");
            }

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: formato de número incorrecto." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al agregar la tarjeta de crédito." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        cargarTabla();
        }else
        {
            JOptionPane.showMessageDialog(null, "ERROR EXISTEN CAMPOS VACIOS, POR FAVOR RELLENAR");
        }
        
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEliminarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTarjetaActionPerformed
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
            /****************************************************************************************************************************************************/    
            //Bloque de código para el proceso de eliminar tarjeta
            int fila=-1;
            fila=tblTarjetas.getSelectedRow();
            long numero=Long.parseLong(tblTarjetas.getValueAt(fila, 0).toString());
            int indice2=-1;
            if(fila!=-1)
            {
                for(int i=0;i<c1.getTarjetasCredito().size();i++)
                {
                    if(c1.getTarjetasCredito().get(i).getNumeroTarjeta()==numero)
                    {
                        c1.getTarjetasCredito().remove(i);
                        agencia.guardarUsuarioActual(c1);
                        listaUsuarios.set(indice, c1);
                        if(agencia.crearUsuario(listaUsuarios)){
                        JOptionPane.showMessageDialog(null, "Se ha eliminado la tarjeta de crédito seleccionada","Confirmación", JOptionPane.INFORMATION_MESSAGE);
                        
                        }
                    }
                }
                cargarTabla();
            }
        /****************************************************************************************************************************************************/    

    }//GEN-LAST:event_btnEliminarTarjetaActionPerformed

    private void tblTarjetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTarjetasMouseClicked
        btnEliminarTarjeta.setEnabled(true);
    }//GEN-LAST:event_tblTarjetasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminarTarjeta;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblTarjetas;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCodigoSeguridad;
    private javax.swing.JTextField txtNumeroTarjeta;
    // End of variables declaration//GEN-END:variables

private void cargarTabla() {
        SimpleDateFormat formato = new SimpleDateFormat("MM/yy");
        Usuario usuarioActual = new Usuario();
        usuarioActual = agencia.leerUsuarioActual();
                //Este código es una combinación de lo aprendido de #TodoCode y parte de nuestra creación
        //definimos el modelo que queremos que tenga la tabla
        DefaultTableModel tabla = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int columm){
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas
        String titulos[] = {"Número Tarjeta","Fecha Vencimiento","Código Seguridad"};
        tabla.setColumnIdentifiers(titulos);
        

       if(usuarioActual.getTarjetasCredito()!=null){//Si existe algun vuelo se envian sus datos a la tabla
           for(TarjetaCredito v: usuarioActual.getTarjetasCredito()){
               String fechaVencimiento = formato.format(v.getFechaVencimiento());
               Object[] objeto = {v.getNumeroTarjeta(), fechaVencimiento, v.getCodigoSeguridad()};
               System.out.println(v.toString());
               tabla.addRow(objeto);//Se añade la informacion al modelos de la tabla
           }
           tblTarjetas.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
           tblTarjetas.getTableHeader().setOpaque(false);
           tblTarjetas.getTableHeader().setBackground(new Color(32,136,206));
           tblTarjetas.getTableHeader().setForeground(new Color(255,255,255));
           tblTarjetas.setRowHeight(30);
           tblTarjetas.setAutoResizeMode(AUTO_RESIZE_ALL_COLUMNS);
           tblTarjetas.setShowVerticalLines(false);
           tblTarjetas.setModel(tabla);//Se asigna el modelo de la tabla con todo la informacion
       }
    }
}
