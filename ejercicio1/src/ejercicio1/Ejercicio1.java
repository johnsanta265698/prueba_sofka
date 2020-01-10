package ejercicio1;
import ejercicio1.Cliente;
import ejercicio1.Procesos;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Procesos objProcesos = new Procesos();
        
        int diasEstancia = objProcesos.capturarDatos("Ingrese días de estancia");
        int distanciaRecorrida = objProcesos.capturarDatos("Ingrese distancia recorrida");
        double ticketNeto = objProcesos.ticketNeto(distanciaRecorrida);
        double ticketConDescuento = objProcesos.impactarDescuento(diasEstancia, distanciaRecorrida, ticketNeto);
        Cliente objCliente = new Cliente(distanciaRecorrida, diasEstancia, ticketConDescuento);
        
        JOptionPane.showMessageDialog(null, "El valor del pasaje de avion es "+objCliente.getValorTicket());
    }
    
}
