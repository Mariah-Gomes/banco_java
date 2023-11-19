
package view;

import view.DebitarCliente;
import controller.ControllerDebitoCliente;
import controller.ControllerInicioCliente;
import javax.swing.JButton;
import javax.swing.JLabel;
import model.Cliente;


public class InicioCliente extends javax.swing.JFrame {

    /**
     * Creates new form InicioCliente
     */
    public InicioCliente (Cliente cliente) {
        initComponents();
        controlInicioCliente = new ControllerInicioCliente(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMenuCliente = new javax.swing.JLabel();
        depositarCliente = new javax.swing.JButton();
        debitarCliente1 = new javax.swing.JButton();
        exiberSaldoCliente = new javax.swing.JButton();
        debitarCliente3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloMenuCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        tituloMenuCliente.setText("Menu Principal:");

        depositarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        depositarCliente.setText("Depositar");
        depositarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositarClienteActionPerformed(evt);
            }
        });

        debitarCliente1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        debitarCliente1.setText("Debitar");
        debitarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitarCliente1ActionPerformed(evt);
            }
        });

        exiberSaldoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exiberSaldoCliente.setText("Exibir Saldo");
        exiberSaldoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exiberSaldoClienteActionPerformed(evt);
            }
        });

        debitarCliente3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        debitarCliente3.setText("Exibir Extrato");
        debitarCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitarCliente3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Banco Mariago");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(293, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(depositarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(debitarCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(debitarCliente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(exiberSaldoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(tituloMenuCliente)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(tituloMenuCliente)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exiberSaldoCliente)
                    .addComponent(debitarCliente1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositarCliente)
                    .addComponent(debitarCliente3))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarClienteActionPerformed
        controlInicioCliente.depositarCliente();
    }//GEN-LAST:event_depositarClienteActionPerformed

    private void debitarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitarCliente1ActionPerformed
        controlInicioCliente.debitarCliente();
    }//GEN-LAST:event_debitarCliente1ActionPerformed

    private void exiberSaldoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exiberSaldoClienteActionPerformed
        controlInicioCliente.exibirSaldoCliente();
    }//GEN-LAST:event_exiberSaldoClienteActionPerformed

    private void debitarCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitarCliente3ActionPerformed
        controlInicioCliente.exibirExtratoCliente();
    }//GEN-LAST:event_debitarCliente3ActionPerformed

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
//            java.util.logging.Logger.getLogger(InicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InicioCliente().setVisible(true);
//            }
//        });
//    }

    public JButton getDebitarCliente1() {
        return debitarCliente1;
    }

    public void setDebitarCliente1(JButton debitarCliente1) {
        this.debitarCliente1 = debitarCliente1;
    }

    public JButton getDebitarCliente3() {
        return debitarCliente3;
    }

    public void setDebitarCliente3(JButton debitarCliente3) {
        this.debitarCliente3 = debitarCliente3;
    }

    public JButton getDepositarCliente() {
        return depositarCliente;
    }

    public void setDepositarCliente(JButton depositarCliente) {
        this.depositarCliente = depositarCliente;
    }

    public JButton getExiberSaldoCliente() {
        return exiberSaldoCliente;
    }

    public void setExiberSaldoCliente(JButton exiberSaldoCliente) {
        this.exiberSaldoCliente = exiberSaldoCliente;
    }

    public JLabel getTituloMenuCliente() {
        return tituloMenuCliente;
    }

 
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
//            java.util.logging.Logger.getLogger(InicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InicioCliente().setVisible(true);
//            }
//        });
//    }
    public void setTituloMenuCliente(JLabel tituloMenuCliente) {
        this.tituloMenuCliente = tituloMenuCliente;
    }
    private ControllerInicioCliente controlInicioCliente;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton debitarCliente1;
    private javax.swing.JButton debitarCliente3;
    private javax.swing.JButton depositarCliente;
    private javax.swing.JButton exiberSaldoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tituloMenuCliente;
    // End of variables declaration//GEN-END:variables
}
