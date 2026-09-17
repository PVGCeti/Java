import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Personas miPersona = new Personas("a", Personas.Pais.ESPANA, Personas.ZonaDelBarco.Proa, "Mario", false, new Date());
		Tripulacion miTripulacion = new Tripulacion("a", Personas.Pais.ESPANA, Personas.ZonaDelBarco.Babor, "Fermin", false, new Date(), "Muy alta");

        Bote miBote = new Bote(123, 123, Personas.ZonaDelBarco.Proa);

		System.out.println("Esta es mi persona: " + miPersona.nombre);
		System.out.println("Este es mi seguridad: " + miTripulacion.getNivelSeguridad());
        System.out.println("Este es mi bote: " + miBote.identificador);

        Personas[] misPersonas = DAOPersonas.generarDatos();

        System.out.print(java.util.Arrays.toString(misPersonas));
    }
}
