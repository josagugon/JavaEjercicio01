/**
 * Realizar una función que calcule el factorial de un número dado.
 * Observaciones:
 * Se deberán aplicar estilo de código (Java) y uso de funciones.
 * Se deberá aplicar el concepto de Recursividad.
 */
package ejercicios;

/**
 * @author agustin
 * @version 2022.10.11
 */
public class Ejercicio03 {

	/**
	 * Función recursiva, que calcula el factorial de un número.
	 */
	public static long factorialNumero(long numero) {
		// System.out.println(numero);
		if (numero <= 1) {
			return 1;
		} else {
			return numero * factorialNumero(numero - 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Valor máximo es 20, para tipo long.
		for (long i = 0; i < 21; i++) {
			System.out.println("\tFactorial del número\t: " + i + " es igual a\t: "
					+ String.format("%,d", factorialNumero(i)));
		}
	}
}
