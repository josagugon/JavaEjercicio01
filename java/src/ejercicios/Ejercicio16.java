/**
 * Realizar un programa que calcule el factorial de un número:
 * 		n! = 1 x 2 x 3 x 4 x 5 x ... x (n-1) x n.
 * Sin hacer uso de librerías.
 * Input (Entrada):
 * 		5
 * Output (Salida):
 * 		El factorial de 5 es: 120
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 13 oct. 2022
 */
public class Ejercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definición de la variables
		Scanner teclado = new Scanner(System.in);
		String ingreso;
		long terminar, numero, factorial;


		// Ingreso de dato
		do {
			Comunes.titulo("CALCULO DEL FACTORIAL DE UN NUMERO", "=");

			terminar = 1;
			factorial = 1;
			numero = 0;
			do {
				System.out.print("Ingresar un número entero positivo : ");
				ingreso = teclado.next();
				teclado.nextLine();
				// Verifica si es númerico
				if (Comunes.esNumero(ingreso)) {
					numero = Long.parseLong(ingreso);
					if (numero >= 0) {
						terminar = 0;
					}
				}
			} while (terminar != 0);

			// Calulo del factorial de un número.
			if (numero > 0) {
				// Mayor que cero
				for (int i = 1; i <= numero; i++) {
					factorial *= i;
				}
			}

			Comunes.linea("-", 34);
			System.out.println("\tEl factorial de : " + numero + " = " + factorial);
			Comunes.linea("-", 34);

			System.out.print("Si desea terminar presione 0 : ");

			terminar = 1;
			ingreso = teclado.next();
			teclado.nextLine();
			// Verifica si es númerico
			if (Comunes.esNumero(ingreso)) {
				terminar = Long.parseLong(ingreso);
			}
		} while (terminar != 0);

		// Final
		Comunes.titulo("FIN.", "-");
		teclado.close();
	}
}
