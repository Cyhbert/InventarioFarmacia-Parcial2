package Entidades.Farmacos;

public class Antiacido extends Farmaco {
     
     String tipoProducto;
     
     public Antiacido(String idProducto, String nombreProducto, String tipoVenta, double precio, int cantDisponible ) {
          super.setIdProducto(idProducto);
          super.setNombre(nombreProducto);
          super.setTipoVenta(tipoVenta);
          super.setPrecio(precio);
          super.setCantDisponible(cantDisponible);
          this.tipoProducto = "Antiacido";
     }

     public String getTipoProducto() {
          return tipoProducto;
     }

     public void setTipoProducto(String tipoProducto) {
          this.tipoProducto = tipoProducto;
     }
     
     
}
