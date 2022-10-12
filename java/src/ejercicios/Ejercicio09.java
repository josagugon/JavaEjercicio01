/**
 * Realizar un programa que dado un número de entrada entre 1 a 7, nos devuelva
 * el dia de la semana de la siguiente forma:
 * 		Número	Dia
 * 		1		Domingo
 * 		2		Lunes
 * 		3		Martes
 * 		4		Miercoles
 * 		5		Jueves
 * 		6		Viernes
 * 		7		Sabado
 * Solución 1 (if-else):
 * Podemos desarrollar un programa parecido al ejercicio anterior número 8.
 * Solución 2 (switch):
 * En este caso, podremos observar la sentencia switch (también llamada según).
 * La funcionalidad que expone esta sentencia se basa según un caso,
 * realiza una operación.
 * Prestemos atención a la sentencia break.
 * ¿Qué sucedería si eliminamos todas esas sentencias break?
 * ¿Que imprimirá si luego ejecuto el programa e ingreso el número 4?.
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 12 oct. 2022
 */
public class Ejercicio09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definición de las variables.
		Scanner teclado = new Scanner(System.in);
		String[] dias = new String[7];
		int dia = 0;

		// Define los valores
		dias[0] = "Domingo";
		dias[1] = "Lunes";
		dias[2] = "Martes";
		dias[3] = "Miercoles";
		dias[4] = "Jueves";
		dias[5] = "Viernes";
		dias[6] = "Sábado";

		// Ingreso de dato
		do {
			System.out.print("Ingresar un número del 1 al 7 :");
			dia = teclado.nextInt();
		} while (dia < 1 || dia > 7);
		teclado.close();

		// Resultado
		System.out.println("\tEl dia de la semana para el número: " + dia + " corresponde al :" + dias[dia - 1]);
	}
}
