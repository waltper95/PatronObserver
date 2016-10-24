package patronobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Profesor {

    private List<Observador> observadores;

    //Metodo que nos permite agregar observadores
    public void agregarObservador(Observador observador) {
        if (observadores == null) {
            observadores = new ArrayList<>();
        }
        observadores.add(observador);
    }

    //Metodos que generen el evento
    public void dictarClase() {
        //.. dicta su clase        
        System.out.println("Dictando clase");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }

        //..
        //..
        //Sucedio el evento
        if (Math.random() > 0.5) {
            for (Observador observador : observadores) {
                observador.siSeQuedaDormido();
            }
        }
    }
}
