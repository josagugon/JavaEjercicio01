/**
 * Realizar un programa que solicite por consola 2 n�meros enteros.
 * Para luego imprimir el resultado de la suma, resta, multiplicaci�n,
 * divisi�n y m�dulo (resto de la divisi�n) de ambos n�meros.
 * Input (Entrada):
 * 		5
 * 		4
 * Output (Salida):
 * 		5 + 4 = 9
 * 		5 - 4 = 1
 * 		5 * 4 = 20
 * 		5 / 4 = 1
 * 		5 % 4 = 1
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 12 oct. 2022
 */
public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definici�n de la variables
		Scanner teclado = new Scanner(System.in);
		String ingreso;
		long terminar, numero1, numero2;

		// Ingreso de dato
		do {
			terminar = 1;
			numero1 = 0;
			do {
				System.out.print("Ingresar el primer n�mero (entero): ");
				ingreso = teclado.next();
				// Verifica si es n�merico
				if (Comunes.esNumero(ingreso)) {
					numero1 = Long.parseLong(ingreso);
					terminar = 0;
				}
			} while (terminar != 0);

			terminar = 1;
			numero2 = 0;
			do {
				System.out.print("Ingresar el segundo n�mero (entero): ");
				ingreso = teclado.next();
				// Verifica si es n�merico
				if (Comunes.esNumero(ingreso)) {
					numero2 = Long.parseLong(ingreso);
					terminar = 0;
				}
			} while (terminar != 0);

			System.out.println("\t" + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			System.out.println("\t" + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			System.out.println("\t" + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
			if (numero2 == 0) {
				System.out.println("\t" + numero1 + " / " + numero2 + " = ERROR");
				System.out.println("\t" + numero1 + " % " + numero2 + " = ERROR");
			}else {
				System.out.println("\t" + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
				System.out.println("\t" + numero1 + " % " + numero2 + " = " + (numero1 % numero2));
			}

			System.out.print("Si desea terminar presione 0 : ");

			terminar = 1;
			ingreso = teclado.next();
			// Verifica si es n�merico
			if (Comunes.esNumero(ingreso)) {
				terminar = Long.parseLong(ingreso);
			}
		} while (terminar != 0);

		// Final
		System.out.println("FIN.");
		teclado.close();
	}

}
