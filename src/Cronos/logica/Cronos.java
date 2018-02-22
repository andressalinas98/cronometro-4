
package Cronos.logica;

import java.util.ArrayList;
import java.util.Iterator;

public class Cronos {
    
    private UnidadTeimpo decimas,segundos,minutos,horas;
    
    private ArrayList<Memoria>memorias;

    public Cronos() {
        decimas = new UnidadTeimpo(10);
        segundos = new UnidadTeimpo(60);
        minutos = new UnidadTeimpo(60);
        //horas = new Tiempo();
                        
    }
    
    

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
    
    public void sumar(){
        decimas.Sumar();
        if (decimas.getValor()==0) {
            segundos.Sumar();
            if (segundos.getValor()==0) {
                minutos.Sumar();
                if (minutos.getValor()==0) {
                    horas.Sumar();
                }
            }
        }
    }
    
    public String PrintTiempo() {
        return horas.getValor() + " : " +
                minutos.getValor() + " : " +
                segundos.getValor() + " : " +
                decimas.getValor();
    }
    
    public void Guardar () {
        Memoria mem = new Memoria();
        mem.setDecimas(decimas);
        mem.setSegundos(segundos);
        mem.setMinutos(minutos);
        mem.setHoras(horas);
    }
    
    public void PrintMem(){
        for (Iterator<Memoria> iterator = memorias.iterator(); iterator.hasNext();) {
            Memoria next = iterator.next();
            System.out.println(next.PrintTiempo());
        }
    }
    
}
