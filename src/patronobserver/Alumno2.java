package patronobserver;

public class Alumno2 implements Observador{

    @Override
    public void siSeQuedaDormido() {
        //Se ejecutara cuando sucedera el evento quedarse dormido al observadoS
        System.out.println("Alumno 2 ejecutara tarea");
    }
    
}
