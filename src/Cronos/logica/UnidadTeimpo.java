
package Cronos.logica;

public class UnidadTeimpo {
    
    private int max;
    private int valor;

    public UnidadTeimpo(int max) {
        this.max = max;
        this.valor=0;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void Sumar() {
        valor++;
        if (valor == max) valor = 0;
    }
    
    public String Print () {
        if (this.valor < 10) {
            return "0" + this.valor;
        } else {
            return String.valueOf(valor);
        }
    }
    
}
