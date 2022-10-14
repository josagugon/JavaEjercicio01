/**
 * Se desea una aplicación que solicite 2 números enteros y realice
 * la operación de multiplicación por sumas sucesivas
 * (sin uso de librerías).
 * Input (Entrada):
 * 		2
 * 		3
 * Output (Salida):
 * 		2 x 3 = 6
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 13 oct. 2022
 */
public class Ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definición de la variables
		Scanner teclado = new Scanner(System.in);
		String ingreso;
		long terminar, numero1, numero2, producto;


		// Ingreso de dato
		do {
			Comunes.titulo("MULTIPLICACION DE DOS NUMEROS X SUMAS SUCESIVAS", "=");

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

			// Producto de dos numeros por sumas sucesivas.
			producto = 0;
			for (long i = 1; i <= numero2; i++) {
				producto += numero1;
			}

			Comunes.linea("-", 40);
			System.out.println("\tEl producto de : " + numero1 + " x " + numero2 + " = " + producto);
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
