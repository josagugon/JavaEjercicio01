/**
 * Clase Comunes, para definir metodos públicos.
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 15 oct. 2022
 */
public class Comunes {

	static Scanner teclado = new Scanner(System.in);

	/**
	 * Método que verifica si la cadena es númerica
	 */
	public static boolean esNumero(String cadena) {
		if (cadena == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(cadena);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	/**
	 * Método que muestra por pantalla un título
	 */
	public static void titulo(String cadena, String raya) {
		if (cadena != null && cadena.length() > 0) {
			System.out.println("\t" + cadena);
			linea(raya, cadena.length());
		}
	}

	/**
	 * Método que muestra por pantalla un título
	 */
	public static void linea(String caracter, int largo) {
		if (caracter != null && caracter.length() > 0) {
			System.out.println("\t" + caracter.repeat(largo));
		}
	}

	/**
	 * Método para verificar si continua
	 */
	public static long continua() {
		System.out.print("Si desea terminar presione 0 : ");
		String ing = teclado.nextLine();

		// Verifica si es númerico
		if (Comunes.esNumero(ing)) {
			return Long.parseLong(ing);
		} else {
			return 1;
		}
	}
}
