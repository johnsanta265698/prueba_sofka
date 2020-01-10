
package control;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Bulto;
/**
 *
 * @author Anderson
 */
public class Procesos {
    //La capacidad maxima se mide en Kg
    int capacidadMaximaCarga = 18000;
    int capacidadMaximaBulto = 500;
    double dolar = 3256;
    
    public double capturarDatos(){
       double pesoBulto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso de bulto"));
       return pesoBulto;
    }
    
    public double calcularPromedio(int cantidadBultos, double pesoCarga){
        double promedio = pesoCarga/cantidadBultos;
        return promedio;
    }
    
    public double calcularPrecioCop(double pesoBulto){
        double precio=0;
        if (pesoBulto>=0 && pesoBulto<=25) {
            precio=0;
        } else if(pesoBulto>=26 && pesoBulto<=300){
            precio = 1500*pesoBulto;
        }else if(pesoBulto>=301 && pesoBulto<=500){
            precio = 2500*pesoBulto;
        }
        return precio;
    }
    
    public double convertirADolar(double pesoCop){
        double valorEnUsd = pesoCop/this.dolar;
        return valorEnUsd;
    }
    
    public double menosPesado(List<Bulto> bultos){
        double menosPesado = capacidadMaximaBulto;
        for (Bulto bulto : bultos) {
            if (bulto.getPeso()<menosPesado) {
                menosPesado=bulto.getPeso();
            }
        }
        return menosPesado;
    }
    
    public double masPesado(List<Bulto> bultos){
        double masPesado = 0;
        for (Bulto bulto : bultos) {
            if (bulto.getPeso()>masPesado) {
                masPesado=bulto.getPeso();
            }
        }
        return masPesado;
    }
    
    public double valorTotalCop(List<Bulto> bultos){
        double total=0;
        for (Bulto bulto : bultos) {
            total+=bulto.getPrecioEnCop();
        }
        return total;
    }
    
    public double valorTotalUsd(List<Bulto> bultos){
        double total=0;
        for (Bulto bulto : bultos) {
            total+=bulto.getPrecioEnDolar();
        }
        return total;
    }
}
