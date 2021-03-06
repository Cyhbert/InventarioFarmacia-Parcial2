package Entidades.Farmacos;

public class Antialergico extends Farmaco {

     String tipoProducto;

     public Antialergico(String idProducto, String nombreProducto, String tipoVenta, double precio, int cantDisponible) {
          super.setIdProducto(idProducto);
          super.setNombre(nombreProducto);
          super.setTipoVenta(tipoVenta);
          super.setPrecio(precio);
          super.setCantDisponible(cantDisponible);
          this.tipoProducto = "Antialergico";
     }

     public String getTipoProducto() {
          return tipoProducto;
     }

     public void setTipoProducto(String tipoProducto) {
          this.tipoProducto = tipoProducto;
     }

}
