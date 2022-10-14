/**
 * Clase Comunes, para definir metodos p�blicos.
 */
package ejercicios;

import java.io.IOException;

/**
 * @author agustin
 * @version 12 oct. 2022
 */
public class Comunes {

	/**
	 * M�todo que verifica si la cadena es n�merica
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
	 * M�todo que muestra por pantalla un t�tulo
	 */
	public static void titulo(String cadena, String raya) {
		if (cadena != null && cadena.length() > 0) {
			System.out.println("\t" + cadena);
			linea(raya, cadena.length());
		}
	}

	/**
	 * M�todo que muestra por pantalla un t�tulo
	 */
	public static void linea(String caracter, int largo) {
		if (caracter != null && caracter.length() > 0) {
			System.out.println("\t" + caracter.repeat(largo));
		}
	}
}
