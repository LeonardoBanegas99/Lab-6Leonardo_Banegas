package lab6leonardo_banegas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Lab6Leonardo_BanegasGUI extends javax.swing.JFrame {
    
    private Inventario inventario = new Inventario("./src\\inventario.txt");
    private Factura factura = new Factura();
    private Ingreso ingreso = new Ingreso("./src\\Ingresos.txt");
    private Scanner sc = null;
    
    public Lab6Leonardo_BanegasGUI() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameProductos = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfPreciodeCosto = new javax.swing.JTextField();
        tfPreciodeVenta = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnguardarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnRegresar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        DialogBebida = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfTamano = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        btnDialogAceptar1 = new javax.swing.JButton();
        DialogComida = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        tfTipodeComida = new javax.swing.JTextField();
        btnAceptarComida = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        PopUpEliminarModificarProducto = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenuItem();
        FrameFactura = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        tfNombreCliente = new javax.swing.JTextField();
        tfRTN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfCAI = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();
        btngenerarfactura = new javax.swing.JButton();
        btnregresarFactura = new javax.swing.JButton();
        FrameIngresos = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnProductos = new javax.swing.JButton();
        btnCrearFactura = new javax.swing.JButton();
        btnIngresosTabla = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        FrameProductos.setPreferredSize(new java.awt.Dimension(800, 600));
        FrameProductos.setSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Precio de Costo");

        jLabel2.setText("Precio de Venta");

        jLabel3.setText("Nombre");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebida", "Comida" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnguardarProducto.setText("Guardar");
        btnguardarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarProductoMouseClicked(evt);
            }
        });

        jList1.setModel(new DefaultListModel());
        jList1.setToolTipText("");
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        jMenu1.setText("Archivos");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        FrameProductos.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout FrameProductosLayout = new javax.swing.GroupLayout(FrameProductos.getContentPane());
        FrameProductos.getContentPane().setLayout(FrameProductosLayout);
        FrameProductosLayout.setHorizontalGroup(
            FrameProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameProductosLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(FrameProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(FrameProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPreciodeCosto)
                    .addComponent(tfPreciodeVenta)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FrameProductosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnguardarProducto)))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );
        FrameProductosLayout.setVerticalGroup(
            FrameProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameProductosLayout.createSequentialGroup()
                .addGroup(FrameProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameProductosLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(FrameProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfPreciodeCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfPreciodeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(FrameProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguardarProducto)))
                    .addGroup(FrameProductosLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        DialogBebida.setPreferredSize(new java.awt.Dimension(500, 400));
        DialogBebida.setSize(new java.awt.Dimension(500, 400));

        jLabel4.setText("Estado");

        jLabel5.setText("Tamaño");

        jLabel6.setText("Tipo");

        btnDialogAceptar1.setText("Aceptar");
        btnDialogAceptar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDialogAceptar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DialogBebidaLayout = new javax.swing.GroupLayout(DialogBebida.getContentPane());
        DialogBebida.getContentPane().setLayout(DialogBebidaLayout);
        DialogBebidaLayout.setHorizontalGroup(
            DialogBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogBebidaLayout.createSequentialGroup()
                .addGroup(DialogBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogBebidaLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(DialogBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(72, 72, 72)
                        .addGroup(DialogBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEstado)
                            .addComponent(tfTamano)
                            .addComponent(tfTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                    .addGroup(DialogBebidaLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(btnDialogAceptar1)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        DialogBebidaLayout.setVerticalGroup(
            DialogBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogBebidaLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(DialogBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(DialogBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(DialogBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnDialogAceptar1)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        DialogComida.setPreferredSize(new java.awt.Dimension(300, 300));
        DialogComida.setSize(new java.awt.Dimension(300, 300));

        jLabel8.setText("Tipo de Comida");

        btnAceptarComida.setText("Aceptar");
        btnAceptarComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarComidaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DialogComidaLayout = new javax.swing.GroupLayout(DialogComida.getContentPane());
        DialogComida.getContentPane().setLayout(DialogComidaLayout);
        DialogComidaLayout.setHorizontalGroup(
            DialogComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogComidaLayout.createSequentialGroup()
                .addGroup(DialogComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogComidaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tfTipodeComida, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DialogComidaLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnAceptarComida)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        DialogComidaLayout.setVerticalGroup(
            DialogComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogComidaLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(DialogComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfTipodeComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnAceptarComida)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jLabel7.setText("jLabel7");

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        PopUpEliminarModificarProducto.add(Eliminar);

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        PopUpEliminarModificarProducto.add(Modificar);

        FrameFactura.setPreferredSize(new java.awt.Dimension(500, 400));
        FrameFactura.setSize(new java.awt.Dimension(500, 400));

        jLabel9.setText("Correo");

        jLabel10.setText("Nombre");

        jLabel11.setText("RTN");

        jLabel12.setText("CAI");

        jLabel13.setText("Fecha");

        btngenerarfactura.setText("Generar Factura");
        btngenerarfactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btngenerarfacturaMouseClicked(evt);
            }
        });

        btnregresarFactura.setText("Regresar");
        btnregresarFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregresarFacturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FrameFacturaLayout = new javax.swing.GroupLayout(FrameFactura.getContentPane());
        FrameFactura.getContentPane().setLayout(FrameFacturaLayout);
        FrameFacturaLayout.setHorizontalGroup(
            FrameFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameFacturaLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(FrameFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameFacturaLayout.createSequentialGroup()
                        .addGroup(FrameFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(50, 50, 50)
                        .addGroup(FrameFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(tfNombreCliente)
                            .addComponent(tfRTN)
                            .addComponent(tfCAI)
                            .addComponent(tfFecha)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameFacturaLayout.createSequentialGroup()
                        .addComponent(btngenerarfactura)
                        .addGap(63, 63, 63)))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameFacturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresarFactura)
                .addContainerGap())
        );
        FrameFacturaLayout.setVerticalGroup(
            FrameFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameFacturaLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(FrameFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(FrameFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(FrameFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfRTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(FrameFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfCAI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(FrameFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btngenerarfactura)
                .addGap(8, 8, 8)
                .addComponent(btnregresarFactura)
                .addContainerGap())
        );

        FrameIngresos.setPreferredSize(new java.awt.Dimension(800, 600));
        FrameIngresos.setSize(new java.awt.Dimension(800, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Factura Neto", "Impuesto", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Regresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jMenu3.setText("Archivos");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        FrameIngresos.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout FrameIngresosLayout = new javax.swing.GroupLayout(FrameIngresos.getContentPane());
        FrameIngresos.getContentPane().setLayout(FrameIngresosLayout);
        FrameIngresosLayout.setHorizontalGroup(
            FrameIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameIngresosLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameIngresosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        FrameIngresosLayout.setVerticalGroup(
            FrameIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameIngresosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProductos.setText("Productos");
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
        });
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 86, 165, 53));

        btnCrearFactura.setText("Crear Factura");
        btnCrearFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearFacturaMouseClicked(evt);
            }
        });
        getContentPane().add(btnCrearFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 173, 165, 58));

        btnIngresosTabla.setText("Tabla de Ingresos");
        btnIngresosTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresosTablaMouseClicked(evt);
            }
        });
        getContentPane().add(btnIngresosTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 265, 165, 53));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DD.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        this.setVisible(false);
        FrameProductos.setVisible(true);
    }//GEN-LAST:event_btnProductosMouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void btnDialogAceptar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDialogAceptar1MouseClicked
        DialogBebida.setVisible(false);
        FrameProductos.setVisible(true);
    }//GEN-LAST:event_btnDialogAceptar1MouseClicked

    private void btnAceptarComidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarComidaMouseClicked
        DialogComida.setVisible(false);
        FrameProductos.setVisible(true);
    }//GEN-LAST:event_btnAceptarComidaMouseClicked

    private void btnguardarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarProductoMouseClicked
        try {
            double preciodecosto = Integer.parseInt(tfPreciodeCosto.getText());
            double preciodeventa = Integer.parseInt(tfPreciodeVenta.getText());
            String nombre = tfNombre.getText();
            if (jComboBox1.getSelectedIndex() == 0) {
                String estado = tfEstado.getText();
                int tamano = Integer.parseInt(tfTamano.getText());
                String tipo = tfTipo.getText();
                Producto p = new Bebida(estado, tamano, tipo, preciodecosto, preciodeventa, nombre);
                inventario.getProductos().add(p);
                factura.getProductos().add(p);
                inventario.guardar(p);
            } else {
                String tipodecomida = tfTipodeComida.getText();
                Producto p = new Comida(tipodecomida, preciodecosto, preciodeventa, nombre);
                inventario.getProductos().add(p);
                factura.getProductos().add(p);
                inventario.guardar(p);
            }
            DefaultListModel modellista = (DefaultListModel) jList1.getModel();
            modellista.addElement(inventario.getProductos().get(inventario.getProductos().size() - 1));
            jList1.setModel(modellista);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ingreso numeros correctamente");
            this.setVisible(true);
            FrameProductos.setVisible(false);
            tfPreciodeCosto.setText("");
            tfPreciodeVenta.setText("");
            tfNombre.setText("");
            tfEstado.setText("");
            tfTamano.setText("");
            tfTipo.setText("");
            tfTipodeComida.setText("");
        }
        tfPreciodeCosto.setText("");
        tfPreciodeVenta.setText("");
        tfNombre.setText("");
        tfEstado.setText("");
        tfTamano.setText("");
        tfTipo.setText("");
        tfTipodeComida.setText("");

    }//GEN-LAST:event_btnguardarProductoMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() == 0) {
            DialogBebida.setVisible(true);
        } else {
            DialogComida.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (evt.isMetaDown()) {
            PopUpEliminarModificarProducto.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        int x = jList1.getSelectedIndex();
        DefaultListModel modelo = (DefaultListModel) jList1.getModel();
        if (inventario.getProductos().get(x) instanceof Bebida) {
            double preciodecosto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Precio de Costo: "));
            double preciodeventa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Precio de Venta: "));
            String nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
            String estado = JOptionPane.showInputDialog("Ingrese Estado: ");
            int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Tamaño: "));
            String tipo = JOptionPane.showInputDialog("Ingrese Tipo: ");
            ((Bebida) inventario.getProductos().get(x)).setPreciodecosto(preciodecosto);
            ((Bebida) inventario.getProductos().get(x)).setPreciodeventa(preciodeventa);
            ((Bebida) inventario.getProductos().get(x)).setNombre(nombre);
            ((Bebida) inventario.getProductos().get(x)).setEstado(estado);
            ((Bebida) inventario.getProductos().get(x)).setTamano(tamano);
            ((Bebida) inventario.getProductos().get(x)).setTipo(tipo);
            
            ((Bebida) modelo.getElementAt(x)).setPreciodecosto(preciodecosto);
            ((Bebida) modelo.getElementAt(x)).setPreciodeventa(preciodeventa);
            ((Bebida) modelo.getElementAt(x)).setNombre(nombre);
            ((Bebida) modelo.getElementAt(x)).setEstado(estado);
            ((Bebida) modelo.getElementAt(x)).setTamano(tamano);
            ((Bebida) modelo.getElementAt(x)).setTipo(tipo);
            jList1.setModel(modelo);
        } else if (inventario.getProductos().get(x) instanceof Comida) {
            double preciodecosto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Precio de Costo: "));
            double preciodeventa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Precio de Venta: "));
            String nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
            String tipodecomida = JOptionPane.showInputDialog("Ingrese Tipo de Comida: ");
            ((Comida) inventario.getProductos().get(x)).setPreciodecosto(preciodecosto);
            ((Comida) inventario.getProductos().get(x)).setPreciodeventa(preciodeventa);
            ((Comida) inventario.getProductos().get(x)).setNombre(nombre);
            ((Comida) inventario.getProductos().get(x)).setTipodecomida(tipodecomida);
            
            ((Comida) modelo.getElementAt(x)).setPreciodecosto(preciodecosto);
            ((Comida) modelo.getElementAt(x)).setPreciodeventa(preciodeventa);
            ((Comida) modelo.getElementAt(x)).setNombre(nombre);
            ((Comida) modelo.getElementAt(x)).setTipodecomida(tipodecomida);
            jList1.setModel(modelo);
        }
        inventario.modificar();
        JOptionPane.showMessageDialog(this, "Modificado con Exito");
        System.out.println(inventario.getProductos());
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int x = jList1.getSelectedIndex();
        DefaultListModel modelo = (DefaultListModel) jList1.getModel();
        modelo.remove(x);
        inventario.getProductos().remove(x);
        jList1.setModel(modelo);
        inventario.modificar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        this.setVisible(true);
        FrameProductos.setVisible(false);
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnCrearFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearFacturaMouseClicked
        this.setVisible(false);
        FrameFactura.setVisible(true);
    }//GEN-LAST:event_btnCrearFacturaMouseClicked

    private void btngenerarfacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngenerarfacturaMouseClicked
        try {
            factura.setCorreo(tfCorreo.getText());
            factura.setNombredelcliente(tfNombreCliente.getText());
            factura.setRTN(Integer.parseInt(tfRTN.getText()));
            factura.setCAI(tfCAI.getText());
            factura.setFecha(tfFecha.getText());
            factura.generarFactura();
            double totalventas = 0;
            double subtotal = 0;
            for (int i = 0; i < inventario.getProductos().size(); i++) {
                subtotal = subtotal + inventario.getProductos().get(i).getPreciodeventa();
            }
            double impuesto = subtotal * 0.15;
            totalventas = totalventas + impuesto + subtotal;
            Ventas v = new Ventas(totalventas, factura.getFecha());
            ingreso.getVentas().add(v);
            ingreso.guardarIngreso(v);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ingreso numeros correctamente");
            tfCorreo.setText("");
            tfNombreCliente.setText("");
            tfRTN.setText("");
            tfCAI.setText("");
            tfFecha.setText("");
            this.setVisible(true);
            FrameFactura.setVisible(false);
        }
        
        tfCorreo.setText("");
        tfNombreCliente.setText("");
        tfRTN.setText("");
        tfCAI.setText("");
        tfFecha.setText("");
    }//GEN-LAST:event_btngenerarfacturaMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        JFileChooser filechooser = new JFileChooser("./");
        int seleccion = filechooser.showSaveDialog(this);
        try {
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = filechooser.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                String[] array1 = null;
                String[] array2 = null;
                linea = br.readLine();
                array1 = linea.split(";");
                for (int i = 0; i < array1.length; i++) {
                    String l = array1[i];
                    array2 = l.split(",");
                    if (array2[0].equals("1")) {
                        double preciodecosto = Double.parseDouble(array2[1]);
                        double preciodeventa = Double.parseDouble(array2[2]);
                        String nombre = array2[3];
                        String estado = array2[4];
                        int tamano = Integer.parseInt(array2[5]);
                        String tipo = array2[6];
                        Producto p = new Bebida(estado, tamano, tipo, preciodecosto, preciodeventa, nombre);
                        inventario.getProductos().add(p);
                        factura.getProductos().add(p);
                        DefaultListModel modellista = (DefaultListModel) jList1.getModel();
                        modellista.addElement(inventario.getProductos().get(inventario.getProductos().size() - 1));
                        jList1.setModel(modellista);
                    } else if (array2[0].equals("2")) {
                        double preciodecosto = Double.parseDouble(array2[1]);
                        double preciodeventa = Double.parseDouble(array2[2]);
                        String nombre = array2[3];
                        String tipodecomida = array2[4];
                        Producto p = new Comida(tipodecomida, preciodecosto, preciodeventa, nombre);
                        inventario.getProductos().add(p);
                        factura.getProductos().add(p);
                        DefaultListModel modellista = (DefaultListModel) jList1.getModel();
                        modellista.addElement(inventario.getProductos().get(inventario.getProductos().size() - 1));
                        jList1.setModel(modellista);
                    }
                    System.out.println(inventario);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab6Leonardo_BanegasGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab6Leonardo_BanegasGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnregresarFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarFacturaMouseClicked
        this.setVisible(true);
        FrameFactura.setVisible(false);
    }//GEN-LAST:event_btnregresarFacturaMouseClicked

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnIngresosTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosTablaMouseClicked
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Total Factura Neto", "Impuesto", "Fecha"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        
        DefaultTableModel modelotabla = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < ingreso.getVentas().size(); i++) {
            double x = ingreso.getVentas().get(i).getTotalventa();
            double impuesto = x * 0.15;
            Object[] newrow = {
                ingreso.getVentas().get(i).getTotalventa(),
                impuesto, ingreso.getVentas().get(i).getFecha()};
            modelotabla.addRow(newrow);
        }
        jTable1.setModel(modelotabla);
        this.setVisible(false);
        FrameIngresos.setVisible(true);
    }//GEN-LAST:event_btnIngresosTablaMouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ingreso.getVentas().clear();;
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        JFileChooser filechooser = new JFileChooser("./");
        int seleccion = filechooser.showSaveDialog(this);
        try {
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = filechooser.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                String[] array1 = null;
                String[] array2 = null;
                linea = br.readLine();
                array1 = linea.split(";");
                for (int i = 0; i < array1.length; i++) {
                    String l = array1[i];
                    array2 = l.split(",");
                    double totalventas = Double.parseDouble(array2[0]);
                    String fecha = array2[1];
                    ingreso.getVentas().add(new Ventas(totalventas, fecha));
                }
                
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Total Factura Neto", "Impuesto", "Fecha"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.Double.class, java.lang.Double.class, java.lang.String.class
                    };
                    
                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }
                });
                
                DefaultTableModel modelotabla = (DefaultTableModel) jTable1.getModel();
                for (int i = 0; i < ingreso.getVentas().size(); i++) {
                    double x = ingreso.getVentas().get(i).getTotalventa();
                    double impuesto = x * 0.15;
                    Object[] newrow = {
                        ingreso.getVentas().get(i).getTotalventa(),
                        impuesto, ingreso.getVentas().get(i).getFecha()};
                    modelotabla.addRow(newrow);
                }
                jTable1.setModel(modelotabla);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab6Leonardo_BanegasGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab6Leonardo_BanegasGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(true);
        FrameIngresos.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked
    
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
            java.util.logging.Logger.getLogger(Lab6Leonardo_BanegasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab6Leonardo_BanegasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab6Leonardo_BanegasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab6Leonardo_BanegasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab6Leonardo_BanegasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogBebida;
    private javax.swing.JDialog DialogComida;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JFrame FrameFactura;
    private javax.swing.JFrame FrameIngresos;
    private javax.swing.JFrame FrameProductos;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JPopupMenu PopUpEliminarModificarProducto;
    private javax.swing.JButton btnAceptarComida;
    private javax.swing.JButton btnCrearFactura;
    private javax.swing.JButton btnDialogAceptar1;
    private javax.swing.JButton btnIngresosTabla;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btngenerarfactura;
    private javax.swing.JButton btnguardarProducto;
    private javax.swing.JButton btnregresarFactura;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfCAI;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombreCliente;
    private javax.swing.JTextField tfPreciodeCosto;
    private javax.swing.JTextField tfPreciodeVenta;
    private javax.swing.JTextField tfRTN;
    private javax.swing.JTextField tfTamano;
    private javax.swing.JTextField tfTipo;
    private javax.swing.JTextField tfTipodeComida;
    // End of variables declaration//GEN-END:variables

}
