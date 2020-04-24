package Formularios;

import Entidades.Farmacos.Analgesico;
import Entidades.Farmacos.Antiacido;
import Entidades.Farmacos.Antialergico;
import Entidades.Farmacos.Antidepresivo;
import Entidades.Farmacos.Antiinflamatorio;
import Entidades.Farmacos.Antipiretico;
import Entidades.Inventario.Inventario;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

public class frm_Farmacia extends javax.swing.JFrame {

     //Utilidades
     DefaultTableModel tablaModelo;
     DecimalFormat df = new DecimalFormat("#.00");
     //Variables y demás.
     private String tipoVenta;
     private double precioFarmaco, totalVenta;
     //Instancia del inventario
     Inventario inventario;

     //Instancias Objetos Farmacos
     Analgesico analgesico;
     Antiacido antiacido;
     Antialergico antialergico;
     Antidepresivo antidepresivo;
     Antiinflamatorio antiinflamatorio;
     Antipiretico antipiretico;

     public frm_Farmacia() {
          initComponents();
          this.startFrame();
          this.inventario = new Inventario();
     }

     private void startFrame() {
          this.setEnabled(true);
          this.setVisible(true);
          this.setResizable(false);
          this.setTitle("Farmacia");
          this.setLocationRelativeTo(null);
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          btngTipoVenta = new javax.swing.ButtonGroup();
          jTabbedPane1 = new javax.swing.JTabbedPane();
          jPanel1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          txtNombreProducto = new javax.swing.JTextField();
          jLabel3 = new javax.swing.JLabel();
          ffIdProducto = new javax.swing.JFormattedTextField();
          jLabel4 = new javax.swing.JLabel();
          rbSoloReceta = new javax.swing.JRadioButton();
          rbVentaLibre = new javax.swing.JRadioButton();
          jLabel5 = new javax.swing.JLabel();
          ffPrecio = new javax.swing.JFormattedTextField();
          jLabel6 = new javax.swing.JLabel();
          spnCantDisponible = new javax.swing.JSpinner();
          jLabel7 = new javax.swing.JLabel();
          cboTipoFarmaco = new javax.swing.JComboBox<>();
          btnRegistrarProducto = new javax.swing.JButton();
          jScrollPane1 = new javax.swing.JScrollPane();
          jtInventarioTotal = new javax.swing.JTable();
          jLabel8 = new javax.swing.JLabel();
          cboIndexInventario = new javax.swing.JComboBox<>();
          jPanel2 = new javax.swing.JPanel();
          jLabel9 = new javax.swing.JLabel();
          jScrollPane2 = new javax.swing.JScrollPane();
          jtProductosVenta = new javax.swing.JTable();
          jLabel10 = new javax.swing.JLabel();
          txtNombreProducto1 = new javax.swing.JTextField();
          jLabel11 = new javax.swing.JLabel();
          jSpinner1 = new javax.swing.JSpinner();
          jLabel12 = new javax.swing.JLabel();
          spnCantCliente = new javax.swing.JSpinner();
          jLabel13 = new javax.swing.JLabel();
          txtTotalVenta = new javax.swing.JTextField();
          jLabel14 = new javax.swing.JLabel();
          jLabel15 = new javax.swing.JLabel();
          cboIndexVenta = new javax.swing.JComboBox<>();
          jButton1 = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jTabbedPane1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

          jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
          jLabel1.setText("Registrar Nuevo Producto");

          jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel2.setText("Nombre");

          txtNombreProducto.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

          jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel3.setText("Número Identicación");

          try {
               ffIdProducto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
          } catch (java.text.ParseException ex) {
               ex.printStackTrace();
          }
          ffIdProducto.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

          jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel4.setText("Tipo de venta");

          btngTipoVenta.add(rbSoloReceta);
          rbSoloReceta.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
          rbSoloReceta.setText("Solo con Receta Medica");

          btngTipoVenta.add(rbVentaLibre);
          rbVentaLibre.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
          rbVentaLibre.setText("Venta libre");

          jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel5.setText("Precio $");

          ffPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
          ffPrecio.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

          jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel6.setText("Cant. Disponible");

          spnCantDisponible.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
          spnCantDisponible.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

          jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel7.setText("Tipo de Farmaco");

          cboTipoFarmaco.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
          cboTipoFarmaco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analgesico", "Antiacido", "Antialergico", "Antidepresivo", "Antiinflamatorio", "Antipiretico" }));

          btnRegistrarProducto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
          btnRegistrarProducto.setText("Registrar");
          btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRegistrarProductoActionPerformed(evt);
               }
          });

          jtInventarioTotal.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
          jtInventarioTotal.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "ID", "Nombre", "Precio", "Cant. Disponible", "Tipo Venta"
               }
          ) {
               boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
               };

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
               }
          });
          jScrollPane1.setViewportView(jtInventarioTotal);
          if (jtInventarioTotal.getColumnModel().getColumnCount() > 0) {
               jtInventarioTotal.getColumnModel().getColumn(0).setResizable(false);
               jtInventarioTotal.getColumnModel().getColumn(1).setResizable(false);
               jtInventarioTotal.getColumnModel().getColumn(2).setResizable(false);
               jtInventarioTotal.getColumnModel().getColumn(3).setResizable(false);
               jtInventarioTotal.getColumnModel().getColumn(4).setResizable(false);
          }

          jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel8.setText("Mostrar");

          cboIndexInventario.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
          cboIndexInventario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analgesicos", "Antiacidos", "Antialergicos", "Antidepresivos", "Antiinflamatorios", "Antipireticos" }));
          cboIndexInventario.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cboIndexInventarioActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jLabel1)
                                   .addComponent(jLabel4)
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                  .addComponent(jLabel2)
                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                  .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                  .addGap(12, 12, 12)
                                                  .addComponent(jLabel3)
                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                  .addComponent(ffIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                  .addComponent(jLabel5)
                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                  .addComponent(ffPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                  .addComponent(jLabel6)
                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                  .addComponent(spnCantDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboTipoFarmaco, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGap(37, 37, 37)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                   .addComponent(btnRegistrarProducto)
                                   .addComponent(rbSoloReceta))
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(rbVentaLibre))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboIndexInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70))))))
               .addComponent(jScrollPane1)
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel2)
                         .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel5)
                         .addComponent(ffPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel3)
                         .addComponent(ffIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel6)
                         .addComponent(spnCantDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel7)
                         .addComponent(cboTipoFarmaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(rbSoloReceta)
                         .addComponent(rbVentaLibre))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(btnRegistrarProducto)
                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel8)
                              .addComponent(cboIndexInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(13, 13, 13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
          );

          jTabbedPane1.addTab("Inventario", jPanel1);

          jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
          jLabel9.setText("Registrar Nuevo Producto");

          jtProductosVenta.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
          jtProductosVenta.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "ID", "Nombre", "Precio", "Cant. Disponible", "Tipo Venta"
               }
          ) {
               boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
               };

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
               }
          });
          jtProductosVenta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
          jtProductosVenta.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mousePressed(java.awt.event.MouseEvent evt) {
                    jtProductosVentaMousePressed(evt);
               }
          });
          jScrollPane2.setViewportView(jtProductosVenta);
          if (jtProductosVenta.getColumnModel().getColumnCount() > 0) {
               jtProductosVenta.getColumnModel().getColumn(0).setResizable(false);
               jtProductosVenta.getColumnModel().getColumn(1).setResizable(false);
               jtProductosVenta.getColumnModel().getColumn(2).setResizable(false);
               jtProductosVenta.getColumnModel().getColumn(3).setResizable(false);
               jtProductosVenta.getColumnModel().getColumn(4).setResizable(false);
          }

          jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel10.setText("Nombre Cliente");

          txtNombreProducto1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

          jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel11.setText("Fecha de Compra");

          jSpinner1.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
          jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1587702696242L), null, java.util.Calendar.DAY_OF_MONTH));

          jLabel12.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel12.setText("Cantidad");

          spnCantCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
          spnCantCliente.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
          spnCantCliente.addChangeListener(new javax.swing.event.ChangeListener() {
               public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spnCantClienteStateChanged(evt);
               }
          });

          jLabel13.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel13.setText("Total");

          txtTotalVenta.setEditable(false);
          txtTotalVenta.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

          jLabel14.setFont(new java.awt.Font("Liberation Sans", 3, 14)); // NOI18N
          jLabel14.setText("Seleccione el producto a vender y automaticamente obtendra el precio*");

          jLabel15.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
          jLabel15.setText("Mostrar");

          cboIndexVenta.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
          cboIndexVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analgesicos", "Antiacidos", "Antialergicos", "Antidepresivos", "Antiinflamatorios", "Antipireticos" }));
          cboIndexVenta.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cboIndexVentaActionPerformed(evt);
               }
          });

          jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
          jButton1.setText("Realizar Venta");

          javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
          jPanel2.setLayout(jPanel2Layout);
          jPanel2Layout.setHorizontalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel2Layout.createSequentialGroup()
                              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner1))
                                   .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jLabel9)
                                             .addGroup(jPanel2Layout.createSequentialGroup()
                                                  .addComponent(jLabel10)
                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                  .addComponent(txtNombreProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addGroup(jPanel2Layout.createSequentialGroup()
                                                  .addComponent(jLabel12)
                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                  .addComponent(spnCantCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addGap(23, 23, 23)
                                                  .addComponent(jButton1)))
                                        .addGap(87, 87, 87)))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel13)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(49, 49, 49))
                         .addGroup(jPanel2Layout.createSequentialGroup()
                              .addComponent(jLabel14)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel15)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(cboIndexVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addContainerGap())))
          );
          jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel9)
                         .addComponent(jLabel13)
                         .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel10)
                         .addComponent(txtNombreProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel11)
                         .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel12)
                         .addComponent(spnCantCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jButton1))
                    .addGap(42, 42, 42)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel14)
                         .addComponent(jLabel15)
                         .addComponent(cboIndexVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addGap(171, 171, 171))
          );

          jTabbedPane1.addTab("Realizar Venta", jPanel2);

          getContentPane().add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
          if (this.rbSoloReceta.isSelected()) {
               this.tipoVenta = this.rbSoloReceta.getText();
          } else {
               this.tipoVenta = this.rbVentaLibre.getText();
          }
          switch (this.cboTipoFarmaco.getSelectedIndex()) {
               case 0:
                    this.analgesico = new Analgesico(this.ffIdProducto.getText(), this.txtNombreProducto.getText().toUpperCase(),
                            this.tipoVenta, Double.parseDouble(this.ffPrecio.getText()), (int) this.spnCantDisponible.getValue());
                    this.inventario.agregarAnalgesico(analgesico);
                    break;
               case 1:
                    this.antiacido = new Antiacido(this.ffIdProducto.getText(), this.txtNombreProducto.getText().toUpperCase(),
                            this.tipoVenta, Double.parseDouble(this.ffPrecio.getText()), (int) this.spnCantDisponible.getValue());
                    this.inventario.agregarAntiacido(antiacido);
                    break;
               case 2:
                    this.antialergico = new Antialergico(this.ffIdProducto.getText(), this.txtNombreProducto.getText().toUpperCase(),
                            this.tipoVenta, Double.parseDouble(this.ffPrecio.getText()), (int) this.spnCantDisponible.getValue());
                    this.inventario.agregarAntialergicos(antialergico);
                    break;
               case 3:
                    this.antidepresivo = new Antidepresivo(this.ffIdProducto.getText(), this.txtNombreProducto.getText().toUpperCase(),
                            this.tipoVenta, Double.parseDouble(this.ffPrecio.getText()), (int) this.spnCantDisponible.getValue());
                    this.inventario.agregarAntidepresivos(antidepresivo);
                    break;
               case 4:
                    this.antiinflamatorio = new Antiinflamatorio(this.ffIdProducto.getText(), this.txtNombreProducto.getText().toUpperCase(),
                            this.tipoVenta, Double.parseDouble(this.ffPrecio.getText()), (int) this.spnCantDisponible.getValue());
                    this.inventario.agregarAntiinflamatorio(antiinflamatorio);
                    break;
               case 5:
                    this.antipiretico = new Antipiretico(this.ffIdProducto.getText(), this.txtNombreProducto.getText().toUpperCase(),
                            this.tipoVenta, Double.parseDouble(this.ffPrecio.getText()), (int) this.spnCantDisponible.getValue());
                    this.inventario.agregarAntipireticos(antipiretico);
                    break;
          }
          this.actualizarTablaInventario();
          this.actualizarTablaVenta();
     }//GEN-LAST:event_btnRegistrarProductoActionPerformed

     private void cboIndexInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIndexInventarioActionPerformed
          this.actualizarTablaInventario();
          this.actualizarTablaVenta();
     }//GEN-LAST:event_cboIndexInventarioActionPerformed

     private void cboIndexVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIndexVentaActionPerformed
          this.actualizarTablaVenta();
     }//GEN-LAST:event_cboIndexVentaActionPerformed

     private void jtProductosVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosVentaMousePressed
          this.obtenerPrecioLista();
     }//GEN-LAST:event_jtProductosVentaMousePressed

     private void spnCantClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantClienteStateChanged
          this.obtenerPrecioLista();
     }//GEN-LAST:event_spnCantClienteStateChanged

     private void obtenerPrecioLista() {
          switch (this.cboIndexVenta.getSelectedIndex()) {
               case 0:
                    this.precioFarmaco = this.inventario.getlAnalgesicos().get(this.jtProductosVenta.getSelectedRow()).getPrecio();
                    this.totalVenta = this.precioFarmaco * (int) this.spnCantCliente.getValue();
                    break;
               case 1:
                    this.precioFarmaco = this.inventario.getlAntiacidos().get(this.jtProductosVenta.getSelectedRow()).getPrecio();
                    break;
               case 2:
                    this.precioFarmaco = this.inventario.getlAnalgesicos().get(this.jtProductosVenta.getSelectedRow()).getPrecio();
                    break;
               case 3:
                    this.precioFarmaco = this.inventario.getlAntidepresivos().get(this.jtProductosVenta.getSelectedRow()).getPrecio();
                    break;
               case 4:
                    this.precioFarmaco = this.inventario.getlAntiinflamatorios().get(this.jtProductosVenta.getSelectedRow()).getPrecio();
                    break;
               case 5:
                    this.precioFarmaco = this.inventario.getlAntipireticos().get(this.jtProductosVenta.getSelectedRow()).getPrecio();
                    break;

          }
          this.totalVenta = this.precioFarmaco * (int) this.spnCantCliente.getValue();
          this.actualizarTxtPrecio();
     }

     private void actualizarTxtPrecio() {
          this.txtTotalVenta.setText("$ " + df.format(totalVenta));
     }

     private void actualizarTablaVenta() {
          this.tablaModelo = (DefaultTableModel) this.jtProductosVenta.getModel();
          this.tablaModelo.getDataVector().removeAllElements();
          this.tablaModelo.fireTableDataChanged();

          switch (this.cboIndexVenta.getSelectedIndex()) {
               case 0:
                    for (int i = 0; i < this.inventario.getlAnalgesicos().size(); i++) {
                         String datos[] = {this.inventario.getlAnalgesicos().get(i).getIdProducto(), this.inventario.getlAnalgesicos().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAnalgesicos().get(i).getPrecio()), String.valueOf(this.inventario.getlAnalgesicos().get(i).getCantDisponible()),
                              this.inventario.getlAnalgesicos().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
               case 1:
                    for (int i = 0; i < this.inventario.getlAntiacidos().size(); i++) {
                         String datos[] = {this.inventario.getlAntiacidos().get(i).getIdProducto(), this.inventario.getlAntiacidos().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAntiacidos().get(i).getPrecio()), String.valueOf(this.inventario.getlAntiacidos().get(i).getCantDisponible()),
                              this.inventario.getlAntiacidos().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
               case 2:
                    for (int i = 0; i < this.inventario.getlAntialergicos().size(); i++) {
                         String datos[] = {this.inventario.getlAntialergicos().get(i).getIdProducto(), this.inventario.getlAntialergicos().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAntialergicos().get(i).getPrecio()), String.valueOf(this.inventario.getlAntialergicos().get(i).getCantDisponible()),
                              this.inventario.getlAntialergicos().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
               case 3:
                    for (int i = 0; i < this.inventario.getlAntidepresivos().size(); i++) {
                         String datos[] = {this.inventario.getlAntidepresivos().get(i).getIdProducto(), this.inventario.getlAntidepresivos().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAntidepresivos().get(i).getPrecio()), String.valueOf(this.inventario.getlAntidepresivos().get(i).getCantDisponible()),
                              this.inventario.getlAntidepresivos().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
               case 4:
                    for (int i = 0; i < this.inventario.getlAntiinflamatorios().size(); i++) {
                         String datos[] = {this.inventario.getlAntiinflamatorios().get(i).getIdProducto(), this.inventario.getlAntiinflamatorios().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAntiinflamatorios().get(i).getPrecio()), String.valueOf(this.inventario.getlAntiinflamatorios().get(i).getCantDisponible()),
                              this.inventario.getlAntiinflamatorios().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
               case 5:
                    for (int i = 0; i < this.inventario.getlAntipireticos().size(); i++) {
                         String datos[] = {this.inventario.getlAntipireticos().get(i).getIdProducto(), this.inventario.getlAntipireticos().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAntipireticos().get(i).getPrecio()), String.valueOf(this.inventario.getlAntipireticos().get(i).getCantDisponible()),
                              this.inventario.getlAntipireticos().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
          }

     }

     private void actualizarTablaInventario() {
          this.tablaModelo = (DefaultTableModel) this.jtInventarioTotal.getModel();
          this.tablaModelo.getDataVector().removeAllElements();
          this.tablaModelo.fireTableDataChanged();

          switch (this.cboIndexInventario.getSelectedIndex()) {
               case 0:
                    for (int i = 0; i < this.inventario.getlAnalgesicos().size(); i++) {
                         String datos[] = {this.inventario.getlAnalgesicos().get(i).getIdProducto(), this.inventario.getlAnalgesicos().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAnalgesicos().get(i).getPrecio()), String.valueOf(this.inventario.getlAnalgesicos().get(i).getCantDisponible()),
                              this.inventario.getlAnalgesicos().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
               case 1:
                    for (int i = 0; i < this.inventario.getlAntiacidos().size(); i++) {
                         String datos[] = {this.inventario.getlAntiacidos().get(i).getIdProducto(), this.inventario.getlAntiacidos().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAntiacidos().get(i).getPrecio()), String.valueOf(this.inventario.getlAntiacidos().get(i).getCantDisponible()),
                              this.inventario.getlAntiacidos().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
               case 2:
                    for (int i = 0; i < this.inventario.getlAntialergicos().size(); i++) {
                         String datos[] = {this.inventario.getlAntialergicos().get(i).getIdProducto(), this.inventario.getlAntialergicos().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAntialergicos().get(i).getPrecio()), String.valueOf(this.inventario.getlAntialergicos().get(i).getCantDisponible()),
                              this.inventario.getlAntialergicos().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
               case 3:
                    for (int i = 0; i < this.inventario.getlAntidepresivos().size(); i++) {
                         String datos[] = {this.inventario.getlAntidepresivos().get(i).getIdProducto(), this.inventario.getlAntidepresivos().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAntidepresivos().get(i).getPrecio()), String.valueOf(this.inventario.getlAntidepresivos().get(i).getCantDisponible()),
                              this.inventario.getlAntidepresivos().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
               case 4:
                    for (int i = 0; i < this.inventario.getlAntiinflamatorios().size(); i++) {
                         String datos[] = {this.inventario.getlAntiinflamatorios().get(i).getIdProducto(), this.inventario.getlAntiinflamatorios().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAntiinflamatorios().get(i).getPrecio()), String.valueOf(this.inventario.getlAntiinflamatorios().get(i).getCantDisponible()),
                              this.inventario.getlAntiinflamatorios().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
               case 5:
                    for (int i = 0; i < this.inventario.getlAntipireticos().size(); i++) {
                         String datos[] = {this.inventario.getlAntipireticos().get(i).getIdProducto(), this.inventario.getlAntipireticos().get(i).getNombre(),
                              String.valueOf(this.inventario.getlAntipireticos().get(i).getPrecio()), String.valueOf(this.inventario.getlAntipireticos().get(i).getCantDisponible()),
                              this.inventario.getlAntipireticos().get(i).getTipoVenta()};
                         this.tablaModelo.addRow(datos);

                    }
                    break;
          }

     }

     private void cargarDatosAnalgesicos() {
          this.tablaModelo = (DefaultTableModel) this.jtInventarioTotal.getModel();

     }
     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton btnRegistrarProducto;
     private javax.swing.ButtonGroup btngTipoVenta;
     private javax.swing.JComboBox<String> cboIndexInventario;
     private javax.swing.JComboBox<String> cboIndexVenta;
     private javax.swing.JComboBox<String> cboTipoFarmaco;
     private javax.swing.JFormattedTextField ffIdProducto;
     private javax.swing.JFormattedTextField ffPrecio;
     private javax.swing.JButton jButton1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel10;
     private javax.swing.JLabel jLabel11;
     private javax.swing.JLabel jLabel12;
     private javax.swing.JLabel jLabel13;
     private javax.swing.JLabel jLabel14;
     private javax.swing.JLabel jLabel15;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JLabel jLabel8;
     private javax.swing.JLabel jLabel9;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JSpinner jSpinner1;
     private javax.swing.JTabbedPane jTabbedPane1;
     private javax.swing.JTable jtInventarioTotal;
     private javax.swing.JTable jtProductosVenta;
     private javax.swing.JRadioButton rbSoloReceta;
     private javax.swing.JRadioButton rbVentaLibre;
     private javax.swing.JSpinner spnCantCliente;
     private javax.swing.JSpinner spnCantDisponible;
     private javax.swing.JTextField txtNombreProducto;
     private javax.swing.JTextField txtNombreProducto1;
     private javax.swing.JTextField txtTotalVenta;
     // End of variables declaration//GEN-END:variables
}
