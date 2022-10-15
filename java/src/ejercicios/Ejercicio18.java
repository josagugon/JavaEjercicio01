/**
 * Se desea una aplicación que solicite 2 números enteros y realice la
 * operación de potencia (sin uso de librerías).
 * Input (Entrada):
 * 		3
 * 		3
 * Output (Salida):
 * 		3 elevado a 3 = 27
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 14 oct. 2022
 */
public class Ejercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definición de la variables
		Scanner teclado = new Scanner(System.in);
		String ingreso;
		long terminar, numero1, numero2, potencia;


		// Ingreso de dato
		do {
			Comunes.titulo("POTENCIA DE DOS NUMEROS X PRODUCTOS SUCESIVOS", "=");

			terminar = 1;
			numero1 = 0;
			do {
				System.out.print("Ingresar el primer número mayor que cero : ");
				ingreso = teclado.next();
				teclado.nextLine();
				// Verifica si es númerico
				if (Comunes.esNumero(ingreso)) {
					numero1 = Long.parseLong(ingreso);
					if (numero1 > 0) {
						terminar = 0;
					}
				}
			} while (terminar != 0);

			terminar = 1;
			numero2 = 0;
			do {
				System.out.print("Ingresar el segundo número mayor que cero : ");
				ingreso = teclado.next();
				teclado.nextLine();
				// Verifica si es númerico
				if (Comunes.esNumero(ingreso)) {
					numero2 = Long.parseLong(ingreso);
					if (numero2 > 0) {
						terminar = 0;
					}
				}
			} while (terminar != 0);

			// Potencia de dos numeros por productos sucesivos.
			potencia = numero1;
			for (long i = 1; i < numero2; i++) {
				potencia *= numero1;
			}

			Comunes.linea("-", 40);
			System.out.println("\tLa potencia de : " + numero1 + " a la " + numero2 + " = " + potencia);
			Comunes.linea("-", 40);

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
