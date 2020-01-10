package modelo;

/**
 *
 * @author Anderson
 */
public class Bulto {
    double peso;
    double precioEnCop;
    double precioEnDolar;

    public Bulto(double peso, double precioEnCop, double precioEnDolar) {
        this.peso = peso;
        this.precioEnCop = precioEnCop;
        this.precioEnDolar = precioEnDolar;
    }

    public Bulto() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioEnCop() {
        return precioEnCop;
    }

    public void setPrecioEnCop(double precioEnCop) {
        this.precioEnCop = precioEnCop;
    }

    public double getPrecioEnDolar() {
        return precioEnDolar;
    }

    public void setPrecioEnDolar(double precioEnDolar) {
        this.precioEnDolar = precioEnDolar;
    }
    
}
