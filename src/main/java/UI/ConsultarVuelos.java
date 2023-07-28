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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.AbstractDocument;
import logica.AgenciaDeViajes;
import logica.OnlyNumbersDocumentFilter;
import logica.Vuelo;


public class ConsultarVuelos extends javax.swing.JPanel {

    int recargar=0;
    private TableRowSorter trs;//Se crea la instancia de un objeto de TableRowSorter
    AgenciaDeViajes agencia = null;//Se crea un objeto de atributos nulos
    public ConsultarVuelos() {
        agencia = new AgenciaDeViajes();//Se instancia el objeto
        initComponents();
        AbstractDocument document3 = (AbstractDocument) jtxtSPrecio.getDocument();
        document3.setDocumentFilter(new OnlyNumbersDocumentFilter());
        
        
        cargarTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVuelos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtxtSPrecio = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnRevisarAsientos2 = new javax.swing.JButton();
        btnReiniciar1 = new javax.swing.JButton();
        btnTarifa1 = new javax.swing.JButton();
        btnConsultaHorario1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jtxtSOrigen1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtSDestino1 = new javax.swing.JTextField();
        cmbEstado6 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        tblVuelos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 230, 920, 430);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(89, 137, 234));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Consultar Vuelos");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(6, 6, 950, 100);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 100, 6, 0);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(89, 137, 234));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Consulta Vuelos");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 100));

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 960, 100);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jLabel7.setText("FIltrar Precio");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(6, 6, 66, 30);

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
        jPanel7.add(jtxtSPrecio);
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
        jPanel7.add(cmbEstado);
        cmbEstado.setBounds(274, 9, 100, 25);

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jLabel8.setText("Filtrar Estado");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(189, 6, 68, 30);

        btnRevisarAsientos2.setText("Ver Asientos");
        btnRevisarAsientos2.setPreferredSize(new java.awt.Dimension(30, 25));
        btnRevisarAsientos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarAsientos2ActionPerformed(evt);
            }
        });
        jPanel7.add(btnRevisarAsientos2);
        btnRevisarAsientos2.setBounds(618, 6, 150, 25);

        btnReiniciar1.setText("Reiniciar Filtros");
        btnReiniciar1.setPreferredSize(new java.awt.Dimension(30, 25));
        btnReiniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciar1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnReiniciar1);
        btnReiniciar1.setBounds(786, 6, 140, 25);

        btnTarifa1.setText("Consulta por Tarifa");
        btnTarifa1.setPreferredSize(new java.awt.Dimension(30, 25));
        btnTarifa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarifa1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnTarifa1);
        btnTarifa1.setBounds(618, 42, 150, 25);

        btnConsultaHorario1.setText("Consulta por Horario");
        btnConsultaHorario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaHorario1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnConsultaHorario1);
        btnConsultaHorario1.setBounds(620, 80, 150, 23);

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jLabel9.setText("Filtrar Origen");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(6, 74, 69, 30);

        jtxtSOrigen1.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jtxtSOrigen1.setPreferredSize(new java.awt.Dimension(30, 25));
        jtxtSOrigen1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSOrigen1KeyTyped(evt);
            }
        });
        jPanel7.add(jtxtSOrigen1);
        jtxtSOrigen1.setBounds(81, 77, 90, 25);

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jLabel10.setText("Filtrar Destino");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(189, 74, 73, 30);

        jtxtSDestino1.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jtxtSDestino1.setPreferredSize(new java.awt.Dimension(30, 25));
        jtxtSDestino1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSDestino1KeyTyped(evt);
            }
        });
        jPanel7.add(jtxtSDestino1);
        jtxtSDestino1.setBounds(274, 77, 100, 25);

        cmbEstado6.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        cmbEstado6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "En tierra", "En vuelo", " " }));
        cmbEstado6.setPreferredSize(new java.awt.Dimension(30, 25));
        cmbEstado6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstado6ItemStateChanged(evt);
            }
        });
        cmbEstado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstado6ActionPerformed(evt);
            }
        });
        jPanel7.add(cmbEstado6);
        cmbEstado6.setBounds(274, 9, 100, 25);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(0, 100, 960, 130);

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

    private void jtxtSPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSPrecioActionPerformed

    }//GEN-LAST:event_jtxtSPrecioActionPerformed

    private void jtxtSPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSPrecioKeyTyped
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

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void btnRevisarAsientos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarAsientos2ActionPerformed

        int filaSeleccionada= tblVuelos.getSelectedRow();
        int indice=-1;
        agencia.leerVuelos();
        int idVuelo=0;

        if(filaSeleccionada != -1){
            idVuelo = Integer.parseInt(tblVuelos.getValueAt(filaSeleccionada, 0).toString());
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún vuelo!","Error",JOptionPane.ERROR_MESSAGE);
        }

        for(int i=0; i<agencia.getVuelos().size(); i++){
            if(agencia.getVuelos().get(i).getIdVuelo()==idVuelo){
                indice = i;
            }
        }

        agencia.guardarVueloActual(agencia.getVuelos().get(indice));

        ConsultaAsientos asientos = new ConsultaAsientos();
        asientos.setVisible(true);
        asientos.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRevisarAsientos2ActionPerformed

    private void btnReiniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciar1ActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnReiniciar1ActionPerformed

    private void btnTarifa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarifa1ActionPerformed
        BusquedaPorTarifa ventana = new BusquedaPorTarifa();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

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
    }//GEN-LAST:event_btnTarifa1ActionPerformed

    private void btnConsultaHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaHorario1ActionPerformed
        BusquedaPorHorario ventana = new BusquedaPorHorario();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

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
    }//GEN-LAST:event_btnConsultaHorario1ActionPerformed

    private void jtxtSOrigen1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSOrigen1KeyTyped
        if(recargar==1)
        {
            cargarTabla();
            recargar=0;
        }
        jtxtSOrigen1.addKeyListener(new KeyAdapter (){

            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena= jtxtSOrigen1.getText();
                jtxtSOrigen1.setText(cadena);
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+jtxtSOrigen1.getText(), 1));
            }

        });
        trs = new TableRowSorter(tblVuelos.getModel());
        tblVuelos.setRowSorter(trs);
    }//GEN-LAST:event_jtxtSOrigen1KeyTyped

    private void jtxtSDestino1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSDestino1KeyTyped
        if(recargar==1)
        {
            cargarTabla();
            recargar=0;
        }
        jtxtSDestino1.addKeyListener(new KeyAdapter (){

            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena= jtxtSDestino1.getText();
                jtxtSDestino1.setText(cadena);
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+jtxtSDestino1.getText(), 2));
            }
        });
        trs = new TableRowSorter(tblVuelos.getModel());
        tblVuelos.setRowSorter(trs);
    }//GEN-LAST:event_jtxtSDestino1KeyTyped

    private void cmbEstado6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstado6ItemStateChanged
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
    }//GEN-LAST:event_cmbEstado6ItemStateChanged

    private void cmbEstado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstado6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstado6ActionPerformed

    private void cargarTabla() {
        
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
               
               String fechaSalida = formato.format(v.getFechaSalida());
               String fechaLlegada = formato.format(v.getFechaLlegada());
               
               Object[] objeto = {v.getIdVuelo(),v.getOrigen(),v.getDestino(),
                   fechaSalida, fechaLlegada ,v.getTipoVuelo(), v.getNombreAerolinea(),
                   v.getPrecio(),v.getEstado()};
               
               
               tabla.addRow(objeto);//Se añade la informacion al modelos de la tabla
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaHorario1;
    private javax.swing.JButton btnReiniciar1;
    private javax.swing.JButton btnRevisarAsientos2;
    private javax.swing.JButton btnTarifa1;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbEstado6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtxtSDestino1;
    private javax.swing.JTextField jtxtSOrigen1;
    private javax.swing.JTextField jtxtSPrecio;
    private javax.swing.JTable tblVuelos;
    // End of variables declaration//GEN-END:variables
}
