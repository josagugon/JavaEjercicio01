/**
 * Realizar un programa que dado un n�mero de entrada entre 1 a 7, nos devuelva
 * el dia de la semana de la siguiente forma:
 * 		N�mero	Dia
 * 		1		Domingo
 * 		2		Lunes
 * 		3		Martes
 * 		4		Miercoles
 * 		5		Jueves
 * 		6		Viernes
 * 		7		Sabado
 * Soluci�n 1 (if-else):
 * Podemos desarrollar un programa parecido al ejercicio anterior n�mero 8.
 * Soluci�n 2 (switch):
 * En este caso, podremos observar la sentencia switch (tambi�n llamada seg�n).
 * La funcionalidad que expone esta sentencia se basa seg�n un caso,
 * realiza una operaci�n.
 * Prestemos atenci�n a la sentencia break.
 * �Qu� suceder�a si eliminamos todas esas sentencias break?
 * �Que imprimir� si luego ejecuto el programa e ingreso el n�mero 4?.
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
		// Definici�n de las variables.
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
		dias[6] = "S�bado";

		// Ingreso de dato
		do {
			System.out.print("Ingresar un n�mero del 1 al 7 :");
			dia = teclado.nextInt();
		} while (dia < 1 || dia > 7);
		teclado.close();

		// Resultado
		System.out.println("\tEl dia de la semana para el n�mero: " + dia + " corresponde al :" + dias[dia - 1]);
	}
}
