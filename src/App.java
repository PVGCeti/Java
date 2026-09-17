import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Personas[] misPersonas = DAOPersonas.generarDatos();
        Bote[] misBotes = DAOBotes.generarBotes();

        // 1 - Hacer un filtro para separarlos por zonas tanto botes como personas [Proa, Estibor, Popa, Babor]
        Personas[] personasProa = Arrays.stream(misPersonas)
            .filter(n -> Personas.ZonaDelBarco.Proa.equals(n.zonaDelBarco))
            .toArray(Personas[]::new);

        Personas[] personasEstribor = Arrays.stream(misPersonas)
            .filter(n -> Personas.ZonaDelBarco.Estribor.equals(n.zonaDelBarco))
            .toArray(Personas[]::new);

        Personas[] personasPopa = Arrays.stream(misPersonas)
            .filter(n -> Personas.ZonaDelBarco.Popa.equals(n.zonaDelBarco))
            .toArray(Personas[]::new);

        Personas[] personasBabor = Arrays.stream(misPersonas)
            .filter(n -> Personas.ZonaDelBarco.Babor.equals(n.zonaDelBarco))
            .toArray(Personas[]::new);

        // 2 - Hacer un sort por edad
        // 3 - Agrupar a los menores con sus hermanos y un adulto
        // 4 - Crear el orden de llamada siguiendo los requisitos
        // 5 - Llamar a los pasajeros a sus respectivos bottes

    }
}
