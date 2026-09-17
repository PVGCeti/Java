import java.util.Date;

public class DAOPersonas {

    public static Personas[] generarDatos(){
        Personas[] lista = new Personas[10];

        Personas.Pais[] paises = {
            Personas.Pais.ALEMANIA,
            Personas.Pais.ESPANA,
            Personas.Pais.FRANCIA,
            Personas.Pais.INGLATERRA,
            Personas.Pais.ITALIA,
        };

        
        Personas.ZonaDelBarco[] zonas = {
            Personas.ZonaDelBarco.Babor,
            Personas.ZonaDelBarco.Estribor,
            Personas.ZonaDelBarco.Popa,
            Personas.ZonaDelBarco.Proa,
        };

        for (int i = 0; i < lista.length; i++) {

            lista[i] = new Personas(
                Integer.toString((int) (Math.random()*100000)+1), 
                paises[(int) (Math.random()*5)], 
                zonas[(int) (Math.random()*4)], 
                "Mario", 
                false, 
                new Date());
        }

        return lista;
        
    }
    
}
