
package view;

import controller.ControllerExibirExtratoResultado;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.Cliente;


public class ExibirExtratoClienteResultado extends javax.swing.JFrame {


    public ExibirExtratoClienteResultado(Cliente cliente) {
        initComponents();
        controllerResultadoExibirExtrato = new ControllerExibirExtratoResultado(this, cliente.getCpf());
    }

    public JButton getBtExibirContas() {
        return btExibirContas;
    }

    public void setBtExibirContas(JButton btExibirContas) {
        this.btExibirContas = btExibirContas;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getTxtSaidaExibirContas() {
        return txtSaidaExibirContas;
    }

    public void setTxtSaidaExibirContas(JTextArea txtSaidaExibirContas) {
        this.txtSaidaExibirContas = txtSaidaExibirContas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtSaidaExibirContas = new javax.swing.JTextArea();
        btExibirContas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtSaidaExibirContas.setColumns(20);
        txtSaidaExibirContas.setRows(5);
        jScrollPane1.setViewportView(txtSaidaExibirContas);

        btExibirContas.setText("Exibir");
        btExibirContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirContasActionPerformed(evt);
            }
        });

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
                        .addComponent(btExibirContas)
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExibirContas)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExibirContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExibirContasActionPerformed
        // TODO add your handling code here:
        controllerResultadoExibirExtrato.exibirExtrato();
    }//GEN-LAST:event_btExibirContasActionPerformed

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
//            java.util.logging.Logger.getLogger(ExibirContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ExibirContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ExibirContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ExibirContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ExibirContas().setVisible(true);
//            }
//        });
//    }
    
    private ControllerExibirExtratoResultado controllerResultadoExibirExtrato;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExibirContas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtSaidaExibirContas;
    // End of variables declaration//GEN-END:variables
}
