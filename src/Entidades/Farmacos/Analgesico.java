
package Entidades.Farmacos;

public class Analgesico extends Farmaco {
     String tipoProducto;
     
     public Analgesico(String idProducto, String nombreProducto, String tipoVenta, double precio, int cantDisponible ) {
          super.setIdProducto(idProducto);
          super.setNombre(nombreProducto);
          super.setTipoVenta(tipoVenta);
          super.setPrecio(precio);
          super.setCantDisponible(cantDisponible);
          this.tipoProducto = "Analgesico";
     }

     public String getTipoProducto() {
          return tipoProducto;
     }

     public void setTipoProducto(String tipoProducto) {
          this.tipoProducto = tipoProducto;
     }
     
     
     
     
}
