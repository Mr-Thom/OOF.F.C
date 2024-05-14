/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controle.Combate;
import java.awt.Color;
import java.util.Objects;
import persistencia.PersonagemDAO;

/**
 *
 * @author danie
 */
public class TelaEspeciais extends javax.swing.JFrame {

    /**
     * Creates new form TelaSoco
     */
    private static Combate combate;

    public TelaEspeciais(Combate combate) {
        initComponents();

        this.setLocationRelativeTo(null);

        Objects.requireNonNull(combate, "Tela de Combate não pode ser nulo");

        this.combate = combate;

        botaoVoltar.setBackground(new Color(0, 0, 0, 0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoEspeciais = new javax.swing.JLabel();
        botaoDuploTwistCarpado = new javax.swing.JButton();
        Patchon = new javax.swing.JButton();
        botaoCotoneteNoOuvido = new javax.swing.JButton();
        botaoVoadoraDeDoisPes = new javax.swing.JButton();
        botaoChaveOuGaveta = new javax.swing.JButton();
        textoCusto1 = new javax.swing.JLabel();
        textoCusto2 = new javax.swing.JLabel();
        textoCusto3 = new javax.swing.JLabel();
        textoCusto4 = new javax.swing.JLabel();
        textoCusto5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textoAtaque1 = new javax.swing.JLabel();
        textoEficacia1 = new javax.swing.JLabel();
        textoAtaque2 = new javax.swing.JLabel();
        textoAtaque3 = new javax.swing.JLabel();
        textoAtaque4 = new javax.swing.JLabel();
        textoAtaque5 = new javax.swing.JLabel();
        textoEficacia3 = new javax.swing.JLabel();
        textoEficacia2 = new javax.swing.JLabel();
        textoEficacia5 = new javax.swing.JLabel();
        textoEficacia4 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        textoEspeciais.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        textoEspeciais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoEspeciais.setText("Especiais");

        botaoDuploTwistCarpado.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        botaoDuploTwistCarpado.setText("Duplo Twist Carpado");
        botaoDuploTwistCarpado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoDuploTwistCarpado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDuploTwistCarpadoActionPerformed(evt);
            }
        });

        Patchon.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        Patchon.setText("Patchon");
        Patchon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Patchon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatchonActionPerformed(evt);
            }
        });

        botaoCotoneteNoOuvido.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        botaoCotoneteNoOuvido.setText("Concha no Ouvido");
        botaoCotoneteNoOuvido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCotoneteNoOuvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCotoneteNoOuvidoActionPerformed(evt);
            }
        });

        botaoVoadoraDeDoisPes.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        botaoVoadoraDeDoisPes.setText("Mata Leão");
        botaoVoadoraDeDoisPes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoadoraDeDoisPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoadoraDeDoisPesActionPerformed(evt);
            }
        });

        botaoChaveOuGaveta.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        botaoChaveOuGaveta.setText("Chute Quintuplo Aéreo");
        botaoChaveOuGaveta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoChaveOuGaveta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChaveOuGavetaActionPerformed(evt);
            }
        });

        textoCusto1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoCusto1.setForeground(new java.awt.Color(0, 128, 0));
        textoCusto1.setText("Custo: 20");

        textoCusto2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoCusto2.setForeground(new java.awt.Color(0, 128, 0));
        textoCusto2.setText("Custo: 12");

        textoCusto3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoCusto3.setForeground(new java.awt.Color(0, 128, 0));
        textoCusto3.setText("Custo: 10");

        textoCusto4.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoCusto4.setForeground(new java.awt.Color(0, 128, 0));
        textoCusto4.setText("Custo: 14");

        textoCusto5.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoCusto5.setForeground(new java.awt.Color(0, 128, 0));
        textoCusto5.setText("Custo: 17");

        textoAtaque1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoAtaque1.setForeground(new java.awt.Color(255, 0, 0));
        textoAtaque1.setText("ATQ: 50");

        textoEficacia1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoEficacia1.setForeground(new java.awt.Color(51, 51, 51));
        textoEficacia1.setText("EFC: 10%");

        textoAtaque2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoAtaque2.setForeground(new java.awt.Color(255, 0, 0));
        textoAtaque2.setText("ATQ: 25");

        textoAtaque3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoAtaque3.setForeground(new java.awt.Color(255, 0, 0));
        textoAtaque3.setText("ATQ: 18");

        textoAtaque4.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoAtaque4.setForeground(new java.awt.Color(255, 0, 0));
        textoAtaque4.setText("ATQ: 28");

        textoAtaque5.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoAtaque5.setForeground(new java.awt.Color(255, 0, 0));
        textoAtaque5.setText("ATQ: 35");

        textoEficacia3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoEficacia3.setForeground(new java.awt.Color(51, 51, 51));
        textoEficacia3.setText("EFC: 35%");

        textoEficacia2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoEficacia2.setForeground(new java.awt.Color(51, 51, 51));
        textoEficacia2.setText("EFC: 30%");

        textoEficacia5.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoEficacia5.setForeground(new java.awt.Color(51, 51, 51));
        textoEficacia5.setText("EFC: 25%");

        textoEficacia4.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoEficacia4.setForeground(new java.awt.Color(51, 51, 51));
        textoEficacia4.setText("EFC: 30%");

        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Botao.png"))); // NOI18N
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botaoVoltar)
                                        .addGap(45, 45, 45))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textoCusto2)
                                                .addComponent(textoCusto3)
                                                .addComponent(textoCusto4)
                                                .addComponent(textoCusto5))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(textoCusto1)
                                                .addGap(3, 3, 3)))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoEspeciais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botaoCotoneteNoOuvido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(Patchon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botaoVoadoraDeDoisPes, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addComponent(botaoChaveOuGaveta, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(textoAtaque2)
                                        .addGap(7, 7, 7)
                                        .addComponent(textoEficacia2)
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textoAtaque3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textoEficacia3)
                                        .addGap(28, 28, 28)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(textoAtaque4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textoEficacia4)
                                    .addGap(26, 26, 26)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoAtaque5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoEficacia5)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoDuploTwistCarpado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoAtaque1)
                        .addGap(6, 6, 6)
                        .addComponent(textoEficacia1)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoEspeciais)
                    .addComponent(botaoVoltar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCotoneteNoOuvido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCusto3)
                    .addComponent(textoAtaque3)
                    .addComponent(textoEficacia3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Patchon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCusto2)
                    .addComponent(textoAtaque2)
                    .addComponent(textoEficacia2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoadoraDeDoisPes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCusto4)
                    .addComponent(textoAtaque4)
                    .addComponent(textoEficacia4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoChaveOuGaveta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCusto5)
                    .addComponent(textoAtaque5)
                    .addComponent(textoEficacia5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDuploTwistCarpado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCusto1)
                    .addComponent(textoAtaque1)
                    .addComponent(textoEficacia1))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoDuploTwistCarpadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDuploTwistCarpadoActionPerformed
        String msg = combate.EspeciaisDoUser(1);
        if (combate.isCombateFinalizado() == true) {
            try {
                PersonagemDAO p = PersonagemDAO.getInstance();
                p.editar(combate.getPersonagem());
                new TelaDeVitoriaOuDerrota(combate).setVisible(true);
                new TelaPopUp(msg).setVisible(true);
            } catch (Exception e) {
                new TelaPopUp(e.getMessage()).setVisible(true);
            }
        } else {
            new TelaCombate(combate).setVisible(true);
            new TelaPopUp(msg).setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_botaoDuploTwistCarpadoActionPerformed

    private void botaoVoadoraDeDoisPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoadoraDeDoisPesActionPerformed
        String msg = combate.EspeciaisDoUser(4);
        if (combate.isCombateFinalizado() == true) {
            try {
                PersonagemDAO p = PersonagemDAO.getInstance();
                p.editar(combate.getPersonagem());
                new TelaDeVitoriaOuDerrota(combate).setVisible(true);
                new TelaPopUp(msg).setVisible(true);
            } catch (Exception e) {
                new TelaPopUp(e.getMessage()).setVisible(true);
            }
        } else {
            new TelaCombate(combate).setVisible(true);
            new TelaPopUp(msg).setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_botaoVoadoraDeDoisPesActionPerformed

    private void PatchonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatchonActionPerformed
        String msg = combate.EspeciaisDoUser(2);
        if (combate.isCombateFinalizado() == true) {
            try {
                PersonagemDAO p = PersonagemDAO.getInstance();
                p.editar(combate.getPersonagem());
                new TelaDeVitoriaOuDerrota(combate).setVisible(true);
                new TelaPopUp(msg).setVisible(true);
            } catch (Exception e) {
                new TelaPopUp(e.getMessage()).setVisible(true);
            }
        } else {
            new TelaCombate(combate).setVisible(true);
            new TelaPopUp(msg).setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_PatchonActionPerformed

    private void botaoCotoneteNoOuvidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCotoneteNoOuvidoActionPerformed
        String msg = combate.EspeciaisDoUser(3);
        if (combate.isCombateFinalizado() == true) {
            try {
                PersonagemDAO p = PersonagemDAO.getInstance();
                p.editar(combate.getPersonagem());
                new TelaDeVitoriaOuDerrota(combate).setVisible(true);
                new TelaPopUp(msg).setVisible(true);
            } catch (Exception e) {
                new TelaPopUp(e.getMessage()).setVisible(true);
            }
        } else {
            new TelaCombate(combate).setVisible(true);
            new TelaPopUp(msg).setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_botaoCotoneteNoOuvidoActionPerformed

    private void botaoChaveOuGavetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChaveOuGavetaActionPerformed
        String msg = combate.EspeciaisDoUser(5);
        if (combate.isCombateFinalizado() == true) {
            try {
                PersonagemDAO p = PersonagemDAO.getInstance();
                p.editar(combate.getPersonagem());
                new TelaDeVitoriaOuDerrota(combate).setVisible(true);
                new TelaPopUp(msg).setVisible(true);
            } catch (Exception e) {
                new TelaPopUp(e.getMessage()).setVisible(true);
            }
        } else {
            new TelaCombate(combate).setVisible(true);
            new TelaPopUp(msg).setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_botaoChaveOuGavetaActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        new TelaCombate(combate).setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaEspeciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEspeciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEspeciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEspeciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEspeciais(combate).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Patchon;
    private javax.swing.JButton botaoChaveOuGaveta;
    private javax.swing.JButton botaoCotoneteNoOuvido;
    private javax.swing.JButton botaoDuploTwistCarpado;
    private javax.swing.JButton botaoVoadoraDeDoisPes;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoAtaque1;
    private javax.swing.JLabel textoAtaque2;
    private javax.swing.JLabel textoAtaque3;
    private javax.swing.JLabel textoAtaque4;
    private javax.swing.JLabel textoAtaque5;
    private javax.swing.JLabel textoCusto1;
    private javax.swing.JLabel textoCusto2;
    private javax.swing.JLabel textoCusto3;
    private javax.swing.JLabel textoCusto4;
    private javax.swing.JLabel textoCusto5;
    private javax.swing.JLabel textoEficacia1;
    private javax.swing.JLabel textoEficacia2;
    private javax.swing.JLabel textoEficacia3;
    private javax.swing.JLabel textoEficacia4;
    private javax.swing.JLabel textoEficacia5;
    private javax.swing.JLabel textoEspeciais;
    // End of variables declaration//GEN-END:variables
}
