
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
        jd_Creacion_Cliente = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bt_Creacion_Cliente = new javax.swing.JButton();
        tf_Nombre_Cliente = new javax.swing.JTextField();
        tf_Contraseña_Cliente = new javax.swing.JTextField();
        tf_Identidad_Cliente = new javax.swing.JTextField();
        tf_Saldo_Cliente = new javax.swing.JTextField();
        tf_Cuenta_Cliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_Usuario_Cliente = new javax.swing.JTextField();
        jd_Creacion_Productos = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bt_Crear_Producto = new javax.swing.JButton();
        bt_Login = new javax.swing.JButton();
        jmb_Opciones = new javax.swing.JMenuBar();
        jm_Admins = new javax.swing.JMenu();
        jm_Cliente1 = new javax.swing.JMenu();
        jmi_Creacion_Clientes = new javax.swing.JMenuItem();
        jmi_Adminstracion_Clientes = new javax.swing.JMenuItem();
        jm_Productos = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
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

        jd_Creacion_Cliente.setTitle("Creacion de Clientes");

        jLabel3.setText("Nombre");

        jLabel4.setText("Cuenta");

        jLabel6.setText("Saldo Disponible");

        jLabel7.setText("Numero de Identidad");

        jLabel8.setText("Contraseña");

        bt_Creacion_Cliente.setText("Crear Cliente");
        bt_Creacion_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Creacion_ClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("Usuario");

        javax.swing.GroupLayout jd_Creacion_ClienteLayout = new javax.swing.GroupLayout(jd_Creacion_Cliente.getContentPane());
        jd_Creacion_Cliente.getContentPane().setLayout(jd_Creacion_ClienteLayout);
        jd_Creacion_ClienteLayout.setHorizontalGroup(
            jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Creacion_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Creacion_ClienteLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Identidad_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Creacion_ClienteLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Contraseña_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Creacion_ClienteLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(tf_Usuario_Cliente))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Creacion_ClienteLayout.createSequentialGroup()
                            .addGroup(jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(bt_Creacion_Cliente))
                            .addGap(18, 18, 18)
                            .addComponent(tf_Saldo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tf_Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Creacion_ClienteLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(tf_Cuenta_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jd_Creacion_ClienteLayout.setVerticalGroup(
            jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Creacion_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Cuenta_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_Contraseña_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_Identidad_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tf_Saldo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tf_Usuario_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_Creacion_Cliente)
                .addGap(63, 63, 63))
        );

        jLabel5.setText("Nombre");

        jLabel10.setText("Cantidad");

        jLabel11.setText("Precio");

        jLabel12.setText("Fecha de Caducidad");

        bt_Crear_Producto.setText("Crear Producto");
        bt_Crear_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Crear_ProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Creacion_ProductosLayout = new javax.swing.GroupLayout(jd_Creacion_Productos.getContentPane());
        jd_Creacion_Productos.getContentPane().setLayout(jd_Creacion_ProductosLayout);
        jd_Creacion_ProductosLayout.setHorizontalGroup(
            jd_Creacion_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Creacion_ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Creacion_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(bt_Crear_Producto))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jd_Creacion_ProductosLayout.setVerticalGroup(
            jd_Creacion_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Creacion_ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(bt_Crear_Producto)
                .addGap(33, 33, 33))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_Login.setText("Login");
        bt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoginActionPerformed(evt);
            }
        });

        jm_Admins.setText("Opciones de Administrador");
        jm_Admins.setEnabled(false);

        jm_Cliente1.setText("Clientes");

        jmi_Creacion_Clientes.setText("Creacion de Clientes");
        jmi_Creacion_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Creacion_ClientesActionPerformed(evt);
            }
        });
        jm_Cliente1.add(jmi_Creacion_Clientes);

        jmi_Adminstracion_Clientes.setText("Administrar Clientes");
        jm_Cliente1.add(jmi_Adminstracion_Clientes);

        jm_Admins.add(jm_Cliente1);

        jm_Productos.setText("Productos");

        jMenuItem5.setText("Creacion de Productos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jm_Productos.add(jMenuItem5);

        jMenuItem6.setText("Administracion de Clientes");
        jm_Productos.add(jMenuItem6);

        jm_Admins.add(jm_Productos);

        jmb_Opciones.add(jm_Admins);

        jm_Cliente.setText("Compra");
        jm_Cliente.setEnabled(false);
        jmb_Opciones.add(jm_Cliente);

        setJMenuBar(jmb_Opciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_Login)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(bt_Login)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Login1ActionPerformed
        // TODO add your handling code here:
        if (rb_Admin.isSelected()) {
            if (tf_Usuario.getText().equals("Die123") && tf_Contraseña.getText().equals("321ied")) {
                JOptionPane.showMessageDialog(jd_Login, "Bienvenido Administrador");
                jd_Login.dispose();
                jm_Admins.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(jd_Login, "Contraseña o usuario no correcto");
            }

        } else if (rootPaneCheckingEnabled) {

        }
    }//GEN-LAST:event_bt_Login1ActionPerformed

    private void bt_Creacion_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Creacion_ClienteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_Creacion_ClienteActionPerformed

    private void jmi_Creacion_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Creacion_ClientesActionPerformed
        // TODO add your handling code here:
        jd_Creacion_Cliente.setModal(true);
        jd_Creacion_Cliente.pack();
        jd_Creacion_Cliente.setLocationRelativeTo(this);
        jd_Creacion_Cliente.setVisible(true);
    }//GEN-LAST:event_jmi_Creacion_ClientesActionPerformed

    private void bt_Crear_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Crear_ProductoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_Crear_ProductoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        jd_Creacion_Productos.setModal(true);
        jd_Creacion_Productos.pack();
        jd_Creacion_Productos.setLocationRelativeTo(this);
        jd_Creacion_Productos.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
    private javax.swing.JButton bt_Creacion_Cliente;
    private javax.swing.JButton bt_Crear_Producto;
    private javax.swing.JButton bt_Login;
    private javax.swing.JButton bt_Login1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JDialog jd_Creacion_Cliente;
    private javax.swing.JDialog jd_Creacion_Productos;
    private javax.swing.JDialog jd_Login;
    private javax.swing.JMenu jm_Admins;
    private javax.swing.JMenu jm_Cliente;
    private javax.swing.JMenu jm_Cliente1;
    private javax.swing.JMenu jm_Productos;
    private javax.swing.JMenuBar jmb_Opciones;
    private javax.swing.JMenuItem jmi_Adminstracion_Clientes;
    private javax.swing.JMenuItem jmi_Creacion_Clientes;
    private javax.swing.JRadioButton rb_Admin;
    private javax.swing.JRadioButton rb_Cliente;
    private javax.swing.JTextField tf_Contraseña;
    private javax.swing.JTextField tf_Contraseña_Cliente;
    private javax.swing.JTextField tf_Cuenta_Cliente;
    private javax.swing.JTextField tf_Identidad_Cliente;
    private javax.swing.JTextField tf_Nombre_Cliente;
    private javax.swing.JTextField tf_Saldo_Cliente;
    private javax.swing.JTextField tf_Usuario;
    private javax.swing.JTextField tf_Usuario_Cliente;
    // End of variables declaration//GEN-END:variables
}
