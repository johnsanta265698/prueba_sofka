package modelo;
import modelo.Bulto;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Anderson
 */
public class Avion {
    int capacidadMaxima = 18000;
    int pesoMaximoBulto = 500;
    private double pesoAcumulado = 0;
    private int contador=0;
    
    private List<Bulto> bultos = new ArrayList<Bulto>();

    public List<Bulto> getBultos() {
        return bultos;
    }
    
    public void agregarBulto(Bulto bulto) {
        this.bultos.add(bulto);
    }
    
    public double getPesoAcumulado() {
        return pesoAcumulado;
    }

    public void setPesoAcumulado(double pesoAcumulado) {
        this.pesoAcumulado = pesoAcumulado;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getPesoMaximoBulto() {
        return pesoMaximoBulto;
    }
    
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public Avion() {
        
    }
    
}