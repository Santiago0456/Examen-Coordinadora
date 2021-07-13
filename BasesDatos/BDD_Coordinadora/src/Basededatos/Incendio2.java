/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Basededatos;

import com.sun.awt.AWTUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.DecimalFormat;

public class Incendio2 extends javax.swing.JFrame {
int x,y;
public int contador=0;

    public Incendio2() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.combo1.removeAllItems();
        AWTUtilities.setWindowOpaque(this, false);
        
             try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=C:/Users/User/Documents/NetBeansProjects/Vectores_y_ Matrices_Coordinadora/Bomberos.MDB", "", "");
        Statement Sent=con.createStatement();
        ResultSet rs=Sent.executeQuery("SELECT Equipo.IDEquipo FROM Equipo ORDER BY IDEquipo");
        while (rs.next()){
            this.combo1.addItem(rs.getString("IDEquipo"));
            
            contador++;
        }
       }

   

catch (ClassNotFoundException e) {e.printStackTrace();}
catch (SQLException e) {e.printStackTrace();}
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfsnombre = new javax.swing.JTextField();
        tfarea = new javax.swing.JTextField();
        tfcomuna = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfpnombre = new javax.swing.JTextField();
        tfsapellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfbarrio = new javax.swing.JTextField();
        tfriesgoz = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfpapellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jdate = new com.toedter.calendar.JDateChooser();
        tfcedula = new javax.swing.JTextField();
        tfhora = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textgeneral = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textespecifica = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfcincendio = new javax.swing.JTextField();
        lbequipo = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 910));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Incendios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 260, 27));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel2.setText("Informante");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 550, 19));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Equipo de Bomberos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Primer Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));
        getContentPane().add(tfsnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 94, -1));

        tfarea.setText("mts x mts");
        getContentPane().add(tfarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 94, -1));
        getContentPane().add(tfcomuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Primer Apellido:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));
        getContentPane().add(tfpnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 94, -1));
        getContentPane().add(tfsapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 94, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Segundo Apellido:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Segundo Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel8.setText("Zona ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Causa General:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));
        getContentPane().add(tfbarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 94, -1));

        tfriesgoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfriesgozActionPerformed(evt);
            }
        });
        getContentPane().add(tfriesgoz, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 94, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Causa Específica:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Código del Incendio:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 740, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Barrio:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Riesgo de la Zona:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));
        getContentPane().add(tfpapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 94, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha del incidente:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));
        getContentPane().add(jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 130, -1));

        tfcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcedulaActionPerformed(evt);
            }
        });
        getContentPane().add(tfcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 94, -1));
        getContentPane().add(tfhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 94, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Área Afectada:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Comuna:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 550, 19));

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel17.setText("Otros");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        textgeneral.setColumns(20);
        textgeneral.setRows(5);
        jScrollPane1.setViewportView(textgeneral);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, -1, -1));

        textespecifica.setColumns(20);
        textespecifica.setRows(5);
        jScrollPane2.setViewportView(textespecifica);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, -1, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 790, -1, -1));

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 790, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cédula:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Hora del incidente:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, -1, -1));
        getContentPane().add(tfcincendio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 740, 130, -1));

        lbequipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lbequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 90, 20));

        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        getContentPane().add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 60, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel (4).png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 40, 40));

        fondo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regi.jpg"))); // NOI18N
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoMousePressed(evt);
            }
        });
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoMouseDragged(evt);
            }
        });
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 610, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfriesgozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfriesgozActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfriesgozActionPerformed

    private void tfcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcedulaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio In=new Inicio();
        In.setLocation(this.getLocation().x, this.getLocation().y);
        this.setVisible(false);
        In.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};"+"DBQ=C:/Users/User/Documents/NetBeansProjects/Vectores_y_ Matrices_Coordinadora/Bomberos.MDB", "", "");
String cedula,codescuadron,pnombre,snombre,papellido,sapellido,comuna,aafectada,barrio,rzona,fecha="",hora,general,especifica,cicendio;

cedula=tfcedula.getText();
codescuadron=combo1.getSelectedItem().toString();
pnombre=tfpnombre.getText();
snombre=tfsnombre.getText();
papellido=tfpapellido.getText();
sapellido=tfsapellido.getText();
comuna=tfcomuna.getText();
aafectada=tfarea.getText();
barrio=tfbarrio.getText();
rzona=tfriesgoz.getText();
String dia=Integer.toString(jdate.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes=Integer.toString(jdate.getCalendar().get(Calendar.MONTH)+1);
String anio=Integer.toString(jdate.getCalendar().get(Calendar.YEAR));
fecha=dia+"/"+mes+"/"+anio;

hora=tfhora.getText();
general=textgeneral.getText();
especifica=textespecifica.getText();
cicendio=tfcincendio.getText();

   
Statement sentencia=con.createStatement();
sentencia.executeUpdate("INSERT INTO Informante(IDInformante, PNombre, SNombre, PApellido, SApellido) VALUES('"+cedula+"','"+pnombre+"','"+snombre+"','"+papellido+"','"+sapellido+"')");
sentencia.executeUpdate("INSERT INTO Zona (IDZona, Nombre, Riesgo) VALUES('"+comuna+"','"+barrio+"','"+rzona+"')");
sentencia.executeUpdate("INSERT INTO Incendio(IDIncendio, IDZona, Hora, Fecha, Area_afectada, Causa_general, Causa_especifica) VALUES('"+cicendio+"','"+comuna+"','"+hora+"','"+fecha+"','"+aafectada+"','"+general+"','"+especifica+"')");
sentencia.executeUpdate("INSERT INTO Registro (IDIncendio, IDInformante, IDEquipo) VALUES('"+cicendio+"','"+cedula+"','"+codescuadron+"')");
   }

catch (ClassNotFoundException e) {e.printStackTrace();}
catch (SQLException e) {e.printStackTrace();}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
try{
    if(this.contador>0){
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con1=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};"+"DBQ=C:/Users/User/Documents/NetBeansProjects/Vectores_y_ Matrices_Coordinadora/Bomberos.MDB", "", "");
    Statement sent1=con1.createStatement();
    ResultSet rsl=sent1.executeQuery("SELECT * FROM Equipo WHERE IDEquipo= '"+this.combo1.getSelectedItem()+"'");
    rsl.next();
  
    this.lbequipo.setText(rsl.getString("Escuadron"));
    

    
    
    }
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_combo1ActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged
this.setLocation(this.getLocation().x + evt.getX() -x, this.getLocation().y + evt.getY()- y);
    }//GEN-LAST:event_fondoMouseDragged

    private void fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMousePressed
        x=evt.getX();
        y=evt.getY();   
    }//GEN-LAST:event_fondoMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Incendio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incendio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incendio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incendio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Incendio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo1;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JLabel lbequipo;
    private javax.swing.JTextArea textespecifica;
    private javax.swing.JTextArea textgeneral;
    private javax.swing.JTextField tfarea;
    private javax.swing.JTextField tfbarrio;
    private javax.swing.JTextField tfcedula;
    private javax.swing.JTextField tfcincendio;
    private javax.swing.JTextField tfcomuna;
    private javax.swing.JTextField tfhora;
    private javax.swing.JTextField tfpapellido;
    private javax.swing.JTextField tfpnombre;
    private javax.swing.JTextField tfriesgoz;
    private javax.swing.JTextField tfsapellido;
    private javax.swing.JTextField tfsnombre;
    // End of variables declaration//GEN-END:variables
}
