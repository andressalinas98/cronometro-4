
package Cronos.logica;

public class Memoria {
    private UnidadTeimpo decimas,segundos,minutos,horas;

    public UnidadTeimpo getDecimas() {
        return decimas;
    }

    public void setDecimas(UnidadTeimpo decimas) {
        this.decimas = decimas;
    }

    public UnidadTeimpo getSegundos() {
        return segundos;
    }

    public void setSegundos(UnidadTeimpo segundos) {
        this.segundos = segundos;
    }

    public UnidadTeimpo getMinutos() {
        return minutos;
    }

    public void setMinutos(UnidadTeimpo minutos) {
        this.minutos = minutos;
    }

    public UnidadTeimpo getHoras() {
        return horas;
    }

    public void setHoras(UnidadTeimpo horas) {
        this.horas = horas;
    }
    
    public String PrintTiempo() {
        return horas.getValor() + " : " +
                minutos.getValor() + " : " +
                segundos.getValor() + " : " +
                decimas.getValor();
    }
    
    public Memoria (){
        
    }
}
