/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author unifmgomes
 */
public class DebitarClienteConta extends javax.swing.JFrame {

    /**
     * Creates new form debitarClienteConta
     */
    public DebitarClienteConta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloDebitarCliente2 = new javax.swing.JLabel();
        butContaPoupanca = new javax.swing.JButton();
        butContaPoupanca1 = new javax.swing.JButton();
        butContaPoupanca2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloDebitarCliente2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloDebitarCliente2.setText("Debitar:");

        butContaPoupanca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butContaPoupanca.setText("Conta Poupança");

        butContaPoupanca1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butContaPoupanca1.setText("Conta Corrente");
        butContaPoupanca1.setToolTipText("");
        butContaPoupanca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butContaPoupanca1ActionPerformed(evt);
            }
        });

        butContaPoupanca2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butContaPoupanca2.setText("Conta Salário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(tituloDebitarCliente2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butContaPoupanca)
                            .addComponent(butContaPoupanca2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butContaPoupanca1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloDebitarCliente2)
                .addGap(18, 18, 18)
                .addComponent(butContaPoupanca)
                .addGap(18, 18, 18)
                .addComponent(butContaPoupanca1)
                .addGap(18, 18, 18)
                .addComponent(butContaPoupanca2)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butContaPoupanca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butContaPoupanca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butContaPoupanca1ActionPerformed

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
//            java.util.logging.Logger.getLogger(debitarClienteConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(debitarClienteConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(debitarClienteConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(debitarClienteConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new debitarClienteConta().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butContaPoupanca;
    private javax.swing.JButton butContaPoupanca1;
    private javax.swing.JButton butContaPoupanca2;
    private javax.swing.JLabel tituloDebitarCliente2;
    // End of variables declaration//GEN-END:variables
}
