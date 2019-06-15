
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        tf_Nombre_Producto = new javax.swing.JTextField();
        tf_Cantidad_Producto = new javax.swing.JTextField();
        tf_Precio_Producto = new javax.swing.JTextField();
        jdc_Caducidad = new com.toedter.calendar.JDateChooser();
        jd_Admins_Productos = new javax.swing.JDialog();
        cb_Productos = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Productos = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_Nombre_Pro = new javax.swing.JTextField();
        jd_Admins_Clientes = new javax.swing.JDialog();
        cb_Clientes = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Clientes = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_Nombre_Cliente1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        pp_Productos = new javax.swing.JPopupMenu();
        jmi_Eliminar_Producto = new javax.swing.JMenuItem();
        jmi_Modificar_Producto = new javax.swing.JMenuItem();
        pp_Clientes = new javax.swing.JPopupMenu();
        jmi_Eliminar_Clientes = new javax.swing.JMenuItem();
        jmi_Modificar_Clientes = new javax.swing.JMenuItem();
        jd_Compra = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        cb_Productos1 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        tf_Nombre_Pro1 = new javax.swing.JTextField();
        bt_Comprar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_Productos1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_Compras = new javax.swing.JList<>();
        jLabel21 = new javax.swing.JLabel();
        bt_Login = new javax.swing.JButton();
        bt_Logout = new javax.swing.JButton();
        jmb_Opciones = new javax.swing.JMenuBar();
        jm_Admins = new javax.swing.JMenu();
        jm_Cliente1 = new javax.swing.JMenu();
        jmi_Creacion_Clientes = new javax.swing.JMenuItem();
        jmi_Adminstracion_Clientes = new javax.swing.JMenuItem();
        jm_Productos = new javax.swing.JMenu();
        jmi_Creacion_Productos = new javax.swing.JMenuItem();
        jmi_Admins_Productos = new javax.swing.JMenuItem();
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
                                .addComponent(jLabel6))
                            .addGap(31, 31, 31)
                            .addComponent(tf_Saldo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_Creacion_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tf_Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Creacion_ClienteLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(tf_Cuenta_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bt_Creacion_Cliente))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(bt_Creacion_Cliente)
                .addGap(35, 35, 35))
        );

        jd_Creacion_Productos.setTitle("Creacion de Productos");

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
                    .addGroup(jd_Creacion_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jd_Creacion_ProductosLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_Nombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_Creacion_ProductosLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_Cantidad_Producto))
                        .addGroup(jd_Creacion_ProductosLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(tf_Precio_Producto))
                        .addComponent(bt_Crear_Producto))
                    .addGroup(jd_Creacion_ProductosLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdc_Caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jd_Creacion_ProductosLayout.setVerticalGroup(
            jd_Creacion_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Creacion_ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Creacion_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Nombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jd_Creacion_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_Cantidad_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Creacion_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_Precio_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Creacion_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jdc_Caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(bt_Crear_Producto)
                .addGap(33, 33, 33))
        );

        cb_Productos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_ProductosItemStateChanged(evt);
            }
        });

        jt_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Precio", "Fecha de Caducidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_ProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Productos);

        jLabel13.setText("Haga click izquierdo sobre la tabla para el resto de las funciones");

        jLabel14.setText("Produtcos");

        jLabel15.setText("Nombre");

        javax.swing.GroupLayout jd_Admins_ProductosLayout = new javax.swing.GroupLayout(jd_Admins_Productos.getContentPane());
        jd_Admins_Productos.getContentPane().setLayout(jd_Admins_ProductosLayout);
        jd_Admins_ProductosLayout.setHorizontalGroup(
            jd_Admins_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Admins_ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Admins_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addGroup(jd_Admins_ProductosLayout.createSequentialGroup()
                        .addGroup(jd_Admins_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jd_Admins_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_Productos, 0, 135, Short.MAX_VALUE)
                            .addComponent(tf_Nombre_Pro))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jd_Admins_ProductosLayout.setVerticalGroup(
            jd_Admins_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_Admins_ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jd_Admins_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Admins_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_Nombre_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jd_Admins_Clientes.setTitle("Administracion de Clientes");

        cb_Clientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_ClientesItemStateChanged(evt);
            }
        });

        jt_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cuenta", "Contraseña", "Identidad", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_ClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_Clientes);

        jLabel16.setText("Clientes");

        jLabel17.setText("Nombre");

        jLabel18.setText("Haga click izquierdo sobre la tabla para el resto de las funciones");

        javax.swing.GroupLayout jd_Admins_ClientesLayout = new javax.swing.GroupLayout(jd_Admins_Clientes.getContentPane());
        jd_Admins_Clientes.getContentPane().setLayout(jd_Admins_ClientesLayout);
        jd_Admins_ClientesLayout.setHorizontalGroup(
            jd_Admins_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Admins_ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Admins_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jd_Admins_ClientesLayout.createSequentialGroup()
                        .addGroup(jd_Admins_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Admins_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Admins_ClientesLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_Nombre_Cliente1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Admins_ClientesLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(cb_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel18))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_Admins_ClientesLayout.setVerticalGroup(
            jd_Admins_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Admins_ClientesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_Admins_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jd_Admins_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_Nombre_Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jmi_Eliminar_Producto.setText("Eliminar");
        jmi_Eliminar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Eliminar_ProductoActionPerformed(evt);
            }
        });
        pp_Productos.add(jmi_Eliminar_Producto);

        jmi_Modificar_Producto.setText("Modificar");
        jmi_Modificar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Modificar_ProductoActionPerformed(evt);
            }
        });
        pp_Productos.add(jmi_Modificar_Producto);

        jmi_Eliminar_Clientes.setText("Eliminar");
        jmi_Eliminar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Eliminar_ClientesActionPerformed(evt);
            }
        });
        pp_Clientes.add(jmi_Eliminar_Clientes);

        jmi_Modificar_Clientes.setText("Modificar");
        jmi_Modificar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Modificar_ClientesActionPerformed(evt);
            }
        });
        pp_Clientes.add(jmi_Modificar_Clientes);

        jd_Compra.setTitle("Compra para los clientes");

        jLabel19.setText("Productos");

        cb_Productos1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Productos1ItemStateChanged(evt);
            }
        });

        jLabel20.setText("Nombre");

        bt_Comprar.setText("Comprar");
        bt_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ComprarActionPerformed(evt);
            }
        });

        jt_Productos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Precio", "Fecha de Caducidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_Productos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_Productos1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jt_Productos1);

        jl_Compras.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_Compras);

        jLabel21.setText("Lista del Cliente");

        javax.swing.GroupLayout jd_CompraLayout = new javax.swing.GroupLayout(jd_Compra.getContentPane());
        jd_Compra.getContentPane().setLayout(jd_CompraLayout);
        jd_CompraLayout.setHorizontalGroup(
            jd_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_Comprar)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addGroup(jd_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(jd_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_CompraLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jd_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_CompraLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_Nombre_Pro1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_CompraLayout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(18, 18, 18)
                            .addComponent(cb_Productos1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(1011, Short.MAX_VALUE)))
        );
        jd_CompraLayout.setVerticalGroup(
            jd_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CompraLayout.createSequentialGroup()
                .addGroup(jd_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CompraLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(bt_Comprar)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_CompraLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jd_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_CompraLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jd_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_Productos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                    .addGroup(jd_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(tf_Nombre_Pro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(223, 223, 223)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_Login.setText("Login");
        bt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoginActionPerformed(evt);
            }
        });

        bt_Logout.setText("Logout");
        bt_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LogoutActionPerformed(evt);
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
        jmi_Adminstracion_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Adminstracion_ClientesActionPerformed(evt);
            }
        });
        jm_Cliente1.add(jmi_Adminstracion_Clientes);

        jm_Admins.add(jm_Cliente1);

        jm_Productos.setText("Productos");

        jmi_Creacion_Productos.setText("Creacion de Productos");
        jmi_Creacion_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Creacion_ProductosActionPerformed(evt);
            }
        });
        jm_Productos.add(jmi_Creacion_Productos);

        jmi_Admins_Productos.setText("Administracion de Productos");
        jmi_Admins_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Admins_ProductosActionPerformed(evt);
            }
        });
        jm_Productos.add(jmi_Admins_Productos);

        jm_Admins.add(jm_Productos);

        jmb_Opciones.add(jm_Admins);

        jm_Cliente.setText("Compra");
        jm_Cliente.setEnabled(false);
        jm_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_ClienteActionPerformed(evt);
            }
        });
        jmb_Opciones.add(jm_Cliente);

        setJMenuBar(jmb_Opciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_Logout)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Login)
                    .addComponent(bt_Logout))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Login1ActionPerformed
        // TODO add your handling code here:
        int cont = 0;
        if (rb_Admin.isSelected()) {
            if (tf_Usuario.getText().equals("Die123") && tf_Contraseña.getText().equals("321ied")) {
                JOptionPane.showMessageDialog(jd_Login, "Bienvenido Administrador");
                jd_Login.dispose();
                jm_Admins.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(jd_Login, "Contraseña o usuario no correcto");
            }
            
        } else if (rb_Cliente.isSelected()) {
            adminClientes ap = new adminClientes("./clientes.cbm");
            ap.cargarArchivo();
            ArrayList cli = new ArrayList();
            cli.add(ap.getListaPersonas().toArray());
            while (cont < cli.size()) {
                if (((Clientes) cli.get(cont)).getUsuario().equals(tf_Usuario.getText()) && ((Clientes) cli.get(cont)).getContraseña().equals(tf_Contraseña.getText())) {
                    JOptionPane.showMessageDialog(jd_Login, "Bienvenido usuario");
                    cont = 0;
                    jd_Login.dispose();
                    jm_Cliente.setEnabled(true);
                    break;
                } else {
                    cont++;
                }
            }//While que valida el login
        } else {
            JOptionPane.showMessageDialog(jd_Login, "Contraseña o usuario no correcto");
            cont = 0;
        }
    }//GEN-LAST:event_bt_Login1ActionPerformed

    private void bt_Creacion_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Creacion_ClienteActionPerformed
        // TODO add your handling code here:
        p = new Clientes(tf_Nombre_Cliente.getText(), tf_Cuenta_Cliente.getText(), tf_Contraseña_Cliente.getText(), tf_Identidad_Cliente.getText(), Integer.parseInt(tf_Saldo_Cliente.getText()), tf_Usuario_Cliente.getText());
        adminClientes ap = new adminClientes("./clientes.cbm");
        ap.cargarArchivo();
        ap.setPersona(p);
        ap.escribirArchivo();
        JOptionPane.showMessageDialog(jd_Creacion_Cliente, "Cliente guardado exitosamente");
        tf_Nombre_Cliente.setText("");
        tf_Cuenta_Cliente.setText("");
        tf_Contraseña_Cliente.setText("");
        tf_Identidad_Cliente.setText("");
        tf_Saldo_Cliente.setText("");
        tf_Usuario_Cliente.setText("");
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
        a = new Productos(tf_Nombre_Producto.getText(), Integer.parseInt(tf_Cantidad_Producto.getText()), Integer.parseInt(tf_Precio_Producto.getText()), jdc_Caducidad.getDate());
        adminProductos ap = new adminProductos("./productos.cbm");
        ap.cargarArchivo();
        ap.setPersona(a);
        ap.escribirArchivo();
        JOptionPane.showMessageDialog(jd_Creacion_Productos, "Producto guardado exitosamente");
        tf_Nombre_Producto.setText("");
        tf_Cantidad_Producto.setText("");
        tf_Precio_Producto.setText("");
        
        jdc_Caducidad.setDate(new Date());
    }//GEN-LAST:event_bt_Crear_ProductoActionPerformed

    private void jmi_Creacion_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Creacion_ProductosActionPerformed
        // TODO add your handling code here:
        jd_Creacion_Productos.setModal(true);
        jd_Creacion_Productos.pack();
        jd_Creacion_Productos.setLocationRelativeTo(this);
        jd_Creacion_Productos.setVisible(true);
    }//GEN-LAST:event_jmi_Creacion_ProductosActionPerformed

    private void bt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LoginActionPerformed
        // TODO add your handling code here:
        jd_Login.setModal(true);
        jd_Login.pack();
        jd_Login.setLocationRelativeTo(this);
        jd_Login.setVisible(true);
    }//GEN-LAST:event_bt_LoginActionPerformed

    private void cb_ProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ProductosItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 1) {
            Productos temp = (Productos) cb_Productos.getSelectedItem();
            if (temp != null) {
                tf_Nombre_Pro.setText(temp.getNombre());
                
                jt_Productos.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Cantidad", "Precio", "Caducidad"}
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false
                    };
                    
                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }
                    
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                Object row[] = {temp.getCantidad(), temp.getPrecio(), temp.getCaducidad()};
                DefaultTableModel m = (DefaultTableModel) jt_Productos.getModel();
                m.addRow(row);
                jt_Productos.setModel(m);
            }
        }
    }//GEN-LAST:event_cb_ProductosItemStateChanged

    private void jt_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ProductosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            pp_Productos.show(jt_Productos, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_ProductosMouseClicked

    private void jmi_Admins_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Admins_ProductosActionPerformed
        // TODO add your handling code here:
        jd_Admins_Productos.setModal(true);
        jd_Admins_Productos.pack();
        jd_Admins_Productos.setLocationRelativeTo(this);
        jd_Admins_Productos.setVisible(true);
        adminProductos ap = new adminProductos("./productos.cbm");
        ap.cargarArchivo();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(ap.getListaPersonas().toArray());
        cb_Productos.setModel(modelo);
    }//GEN-LAST:event_jmi_Admins_ProductosActionPerformed

    private void jmi_Adminstracion_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Adminstracion_ClientesActionPerformed
        // TODO add your handling code here:
        jd_Admins_Clientes.setModal(true);
        jd_Admins_Clientes.pack();
        jd_Admins_Clientes.setLocationRelativeTo(this);
        jd_Admins_Clientes.setVisible(true);
        adminClientes ap = new adminClientes("./clientes.cbm");
        ap.cargarArchivo();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(ap.getListaPersonas().toArray());
        cb_Clientes.setModel(modelo);
    }//GEN-LAST:event_jmi_Adminstracion_ClientesActionPerformed

    private void cb_ClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ClientesItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 1) {
            Clientes temp = (Clientes) cb_Clientes.getSelectedItem();
            if (temp != null) {
                tf_Nombre_Cliente1.setText(temp.getNombre());
                
                jt_Clientes.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Cuenta", "Contraseña", "Identidad", "Saldo"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false
                    };
                    
                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }
                    
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                
                Object row[] = {temp.getNombre(), temp.getCuenta(), temp.getContraseña(), temp.getIdentidad(), temp.getSaldo()};
                DefaultTableModel m = (DefaultTableModel) jt_Clientes.getModel();
                m.addRow(row);
                jt_Clientes.setModel(m);
            }
        }
    }//GEN-LAST:event_cb_ClientesItemStateChanged

    private void jmi_Eliminar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Eliminar_ProductoActionPerformed
        // TODO add your handling code here:
        jt_Productos.remove(jt_Productos.getSelectedRow());
        cb_Productos.remove(jt_Productos.getSelectedRow());
    }//GEN-LAST:event_jmi_Eliminar_ProductoActionPerformed

    private void jmi_Modificar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Modificar_ProductoActionPerformed
        // TODO add your handling code here:
        if (jt_Productos.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) jt_Productos.getModel();
            //Modificar en la tabla
            ((Productos) modelo.getValueAt(jt_Productos.getSelectedRow(), 1)).setCantidad(Integer.parseInt(JOptionPane.showInputDialog(jd_Admins_Productos, "Ingrese nueva cantidad")));
            ((Productos) modelo.getValueAt(jt_Productos.getSelectedRow(), 2)).setPrecio(Integer.parseInt(JOptionPane.showInputDialog(jd_Admins_Productos, "Ingrese nuevo precio")));
            ((Productos) modelo.getValueAt(jt_Productos.getSelectedRow(), 3)).setCaducidad(new Date());
            jt_Productos.setModel(modelo);
        }
    }//GEN-LAST:event_jmi_Modificar_ProductoActionPerformed

    private void bt_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LogoutActionPerformed
        // TODO add your handling code here:
        jm_Admins.setEnabled(false);
        jm_Cliente.setEnabled(false);
    }//GEN-LAST:event_bt_LogoutActionPerformed

    private void jmi_Eliminar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Eliminar_ClientesActionPerformed
        // TODO add your handling code here:
        jt_Clientes.remove(jt_Clientes.getSelectedRow());
        cb_Clientes.remove(jt_Clientes.getSelectedRow());
    }//GEN-LAST:event_jmi_Eliminar_ClientesActionPerformed

    private void jt_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ClientesMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            pp_Clientes.show(jt_Clientes, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_ClientesMouseClicked

    private void jmi_Modificar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Modificar_ClientesActionPerformed
        // TODO add your handling code here:
        if (jt_Clientes.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) jt_Clientes.getModel();
            //Modificar en la tabla
            ((Clientes) modelo.getValueAt(jt_Clientes.getSelectedRow(), 1)).setNombre(JOptionPane.showInputDialog(jd_Admins_Clientes, "Ingrese nuevo nombre"));
            ((Clientes) modelo.getValueAt(jt_Clientes.getSelectedRow(), 2)).setCuenta(JOptionPane.showInputDialog(jd_Admins_Clientes, "Ingrese nueva cuenta"));
            ((Clientes) modelo.getValueAt(jt_Clientes.getSelectedRow(), 4)).setSaldo(Integer.parseInt(JOptionPane.showInputDialog(jd_Admins_Clientes, "Ingrese nuevo saldo")));
            ((Clientes) modelo.getValueAt(jt_Clientes.getSelectedRow(), 3)).setIdentidad(JOptionPane.showInputDialog(jd_Admins_Clientes, "Ingrese nueva identidad"));
            jt_Clientes.setModel(modelo);
        }
    }//GEN-LAST:event_jmi_Modificar_ClientesActionPerformed

    private void cb_Productos1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Productos1ItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 1) {
            Productos temp = (Productos) cb_Productos1.getSelectedItem();
            if (temp != null) {
                tf_Nombre_Pro1.setText(temp.getNombre());
                
                jt_Productos1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Cantidad", "Precio", "Caducidad"}
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false
                    };
                    
                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }
                    
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                Object row[] = {temp.getCantidad(), temp.getPrecio(), temp.getCaducidad()};
                DefaultTableModel m = (DefaultTableModel) jt_Productos1.getModel();
                m.addRow(row);
                jt_Productos1.setModel(m);
            }
        }
    }//GEN-LAST:event_cb_Productos1ItemStateChanged

    private void jt_Productos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_Productos1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_Productos1MouseClicked

    private void jm_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_ClienteActionPerformed
        // TODO add your handling code here:
        jd_Compra.setModal(true);
        jd_Compra.pack();
        jd_Compra.setLocationRelativeTo(this);
        jd_Compra.setVisible(true);
        adminProductos ap = new adminProductos("./productos.cbm");
        ap.cargarArchivo();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(ap.getListaPersonas().toArray());
        cb_Productos1.setModel(modelo);
    }//GEN-LAST:event_jm_ClienteActionPerformed

    private void bt_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ComprarActionPerformed
        // TODO add your handling code here:
        int total = 0;
        if (jt_Productos1.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) jt_Productos1.getModel();
            DefaultListModel mode = (DefaultListModel) jl_Compras.getModel();
            total += ((Productos) modelo.getValueAt(jt_Productos1.getSelectedRow(), 2)).getPrecio();
            mode.addElement(((Productos) modelo.getValueAt(jt_Productos1.getSelectedRow(), 1)).getNombre());
            jl_Compras.setModel(mode);
            if (p.getSaldo() >= total
                    && ((Productos) modelo.getValueAt(jt_Productos1.getSelectedRow(), 2)).getCaducidad() != new Date()) {
                a.setCantidad(a.getCantidad() - 1);
                p.getCompra().add(a);
                p.setSaldo(p.getSaldo() - total);
                JOptionPane.showMessageDialog(jd_Compra, "Gracias por su compra");
            } else {
                JOptionPane.showMessageDialog(jd_Compra, "No cuenta con el saldo necesario para hacer la compra");
            }
            
        }
    }//GEN-LAST:event_bt_ComprarActionPerformed

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
    private javax.swing.JButton bt_Comprar;
    private javax.swing.JButton bt_Creacion_Cliente;
    private javax.swing.JButton bt_Crear_Producto;
    private javax.swing.JButton bt_Login;
    private javax.swing.JButton bt_Login1;
    private javax.swing.JButton bt_Logout;
    private javax.swing.JComboBox cb_Clientes;
    private javax.swing.JComboBox cb_Productos;
    private javax.swing.JComboBox cb_Productos1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JDialog jd_Admins_Clientes;
    private javax.swing.JDialog jd_Admins_Productos;
    private javax.swing.JDialog jd_Compra;
    private javax.swing.JDialog jd_Creacion_Cliente;
    private javax.swing.JDialog jd_Creacion_Productos;
    private javax.swing.JDialog jd_Login;
    private com.toedter.calendar.JDateChooser jdc_Caducidad;
    private javax.swing.JList<String> jl_Compras;
    private javax.swing.JMenu jm_Admins;
    private javax.swing.JMenu jm_Cliente;
    private javax.swing.JMenu jm_Cliente1;
    private javax.swing.JMenu jm_Productos;
    private javax.swing.JMenuBar jmb_Opciones;
    private javax.swing.JMenuItem jmi_Admins_Productos;
    private javax.swing.JMenuItem jmi_Adminstracion_Clientes;
    private javax.swing.JMenuItem jmi_Creacion_Clientes;
    private javax.swing.JMenuItem jmi_Creacion_Productos;
    private javax.swing.JMenuItem jmi_Eliminar_Clientes;
    private javax.swing.JMenuItem jmi_Eliminar_Producto;
    private javax.swing.JMenuItem jmi_Modificar_Clientes;
    private javax.swing.JMenuItem jmi_Modificar_Producto;
    private javax.swing.JTable jt_Clientes;
    private javax.swing.JTable jt_Productos;
    private javax.swing.JTable jt_Productos1;
    private javax.swing.JPopupMenu pp_Clientes;
    private javax.swing.JPopupMenu pp_Productos;
    private javax.swing.JRadioButton rb_Admin;
    private javax.swing.JRadioButton rb_Cliente;
    private javax.swing.JTextField tf_Cantidad_Producto;
    private javax.swing.JTextField tf_Contraseña;
    private javax.swing.JTextField tf_Contraseña_Cliente;
    private javax.swing.JTextField tf_Cuenta_Cliente;
    private javax.swing.JTextField tf_Identidad_Cliente;
    private javax.swing.JTextField tf_Nombre_Cliente;
    private javax.swing.JTextField tf_Nombre_Cliente1;
    private javax.swing.JTextField tf_Nombre_Pro;
    private javax.swing.JTextField tf_Nombre_Pro1;
    private javax.swing.JTextField tf_Nombre_Producto;
    private javax.swing.JTextField tf_Precio_Producto;
    private javax.swing.JTextField tf_Saldo_Cliente;
    private javax.swing.JTextField tf_Usuario;
    private javax.swing.JTextField tf_Usuario_Cliente;
    // End of variables declaration//GEN-END:variables
 Clientes p;
    Productos a;
}
