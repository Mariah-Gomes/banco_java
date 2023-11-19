/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerDebitoCliente;
import controller.ControllerDepositarCliente;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author unifmgomes
 */
public class DepositarCliente extends javax.swing.JFrame {

    /**
     * Creates new form DepositoCliente
     */
    public DepositarCliente() {
        initComponents();
        controllerDeposito = new ControllerDepositarCliente(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloDepositarCliente = new javax.swing.JLabel();
        cpfClienteDepositarTXT = new javax.swing.JLabel();
        senhaClienteDepositarTXT = new javax.swing.JLabel();
        cpfClienteDepositarEntrada = new javax.swing.JTextField();
        senhaClienteDepositarEntrada1 = new javax.swing.JTextField();
        butClienteDepositarEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloDepositarCliente.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloDepositarCliente.setText("Depositar:");

        cpfClienteDepositarTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cpfClienteDepositarTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfClienteDepositarTXT.setText("CPF:");

        senhaClienteDepositarTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        senhaClienteDepositarTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaClienteDepositarTXT.setText("Senha:");

        cpfClienteDepositarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteDepositarEntradaActionPerformed(evt);
            }
        });

        senhaClienteDepositarEntrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaClienteDepositarEntrada1ActionPerformed(evt);
            }
        });

        butClienteDepositarEntrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butClienteDepositarEntrar.setText("Entrar");
        butClienteDepositarEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClienteDepositarEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cpfClienteDepositarTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloDepositarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpfClienteDepositarEntrada)
                    .addComponent(senhaClienteDepositarTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(senhaClienteDepositarEntrada1)
                    .addComponent(butClienteDepositarEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloDepositarCliente)
                .addGap(43, 43, 43)
                .addComponent(cpfClienteDepositarTXT)
                .addGap(4, 4, 4)
                .addComponent(cpfClienteDepositarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaClienteDepositarTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaClienteDepositarEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(butClienteDepositarEntrar)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfClienteDepositarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteDepositarEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteDepositarEntradaActionPerformed

    private void senhaClienteDepositarEntrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaClienteDepositarEntrada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaClienteDepositarEntrada1ActionPerformed

    private void butClienteDepositarEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClienteDepositarEntrarActionPerformed
        controllerDeposito.entrarClienteDeposito();
    }//GEN-LAST:event_butClienteDepositarEntrarActionPerformed

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
//            java.util.logging.Logger.getLogger(DepositoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DepositoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DepositoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DepositoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DepositoCliente().setVisible(true);
//            }
//        });
//    }
    private ControllerDepositarCliente controllerDeposito;

    public ControllerDepositarCliente getControllerDeposito() {
        return controllerDeposito;
    }

    public void setControllerDeposito(ControllerDepositarCliente controllerDeposito) {
        this.controllerDeposito = controllerDeposito;
    }

    public JButton getButClienteDepositarEntrar() {
        return butClienteDepositarEntrar;
    }

    public void setButClienteDepositarEntrar(JButton butClienteDepositarEntrar) {
        this.butClienteDepositarEntrar = butClienteDepositarEntrar;
    }

    public JTextField getCpfClienteDepositarEntrada() {
        return cpfClienteDepositarEntrada;
    }

    public void setCpfClienteDepositarEntrada(JTextField cpfClienteDepositarEntrada) {
        this.cpfClienteDepositarEntrada = cpfClienteDepositarEntrada;
    }

    public JLabel getCpfClienteDepositarTXT() {
        return cpfClienteDepositarTXT;
    }

    public void setCpfClienteDepositarTXT(JLabel cpfClienteDepositarTXT) {
        this.cpfClienteDepositarTXT = cpfClienteDepositarTXT;
    }

    public JTextField getSenhaClienteDepositarEntrada1() {
        return senhaClienteDepositarEntrada1;
    }

    public void setSenhaClienteDepositarEntrada1(JTextField senhaClienteDepositarEntrada1) {
        this.senhaClienteDepositarEntrada1 = senhaClienteDepositarEntrada1;
    }

    public JLabel getSenhaClienteDepositarTXT() {
        return senhaClienteDepositarTXT;
    }

    public void setSenhaClienteDepositarTXT(JLabel senhaClienteDepositarTXT) {
        this.senhaClienteDepositarTXT = senhaClienteDepositarTXT;
    }

    public JLabel getTituloDepositarCliente() {
        return tituloDepositarCliente;
    }

    public void setTituloDepositarCliente(JLabel tituloDepositarCliente) {
        this.tituloDepositarCliente = tituloDepositarCliente;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butClienteDepositarEntrar;
    private javax.swing.JTextField cpfClienteDepositarEntrada;
    private javax.swing.JLabel cpfClienteDepositarTXT;
    private javax.swing.JTextField senhaClienteDepositarEntrada1;
    private javax.swing.JLabel senhaClienteDepositarTXT;
    private javax.swing.JLabel tituloDepositarCliente;
    // End of variables declaration//GEN-END:variables
}