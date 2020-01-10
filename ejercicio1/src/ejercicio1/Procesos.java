package ejercicio1;

import javax.swing.JOptionPane;

/**
 * Clase encargada de realizar procesos vitales para el correcto funcionamiento del ejercicio
 * @author Anderson
 */
public class Procesos {
    double valorKm = 35.00;
    
    public int capturarDatos(String mensaje){
        int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
    
    public double impactarDescuento(int diasEstancia, int distanciaRecorrida , double valorTicket){
        double ticketConDescuento=0;
        if (diasEstancia>7 && distanciaRecorrida>1000) {
            ticketConDescuento = valorTicket - (valorTicket*0.3);
        } else {
            ticketConDescuento = valorTicket;
        }
        return ticketConDescuento;
    }
    
    public double ticketNeto(int distanciaRecorrida){
        double valorTicket = distanciaRecorrida * this.valorKm;
        return valorTicket;
    }
}
