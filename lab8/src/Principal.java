
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Login = new javax.swing.JDialog();
        bt_Login1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rb_Admin = new javax.swing.JRadioButton();
        rb_Cliente = new javax.swing.JRadioButton();
        tf_Usuario = new javax.swing.JTextField();
        tf_Contraseña = new javax.swing.JTextField();
        bg_Admin = new javax.swing.ButtonGroup();
        bt_Login = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_Admins = new javax.swing.JMenu();
        jm_Cliente1 = new javax.swing.JMenu();
        jm_Productos = new javax.swing.JMenu();
        jm_Cliente = new javax.swing.JMenu();

        jd_Login.setTitle("Login");

        bt_Login1.setText("Login");
        bt_Login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Login1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        bg_Admin.add(rb_Admin);
        rb_Admin.setSelected(true);
        rb_Admin.setText("Administrador");

        bg_Admin.add(rb_Cliente);
        rb_Cliente.setText("Cliente");

        javax.swing.GroupLayout jd_LoginLayout = new javax.swing.GroupLayout(jd_Login.getContentPane());
        jd_Login.getContentPane().setLayout(jd_LoginLayout);
        jd_LoginLayout.setHorizontalGroup(
            jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_LoginLayout.createSequentialGroup()
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_Login1)
                            .addGroup(jd_LoginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_Contraseña))
                            .addGroup(jd_LoginLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_LoginLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(rb_Admin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Cliente)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jd_LoginLayout.setVerticalGroup(
            jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_LoginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Admin)
                    .addComponent(rb_Cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(bt_Login1)
                .addGap(24, 24, 24))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_Login.setText("Login ");
        bt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoginActionPerformed(evt);
            }
        });

        jm_Admins.setText("Opciones de Administrador");

        jm_Cliente1.setText("Clientes");
        jm_Admins.add(jm_Cliente1);

        jm_Productos.setText("Productos");
        jm_Admins.add(jm_Productos);

        jMenuBar1.add(jm_Admins);

        jm_Cliente.setText("Compra");
        jMenuBar1.add(jm_Cliente);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_Login)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(bt_Login)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Login1ActionPerformed
        // TODO add your handling code here:
        if (rb_Admin.isSelected()) {
            if (tf_Usuario.getText().equals("Die123") && tf_Contraseña.getText().equals("321ied")) {
                JOptionPane.showMessageDialog(jd_Login, "Bienvenido Administrador");
                jd_Login.dispose();
            } else {
                JOptionPane.showMessageDialog(jd_Login, "Contraseña o usuario no correcto");
            }

        } else if (rootPaneCheckingEnabled) {

        }
    }//GEN-LAST:event_bt_Login1ActionPerformed

    private void bt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LoginActionPerformed
        // TODO add your handling code here:
        jd_Login.setModal(true);
        jd_Login.pack();
        jd_Login.setLocationRelativeTo(this);
        jd_Login.setVisible(true);
    }//GEN-LAST:event_bt_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_Admin;
    private javax.swing.JButton bt_Login;
    private javax.swing.JButton bt_Login1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDialog jd_Login;
    private javax.swing.JMenu jm_Admins;
    private javax.swing.JMenu jm_Cliente;
    private javax.swing.JMenu jm_Cliente1;
    private javax.swing.JMenu jm_Productos;
    private javax.swing.JRadioButton rb_Admin;
    private javax.swing.JRadioButton rb_Cliente;
    private javax.swing.JTextField tf_Contraseña;
    private javax.swing.JTextField tf_Usuario;
    // End of variables declaration//GEN-END:variables
}
