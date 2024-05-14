/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entidades.Historico;
import java.awt.Color;

/**
 *
 * @author danie
 */
public class TelaHistorico extends javax.swing.JFrame {

    /**
     * Creates new form TelaHistorico
     */
    private static Historico historico;

    public TelaHistorico(Historico historico) {
        initComponents();
        botaoVoltar.setBackground(new Color(0, 0, 0, 0));
        this.historico = historico;
        
        textoPartidaJogada.setText("Partidas Jogadas: " + this.historico.getPartidasJogadas());
        textoPartidaGanha.setText("Partidas Ganhas: " + this.historico.getPartidasGanhas());
        textoPartidaPerdida.setText("Partidas Perdidas: " + this.historico.getPartidasPerdidas());

        this.setLocationRelativeTo(null);
        
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoHistorico = new javax.swing.JLabel();
        textoPartidaJogada = new javax.swing.JLabel();
        textoPartidaGanha = new javax.swing.JLabel();
        textoPartidaPerdida = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoHistorico.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        textoHistorico.setForeground(new java.awt.Color(255, 255, 255));
        textoHistorico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoHistorico.setText("Histórico");
        getContentPane().add(textoHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 32, -1, -1));

        textoPartidaJogada.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        textoPartidaJogada.setForeground(new java.awt.Color(255, 255, 255));
        textoPartidaJogada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPartidaJogada.setText("Partidas Jogadas: 100");
        getContentPane().add(textoPartidaJogada, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 81, -1, -1));

        textoPartidaGanha.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        textoPartidaGanha.setForeground(new java.awt.Color(255, 255, 255));
        textoPartidaGanha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPartidaGanha.setText("Partidas Ganhas: 80");
        getContentPane().add(textoPartidaGanha, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 125, 166, -1));

        textoPartidaPerdida.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        textoPartidaPerdida.setForeground(new java.awt.Color(255, 255, 255));
        textoPartidaPerdida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPartidaPerdida.setText("Partidas Perdidas: 20");
        getContentPane().add(textoPartidaPerdida, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 169, -1, -1));

        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/botao_branco.png"))); // NOI18N
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/trofeu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        //new TelaAcoesDoPersonagem().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botaoVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHistorico(historico).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel textoHistorico;
    private javax.swing.JLabel textoPartidaGanha;
    private javax.swing.JLabel textoPartidaJogada;
    private javax.swing.JLabel textoPartidaPerdida;
    // End of variables declaration//GEN-END:variables
}