package patronobserver;

public class PatronObserver {

    public static void main(String[] args) {
        // Cree observadores
        Alumno1 obs1 = new Alumno1();
        Alumno2 obs2 = new Alumno2();
        Alumno2 obs3 = new Alumno2();
        
        // Cree observado
        Profesor profesor = new Profesor();
        profesor.agregarObservador(obs1);
        profesor.agregarObservador(obs2);
        profesor.agregarObservador(obs3);
        
        // Metodo que PROBABLEMENTE llame el evento que iniciara el trabajo de los observadores
        profesor.dictarClase();
    }
    
}
