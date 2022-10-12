/**
 * Clase Comunes, para definir metodos p�blicos.
 */
package ejercicios;

/**
 * @author agustin
 * @version 12 oct. 2022
 */
public class Comunes {

	/**
	 * Metodo que verifica si la cadena es n�merica
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
