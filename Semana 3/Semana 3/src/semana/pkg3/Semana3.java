package semana.pkg3;

public class Semana3 {

    public static void main(String[] args) {
        Persona persona = new Persona("Matias", "Weisz");
        Ciudadano ciudadano = new Ciudadano("Juan Pablo", "Fernandez", "Mendoza", 42750925);

        System.out.println(persona.getNombre());
        System.out.println(ciudadano.getApellido());
    }
}
