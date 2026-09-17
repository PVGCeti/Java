public class Bote {
    int identificador;
    int plazas;
    Personas.ZonaDelBarco zonaDelBarco;

    public Bote(int identificador, int plazas, Personas.ZonaDelBarco zonaDelBarco) {
        this.identificador = identificador;
        this.plazas = plazas;
        this.zonaDelBarco = zonaDelBarco;

    }

    public String toString(){
        return "\n\nDatos del bote: \nIdentificador: " + this.identificador + "\nPlazas totales: " + this.plazas + "\nZona situada: " + this.zonaDelBarco;
    }
}
