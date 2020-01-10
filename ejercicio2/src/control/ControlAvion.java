/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import modelo.Avion;
import modelo.Bulto;
/**
 *
 * @author Anderson
 */
public class ControlAvion {
    public Avion objAvion = new Avion();
    
    public boolean validarAgregar(double pesoPorBulto){
        double pesoAcumuladoTemporal = objAvion.getPesoAcumulado() + pesoPorBulto;
        if (pesoAcumuladoTemporal<=objAvion.getCapacidadMaxima() && pesoPorBulto<=objAvion.getPesoMaximoBulto()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void agregarBulto(double pesoBulto, double precioEnCop, double precioEnDolar) {
        objAvion.setPesoAcumulado(objAvion.getPesoAcumulado()+pesoBulto);
        objAvion.setContador(objAvion.getContador()+1);
        Bulto objBulto = new Bulto(pesoBulto, precioEnCop, precioEnDolar);
        objAvion.agregarBulto(objBulto);
    }
}
