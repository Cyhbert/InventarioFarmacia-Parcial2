package Entidades.Farmacos;

public class Antidepresivo extends Farmaco {
     String tipoProducto;

     public Antidepresivo(String idProducto, String nombreProducto, String tipoVenta, double precio, int cantDisponible) {
          super.setIdProducto(idProducto);
          super.setNombre(nombreProducto);
          super.setTipoVenta(tipoVenta);
          super.setPrecio(precio);
          super.setCantDisponible(cantDisponible);
          this.tipoProducto = "Antidepresivo";
     }

     public String getTipoProducto() {
          return tipoProducto;
     }

     public void setTipoProducto(String tipoProducto) {
          this.tipoProducto = tipoProducto;
     }

     
}
