import java.util.Date;

public class DAOPersonas {

    public static Personas[] generarDatos(){
        Personas[] lista = new Personas[10];

        for (int i = 0; i < lista.length; i++) {

            int paisAleatorio =((int) (Math.random()*5)+1);
            int zonaAleatoria =((int) (Math.random()*4)+1);
            
            Personas.Pais pais;
            Personas.ZonaDelBarco zona;
            

            switch(paisAleatorio){
                case 1:
                    pais = Personas.Pais.ESPANA;
                    break;
                case 2:
                    pais = Personas.Pais.ALEMANIA;
                    break;
                case 3:
                    pais = Personas.Pais.FRANCIA;
                    break;
                case 4:
                    pais = Personas.Pais.INGLATERRA;
                    break;
                default:
                    pais = Personas.Pais.ITALIA;
            }

            switch(zonaAleatoria){
                case 1:
                    zona = Personas.ZonaDelBarco.Babor;
                    break;
                case 2:
                    zona = Personas.ZonaDelBarco.Babor;
                    break;
                case 3:
                    zona = Personas.ZonaDelBarco.Babor;
                    break;
                default:
                    zona = Personas.ZonaDelBarco.Babor;
            }


            lista[i] = new Personas(
                Integer.toString((int) (Math.random()*100000)+1), 
                pais, 
                zona, 
                "Mario", 
                false, 
                new Date());
        }

        return lista;
        
    }
    
}
