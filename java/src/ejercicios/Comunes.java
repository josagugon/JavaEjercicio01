/**
 * Clase Comunes, para definir metodos públicos.
 */
package ejercicios;

/**
 * @author agustin
 * @version 12 oct. 2022
 */
public class Comunes {

	/**
	 * Metodo que verifica si la cadena es númerica
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
}
