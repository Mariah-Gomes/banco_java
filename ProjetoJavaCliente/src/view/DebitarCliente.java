<<<<<<< HEAD

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
public class DebitarCliente extends javax.swing.JFrame {

    /**
     * Creates new form DebitarCliente
     */
    public DebitarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
>>>>>>> main
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloDebitarCliente1 = new javax.swing.JLabel();
        cpfClienteDebitarEntrada = new javax.swing.JTextField();
        cpfClienteDebitarTXT = new javax.swing.JLabel();
        cpfSenhaDebitarTXT = new javax.swing.JLabel();
        senhaClienteDebitarEntrada = new javax.swing.JTextField();
        butClienteDebitarEntrar = new javax.swing.JButton();
<<<<<<< HEAD
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloDebitarCliente1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        tituloDebitarCliente1.setText("Debitar:");

        cpfClienteDebitarEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
=======

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloDebitarCliente1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloDebitarCliente1.setText("Debitar:");

>>>>>>> main
        cpfClienteDebitarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteDebitarEntradaActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        cpfClienteDebitarTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cpfClienteDebitarTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfClienteDebitarTXT.setText("CPF:");

        cpfSenhaDebitarTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cpfSenhaDebitarTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfSenhaDebitarTXT.setText("Senha:");

        senhaClienteDebitarEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        butClienteDebitarEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        butClienteDebitarEntrar.setText("Entrar");
        butClienteDebitarEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClienteDebitarEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Banco Mariago");
=======
        cpfClienteDebitarTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cpfClienteDebitarTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfClienteDebitarTXT.setText("CPF:");

        cpfSenhaDebitarTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cpfSenhaDebitarTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfSenhaDebitarTXT.setText("Senha:");

        butClienteDebitarEntrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butClienteDebitarEntrar.setText("Entrar");
>>>>>>> main

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(tituloDebitarCliente1)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cpfClienteDebitarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cpfClienteDebitarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cpfSenhaDebitarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(butClienteDebitarEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(senhaClienteDebitarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
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
>>>>>>> main
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(tituloDebitarCliente1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfClienteDebitarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfClienteDebitarTXT))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaClienteDebitarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfSenhaDebitarTXT))
                .addGap(18, 18, 18)
                .addComponent(butClienteDebitarEntrar)
                .addContainerGap(78, Short.MAX_VALUE))
=======
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
>>>>>>> main
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfClienteDebitarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteDebitarEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteDebitarEntradaActionPerformed

<<<<<<< HEAD
    private void butClienteDebitarEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClienteDebitarEntrarActionPerformed
//        DebitarClienteConta debitarclienteconta = new DebitarClienteConta();
//        debitarclienteconta.setVisible(true);
        controllerDebito.entrarClienteDebito();
    }//GEN-LAST:event_butClienteDebitarEntrarActionPerformed

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

<<<<<<< HEAD
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
=======
>>>>>>> main
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butClienteDebitarEntrar;
    private javax.swing.JTextField cpfClienteDebitarEntrada;
    private javax.swing.JLabel cpfClienteDebitarTXT;
    private javax.swing.JLabel cpfSenhaDebitarTXT;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel1;
=======
>>>>>>> main
    private javax.swing.JTextField senhaClienteDebitarEntrada;
    private javax.swing.JLabel tituloDebitarCliente1;
    // End of variables declaration//GEN-END:variables
}
