package Formularios;

public class frm_Farmacia extends javax.swing.JFrame {

     public frm_Farmacia() {
          initComponents();
          this.startFrame();
     }
     
     private void startFrame(){
          this.setEnabled(true);
          this.setVisible(true);
          this.setLocationRelativeTo(null);
          this.setTitle("Farmacias Similares");
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 1090, Short.MAX_VALUE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 531, Short.MAX_VALUE)
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents


     // Variables declaration - do not modify//GEN-BEGIN:variables
     // End of variables declaration//GEN-END:variables
}
