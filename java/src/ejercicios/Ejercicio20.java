/**
 * Crear una aplicación que solicite de entrada los datos de una persona
 * en este orden:
 * 		Nombre y Apellido
 * 		Edad
 * 		Dirección
 * 		Ciudad
 * Luego imprimirá el siguiente mensaje:
 * {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 * Input (Entrada):
 * 		Homero Simpson
 * 		48
 * 		Calle Falsa 1234
 * 		Springfield
 * Output (Salida):
 * 		Springfield - Calle Falsa 1234 - 48 - Homero Simpson
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 14 oct. 2022
 */
public class Ejercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definición de la variables
		Scanner teclado = new Scanner(System.in);
		String ingreso, nombre, direccion, ciudad;
		int edad;
		long terminar;

		// Ingreso de dato
		do {
			Comunes.titulo("DATOS DE UNA PERSONA", "=");

			terminar = 1;
			nombre = "";
			do {
				System.out.print("Ingresar Nombre y Apellido\t: ");
				nombre = teclado.nextLine();
				// Verifica la longitud
				if (null != nombre && nombre.length() > 0) {
					terminar = 0;
				}
			} while (terminar != 0);

			terminar = 1;
			edad = 0;
			do {
				System.out.print("Ingresar la edad\t\t: ");
				ingreso = teclado.next();
				teclado.nextLine();
				// Verifica si es númerico
				if (Comunes.esNumero(ingreso)) {
					edad = Integer.parseInt(ingreso);
					if (edad > 0) {
						terminar = 0;
					}
				}
			} while (terminar != 0);

			terminar = 1;
			direccion = "";
			do {
				System.out.print("Ingresar la dirección\t\t: ");
				direccion = teclado.nextLine();
				// Verifica la longitud
				if (null != direccion && direccion.length() > 0) {
					terminar = 0;
				}
			} while (terminar != 0);

			terminar = 1;
			ciudad = "";
			do {
				System.out.print("Ingresar la ciudad\t\t: ");
				ciudad = teclado.nextLine();
				// Verifica la longitud
				if (null != ciudad && ciudad.length() > 0) {
					terminar = 0;
				}
			} while (terminar != 0);

			// Imprime los datos.
			Comunes.linea("-", 40);
			System.out.println("\t" + ciudad + " - " + direccion + " - " + edad + " - " + nombre);
			Comunes.linea("-", 40);

			terminar = 1;
			System.out.print("Si desea terminar presione 0 : ");
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
