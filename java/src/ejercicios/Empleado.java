/**
 * Clase Empleados del Ejercicio05
 */
package ejercicios;

/**
 * @author agustin
 * @version 2022.10.11
 */
public class Empleado {

    /**
	 * Atributos de la clase Persona
	 */
	private int dni;
	private String nombre;
	private String apellido;
	
	/**
	 * Constructor con todos los atributos
	 * @param dni
	 * @param nombre
	 * @param apellido
	 */
	public Empleado(int dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	/**
	 * Devuelve toda la información del objeto.
	 */
    public String toString() {
        return dni + "," + nombre + "," + apellido;
    }
}
