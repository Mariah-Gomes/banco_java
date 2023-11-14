/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerExibindoSaldoCliente;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.Cliente;

/**
 *
 * @author iago2
 */
public class ExibirSaldoExibindo extends javax.swing.JFrame {

    /**
     * Creates new form ExibirSaldoExibindo
     */
    public ExibirSaldoExibindo(Cliente cliente) {
        initComponents();
        controller = new ControllerExibindoSaldoCliente(this, cliente.getCpf());
    }

    public JButton getBtExibirSaldo() {
        return btExibirSaldo;
    }

    public void setBtExibirSaldo(JButton btExibirSaldo) {
        this.btExibirSaldo = btExibirSaldo;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getTxtSaidaExibirSaldo() {
        return txtSaidaExibirSaldo;
    }

    public void setTxtSaidaExibirSaldo(JTextArea txtSaidaExibirSaldo) {
        this.txtSaidaExibirSaldo = txtSaidaExibirSaldo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btExibirSaldo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSaidaExibirSaldo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btExibirSaldo.setText("Exibir");
        btExibirSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirSaldoActionPerformed(evt);
            }
        });

        txtSaidaExibirSaldo.setColumns(20);
        txtSaidaExibirSaldo.setRows(5);
        jScrollPane1.setViewportView(txtSaidaExibirSaldo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btExibirSaldo)
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExibirSaldo)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExibirSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExibirSaldoActionPerformed
        // TODO add your handling code here:
        controller.exibirSaldo();
    }//GEN-LAST:event_btExibirSaldoActionPerformed

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
//            java.util.logging.Logger.getLogger(ExibirSaldoExibindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ExibirSaldoExibindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ExibirSaldoExibindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ExibirSaldoExibindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ExibirSaldoExibindo().setVisible(true);
//            }
//        });
//    }

    private ControllerExibindoSaldoCliente controller;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExibirSaldo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtSaidaExibirSaldo;
    // End of variables declaration//GEN-END:variables
}