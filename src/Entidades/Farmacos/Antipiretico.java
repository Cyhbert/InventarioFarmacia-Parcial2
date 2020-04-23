
package Entidades.Farmacos;

public class Antipiretico extends Farmaco {
     String tipoProducto;

     public Antipiretico(String idProducto, String nombreProducto, String tipoVenta, double precio, int cantDisponible) {
          super.setIdProducto(idProducto);
          super.setNombre(nombreProducto);
          super.setTipoVenta(tipoVenta);
          super.setPrecio(precio);
          super.setCantDisponible(cantDisponible);
          this.tipoProducto = "Antipiretico";
     }

     public String getTipoProducto() {
          return tipoProducto;
     }

     public void setTipoProducto(String tipoProducto) {
          this.tipoProducto = tipoProducto;
     }

}
