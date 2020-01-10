package ejercicio1;
/**
 *
 * @author Anderson
 */
public class Cliente {
    private int distanciaRecorrida;
    private int diasEstancia;
    private double valorTicket;
    

    public Cliente() {
    }

    public Cliente(int distanciaRecorrida, int diasEstancia, double valorTicket) {
        this.distanciaRecorrida = distanciaRecorrida;
        this.diasEstancia = diasEstancia;
        this.valorTicket = valorTicket;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getDiasEstancia() {
        return diasEstancia;
    }

    public void setDiasEstancia(int diasEstancia) {
        this.diasEstancia = diasEstancia;
    }

    public double getValorTicket() {
        return valorTicket;
    }

    public void setValorTicket(double valorTicket) {
        this.valorTicket = valorTicket;
    }
}
