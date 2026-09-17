import java.util.Date;

public class Personas {

    public enum Pais {
        ESPANA,
        FRANCIA,
        ALEMANIA,
        ITALIA,
        INGLATERRA,
    }

    public enum ZonaDelBarco {
        Proa,
        Popa,
        Babor,
        Estribor,
    }
	
	String DNI;
	Pais pais;
	ZonaDelBarco zonaDelBarco;
	String nombre;
	Boolean minusvalia;
	Date fecha;
	

    public Personas(String DNI, Pais pais, ZonaDelBarco zonaDelBarco, String nombre, boolean minusvalia, Date fecha) {
    	this.DNI = DNI;
    	this.pais = pais;
    	this.zonaDelBarco = zonaDelBarco;
        this.nombre = nombre;
        this.minusvalia = minusvalia;
        this.fecha = fecha;
    }
	
    public String toString() {
        return "\n\nDatos de " + nombre + "\nDNI: " + DNI + "\nPais: " + pais + "\nZona del barco: " + zonaDelBarco + (minusvalia ? "\nCon minusvalia" : "\nSin minusvalia") + "\nFecha de nacimiento: " + fecha;
    }

}