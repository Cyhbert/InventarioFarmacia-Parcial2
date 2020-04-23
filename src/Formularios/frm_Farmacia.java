package Formularios;

import Entidades.Farmacos.*;
import Entidades.Inventario.Inventario;

public class frm_Farmacia extends javax.swing.JFrame {

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
          this.setLocationRelativeTo(null);
          this.setTitle("Farmacias Similares");
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jTabbedPane1 = new javax.swing.JTabbedPane();
          jpRegistrarProducto = new javax.swing.JPanel();
          jpInventario = new javax.swing.JPanel();
          jpRealizarVenta = new javax.swing.JPanel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          javax.swing.GroupLayout jpRegistrarProductoLayout = new javax.swing.GroupLayout(jpRegistrarProducto);
          jpRegistrarProducto.setLayout(jpRegistrarProductoLayout);
          jpRegistrarProductoLayout.setHorizontalGroup(
               jpRegistrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 941, Short.MAX_VALUE)
          );
          jpRegistrarProductoLayout.setVerticalGroup(
               jpRegistrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 571, Short.MAX_VALUE)
          );

          jTabbedPane1.addTab("Agregar Producto", jpRegistrarProducto);

          javax.swing.GroupLayout jpInventarioLayout = new javax.swing.GroupLayout(jpInventario);
          jpInventario.setLayout(jpInventarioLayout);
          jpInventarioLayout.setHorizontalGroup(
               jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 941, Short.MAX_VALUE)
          );
          jpInventarioLayout.setVerticalGroup(
               jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 571, Short.MAX_VALUE)
          );

          jTabbedPane1.addTab("Inventario", jpInventario);

          javax.swing.GroupLayout jpRealizarVentaLayout = new javax.swing.GroupLayout(jpRealizarVenta);
          jpRealizarVenta.setLayout(jpRealizarVentaLayout);
          jpRealizarVentaLayout.setHorizontalGroup(
               jpRealizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 941, Short.MAX_VALUE)
          );
          jpRealizarVentaLayout.setVerticalGroup(
               jpRealizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 571, Short.MAX_VALUE)
          );

          jTabbedPane1.addTab("Realizar Venta", jpRealizarVenta);

          getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

          pack();
     }// </editor-fold>//GEN-END:initComponents


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JTabbedPane jTabbedPane1;
     private javax.swing.JPanel jpInventario;
     private javax.swing.JPanel jpRealizarVenta;
     private javax.swing.JPanel jpRegistrarProducto;
     // End of variables declaration//GEN-END:variables
}
