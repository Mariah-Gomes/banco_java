<<<<<<< HEAD

package view;

import controller.ControllerExibirExtratoCliente;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ExibirExtratoCliente extends javax.swing.JFrame {

    
    public ExibirExtratoCliente() {
        initComponents();
        controlExtrato = new ControllerExibirExtratoCliente(this);
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author unifmgomes
 */
public class ExibirExtratoCliente extends javax.swing.JFrame {

    /**
     * Creates new form ExibirExtratoCliente
     */
    public ExibirExtratoCliente() {
        initComponents();
>>>>>>> main
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cpfClienteExibirSaldoTXT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
<<<<<<< HEAD
        jLabel4 = new javax.swing.JLabel();
=======
>>>>>>> main
        tituloExibirExtratoCliente1 = new javax.swing.JLabel();
        cpfClienteExibirExtrato = new javax.swing.JTextField();
        senhaClienteExibirExtrato = new javax.swing.JTextField();
        cpfClienteExibirExtratoTXT = new javax.swing.JLabel();
        senhaClienteExibirExtratoTXT = new javax.swing.JLabel();
        butClienteExibirExtrato = new javax.swing.JButton();
<<<<<<< HEAD
        jLabel3 = new javax.swing.JLabel();
=======
>>>>>>> main

        cpfClienteExibirSaldoTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cpfClienteExibirSaldoTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfClienteExibirSaldoTXT.setText("CPF:");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

<<<<<<< HEAD
        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 3, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Banco Mariago");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloExibirExtratoCliente1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
=======
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloExibirExtratoCliente1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
>>>>>>> main
        tituloExibirExtratoCliente1.setText("Exibir Extrato:");

        cpfClienteExibirExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteExibirExtratoActionPerformed(evt);
            }
        });

        senhaClienteExibirExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaClienteExibirExtratoActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        cpfClienteExibirExtratoTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cpfClienteExibirExtratoTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfClienteExibirExtratoTXT.setText("CPF:");

        senhaClienteExibirExtratoTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        senhaClienteExibirExtratoTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaClienteExibirExtratoTXT.setText("Senha:");

        butClienteExibirExtrato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        butClienteExibirExtrato.setText("Exibir Extrato");
        butClienteExibirExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClienteExibirExtratoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 3, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Banco Mariago");
=======
        cpfClienteExibirExtratoTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cpfClienteExibirExtratoTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfClienteExibirExtratoTXT.setText("CPF:");

        senhaClienteExibirExtratoTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        senhaClienteExibirExtratoTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaClienteExibirExtratoTXT.setText("Senha:");

        butClienteExibirExtrato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butClienteExibirExtrato.setText("Exibir Extrato");
>>>>>>> main

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(tituloExibirExtratoCliente1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cpfClienteExibirExtratoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senhaClienteExibirExtratoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpfClienteExibirExtrato)
                            .addComponent(butClienteExibirExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(senhaClienteExibirExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloExibirExtratoCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpfClienteExibirExtrato)
                    .addComponent(cpfClienteExibirExtratoTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(senhaClienteExibirExtratoTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(senhaClienteExibirExtrato)
                    .addComponent(butClienteExibirExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
>>>>>>> main
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addComponent(tituloExibirExtratoCliente1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfClienteExibirExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfClienteExibirExtratoTXT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaClienteExibirExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaClienteExibirExtratoTXT))
                .addGap(18, 18, 18)
                .addComponent(butClienteExibirExtrato)
                .addContainerGap(79, Short.MAX_VALUE))
=======
                .addComponent(tituloExibirExtratoCliente1)
                .addGap(18, 18, 18)
                .addComponent(cpfClienteExibirExtratoTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfClienteExibirExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaClienteExibirExtratoTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaClienteExibirExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(butClienteExibirExtrato)
                .addContainerGap(91, Short.MAX_VALUE))
>>>>>>> main
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfClienteExibirExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteExibirExtratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteExibirExtratoActionPerformed

    private void senhaClienteExibirExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaClienteExibirExtratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaClienteExibirExtratoActionPerformed

<<<<<<< HEAD
    private void butClienteExibirExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClienteExibirExtratoActionPerformed
        controlExtrato.entrarExibirExtrato();
    }//GEN-LAST:event_butClienteExibirExtratoActionPerformed

    public ControllerExibirExtratoCliente getControlExtrato() {
        return controlExtrato;
    }

    public void setControlExtrato(ControllerExibirExtratoCliente controlExtrato) {
        this.controlExtrato = controlExtrato;
    }

    public JButton getButClienteExibirExtrato() {
        return butClienteExibirExtrato;
    }

    public void setButClienteExibirExtrato(JButton butClienteExibirExtrato) {
        this.butClienteExibirExtrato = butClienteExibirExtrato;
    }

    public JTextField getCpfClienteExibirExtrato() {
        return cpfClienteExibirExtrato;
    }

    public void setCpfClienteExibirExtrato(JTextField cpfClienteExibirExtrato) {
        this.cpfClienteExibirExtrato = cpfClienteExibirExtrato;
    }

    public JLabel getCpfClienteExibirExtratoTXT() {
        return cpfClienteExibirExtratoTXT;
    }

    public void setCpfClienteExibirExtratoTXT(JLabel cpfClienteExibirExtratoTXT) {
        this.cpfClienteExibirExtratoTXT = cpfClienteExibirExtratoTXT;
    }

    public JLabel getCpfClienteExibirSaldoTXT() {
        return cpfClienteExibirSaldoTXT;
    }

    public void setCpfClienteExibirSaldoTXT(JLabel cpfClienteExibirSaldoTXT) {
        this.cpfClienteExibirSaldoTXT = cpfClienteExibirSaldoTXT;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JTextField getSenhaClienteExibirExtrato() {
        return senhaClienteExibirExtrato;
    }

    public void setSenhaClienteExibirExtrato(JTextField senhaClienteExibirExtrato) {
        this.senhaClienteExibirExtrato = senhaClienteExibirExtrato;
    }

    public JLabel getSenhaClienteExibirExtratoTXT() {
        return senhaClienteExibirExtratoTXT;
    }

    public void setSenhaClienteExibirExtratoTXT(JLabel senhaClienteExibirExtratoTXT) {
        this.senhaClienteExibirExtratoTXT = senhaClienteExibirExtratoTXT;
    }

    public JLabel getTituloExibirExtratoCliente1() {
        return tituloExibirExtratoCliente1;
    }

=======
>>>>>>> main
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ExibirExtratoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ExibirExtratoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ExibirExtratoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ExibirExtratoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ExibirExtratoCliente().setVisible(true);
//            }
//        });
//    }
<<<<<<< HEAD
    public void setTituloExibirExtratoCliente1(JLabel tituloExibirExtratoCliente1) {
        this.tituloExibirExtratoCliente1 = tituloExibirExtratoCliente1;
    }
    private ControllerExibirExtratoCliente controlExtrato;
    
=======

>>>>>>> main
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butClienteExibirExtrato;
    private javax.swing.JTextField cpfClienteExibirExtrato;
    private javax.swing.JLabel cpfClienteExibirExtratoTXT;
    private javax.swing.JLabel cpfClienteExibirSaldoTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
=======
>>>>>>> main
    private javax.swing.JTextField senhaClienteExibirExtrato;
    private javax.swing.JLabel senhaClienteExibirExtratoTXT;
    private javax.swing.JLabel tituloExibirExtratoCliente1;
    // End of variables declaration//GEN-END:variables
}
