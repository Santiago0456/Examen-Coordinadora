/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desarrollo;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.util.*;

public class PiedraPapeloTijera extends javax.swing.JFrame {
int score=0;
int x,y;
    /**
     * Creates new form PiedraPapeloTijera
     */
    public PiedraPapeloTijera() {
        initComponents();
        this.setLocationRelativeTo(null);;
        AWTUtilities.setWindowOpaque(this, false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbmaquina = new javax.swing.JLabel();
        lbresultado = new javax.swing.JLabel();
        lbscore = new javax.swing.JLabel();
        TIJERA = new javax.swing.JLabel();
        PIEDRA = new javax.swing.JLabel();
        PAPEL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(490, 521));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbmaquina.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        lbmaquina.setForeground(new java.awt.Color(255, 255, 255));
        lbmaquina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmaquina.setText("¿LISTO PARA PERDER?");
        getContentPane().add(lbmaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, 78));

        lbresultado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbresultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 380, 84));

        lbscore.setFont(new java.awt.Font("Showcard Gothic", 1, 16)); // NOI18N
        lbscore.setForeground(new java.awt.Color(153, 255, 153));
        lbscore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 80, 40));

        TIJERA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/scissors.png"))); // NOI18N
        TIJERA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TIJERA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TIJERAMouseClicked(evt);
            }
        });
        getContentPane().add(TIJERA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 130, 130));

        PIEDRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rock.png"))); // NOI18N
        PIEDRA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PIEDRA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PIEDRAMouseClicked(evt);
            }
        });
        getContentPane().add(PIEDRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 110));

        PAPEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paper.png"))); // NOI18N
        PAPEL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PAPEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PAPELMouseClicked(evt);
            }
        });
        getContentPane().add(PAPEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 130, 140));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MÁQUINA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 70, -1));

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("score:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, 20));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 70, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neon.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PIEDRAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PIEDRAMouseClicked
String[] maquina = {"PIEDRA","PAPEL","TIJERA"};
int num=0;

        num =(int)(Math.random()*3);        
lbmaquina.setText(maquina[num]);
if (num==0){
    lbresultado.setText("EMPATE CAMPEÓN, SIGUE JUGANDO!");
    lbresultado.setForeground(Color.WHITE);
     lbscore.setText(""+score);
}
if (num==1){
    lbresultado.setText("PERDISTE!!!!");
    lbresultado.setForeground(Color.RED);
    score=(score-1);
    lbscore.setText(""+score);;
}
if (num==2){
    lbresultado.setText("GANASTE!!! FELICIDADES!!");
    lbresultado.setForeground(Color.GREEN);
    score=(score+1);
    lbscore.setText(""+score);
}
    }//GEN-LAST:event_PIEDRAMouseClicked

    private void PAPELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PAPELMouseClicked
String[] maquina = {"PIEDRA","PAPEL","TIJERA"};
int num=0;

        num =(int)(Math.random()*3);        
lbmaquina.setText(maquina[num]);
if (num==1){
    lbresultado.setText("EMPATE CAMPEÓN, SIGUE JUGANDO!");
    lbresultado.setForeground(Color.WHITE);
    lbscore.setText(""+score);
}
if (num==2){
    lbresultado.setText("PERDISTE!!!!");
    lbresultado.setForeground(Color.RED);
    score=(score-1);
    lbscore.setText(""+score);
}
if (num==0){
    lbresultado.setText("GANASTE!!! FELICIDADES!!");
    lbresultado.setForeground(Color.GREEN);
    score=(score+1);
    lbscore.setText(""+score);
}
    }//GEN-LAST:event_PAPELMouseClicked

    private void TIJERAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIJERAMouseClicked
String[] maquina = {"PIEDRA","PAPEL","TIJERA"};
int num=0;

        num =(int)(Math.random()*3);        
lbmaquina.setText(maquina[num]);
if (num==2){
    lbresultado.setText("EMPATE CAMPEÓN, SIGUE JUGANDO!");
    lbresultado.setForeground(Color.WHITE);
    lbscore.setText(""+score);
}
if (num==0){
    lbresultado.setText("PERDISTE!!!!");
    lbresultado.setForeground(Color.RED);
    score=(score-1);
    lbscore.setText(""+score);
}
if (num==1){
    lbresultado.setText("GANASTE!!! FELICIDADES!!");
    lbresultado.setForeground(Color.GREEN);
    score=(score+1);
    lbscore.setText(""+score);
}
    }//GEN-LAST:event_TIJERAMouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
this.setLocation(this.getLocation().x + evt.getX() -x, this.getLocation().y + evt.getY()- y);
    }//GEN-LAST:event_jLabel2MouseDragged


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
            java.util.logging.Logger.getLogger(PiedraPapeloTijera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PiedraPapeloTijera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PiedraPapeloTijera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PiedraPapeloTijera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PiedraPapeloTijera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PAPEL;
    private javax.swing.JLabel PIEDRA;
    private javax.swing.JLabel TIJERA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbmaquina;
    private javax.swing.JLabel lbresultado;
    private javax.swing.JLabel lbscore;
    // End of variables declaration//GEN-END:variables
}
