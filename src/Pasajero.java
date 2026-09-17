import java.util.Date;

public class Pasajero extends Personas {
	private int numeroHabitacion;
	
    public Pasajero(String DNI, Pais pais, ZonaDelBarco zonaDelBarco, String nombre, boolean minusvalia, Date fecha, int numeroHabitacion) {

        super(DNI, pais, zonaDelBarco, nombre, minusvalia, fecha);
        this.setNumeroHabitacion(numeroHabitacion);
    }

	public int getNivelSeguridad() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}
}


