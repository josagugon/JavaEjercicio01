/**
 * Dado un String de entrada (frase, texto, etc) calcular la cantidad
 * de veces que aparece una letra dada.
 * Input (Entrada):
 * 		Hola Informatorio Java 2022.
 * 		A
 * Output (Salida):
 * 		4
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
            System.out.println("\t#" + i + " - " + ciudades.get(i));
        }

		// Final
		Comunes.titulo("FIN.", "-");
	}
}
