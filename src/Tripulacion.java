import java.util.Date;

public class Tripulacion extends Personas {
	private String nivelSeguridad;
	
    public Tripulacion(String DNI, Pais pais, ZonaDelBarco zonaDelBarco, String nombre, boolean minusvalia, Date fecha, String nivelSeguridad) {

        super(DNI, pais, zonaDelBarco, nombre, minusvalia, fecha);
        this.setNivelSeguridad(nivelSeguridad);
    }

	public String getNivelSeguridad() {
		return nivelSeguridad;
	}

	public void setNivelSeguridad(String nivelSeguridad) {
		this.nivelSeguridad = nivelSeguridad;
	}
}