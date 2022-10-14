/**
 * Solicitar por consola el nombre del usuario e imprimir por pantalla
 * el siguiente mensaje "HOLA {USUARIO}!!!"
 * Input (Entrada):
 * 		Obi Wan Kenobi
 * Output (Salida):
 * 		HOLA Obi Wan Kenobi!!!
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 12 oct. 2022
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definición de la variables
		Scanner teclado = new Scanner(System.in);
		String nombre, ingreso;
		long terminar;


		// Ingreso de dato
		do {
			Comunes.titulo("SALUDO PERSONALIZADO", "=");
			
			System.out.print("Ingresar su nombre : ");
			nombre = teclado.next();
			teclado.nextLine();

			Comunes.linea("-", 40);
			System.out.println("\t¡¡¡ HOLA : " + nombre + " !!!");
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

		Comunes.titulo("FIN.", "-");
		teclado.close();
	}
}
