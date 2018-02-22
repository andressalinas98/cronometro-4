
package cronometrojava;

import Cronos.logica.*;

public class Main {

    public static void main(String[] args) {
        Cronos Kr = new Cronos();
        
        for (int i = 0; i < 1000; i++) {
            Kr.sumar();
            System.out.println(Kr.PrintTiempo());
            if(i % 100 == 0){
                Kr.Guardar();
            }
        }
        System.out.println("Memorias");
        Kr.PrintMem();
    }
    
}
