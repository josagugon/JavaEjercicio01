/**
 * Confeccionar un programa que dado un n�mero entero como dato de entrada
 * imprima la secuencia de n�meros (incrementos de 1) de la siguiente forma:
 * Input (Entrada):
 * 		5
 * Output (Salida):
 * 		1
 * 		1 2
 * 		1 2 3
 * 		1 2 3 4
 * 		1 2 3 4 5
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 13 oct. 2022
 */
public class Ejercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definici�n de la variables
		Scanner teclado = new Scanner(System.in);
		String ingreso;
		long terminar, numero;

		// Ingreso de dato
		do {
			Comunes.titulo("SECUENCIA DE UN NUMERO", "=");

			terminar = 1;
			numero = 0;
			do {
				System.out.print("Ingresar un n�mero entero mayor que cero : ");
				ingreso = teclado.next();
				teclado.nextLine();
				// Verifica si es n�merico
				if (Comunes.esNumero(ingreso)) {
					numero = Long.parseLong(ingreso);
					if (numero > 0) {
						terminar = 0;
					}
				}
			} while (terminar != 0);

			Comunes.linea("-", 40);
			for (int i = 1; i <= numero; i++) {
				System.out.print("\t");
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			Comunes.linea("-", 40);

			System.out.print("Si desea terminar presione 0 : ");

			terminar = 1;
			ingreso = teclado.next();
			teclado.nextLine();

			// Verifica si es n�merico
			if (Comunes.esNumero(ingreso)) {
				terminar = Long.parseLong(ingreso);
			}
		} while (terminar != 0);

		// Final
		Comunes.titulo("FIN.", "-");
		teclado.close();
	}
}
