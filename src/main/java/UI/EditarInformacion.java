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


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import logica.AgenciaDeViajes;
import logica.Usuario;


public class EditarInformacion extends javax.swing.JPanel {

    AgenciaDeViajes agencia;
    Usuario c2 = new Usuario();
    public EditarInformacion() {
        agencia = new AgenciaDeViajes();
        agencia.leerUsuarios();
        c2=agencia.leerUsuarioActual();
        System.out.println("Aqui seteo los txt");
        initComponents();
        txtNombre.setText(c2.getNombre());
        txtApellido.setText(c2.getApellido());
        txtCorreo.setText(c2.getCorreo());
        txtContraseña.setText(c2.getPassword());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(960, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(89, 137, 234));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar Información");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 120));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 61, 93, -1));

        jLabel3.setText("Nombre:");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 64, -1, -1));

        jLabel4.setText("Apellido:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 98, -1, -1));
        jPanel7.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 95, 93, -1));

        jLabel5.setText("Correo:");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 132, -1, -1));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel7.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 129, 93, -1));

        jLabel7.setText("Contraseña:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 166, -1, -1));

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel7.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 163, 93, -1));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (18).png"))); // NOI18N
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel7.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 261, 217, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undraw_Travelers_re_y25a.png"))); // NOI18N
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -80, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 960, 470));

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

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        String patron = ".*@.*";
        
        //declaración de obejtos Pattern y Matcher
        Pattern pattern = Pattern.compile(patron);
        Matcher match = pattern.matcher(txtCorreo.getText());
        
        //bloque de código en un try catch para evitar las excepciones
        try{
            agencia.leerUsuarios();
            Usuario c1 = new Usuario();
/****************************************************************************************************************************************************/    
    //Este bloque de código se encargar de verificar que todos los campos sean correctos y de que no existen usuarios repetidos
    //agrega un nuevo usuario al archivo de usuarios
            String correo = txtCorreo.getText();
            int banderaDos = -1;
            int indice = -1;
            
            for(int i=0; i<agencia.getClientes().size(); i++){
                if(agencia.getClientes().get(i).getCedula() == c2.getCedula()){
                    indice = i;
                }
            }

            for(int i=0; i<agencia.getClientes().size(); i++){
                if(agencia.getClientes().get(i).getCorreo().equals(correo)){
                    banderaDos = 1;
                }
            }

            if(banderaDos !=1){

                if(match.matches()){
                    if(!(txtNombre.getText().equals("")) && !(txtCorreo.getText().equals("")) && !(txtApellido.getText().equals("")) && !(txtContraseña.getText().equals("")))
                    {
                        agencia.getClientes().get(indice).setNombre(txtNombre.getText());
                        agencia.getClientes().get(indice).setApellido(txtApellido.getText());
                        agencia.getClientes().get(indice).setCorreo(correo);
                        agencia.getClientes().get(indice).setPassword(txtContraseña.getText());
                        
                        agencia.crearUsuario(agencia.getClientes());
                        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente", "Información",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Hay campos vacios!", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El correo es invalido, intente otro", "Error",JOptionPane.ERROR_MESSAGE);
                }

            }else{
                JOptionPane.showMessageDialog(null, "El correo ya se encuentra registrado, intente otro", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: ingreso una letra en vez de un número: " +e.getMessage() , "Error",JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            e.printStackTrace();
        }

        //usar el método de los arrayLists .contains para buscar si existe una cuenta que tenga la información de otro cliente
    }//GEN-LAST:event_btnIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
