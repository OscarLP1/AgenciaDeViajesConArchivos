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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import logica.AgenciaDeViajes;
import logica.Asiento;
import logica.Vuelo;


public class ConsultaAsientos extends javax.swing.JFrame {
    //atributos
    AgenciaDeViajes agencia;
    Vuelo v1;
    Asiento[][] asiento;

    JButton[][] matriz;
    ImageIcon ocupado= new ImageIcon("src/main/resources/sillaOcupada.png");
    ImageIcon disponible= new ImageIcon("src/main/resources/SillaDisponible.png");
    //método constructor
    public ConsultaAsientos() {
        agencia = new AgenciaDeViajes();
        asiento = new Asiento[6][15];
        v1 = new Vuelo();
        matriz = new JButton[6][15];
        setResizable(false);//Hacemos que la ventana no pueda ser redimensionada
        setMaximumSize(new Dimension(400, 500));//Asignamos su tamaño
        initComponents();
        cargarAsientos();
        ImageIcon imagen = new ImageIcon("src/main/resources/Maracaibo.png");
        setIconImage(imagen.getImage());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton13 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAsiento = new javax.swing.JLabel();
        txtTipoAsiento = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();

        jButton13.setText("1");

        jButton24.setText("1");

        jButton34.setText("1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(89, 137, 234));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Consultar Asientos");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 104, 340, 530));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Información");

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel3.setText("Id:");

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel4.setText("Tipo Asiento:");

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel9.setText("Precio:");

        txtAsiento.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N

        txtTipoAsiento.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N

        txtEstado.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N

        txtPrecio.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAsiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipoAsiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAsiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtTipoAsiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(289, 289, 289))
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 440, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton34;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel txtAsiento;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtTipoAsiento;
    // End of variables declaration//GEN-END:variables

    private void cargarAsientos() {
        //variables locales
        int x=90;
        int y=80;

        //matriz de botones para los asientos y vectores de label para los titulos
        JLabel[] filasTitulos = new JLabel[6];
        JLabel[] columnasTitulos = new JLabel[15];
        
          //ciclo for más externo para hacer la iteracíon de las columnas de los asientos.
          for(int i=0; i<6;i++){
              //for que se usa para hacer la iteración de las filas de los asientos
            for(int j=0; j<15; j++){
                
                columnasTitulos[j]= new JLabel();
                columnasTitulos[j].setVisible(true);
                columnasTitulos[j].setBounds(50, y, 30, 30);
                columnasTitulos[j].setText(Integer.toString(j+1));
                jPanel1.add(columnasTitulos[j]);
                matriz[i][j] = new JButton();
                matriz[i][j].setVisible(true);
                matriz[i][j].setBounds(x, y, 25, 25);
                matriz[i][j].setContentAreaFilled(false);
                matriz[i][j].setBorderPainted(false);
                matriz[i][j].setFocusPainted(false);
                jPanel1.add(matriz[i][j]);
                y+=30;
            } 
            filasTitulos[i]= new JLabel();
            filasTitulos[i].setVisible(true);
            if(i==0){
                filasTitulos[i].setText("A");
            }else if(i==1){
                filasTitulos[i].setText("B");
            }else if(i==2){
                filasTitulos[i].setText("C");
            }else if(i==3){
                filasTitulos[i].setText("D");
            }else if(i==4){
                filasTitulos[i].setText("E");
            }else if(i==5){
                filasTitulos[i].setText("F");
            }
            filasTitulos[i].setBounds(x+8, 50, 30, 30);
            jPanel1.add(filasTitulos[i]);
            if(i==2){
                x+=60;
            }else{
                x+=30;
            }
            y=80;
        }
        //creación de una matriz de asientos
        asiento = new Asiento[6][30];
        //en el siguiente for se instancian los objetos en cada una de las posiciones de la matriz de asientos
        for(int i=0; i<6;i++){
            for(int j=0; j<15; j++){
                asiento[i][j] = new Asiento();
            }   
        }
        //se lee el vuelo que el usuario selecciono
        v1 = agencia.leerVueloActual();
        //se le pasan los asientos del vuelo al atributo global
        asiento = v1.getAsientos();
        
        
        //Inicialización de los atributos de los asientos
          
        ActionListener evento = new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {

                JButton button = (JButton) e.getSource();
                int fila = -1; 
                int columna=-1;

                for(int i=0; i<6; i++){
                    for(int j=0; j<15; j++){
                        if(matriz[i][j] == button){
                            columna= i;
                            fila =j;
                            break;
                        }
                    }
                }
                
                String id = String.valueOf(asiento[columna][fila].getId());
                String tipoAsiento = asiento[columna][fila].getTipoAsiento();
                double precio =asiento[columna][fila].getPrecio();
                txtAsiento.setText(id);
                txtTipoAsiento.setText(tipoAsiento);
                txtPrecio.setText(String.valueOf(precio));
                
                if(asiento[columna][fila].getEstado() == 1){
                    txtEstado.setText("Ocupado");
                }else if(asiento[columna][fila].getEstado() == 0){
                    txtEstado.setText("Disponible");
                }
                
            }
        };
            for(int i=0; i<6; i++){
                for(int j=0; j<15;j++){
                    if(asiento[i][j].getEstado()==1){
                        matriz[i][j].setIcon(ocupado);
                        
                    }else
                    {
                        matriz[i][j].setIcon(disponible);
                    } 
                matriz[i][j].addActionListener(evento);
            }
        }
  
    }  
}
