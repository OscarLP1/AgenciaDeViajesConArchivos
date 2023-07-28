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

import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class BusquedaPorHorario extends javax.swing.JFrame {


    public BusquedaPorHorario() {
        setResizable(false);//Hacemos que la ventana no pueda ser redimensionada
        setMaximumSize(new Dimension(400, 500));//Asignamos su tamaño
        initComponents();
        ImageIcon imagen = new ImageIcon("src/main/resources/Maracaibo.png");
        setIconImage(imagen.getImage());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        cmbMes = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        cmbAño = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cmbDia1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cmbMes1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        cmbAño1 = new javax.swing.JComboBox<>();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(89, 137, 234));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busqueda por Horario");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(89, 137, 234));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fecha Salida");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        jLabel20.setText("Día:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        cmbDia.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(cmbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        cmbDia.getAccessibleContext().setAccessibleParent(cmbDia);

        jLabel21.setText("Mes:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 20));

        cmbMes.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel3.add(cmbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel22.setText("Año:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 20));

        cmbAño.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        cmbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2023", "2024", "2025", "2026" }));
        jPanel3.add(cmbAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(89, 137, 234));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha Llegada");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 460, -1));

        jLabel23.setText("Día:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));

        cmbDia1.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        cmbDia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(cmbDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel24.setText("Mes:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 20));

        cmbMes1.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        cmbMes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel3.add(cmbMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel25.setText("Año:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, 20));

        cmbAño1.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        cmbAño1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2023", "2024", "2025", "2026" }));
        jPanel3.add(cmbAño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (13).png"))); // NOI18N
        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConfirmar;
    public javax.swing.JComboBox<String> cmbAño;
    public javax.swing.JComboBox<String> cmbAño1;
    public javax.swing.JComboBox<String> cmbDia;
    public javax.swing.JComboBox<String> cmbDia1;
    public javax.swing.JComboBox<String> cmbMes;
    public javax.swing.JComboBox<String> cmbMes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
