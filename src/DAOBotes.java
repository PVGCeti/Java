public class DAOBotes {
    
    public static Bote[] generarBotes(){
        Bote[] lista = new Bote[10];

        Personas.ZonaDelBarco[] zonas = {
            Personas.ZonaDelBarco.Babor,
            Personas.ZonaDelBarco.Estribor,
            Personas.ZonaDelBarco.Popa,
            Personas.ZonaDelBarco.Proa,
        };

        for(int i=0; i<lista.length; i++){
            lista[i] = new Bote(
                (int) (Math.random()*100000)+1, 
                (int) (Math.random()*20)+1, 
                zonas[(int) (Math.random()*4)]);
        }


        return lista;
    }
}
