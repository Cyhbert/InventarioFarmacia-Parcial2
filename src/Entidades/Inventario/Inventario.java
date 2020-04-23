package Entidades.Inventario;

import Entidades.Farmacos.*;
import java.util.ArrayList;

public class Inventario {

     private ArrayList<Analgesico> lAnalgesicos;
     private ArrayList<Antiacido> lAntiacidos;
     private ArrayList<Antialergico> lAntialergicos;
     private ArrayList<Antidepresivo> lAntidepresivos;
     private ArrayList<Antiinflamatorio> lAntiinflamatorios;
     private ArrayList<Antipiretico> lAntipireticos;

     public Inventario() {
          this.lAnalgesicos = new ArrayList<>();
          this.lAntiacidos = new ArrayList<>();
          this.lAntialergicos = new ArrayList<>();
          this.lAntidepresivos = new ArrayList<>();
          this.lAntiinflamatorios = new ArrayList<>();
          this.lAntipireticos = new ArrayList<>();
     }

     //Metodos
     public void agregarAnalgesico(Analgesico analgesico) {
          this.lAnalgesicos.add(analgesico);
     }

     public void agregarAntiacido(Antiacido antiacido) {
          this.lAntiacidos.add(antiacido);
     }

     public void agregarAntialergicos(Antialergico antialergico) {
          this.lAntialergicos.add(antialergico);
     }

     public void agregarAntidepresivos(Antidepresivo antidepresivo) {
          this.lAntidepresivos.add(antidepresivo);
     }

     public void agregarAntiinflamatorio(Antiinflamatorio antiinflamatorio) {
          this.lAntiinflamatorios.add(antiinflamatorio);
     }

     public void agregarAntipireticos(Antipiretico antipiretico) {
          this.lAntipireticos.add(antipiretico);
     }

     //setters
     public void setlAnalgesicos(ArrayList<Analgesico> lAnalgesicos) {
          this.lAnalgesicos = lAnalgesicos;
     }

     public void setlAntiacidos(ArrayList<Antiacido> lAntiacidos) {
          this.lAntiacidos = lAntiacidos;
     }

     public void setlAntialergicos(ArrayList<Antialergico> lAntialergicos) {
          this.lAntialergicos = lAntialergicos;
     }

     public void setlAntidepresivos(ArrayList<Antidepresivo> lAntidepresivos) {
          this.lAntidepresivos = lAntidepresivos;
     }

     public void setlAntiinflamatorios(ArrayList<Antiinflamatorio> lAntiinflamatorios) {
          this.lAntiinflamatorios = lAntiinflamatorios;
     }

     public void setlAntipireticos(ArrayList<Antipiretico> lAntipireticos) {
          this.lAntipireticos = lAntipireticos;
     }

     //Getters
     public ArrayList<Analgesico> getlAnalgesicos() {
          return lAnalgesicos;
     }

     public ArrayList<Antiacido> getlAntiacidos() {
          return lAntiacidos;
     }

     public ArrayList<Antialergico> getlAntialergicos() {
          return lAntialergicos;
     }

     public ArrayList<Antidepresivo> getlAntidepresivos() {
          return lAntidepresivos;
     }

     public ArrayList<Antiinflamatorio> getlAntiinflamatorios() {
          return lAntiinflamatorios;
     }

     public ArrayList<Antipiretico> getlAntipireticos() {
          return lAntipireticos;
     }

}
