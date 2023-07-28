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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS;
import javax.swing.table.DefaultTableModel;
import logica.AgenciaDeViajes;
import logica.TarjetaCredito;
import logica.Usuario;


public class SeleccionarTarjeta extends javax.swing.JFrame {

    AgenciaDeViajes agencia = new AgenciaDeViajes();
    public SeleccionarTarjeta() {
        agencia = new AgenciaDeViajes();
        initComponents();
        cargarTabla();
        ImageIcon imagen = new ImageIcon("src/main/resources/Maracaibo.png");
        setIconImage(imagen.getImage());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTarjetas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(tblTarjetas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 470, 370));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(89, 137, 234));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Selección de Tarjeta");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 710, 110));

        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (25).png"))); // NOI18N
        btnSeleccionar.setBorderPainted(false);
        btnSeleccionar.setContentAreaFilled(false);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnSeleccionar)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnSeleccionar)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 200, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/****************************************************************************************************************************************************/    
//Este bloque de código es para permitirle al cliente seleccionar la tarjeta de crédito para pagar
    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        int filaSeleccionada = tblTarjetas.getSelectedRow();
        long numeroTarjeta = 0;
              
        Usuario u1 = new Usuario();
        TarjetaCredito tarjetaActual = new TarjetaCredito();
        
        u1 = agencia.leerUsuarioActual();
        
        if(filaSeleccionada != -1){
            numeroTarjeta = Long.parseLong(tblTarjetas.getValueAt(filaSeleccionada, 0).toString());
        }
        
        for(int i=0; i<u1.getTarjetasCredito().size(); i++){
            if(u1.getTarjetasCredito().get(i).getNumeroTarjeta() == numeroTarjeta){
               tarjetaActual = u1.getTarjetasCredito().get(i);
            }
        }
        
        agencia.guardarTarjetaActual(tarjetaActual);
        JOptionPane.showMessageDialog(null, "¡Tarjeta seleccionada de forma exitosa!", "Información", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        
    }//GEN-LAST:event_btnSeleccionarActionPerformed
/****************************************************************************************************************************************************/    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTarjetas;
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
