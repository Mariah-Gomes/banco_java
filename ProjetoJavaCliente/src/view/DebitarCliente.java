
package view;

import controller.ControllerDebitoCliente;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DebitarCliente extends javax.swing.JFrame {

    public DebitarCliente() {
        initComponents();
        controllerDebito = new ControllerDebitoCliente(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloDebitarCliente1 = new javax.swing.JLabel();
        cpfClienteDebitarEntrada = new javax.swing.JTextField();
        cpfClienteDebitarTXT = new javax.swing.JLabel();
        cpfSenhaDebitarTXT = new javax.swing.JLabel();
        senhaClienteDebitarEntrada = new javax.swing.JTextField();
        butClienteDebitarEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloDebitarCliente1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloDebitarCliente1.setText("Debitar:");

        cpfClienteDebitarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteDebitarEntradaActionPerformed(evt);
            }
        });

        cpfClienteDebitarTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cpfClienteDebitarTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfClienteDebitarTXT.setText("CPF:");

        cpfSenhaDebitarTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cpfSenhaDebitarTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfSenhaDebitarTXT.setText("Senha:");

        butClienteDebitarEntrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butClienteDebitarEntrar.setText("Entrar");
        butClienteDebitarEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClienteDebitarEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(tituloDebitarCliente1)
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(senhaClienteDebitarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(cpfClienteDebitarTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(cpfClienteDebitarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(cpfSenhaDebitarTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(butClienteDebitarEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloDebitarCliente1)
                .addGap(29, 29, 29)
                .addComponent(cpfClienteDebitarTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfClienteDebitarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cpfSenhaDebitarTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaClienteDebitarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(butClienteDebitarEntrar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfClienteDebitarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteDebitarEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteDebitarEntradaActionPerformed

    private void butClienteDebitarEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClienteDebitarEntrarActionPerformed
//        DebitarClienteConta debitarclienteconta = new DebitarClienteConta();
//        debitarclienteconta.setVisible(true);
        controllerDebito.entrarClienteDebito();
    }//GEN-LAST:event_butClienteDebitarEntrarActionPerformed

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
//            java.util.logging.Logger.getLogger(DebitarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DebitarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DebitarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DebitarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DebitarCliente().setVisible(true);
//            }
//        });
//    }

    public JButton getButClienteDebitarEntrar() {
        return butClienteDebitarEntrar;
    }

    public void setButClienteDebitarEntrar(JButton butClienteDebitarEntrar) {
        this.butClienteDebitarEntrar = butClienteDebitarEntrar;
    }

    public JTextField getCpfClienteDebitarEntrada() {
        return cpfClienteDebitarEntrada;
    }

    public void setCpfClienteDebitarEntrada(JTextField cpfClienteDebitarEntrada) {
        this.cpfClienteDebitarEntrada = cpfClienteDebitarEntrada;
    }

    public JLabel getCpfClienteDebitarTXT() {
        return cpfClienteDebitarTXT;
    }

    public void setCpfClienteDebitarTXT(JLabel cpfClienteDebitarTXT) {
        this.cpfClienteDebitarTXT = cpfClienteDebitarTXT;
    }

    public JLabel getCpfSenhaDebitarTXT() {
        return cpfSenhaDebitarTXT;
    }

    public void setCpfSenhaDebitarTXT(JLabel cpfSenhaDebitarTXT) {
        this.cpfSenhaDebitarTXT = cpfSenhaDebitarTXT;
    }

    public JTextField getSenhaClienteDebitarEntrada() {
        return senhaClienteDebitarEntrada;
    }

    public void setSenhaClienteDebitarEntrada(JTextField senhaClienteDebitarEntrada) {
        this.senhaClienteDebitarEntrada = senhaClienteDebitarEntrada;
    }

    public JLabel getTituloDebitarCliente1() {
        return tituloDebitarCliente1;
    }

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
//            java.util.logging.Logger.getLogger(DebitarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DebitarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DebitarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DebitarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DebitarCliente().setVisible(true);
//            }
//        });
//    }
    public void setTituloDebitarCliente1(JLabel tituloDebitarCliente1) {
        this.tituloDebitarCliente1 = tituloDebitarCliente1;
    }
    
    private ControllerDebitoCliente controllerDebito;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butClienteDebitarEntrar;
    private javax.swing.JTextField cpfClienteDebitarEntrada;
    private javax.swing.JLabel cpfClienteDebitarTXT;
    private javax.swing.JLabel cpfSenhaDebitarTXT;
    private javax.swing.JTextField senhaClienteDebitarEntrada;
    private javax.swing.JLabel tituloDebitarCliente1;
    // End of variables declaration//GEN-END:variables
}
