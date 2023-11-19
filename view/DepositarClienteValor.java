
package view;

import controller.ControllerDebitoClienteValor;
import controller.ControllerDepositarClienteValor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.Cliente;


public class DepositarClienteValor extends javax.swing.JFrame {

    
    public DepositarClienteValor(Cliente cliente) {
        initComponents();
        controllerDepositarValor = new ControllerDepositarClienteValor(this, cliente.getCpf());
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
        valorClienteDepositoTXT = new javax.swing.JLabel();
        valorClienteDepositarEntrada = new javax.swing.JTextField();
        butClienteDepositar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloDepositarCliente.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloDepositarCliente.setText("Depositar:");

        valorClienteDepositoTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valorClienteDepositoTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valorClienteDepositoTXT.setText("Valor:");

        valorClienteDepositarEntrada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valorClienteDepositarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorClienteDepositarEntradaActionPerformed(evt);
            }
        });

        butClienteDepositar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        butClienteDepositar.setText("Depositar");
        butClienteDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClienteDepositarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloDepositarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorClienteDepositoTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorClienteDepositarEntrada)
                    .addComponent(butClienteDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloDepositarCliente)
                .addGap(18, 18, 18)
                .addComponent(valorClienteDepositoTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorClienteDepositarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(butClienteDepositar)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorClienteDepositarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorClienteDepositarEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorClienteDepositarEntradaActionPerformed

    private void butClienteDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClienteDepositarActionPerformed
        controllerDepositarValor.depositar();
    }//GEN-LAST:event_butClienteDepositarActionPerformed

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
//            java.util.logging.Logger.getLogger(DepositarClienteValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DepositarClienteValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DepositarClienteValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DepositarClienteValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DepositarClienteValor().setVisible(true);
//            }
//        });
//    }

    public JButton getButClienteDepositar() {
        return butClienteDepositar;
    }

    public void setButClienteDepositar(JButton butClienteDepositar) {
        this.butClienteDepositar = butClienteDepositar;
    }

    public JLabel getTituloDepositarCliente() {
        return tituloDepositarCliente;
    }

    public void setTituloDepositarCliente(JLabel tituloDepositarCliente) {
        this.tituloDepositarCliente = tituloDepositarCliente;
    }

    public JTextField getValorClienteDepositarEntrada() {
        return valorClienteDepositarEntrada;
    }

    public void setValorClienteDepositarEntrada(JTextField valorClienteDepositarEntrada) {
        this.valorClienteDepositarEntrada = valorClienteDepositarEntrada;
    }

    public JLabel getValorClienteDepositoTXT() {
        return valorClienteDepositoTXT;
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
//            java.util.logging.Logger.getLogger(DepositarClienteValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DepositarClienteValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DepositarClienteValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DepositarClienteValor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DepositarClienteValor().setVisible(true);
//            }
//        });
//    }
    public void setValorClienteDepositoTXT(JLabel valorClienteDepositoTXT) {
        this.valorClienteDepositoTXT = valorClienteDepositoTXT;
    }
    private ControllerDepositarClienteValor controllerDepositarValor;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butClienteDepositar;
    private javax.swing.JLabel tituloDepositarCliente;
    private javax.swing.JTextField valorClienteDepositarEntrada;
    private javax.swing.JLabel valorClienteDepositoTXT;
    // End of variables declaration//GEN-END:variables
}