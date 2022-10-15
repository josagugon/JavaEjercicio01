/**
 * Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
 * luego imprimir por pantalla el ranking.
 * Input (Entrada):
 *      Bariloche
 *      Córdoba
 *      Resistencia
 * Output (Salida):
 *      #1 - Bariloche
 *      #2 - Córdoba
 *      #3 - Resistencia
 */
package ejercicios;

import java.util.ArrayList;

/**
 * @author agustin
 * @version 15 oct. 2022
 */
public class Ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definición de la variables
	    ArrayList<String> ciudades = new ArrayList<String>();
	    
		Comunes.titulo("CIUDADES FAVORITAS", "=");
		
        ciudades.add("Bariloche");
        ciudades.add("Córdoba");
        ciudades.add("Resistencia");

        // Calcular cuanto se repite la letra.
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("\t#" + (i+1) + " - " + ciudades.get(i));
        }

		// Final
		Comunes.titulo("FIN.", "-");
	}
}
