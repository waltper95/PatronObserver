package patronobserver;

public class Alumno1 implements Observador{

    @Override
    public void siSeQuedaDormido() {
        //Se ejecutara cuando sucedera el evento quedarse dormido al observado
        System.out.println("Alumno 1 ejecutara tarea");
    }
    
}
