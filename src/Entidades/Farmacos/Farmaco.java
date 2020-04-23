package Entidades.Farmacos;

public abstract class Farmaco {

     private String idProducto, nombre, tipoVenta;
     private double precio;
     private int cantDisponible;

     //Getters
     public String getIdProducto() {
          return idProducto;
     }

     public String getNombre() {
          return nombre;
     }

     public String getTipoVenta() {
          return tipoVenta;
     }

     public double getPrecio() {
          return precio;
     }

     public int getCantDisponible() {
          return cantDisponible;
     }

     //Setters
     public void setIdProducto(String idProducto) {
          this.idProducto = idProducto;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public void setTipoVenta(String tipoVenta) {
          this.tipoVenta = tipoVenta;
     }

     public void setPrecio(double precio) {
          this.precio = precio;
     }

     public void setCantDisponible(int cantDisponible) {
          this.cantDisponible = cantDisponible;
     }

}
